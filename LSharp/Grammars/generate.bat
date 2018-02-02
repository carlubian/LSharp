:: Lexical analysis
java -jar .\antlr-4.7-complete.jar -o "..\Parser" -visitor -Dlanguage=CSharp .\LSharpLexer.g4
:: Syntactic analysis
java -jar .\antlr-4.7-complete.jar -o "..\Parser" -visitor -Dlanguage=CSharp .\LSharpParser.g4