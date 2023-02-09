// Generated from JohnRey.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JohnReyParser}.
 */
public interface JohnReyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull JohnReyParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull JohnReyParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull JohnReyParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull JohnReyParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull JohnReyParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull JohnReyParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull JohnReyParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull JohnReyParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull JohnReyParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull JohnReyParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull JohnReyParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull JohnReyParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull JohnReyParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull JohnReyParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull JohnReyParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull JohnReyParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull JohnReyParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull JohnReyParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JohnReyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JohnReyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull JohnReyParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull JohnReyParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull JohnReyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull JohnReyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull JohnReyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull JohnReyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull JohnReyParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull JohnReyParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull JohnReyParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull JohnReyParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull JohnReyParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull JohnReyParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull JohnReyParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull JohnReyParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull JohnReyParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull JohnReyParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull JohnReyParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull JohnReyParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull JohnReyParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link JohnReyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull JohnReyParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull JohnReyParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull JohnReyParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JohnReyParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull JohnReyParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JohnReyParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull JohnReyParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull JohnReyParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull JohnReyParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull JohnReyParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull JohnReyParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull JohnReyParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link JohnReyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull JohnReyParser.AndExprContext ctx);
}