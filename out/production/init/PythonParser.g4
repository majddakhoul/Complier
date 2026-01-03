parser grammar PythonParser;
options { tokenVocab=PythonLexer; }

program : (statement)+ EOF;

statement
    : importStmt
    | assignment
    | ifStmt
    | returnStmt
    | decorator? funcDef
    | expr
    ;


importStmt
    : FROM dottedName IMPORT (importItem (COMMA importItem)*)
    | IMPORT dottedName (COMMA dottedName)*;

importItem : ID | ALL;

dottedName : ID (DOT ID)*;

assignment : expr ASSIGN expr;

ifStmt : IF expr COLON block;

returnStmt : RETURN expr;

decorator : AT dottedName (LPAREN args? RPAREN)?;

funcDef : DEF ID LPAREN params? RPAREN COLON block;

// لجعل الشجرة تبدو منظمة في بايثون بدون مسافات معقدة
block : (statement)+;

expr : atom
     | expr LPAREN args? RPAREN
     | expr LBRACK expr RBRACK
     | expr EQ_DOUBLE expr
     | expr PLUS expr
     | LBRACK args? RBRACK
     | LBRACE (expr COLON expr (COMMA expr COLON expr)*)? RBRACE
     ;

atom : ID | STRING | NUMBER | TRUE | FALSE | dottedName;

params : ID (COMMA ID)*;

args   : arg (COMMA arg)*;
arg    : (ID ASSIGN)? expr;