// Generated from c://Users//DENIS//Desktop//Nueva carpeta//ssl-antlr-calculator//SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARA=1, DESDE=2, HASTA=3, HACER=4, IMPRIMIR=5, SALIR=6, PAREN_ABRE=7, 
		PAREN_CIERRA=8, LLAVE_ABRE=9, LLAVE_CIERRA=10, PUNTO_Y_COMA=11, COMILLAS_D=12, 
		IDENTIFICADOR=13, NUMERO=14, CARACTER=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PARA", "DESDE", "HASTA", "HACER", "IMPRIMIR", "SALIR", "PAREN_ABRE", 
			"PAREN_CIERRA", "LLAVE_ABRE", "LLAVE_CIERRA", "PUNTO_Y_COMA", "COMILLAS_D", 
			"IDENTIFICADOR", "NUMERO", "CARACTER", "WS"
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


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010h\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fV\b\f\n\f\f\fY\t\f\u0001\r\u0004"+
		"\r\\\b\r\u000b\r\f\r]\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f"+
		"c\b\u000f\u000b\u000f\f\u000fd\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0005\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0001\u000009\u0007\u0000!!,,..0;??AZaz\u0003\u0000\t\n\r\r  j"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000"+
		"\u0000\u00072\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b"+
		"A\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fI\u0001\u0000"+
		"\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013M\u0001\u0000\u0000\u0000"+
		"\u0015O\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019S"+
		"\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001d_\u0001\u0000"+
		"\u0000\u0000\u001fb\u0001\u0000\u0000\u0000!\"\u0005p\u0000\u0000\"#\u0005"+
		"a\u0000\u0000#$\u0005r\u0000\u0000$%\u0005a\u0000\u0000%\u0002\u0001\u0000"+
		"\u0000\u0000&\'\u0005d\u0000\u0000\'(\u0005e\u0000\u0000()\u0005s\u0000"+
		"\u0000)*\u0005d\u0000\u0000*+\u0005e\u0000\u0000+\u0004\u0001\u0000\u0000"+
		"\u0000,-\u0005h\u0000\u0000-.\u0005a\u0000\u0000./\u0005s\u0000\u0000"+
		"/0\u0005t\u0000\u000001\u0005a\u0000\u00001\u0006\u0001\u0000\u0000\u0000"+
		"23\u0005h\u0000\u000034\u0005a\u0000\u000045\u0005c\u0000\u000056\u0005"+
		"e\u0000\u000067\u0005r\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005"+
		"i\u0000\u00009:\u0005m\u0000\u0000:;\u0005p\u0000\u0000;<\u0005r\u0000"+
		"\u0000<=\u0005i\u0000\u0000=>\u0005m\u0000\u0000>?\u0005i\u0000\u0000"+
		"?@\u0005r\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005s\u0000\u0000"+
		"BC\u0005a\u0000\u0000CD\u0005l\u0000\u0000DE\u0005i\u0000\u0000EF\u0005"+
		"r\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000H\u000e\u0001"+
		"\u0000\u0000\u0000IJ\u0005)\u0000\u0000J\u0010\u0001\u0000\u0000\u0000"+
		"KL\u0005{\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005}\u0000\u0000"+
		"N\u0014\u0001\u0000\u0000\u0000OP\u0005;\u0000\u0000P\u0016\u0001\u0000"+
		"\u0000\u0000QR\u0005\"\u0000\u0000R\u0018\u0001\u0000\u0000\u0000SW\u0007"+
		"\u0000\u0000\u0000TV\u0007\u0001\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\u001a\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0007"+
		"\u0002\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u001c\u0001\u0000"+
		"\u0000\u0000_`\u0007\u0003\u0000\u0000`\u001e\u0001\u0000\u0000\u0000"+
		"ac\u0007\u0004\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0006\u000f\u0000\u0000g \u0001\u0000\u0000\u0000\u0004"+
		"\u0000W]d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}