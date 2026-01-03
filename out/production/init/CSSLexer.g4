lexer grammar CSSLexer;

LBRACE: '{';
RBRACE: '}';
COLON: ':';
SEMI: ';';
DOT: '.';
HASH: '#';

ID: [a-zA-Z0-9_-]+;
COLOR: '#' [a-fA-F0-9]+;
WS: [ \t\r\n]+ -> skip;