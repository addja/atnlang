ATN :	
	atn_def atn_dicc
	;

// Dictionaire definition

atn_dicc
	: "DICTIONAIRE"! (WORD EQUALS^ "("! list_words ")"!)*
	;

list_words
	: WORD (","! WORD)*
	;


// ATN definition

atn_def
	:	atn_def_head atn_def_cont
	;

atn_def_head
	:	"NODE"!	"Test"! "Dest"! "Action"
		"----"! "----"! "----"! "------"!
	;

atn_def_cont
	:	instruction ';'! (instruction ";"!)*
	;

instruction
	:	ID^ ":"! IF^ func GOTO! ID AFTER! action
		(ELIF^ func GOTO! ID AFTER! action)? 
		(ELSE^ action)?
	|	action 
	;

func
	:	SCAN^ "("! WORD ")"!
	|	PARSE^ "("! ID ")"!
	;

action
	:	RETURN^ (ID | complex_id)
	|	ID EQUALS^ complex_id
	;

complex_id
	:	WORD^ "("! list_id ")"!
	|	CURR_INPUT
	;

list_id
	: ID (","! ID)*
	;

// Basic tokens
CURR_INPUT	: '#'		;
SCAN		: 'scan'	;
RETURN		: 'return'	;
IF			: 'if'		;
GOTO		: 'goto'	;
AFTER		: 'after'	;
ELIF		: 'elif'	;
ELSE		: 'else'	;
PARSE		: 'parse'	;
EQUALS 		: '='		;
ID  		: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

// C-style comments
COMMENT	: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    	| '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

// Strings (in quotes) with escape sequences        
WORD	:  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
        ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

// White spaces
WS  	
	: 	( ' '
    | 	'\t'
    |	 '\r'
    |	 '\n'
       	) {$channel=HIDDEN;}
    ;