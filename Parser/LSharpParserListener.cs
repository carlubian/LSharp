//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from .\LSharpParser.g4 by ANTLR 4.7

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="LSharpParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7")]
[System.CLSCompliant(false)]
public interface ILSharpParserListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProgram([NotNull] LSharpParser.ProgramContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProgram([NotNull] LSharpParser.ProgramContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.usingList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUsingList([NotNull] LSharpParser.UsingListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.usingList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUsingList([NotNull] LSharpParser.UsingListContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.using"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUsing([NotNull] LSharpParser.UsingContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.using"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUsing([NotNull] LSharpParser.UsingContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.namespace"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNamespace([NotNull] LSharpParser.NamespaceContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.namespace"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNamespace([NotNull] LSharpParser.NamespaceContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.langMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLangMember([NotNull] LSharpParser.LangMemberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.langMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLangMember([NotNull] LSharpParser.LangMemberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.interfaceDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInterfaceDef([NotNull] LSharpParser.InterfaceDefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.interfaceDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInterfaceDef([NotNull] LSharpParser.InterfaceDefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.classDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterClassDef([NotNull] LSharpParser.ClassDefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.classDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitClassDef([NotNull] LSharpParser.ClassDefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.baseClass"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBaseClass([NotNull] LSharpParser.BaseClassContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.baseClass"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBaseClass([NotNull] LSharpParser.BaseClassContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.enumDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEnumDef([NotNull] LSharpParser.EnumDefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.enumDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEnumDef([NotNull] LSharpParser.EnumDefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.interfaceMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInterfaceMember([NotNull] LSharpParser.InterfaceMemberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.interfaceMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInterfaceMember([NotNull] LSharpParser.InterfaceMemberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.classMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterClassMember([NotNull] LSharpParser.ClassMemberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.classMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitClassMember([NotNull] LSharpParser.ClassMemberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatement([NotNull] LSharpParser.StatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatement([NotNull] LSharpParser.StatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.nonEndingStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNonEndingStatement([NotNull] LSharpParser.NonEndingStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.nonEndingStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNonEndingStatement([NotNull] LSharpParser.NonEndingStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.endingStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEndingStatement([NotNull] LSharpParser.EndingStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.endingStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEndingStatement([NotNull] LSharpParser.EndingStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.breakStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBreakStatement([NotNull] LSharpParser.BreakStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.breakStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBreakStatement([NotNull] LSharpParser.BreakStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.throwStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterThrowStatement([NotNull] LSharpParser.ThrowStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.throwStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitThrowStatement([NotNull] LSharpParser.ThrowStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.varDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVarDef([NotNull] LSharpParser.VarDefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.varDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVarDef([NotNull] LSharpParser.VarDefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.localDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLocalDef([NotNull] LSharpParser.LocalDefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.localDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLocalDef([NotNull] LSharpParser.LocalDefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.funcDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFuncDef([NotNull] LSharpParser.FuncDefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.funcDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFuncDef([NotNull] LSharpParser.FuncDefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.ctorDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCtorDef([NotNull] LSharpParser.CtorDefContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.ctorDef"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCtorDef([NotNull] LSharpParser.CtorDefContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.params"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterParams([NotNull] LSharpParser.ParamsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.params"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitParams([NotNull] LSharpParser.ParamsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssign([NotNull] LSharpParser.AssignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssign([NotNull] LSharpParser.AssignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.triStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTriStatement([NotNull] LSharpParser.TriStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.triStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTriStatement([NotNull] LSharpParser.TriStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileStatement([NotNull] LSharpParser.WhileStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileStatement([NotNull] LSharpParser.WhileStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.foreachStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForeachStatement([NotNull] LSharpParser.ForeachStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.foreachStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForeachStatement([NotNull] LSharpParser.ForeachStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.switchStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSwitchStatement([NotNull] LSharpParser.SwitchStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.switchStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSwitchStatement([NotNull] LSharpParser.SwitchStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.caseBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCaseBlock([NotNull] LSharpParser.CaseBlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.caseBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCaseBlock([NotNull] LSharpParser.CaseBlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.defaultBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDefaultBlock([NotNull] LSharpParser.DefaultBlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.defaultBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDefaultBlock([NotNull] LSharpParser.DefaultBlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.ifBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfBlock([NotNull] LSharpParser.IfBlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.ifBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfBlock([NotNull] LSharpParser.IfBlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.elseBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElseBlock([NotNull] LSharpParser.ElseBlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.elseBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElseBlock([NotNull] LSharpParser.ElseBlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturnStatement([NotNull] LSharpParser.ReturnStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturnStatement([NotNull] LSharpParser.ReturnStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.emptyStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEmptyStatement([NotNull] LSharpParser.EmptyStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.emptyStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEmptyStatement([NotNull] LSharpParser.EmptyStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.nullCheck"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNullCheck([NotNull] LSharpParser.NullCheckContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.nullCheck"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNullCheck([NotNull] LSharpParser.NullCheckContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] LSharpParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] LSharpParser.ExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.funcCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFuncCall([NotNull] LSharpParser.FuncCallContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.funcCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFuncCall([NotNull] LSharpParser.FuncCallContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.args"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArgs([NotNull] LSharpParser.ArgsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.args"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArgs([NotNull] LSharpParser.ArgsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.ident"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIdent([NotNull] LSharpParser.IdentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.ident"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIdent([NotNull] LSharpParser.IdentContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.binaryOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBinaryOp([NotNull] LSharpParser.BinaryOpContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.binaryOp"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBinaryOp([NotNull] LSharpParser.BinaryOpContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.assignOperator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignOperator([NotNull] LSharpParser.AssignOperatorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.assignOperator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignOperator([NotNull] LSharpParser.AssignOperatorContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.access"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAccess([NotNull] LSharpParser.AccessContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.access"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAccess([NotNull] LSharpParser.AccessContext context);
}