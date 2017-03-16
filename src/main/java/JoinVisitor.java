// Generated from /Users/andy/Desktop/SanDiego/232B/milestone3/xquery-processor-master/src/main/resources/Join.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JoinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JoinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JoinParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(JoinParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(JoinParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(JoinParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(JoinParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(JoinParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#varorsentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarorsentence(JoinParser.VarorsentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(JoinParser.VarnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JoinParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JoinParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(JoinParser.SentenceContext ctx);
}