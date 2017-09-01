lexer grammar LSharpLexer;

/* Lexical tokens */

// Whitespace and comments
WHITESPACES: (Whitespace | NewLine)+        -> channel(HIDDEN);
SINGLE_LINE_COMMENT: '//'  .*? NewLine		-> channel(HIDDEN);
DELIMITED_COMMENT: '/*'  .*? '*/'           -> channel(HIDDEN);


fragment NewLine: '\r\n' | '\r' | '\n'
	| '\u0085' // Next Line (U+0085)
	| '\u2028' // Line Separator (U+2028)
	| '\u2029' // Paragraph Separator (U+2029)
	;

fragment Whitespace: '\u0020' // SPACE
	| '\u00A0' // NO_BREAK SPACE
	| '\u1680' // OGHAM SPACE MARK
	| '\u180E' // MONGOLIAN VOWEL SEPARATOR
	| '\u2000' // EN QUAD
	| '\u2001' // EM QUAD
	| '\u2002' // EN SPACE
	| '\u2003' // EM SPACE
	| '\u2004' // THREE_PER_EM SPACE
	| '\u2005' // FOUR_PER_EM SPACE
	| '\u2006' // SIX_PER_EM SPACE
	| '\u2008' // PUNCTUATION SPACE
	| '\u2009' // THIN SPACE
	| '\u200A' // HAIR SPACE
	| '\u202F' // NARROW NO_BREAK SPACE
	| '\u3000' // IDEOGRAPHIC SPACE
	| '\u205F' // MEDIUM MATHEMATICAL SPACE
	| '\u0009' //'<Horizontal Tab Character (U+0009)>'
	| '\u000B' //'<Vertical Tab Character (U+000B)>'
	| '\u000C' //'<Form Feed Character (U+000C)>'
	;

// Reserved words
USING: 'using';
PART: 'part';
OF: 'of';
IN: 'in';
TO: 'to';
INTERFACE: 'interface';
CLASS: 'class';
ENUM: 'enum';
FROM: 'from';
PUBLIC: 'public';
INTERNAL: 'internal';
PRIVATE: 'private';
STATIC: 'static';
NEW: 'new';
RETURN: 'return';
BREAK: 'break';
WITH: 'with';
VAR: 'var';
UNIT: 'unit';
NULL: 'null';
THIS: 'this';
BASE: 'base';
WHILE: 'while';
ENTRYPOINT: 'EntryPoint';

// Symbols and operators
SC: ';';
LEAD: '>>';
ARR: '=>';
DOT: '.';
LT: '<';
GT: '>';
OP: '(';
CP: ')';
OSB: '[';
CSB: ']';
EQ: '=';
PEQ: '+=';
MEQ: '-=';
AEQ: '*=';
DEQ: '/=';
QM: '?';
COL: ':';
EM: '!';
COM: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
LTE: '<=';
GTE: '>=';
EQS: '==';
NEQ: '!=';
AND: '&&';
OR: '||';
WOT: '??';
DEF: '?:';
NIL: '!:';

// Literals
IDENT: '@'?[a-zA-Z_][a-zA-Z0-9_]*;
LITINT: '-'?[0-9]+;
LITDEC: [0-9]+'.'[0-9]+;
LITCHAR: '\''(~['\\\r\n\u0085\u2028\u2029]|CommonCharacter) '\'';
LITSTR: '"'(~["\\\r\n\u0085\u2028\u2029]|CommonCharacter)* '"';
LITBOOL: ('true'|'false');


fragment CommonCharacter: '\\\''
	| '\\"'
	| '\\\\'
	| '\\0'
	| '\\a'
	| '\\b'
	| '\\f'
	| '\\n'
	| '\\r'
	| '\\t'
	| '\\v'
	;