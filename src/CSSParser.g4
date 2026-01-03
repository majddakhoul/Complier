parser grammar CSSParser;
options { tokenVocab=CssLexer; }

stylesheet: rule+ EOF;

rule: selector LBRACE declaration* RBRACE ;

selector: ID | DOT ID | ID COLON ID;

declaration: ID COLON* value SEMI*;

value: ID | COLOR | ID ID;