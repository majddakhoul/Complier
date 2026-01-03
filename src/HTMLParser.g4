parser grammar HTMLParser;
options { tokenVocab=HTMLLexer; }

html : content* EOF ;

content
    : element
    | jinja
    | misc
    ;

// القاعدة المرنة: تقبل أوسمة مغلقة ذاتياً، أو أوسمة زوجية، أو أوسمة مفردة
element
    : TAG_OPEN ID attribute* TAG_SLASH_CLOSE                               // <br/>
    | TAG_OPEN ID attribute* TAG_CLOSE content* (TAG_SLASH_OPEN ID TAG_CLOSE) // <div></div>
    | TAG_OPEN ID attribute* TAG_CLOSE                                     // <img>
    ;

attribute : ID (EQUALS attr_value)?;

// السماح لجينجا والنصوص والرموز بأن تكون قيم للسمات
attr_value : STRING | ID | NUMBER | jinja | misc;

// هذه القاعدة هي "المغناطيس" الذي يلتقط أي توكن لكي لا يظهر خطأ أحمر
misc : TEXT | ID | NUMBER | DOT | SLASH | PLUS | COMMA | COLON | DASH | EQUALS | ANY;

// تحسين جينجا لكي لا تتوقف عند أي رمز داخلي
jinja
    : OPEN_EXPR (options {greedy=false;}: .)* CLOSE_EXPR
    | OPEN_BLOCK (options {greedy=false;}: .)* CLOSE_BLOCK
    ;