// Generated from c://Users//DENIS//Desktop//Nueva carpeta//ssl-antlr-calculator//SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARA=1, DESDE=2, HASTA=3, HACER=4, IMPRIMIR=5, SALIR=6, PAREN_ABRE=7, 
		PAREN_CIERRA=8, LLAVE_ABRE=9, LLAVE_CIERRA=10, PUNTO_Y_COMA=11, COMILLAS_D=12, 
		IDENTIFICADOR=13, NUMERO=14, CARACTER=15, WS=16;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_conteo = 2, RULE_sentencia = 3, 
		RULE_salida = 4, RULE_terminar = 5, RULE_cadena = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "conteo", "sentencia", "salida", "terminar", 
			"cadena"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'para'", "'desde'", "'hasta'", "'hacer'", "'imprimir'", "'salir'", 
			"'('", "')'", "'{'", "'}'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PARA", "DESDE", "HASTA", "HACER", "IMPRIMIR", "SALIR", "PAREN_ABRE", 
			"PAREN_CIERRA", "LLAVE_ABRE", "LLAVE_CIERRA", "PUNTO_Y_COMA", "COMILLAS_D", 
			"IDENTIFICADOR", "NUMERO", "CARACTER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				instruccion();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public ConteoContext conteo() {
			return getRuleContext(ConteoContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			conteo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConteoContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(SimpleLangParser.PARA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SimpleLangParser.IDENTIFICADOR, 0); }
		public TerminalNode DESDE() { return getToken(SimpleLangParser.DESDE, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(SimpleLangParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(SimpleLangParser.NUMERO, i);
		}
		public TerminalNode HASTA() { return getToken(SimpleLangParser.HASTA, 0); }
		public TerminalNode HACER() { return getToken(SimpleLangParser.HACER, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(SimpleLangParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(SimpleLangParser.LLAVE_CIERRA, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ConteoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterConteo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitConteo(this);
		}
	}

	public final ConteoContext conteo() throws RecognitionException {
		ConteoContext _localctx = new ConteoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conteo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(PARA);
			setState(22);
			match(IDENTIFICADOR);
			setState(23);
			match(DESDE);
			setState(24);
			match(NUMERO);
			setState(25);
			match(HASTA);
			setState(26);
			match(NUMERO);
			setState(27);
			match(HACER);
			setState(28);
			match(LLAVE_ABRE);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPRIMIR || _la==SALIR) {
				{
				{
				setState(29);
				sentencia();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				salida();
				}
				break;
			case SALIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				terminar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(SimpleLangParser.IMPRIMIR, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(SimpleLangParser.PAREN_ABRE, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(SimpleLangParser.PAREN_CIERRA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleLangParser.PUNTO_Y_COMA, 0); }
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSalida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSalida(this);
		}
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IMPRIMIR);
			setState(42);
			match(PAREN_ABRE);
			setState(43);
			cadena();
			setState(44);
			match(PAREN_CIERRA);
			setState(45);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminarContext extends ParserRuleContext {
		public TerminalNode SALIR() { return getToken(SimpleLangParser.SALIR, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(SimpleLangParser.PUNTO_Y_COMA, 0); }
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTerminar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTerminar(this);
		}
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_terminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(SALIR);
			setState(48);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends ParserRuleContext {
		public List<TerminalNode> COMILLAS_D() { return getTokens(SimpleLangParser.COMILLAS_D); }
		public TerminalNode COMILLAS_D(int i) {
			return getToken(SimpleLangParser.COMILLAS_D, i);
		}
		public List<TerminalNode> CARACTER() { return getTokens(SimpleLangParser.CARACTER); }
		public TerminalNode CARACTER(int i) {
			return getToken(SimpleLangParser.CARACTER, i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCadena(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(COMILLAS_D);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARACTER) {
				{
				{
				setState(51);
				match(CARACTER);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(COMILLAS_D);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003(\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u00065\b\u0006\n\u0006\f\u00068\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u00008\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004"+
		"\u0015\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b)\u0001"+
		"\u0000\u0000\u0000\n/\u0001\u0000\u0000\u0000\f2\u0001\u0000\u0000\u0000"+
		"\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0001\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0003\u0004\u0002\u0000\u0014\u0003\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0005\u0001\u0000\u0000\u0016\u0017\u0005\r\u0000\u0000\u0017"+
		"\u0018\u0005\u0002\u0000\u0000\u0018\u0019\u0005\u000e\u0000\u0000\u0019"+
		"\u001a\u0005\u0003\u0000\u0000\u001a\u001b\u0005\u000e\u0000\u0000\u001b"+
		"\u001c\u0005\u0004\u0000\u0000\u001c \u0005\t\u0000\u0000\u001d\u001f"+
		"\u0003\u0006\u0003\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\n"+
		"\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%(\u0003\b\u0004\u0000&(\u0003"+
		"\n\u0005\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000("+
		"\u0007\u0001\u0000\u0000\u0000)*\u0005\u0005\u0000\u0000*+\u0005\u0007"+
		"\u0000\u0000+,\u0003\f\u0006\u0000,-\u0005\b\u0000\u0000-.\u0005\u000b"+
		"\u0000\u0000.\t\u0001\u0000\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005"+
		"\u000b\u0000\u00001\u000b\u0001\u0000\u0000\u000026\u0005\f\u0000\u0000"+
		"35\u0005\u000f\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\f\u0000\u0000:\r\u0001"+
		"\u0000\u0000\u0000\u0004\u0011 \'6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}