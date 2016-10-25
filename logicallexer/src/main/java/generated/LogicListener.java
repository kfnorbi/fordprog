// Generated from Logic.g4 by ANTLR 4.5.3

package generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicParser}.
 */
public interface LogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LogicParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryoperator(LogicParser.BinaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryoperator(LogicParser.BinaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogicParser#unarioperator}.
	 * @param ctx the parse tree
	 */
	void enterUnarioperator(LogicParser.UnarioperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#unarioperator}.
	 * @param ctx the parse tree
	 */
	void exitUnarioperator(LogicParser.UnarioperatorContext ctx);
}