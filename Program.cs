using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using LSharp.CodeGeneration;
using System;
using System.Collections.Generic;
using System.IO;

namespace LSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            // If there are no parameters, show help text
            if(args.Length == 0)
            {
                ShowHelp();
                return;
            }

             // Input source
             String input = args[0];
             Stream file = new FileStream(input, FileMode.OpenOrCreate);
             ICharStream stream = CharStreams.fromStream(file);

             // Lexical analysis
             ITokenSource lexer = new LSharpLexer(stream);
             ITokenStream tokens = new CommonTokenStream(lexer);

             // Syntactic analysis
             LSharpParser parser = new LSharpParser(tokens)
             {
                 BuildParseTree = true
             };

             // Code generation
             IParseTree tree = parser.program();
             var visitor = new CSharpCodeGenerator(input.Replace(".ls", ".cs"));
             tree.Accept(visitor);

            Console.WriteLine("Compilation process finalized.");
        }

        private static void ShowHelp()
        {
            Console.WriteLine("The L# Compiler requires the source file to be passed as a parameter.");
        }
    }
}
