grammar Pascal;

program:
    description? declaration? main_part;

description:
    PROGRAM IDENT SEMICOLON;

declaration:
    (const_block)? (var_block)?;

const_block:
    CONST (const_declaration)+;

const_declaration:
    IDENT COLON INTEGER EQUAL_SIGN INT SEMICOLON;

var_block:
    VAR (var_declaration)+;

var_declaration:
    IDENT (COMMA IDENT)* COLON INTEGER SEMICOLON;


main_part:
    BEGIN (code)* END DOT;

code
    : math_statement
    | assignment
    | function
    | if_cond
    | block;

if_cond
    : IF cond THEN block
    | IF cond THEN block ELSE block;

cond:
    IDENT sign IDENT;

sign
    : '='
    | '<>'
    | '<'
    | '>'
    | '<='
    | '>=';

math_value
    :const_val
	| IDENT;

math:
    math_value
	| math_value '+' math
	| math_value '-' math
	| math_value '*' math
	| math_value '/' math;

math_statement:
    math;

assignment:
	IDENT ASSIGNMENT math_statement SEMICOLON;

func_parameter
    :ARG
    |math;

function :
	IDENT '(' (func_parameter)* (COMMA func_parameter)* ')' SEMICOLON;

const_val:
    INT;

block :
	BEGIN (code)* END SEMICOLON?;

WS: [ \t\r\n]+ -> skip;

VAR: 'var';
CONST: 'const';
PROGRAM: 'program';
BEGIN: 'begin';
END: 'end';
INTEGER: 'integer';
IF: 'if';
THEN: 'then';
ELSE: 'else';

ASSIGNMENT: ':=';
EQUAL_SIGN: '=';
DOT: '.';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';

ARG : '\'' (('a'..'z')|('A'..'Z')|('0'..'9')|' '|'!'|';'|':'|'+'|'/'|'-')* '\'';
IDENT: (('a'..'z')|('A'..'Z'))((('a'..'z')|('A'..'Z')|('0'..'9')))*;
INT: '0' | [1-9] ([0-9])*;

