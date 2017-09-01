parser grammar LSharpParser;
options { tokenVocab=LSharpLexer; }

/* Syntax rules */

// General structure
program: usingList? namespace? langMember*
    ;

usingList: using (using)*
    ;

using: USING ident ';'
    ;

namespace: PART OF ident ';'
	;

langMember: interfaceDef
    | classDef
    | enumDef
    ;

// Definitions
interfaceDef: access INTERFACE ident '>>' interfaceMember*
    ;

classDef: access STATIC? CLASS ident (baseClass)? '>>' classMember*
    ;

baseClass: FROM ident (',' ident)*
    ;

enumDef: access ENUM ident '>>'
    ;

interfaceMember: (VAR|UNIT) ident '(' params ')' ';'
    ;

classMember: varDef
    | funcDef
    | ctorDef
    ;

// Statements
statement: nonEndingStatement
    | endingStatement
    ;

nonEndingStatement: localDef
    | assign
    | triStatement
    | whileStatement
    | foreachStatement
    | switchStatement
    | funcCall (QM (ident|'.'))? ';'
    | emptyStatement
    | nullCheck
    ;

endingStatement: returnStatement
    | breakStatement
    | throwStatement
    ;

breakStatement: BREAK ';'
    ;

throwStatement: BREAK WITH ident ';'
    ;

varDef: access STATIC? VAR IDENT ('=' expression)? ';'
    ;

localDef: VAR IDENT ('=' expression)? ';'
    ;

funcDef: access STATIC? (VAR|UNIT) ident (QM (ident|'.'))? '>>' '(' params ')' '=>' statement*
    | ENTRYPOINT (QM (ident|'.'))? '>>' statement*
    ;

ctorDef: access NEW (QM (ident|'.'))? '>>' '(' params ')' '=>' nonEndingStatement*
    | STATIC '>>' '(' ')' '=>' nonEndingStatement*
    ;

params: ident? (',' ident)*
    ;

assign: ident assignOperator expression ';'
    ;

triStatement: expression '?' ifBlock endingStatement (':' elseBlock endingStatement)?
    ;

whileStatement: WHILE expression '=>' nonEndingStatement* endingStatement
    ;

foreachStatement: IDENT IN ident '=>' nonEndingStatement* endingStatement
    ;

switchStatement: expression WOT caseBlock* defaultBlock?
    ;

caseBlock: expression ':' nonEndingStatement* endingStatement
    ;

defaultBlock: '?:' nonEndingStatement* endingStatement
    ;

ifBlock: nonEndingStatement*
    ;

elseBlock: nonEndingStatement*
    ;

returnStatement: RETURN (expression)? ';'
    ;

emptyStatement: ';'
    ;

nullCheck: expression DEF nonEndingStatement* endingStatement
    | expression NIL nonEndingStatement* endingStatement
    ;

// Expressions
expression: ident
    | LITINT
    | LITDEC
    | LITCHAR
    | LITSTR
    | LITBOOL
    | NULL
    | expression '?' expression ':' expression
    | funcCall
    | expression binaryOp expression
    | EM expression
    | OP expression ')'
    ;

funcCall: ident '(' args ')'
    ;

args: expression? (',' expression)*
    ;

// Operators and Misc.
ident: IDENT
    | THIS
    | BASE
    | ident DOT ident
    | ident LT ident (',' ident)* '>'
    | ident OSB expression ']'
    | NEW funcCall
    ;
    // Most of these are directly translated
    // into C# code, so there's no need for a
    // more specific grammar.

binaryOp: '+'
    | '-'
    | '*'
    | '/'
    | '%'
    | '>'
    | '>='
    | '<'
    | '<='
    | '=='
    | '!='
    | '&&'
    | '||'
    ;

assignOperator: '='
    | '+='
    | '-='
    | '*='
    | '/='
    ;

access: PUBLIC
	| INTERNAL
	| PRIVATE
	;
