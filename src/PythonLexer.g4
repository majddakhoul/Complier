lexer grammar PythonLexer;

// Keywords
FROM     : 'from';
IMPORT   : 'import';
DEF      : 'def';
IF       : 'if';
RETURN   : 'return';
TRUE     : 'True';
FALSE    : 'False';

// Symbols
AT       : '@';
LPAREN   : '(';
RPAREN   : ')';
LBRACK   : '[';
RBRACK   : ']';
LBRACE   : '{';
RBRACE   : '}';
COLON    : ':';
COMMA    : ',';
DOT      : '.';
ASSIGN   : '=';
EQ_DOUBLE: '==';
PLUS     : '+';
SLASH    : '/';
ALL      : '*';

// Literals
STRING   : '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'';
ID       : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER   : [0-9]+;

WS       : [ \t\r\n]+ -> skip;