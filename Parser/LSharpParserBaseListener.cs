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
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="ILSharpParserListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7")]
[System.CLSCompliant(false)]
public partial class LSharpParserBaseListener : ILSharpParserListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterProgram([NotNull] LSharpParser.ProgramContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.program"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitProgram([NotNull] LSharpParser.ProgramContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.usingList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterUsingList([NotNull] LSharpParser.UsingListContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.usingList"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitUsingList([NotNull] LSharpParser.UsingListContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.using"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterUsing([NotNull] LSharpParser.UsingContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.using"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitUsing([NotNull] LSharpParser.UsingContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.namespace"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNamespace([NotNull] LSharpParser.NamespaceContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.namespace"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNamespace([NotNull] LSharpParser.NamespaceContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.langMember"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLangMember([NotNull] LSharpParser.LangMemberContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.langMember"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLangMember([NotNull] LSharpParser.LangMemberContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.interfaceDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInterfaceDef([NotNull] LSharpParser.InterfaceDefContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.interfaceDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInterfaceDef([NotNull] LSharpParser.InterfaceDefContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.classDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterClassDef([NotNull] LSharpParser.ClassDefContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.classDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitClassDef([NotNull] LSharpParser.ClassDefContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.baseClass"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBaseClass([NotNull] LSharpParser.BaseClassContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.baseClass"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBaseClass([NotNull] LSharpParser.BaseClassContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.enumDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterEnumDef([NotNull] LSharpParser.EnumDefContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.enumDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitEnumDef([NotNull] LSharpParser.EnumDefContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.interfaceMember"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterInterfaceMember([NotNull] LSharpParser.InterfaceMemberContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.interfaceMember"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitInterfaceMember([NotNull] LSharpParser.InterfaceMemberContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.classMember"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterClassMember([NotNull] LSharpParser.ClassMemberContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.classMember"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitClassMember([NotNull] LSharpParser.ClassMemberContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStatement([NotNull] LSharpParser.StatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStatement([NotNull] LSharpParser.StatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.nonEndingStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNonEndingStatement([NotNull] LSharpParser.NonEndingStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.nonEndingStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNonEndingStatement([NotNull] LSharpParser.NonEndingStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.endingStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterEndingStatement([NotNull] LSharpParser.EndingStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.endingStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitEndingStatement([NotNull] LSharpParser.EndingStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.breakStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBreakStatement([NotNull] LSharpParser.BreakStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.breakStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBreakStatement([NotNull] LSharpParser.BreakStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.throwStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterThrowStatement([NotNull] LSharpParser.ThrowStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.throwStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitThrowStatement([NotNull] LSharpParser.ThrowStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.varDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVarDef([NotNull] LSharpParser.VarDefContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.varDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVarDef([NotNull] LSharpParser.VarDefContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.localDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterLocalDef([NotNull] LSharpParser.LocalDefContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.localDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitLocalDef([NotNull] LSharpParser.LocalDefContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.funcDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFuncDef([NotNull] LSharpParser.FuncDefContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.funcDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFuncDef([NotNull] LSharpParser.FuncDefContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.ctorDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCtorDef([NotNull] LSharpParser.CtorDefContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.ctorDef"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCtorDef([NotNull] LSharpParser.CtorDefContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.params"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterParams([NotNull] LSharpParser.ParamsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.params"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitParams([NotNull] LSharpParser.ParamsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.assign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAssign([NotNull] LSharpParser.AssignContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.assign"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAssign([NotNull] LSharpParser.AssignContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.triStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterTriStatement([NotNull] LSharpParser.TriStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.triStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitTriStatement([NotNull] LSharpParser.TriStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.whileStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterWhileStatement([NotNull] LSharpParser.WhileStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.whileStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitWhileStatement([NotNull] LSharpParser.WhileStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.foreachStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterForeachStatement([NotNull] LSharpParser.ForeachStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.foreachStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitForeachStatement([NotNull] LSharpParser.ForeachStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.switchStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterSwitchStatement([NotNull] LSharpParser.SwitchStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.switchStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitSwitchStatement([NotNull] LSharpParser.SwitchStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.caseBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterCaseBlock([NotNull] LSharpParser.CaseBlockContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.caseBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitCaseBlock([NotNull] LSharpParser.CaseBlockContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.defaultBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterDefaultBlock([NotNull] LSharpParser.DefaultBlockContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.defaultBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitDefaultBlock([NotNull] LSharpParser.DefaultBlockContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.ifBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIfBlock([NotNull] LSharpParser.IfBlockContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.ifBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIfBlock([NotNull] LSharpParser.IfBlockContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.elseBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterElseBlock([NotNull] LSharpParser.ElseBlockContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.elseBlock"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitElseBlock([NotNull] LSharpParser.ElseBlockContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterReturnStatement([NotNull] LSharpParser.ReturnStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitReturnStatement([NotNull] LSharpParser.ReturnStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.emptyStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterEmptyStatement([NotNull] LSharpParser.EmptyStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.emptyStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitEmptyStatement([NotNull] LSharpParser.EmptyStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.nullCheck"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterNullCheck([NotNull] LSharpParser.NullCheckContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.nullCheck"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitNullCheck([NotNull] LSharpParser.NullCheckContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExpression([NotNull] LSharpParser.ExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExpression([NotNull] LSharpParser.ExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.funcCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFuncCall([NotNull] LSharpParser.FuncCallContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.funcCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFuncCall([NotNull] LSharpParser.FuncCallContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.args"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterArgs([NotNull] LSharpParser.ArgsContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.args"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitArgs([NotNull] LSharpParser.ArgsContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.ident"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterIdent([NotNull] LSharpParser.IdentContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.ident"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitIdent([NotNull] LSharpParser.IdentContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.binaryOp"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterBinaryOp([NotNull] LSharpParser.BinaryOpContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.binaryOp"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitBinaryOp([NotNull] LSharpParser.BinaryOpContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.assignOperator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAssignOperator([NotNull] LSharpParser.AssignOperatorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.assignOperator"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAssignOperator([NotNull] LSharpParser.AssignOperatorContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="LSharpParser.access"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAccess([NotNull] LSharpParser.AccessContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="LSharpParser.access"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAccess([NotNull] LSharpParser.AccessContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}
