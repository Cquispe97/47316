// Generated from c://Users//DENIS//Desktop//Nueva carpeta//ssl-antlr-calculator//SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLangParser}.
 */
public interface SimpleLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SimpleLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SimpleLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(SimpleLangParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(SimpleLangParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#conteo}.
	 * @param ctx the parse tree
	 */
	void enterConteo(SimpleLangParser.ConteoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#conteo}.
	 * @param ctx the parse tree
	 */
	void exitConteo(SimpleLangParser.ConteoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(SimpleLangParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(SimpleLangParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(SimpleLangParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(SimpleLangParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTerminar(SimpleLangParser.TerminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTerminar(SimpleLangParser.TerminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLangParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(SimpleLangParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLangParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(SimpleLangParser.CadenaContext ctx);
}