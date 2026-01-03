lexer grammar HTMLLexer;

// 1. Jinja2
OPEN_EXPR:  '{{';
CLOSE_EXPR: '}}';
OPEN_BLOCK: '{%';
CLOSE_BLOCK: '%}';

// 2. HTML Structure
TAG_OPEN:       '<';
TAG_CLOSE:      '>';
TAG_SLASH_OPEN: '</';
TAG_SLASH_CLOSE: '/>';
EQUALS:         '=';

// 3. Literals and Symbols
STRING: '"' (~["])* '"' | '\'' (~['])* '\'';
ID:     [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;

// 4. Special Characters (مهمة جداً لفك التضارب)
DOT:    '.';
SLASH:  '/';
PLUS:   '+';
COMMA:  ',';
COLON:  ':';
DASH:   '-';

// 5. Whitespace
WS: [ \t\r\n]+ -> skip;

// 6. النص الأساسي (فقط كلمات بسيطة)
TEXT: [a-zA-Z0-9\u0600-\u06FF]+;

// 7. القاعدة المنقذة: أي رمز آخر لم تلتقطه القواعد أعلاه
ANY: . ;