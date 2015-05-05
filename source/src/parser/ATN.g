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
    ARGLIST;    // List of arguments passed in a function call
    LIST_INSTR; // Block of instructions
    ARC_LIST;   // List of arc definitions
    BOOLEAN;    // Boolean atom (for Boolean constants "true" or "false")
    PVALUE;     // Parameter by value in the list of parameters
    PREF;       // Parameter by reference in the list of parameters
    HASHCODE;   // Especial token for the atn input pointer
    HASHTEXT;   // Especial token for the atn input pointer
    HASHBASE;   // Especial token for the atn input pointer
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
            | ATN^ ID '{'! node+ '}'!
            | assign ';'!
            | funcall ';'!
            ;

node        : NODE^ ID arc_list
            ;

arc_list    : '{' arc+ '}' -> ^(ARC_LIST arc+) 
            | (ACCEPT^)? ';'!  //TODO: A node can have no arcs
            ;

arc        : ARC^ '(' expr ')'! arc_jump list_instructions
           ;

arc_jump    : JUMP^ ID
            ;

// The list of parameters grouped in a subtree (it can be empty)
params  : '(' paramlist? ')' -> ^(PARAMS paramlist?)
        ;

// Parameters are separated by commas
paramlist: param (','! param)*
        ;

// Parameters with & as prefix are passed by reference
// Only one node with the name of the parameter is created
param   :   '&' id=ID -> ^(PREF[$id,$id.text])
        |   id=ID -> ^(PVALUE[$id,$id.text])
        ;

// A list of instructions, either enclosed or not
list_instructions
        :  inst_comma -> ^(LIST_INSTR inst_comma)
        |  '{'! block_instructions '}'!
        ;

// A block of instructions, all of them gouped in a subtree
block_instructions
        :  inst_comma+ -> ^(LIST_INSTR inst_comma+)
        |                   //Empty block
        ;

inst_comma
        : instruction ';'!
        ;

// The different types of instructions
instruction
        :   assign          // Assignment
        |   ite_stmt        // if-then-else
        |   while_stmt      // while statement
        |   for_stmt        // for statement
        |   funcall         // Call to a procedure (no result produced)
        |   return_stmt     // Return statement
        |   print           // Write a string or an expression
        |                   // Nothing
        ;
  
// Assignment
assign  :   subatom eq=EQUAL expr -> ^(ASSIGN[$eq,":="] subatom expr)
        ;
        
// if-then-else (else is optional)
ite_stmt    :   IF^ '('! expr ')'! list_instructions
                (ELSE! list_instructions)? 
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

//Return of a value in a function
return_stmt
        :  RETURN^ expr?
        ;
        
// Grammar for expressions with boolean, relational and aritmetic operators
expr    :   boolterm (OR^ boolterm)*
        ;

boolterm:   boolfact (AND^ boolfact)*
        ;

boolfact:   num_expr ((EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GT^ | GE^) num_expr)?
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
        |   (b=TRUE | b=FALSE)  -> ^(BOOLEAN[$b,$b.text])
        |   funcall
        |   '('! expr ')'!
        |   '#.code' -> HASHCODE
        |   '#.base' -> HASHBASE
        |   '#.text' -> HASHTEXT
        ;

subatom :   ID (BRACKET^ expr ']'!)?
        |   ID '.length' -> ^(ARRAYLENGTH ID)
        ;
        
// A function call has a lits of arguments in parenthesis (possibly empty)
funcall :   ID '(' expr_list? ')' -> ^(FUNCALL ID ^(ARGLIST expr_list?))
        ;

// A list of expressions separated by commas
expr_list:  expr (','! expr)*
        ;    
        
// Basic tokens
BRACKET : '[' ;
EQUAL   : '=' ;
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
RETURN  : 'return' ;
PRINT   : 'print' ;
JUMP    : 'goto' ;
TRUE    : 'true' ;
FALSE   : 'false';
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
