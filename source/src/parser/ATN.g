/**
 * ATN interpreter grammar
*/

grammar ATN;

options {
    output = AST;
    ASTLabelType = ATNTree;
}

tokens {
    PROGRAM;    // List of variables, functions and atns
    ASSIGN;     // Assignment instruction
    PARAMS;     // List of parameters in the declaration of a function
    FUNCALL;    // Function call
    ATNCALL;    // ATN function call
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    ARRAY_DECL; // Array immediate declaration
    NODELIST;   // List of nodes of an ATN
    ARC_LIST;   // List of arc definitions
    BOOLEAN;    // Boolean atom (for Boolean constants "true" or "false")
    PVALUE;     // Parameter by value in the list of parameters
    PREF;       // Parameter by reference in the list of parameters
    ARRAYLENGTH; 
}

@header {
package parser;
import interp.ATNTree;
}

@lexer::header {
package parser;
}

// A program is a list of utilities
prog    : utilities+ EOF -> ^(PROGRAM utilities+)
        ;
        
// An utility can be a function, a variable or an atn   
utilities   : DEF^ ID params '{'! block_instructions '}'!
            | ATN^ ID '{'! node_list '}'!
            | assign ';'!   //Global vars
            ;

// List of nodes rooted to NODELIST
node_list   : node+ -> ^(NODELIST node+)
            ;

// A node can be a node definition or a local ATN 
// variable assigment
node        : NODE^ ID arc_list
            | assign ';'!
            ;

// An arc list can also consist of only one definition
// or can be an accepting node
arc_list    : '{' arc+ '}' -> ^(ARC_LIST arc+) 
            | arc -> ^(ARC_LIST arc)
            | ACCEPT^ ';'! 
            ;

arc        : ARC^ '('! expr ')'! arc_jump list_instructions
           ;

arc_jump    : JUMP^ ID
            ;

// The list of parameters grouped in a subtree (it can be empty)
params  : '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist
        : param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   '&' id=ID -> ^(PREF[$id,$id.text])
        |   id=ID -> ^(PVALUE[$id,$id.text])
        ;

// A list of instructions, either enclosed in brackets or not
// Also, a list of instructions can be empty
list_instructions
        :  instruction -> ^(LIST_INSTR instruction)
        |  ';'!
        |  '{'! block_instructions '}'!
        ;

// A block of instructions, all of them gouped in a subtree
block_instructions
        :  instruction+ -> ^(LIST_INSTR instruction+)
        ;

// The different types of instructions, followed by semicolon
instruction
        :   assign ';'!         // Assignment
        |   ite_stmt            // if-then-else
        |   read ';'!           // read some input variable
        |   while_stmt          // while statement
        |   for_stmt            // for statement
        |   funcall ';'!        // Call to a procedure (no result produced)
        |   atncall ';'!        // Call to a procedure (fail if returns false)
        |   return_stmt ';'!    // Return statement
        |   print ';'!          // Write a string or an expression
        ;
  
// Assignment
assign  :   subatom eq=EQUAL expr -> ^(ASSIGN[$eq,":="] subatom expr)
        ;
        
// if-then-else (else is optional)
ite_stmt    :   IF^ '('! expr ')'! list_instructions
                (options {greedy=true;} : ELSE! list_instructions)? 
            ;

// while statement
while_stmt  :   WHILE^ '('! expr ')'! list_instructions
            ;
            
// for statement
for_stmt    :   FOR^ '('! assign ';'! expr ';'! assign ')'! list_instructions
            ;

// Write an expression or a string
print   :   PRINT^ expr (','! expr)*
        ;

// Read a variable
read    :   READ^ subatom
        ;

//Return of a value in a function
return_stmt
        :  RETURN^ expr?
        ;
        
// Grammar for expressions with boolean, relational and aritmetic operators
expr    :   boolterm (OR^ boolterm)*
        ;

boolterm:   boolfact (AND^ boolfact)*
        ;

boolfact:   num_expr ((EQ_COMP^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
        ;

num_expr:   term ( (PLUS^ | MINUS^) term)*
        ;

term    :   factor ( (MUL^ | DIV^ | MOD^) factor)*
        ;

factor  :   (NOT^ | PLUS^ | MINUS^) factor | atom
        ;

// Atom of the expressions (variables, integer and boolean literals).
// An atom can also be a function call or another expression
// in parenthesis
atom    :   subatom 
        |   INT
        |   STRING
        |   '{' expr (',' expr)* '}' -> ^(ARRAY_DECL expr*)
        |   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
        |   funcall
        |   atncall     //calls atn and saves value on var
        |   '('! expr ')'!
        |   HASH^ '.'! INT
        ;

// Array definition or array length checking
subatom :   ID (BRACKET^ expr ']'!)?
        |   ID '.length' -> ^(ARRAYLENGTH ID)
        ;
        
// A function call has a lits of arguments in parenthesis (possibly empty)
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

// A function call has a lits of arguments in parenthesis (possibly empty)
atncall :   'atn' '(' ID ')' -> ^(ATNCALL ID)
        ;

// A list of expressions separated by commas
expr_list:  expr (','! expr)*
        ;    
        
// Basic tokens
BRACKET : '[' ;
EQUAL   : '=' ;
EQ_COMP : '==' ;
NOT_EQUAL: '!=' ;
LT      : '<' ;
LE      : '<=';
GT      : '>';
GE      : '>=';
PLUS    : '+' ;
MINUS   : '-' ;
MUL     : '*';
DIV     : '/';
MOD     : '%' ;
NOT     : 'not';
AND     : 'and' ;
OR      : 'or' ;    
IF      : 'if' ;
ELSE    : 'else' ;
WHILE   : 'while' ;
FOR     : 'for' ;
NODE    : 'node' ;
ARC     : 'arc' ;
ATN     : 'atn' ;
DEF     : 'def' ;
ACCEPT  : 'accept' ;
READ    : 'read' ;
RETURN  : 'return' ;
PRINT   : 'print' ;
JUMP    : 'goto' ;
TRUE    : 'true' ;
FALSE   : 'false';
HASH    : '#';
ID      :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT     :   '0'..'9'+ ;

// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
        | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
        ;

// Strings (in quotes) with escape sequences        
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
        ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ; 
