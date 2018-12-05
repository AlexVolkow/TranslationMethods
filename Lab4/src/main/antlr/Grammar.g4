grammar Grammar;

gram : pack? (begin gramRule+)? EOF;

begin: 'start' '=' PARSER_IDN;
pack : 'package' PACKAGE_NAME;

gramRule
	: parsingRule ';'
	| lexerRule ';'
	;

parsingRule : PARSER_IDN inAttrs? (':' outAttr)? ':=' prods ('|' prods)*;

inAttrs : '[' param (',' param)* ']';
outAttr: LEXER_IDN;

param : paramName ':' paramType;
paramType : LEXER_IDN;
paramName : PARSER_IDN;

prods: prod*;
prod
    : PARSER_IDN args?
    | LEXER_IDN
    | CODE
    ;

args: '(' arg (',' arg)* ')';
arg
    : PARSER_IDN
    | LEXER_IDN
    | CODE
    ;

lexerRule
	: LEXER_IDN ':' term
	| LEXER_IDN 'skip' term
	;

term
	: REGEX;

PARSER_IDN : [a-z][a-zA-Z0-9_]*;
LEXER_IDN : [A-Z][a-zA-Z0-9_]*;

REGEX : '"' (~('\''|'\r' | '\n') | '\\\'')* '"';

CODE : '{' (~[{}]+ CODE?)* '}' ;
PACKAGE_NAME : ([a-z0-9] | '.')+;

WS  : [ \t\r\n]+ -> skip ;