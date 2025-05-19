// Generated from c://Users//DENIS//Desktop//Nueva carpeta//ssl-antlr-calculator//SimpleLang.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import SimpleLangListener from './SimpleLangListener.js';
import SimpleLangVisitor from './SimpleLangVisitor.js';

const serializedATN = [4,1,16,49,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,1,0,4,0,14,8,0,11,0,12,0,15,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
1,2,1,2,5,2,29,8,2,10,2,12,2,32,9,2,1,2,1,2,1,3,1,3,3,3,38,8,3,1,4,1,4,1,
4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,0,0,6,0,2,4,6,8,10,0,0,45,0,13,1,0,0,0,2,17,
1,0,0,0,4,19,1,0,0,0,6,37,1,0,0,0,8,39,1,0,0,0,10,42,1,0,0,0,12,14,3,2,1,
0,13,12,1,0,0,0,14,15,1,0,0,0,15,13,1,0,0,0,15,16,1,0,0,0,16,1,1,0,0,0,17,
18,3,4,2,0,18,3,1,0,0,0,19,20,5,1,0,0,20,21,5,13,0,0,21,22,5,2,0,0,22,23,
5,14,0,0,23,24,5,3,0,0,24,25,5,14,0,0,25,26,5,4,0,0,26,30,5,9,0,0,27,29,
3,6,3,0,28,27,1,0,0,0,29,32,1,0,0,0,30,28,1,0,0,0,30,31,1,0,0,0,31,33,1,
0,0,0,32,30,1,0,0,0,33,34,5,10,0,0,34,5,1,0,0,0,35,38,3,10,5,0,36,38,3,8,
4,0,37,35,1,0,0,0,37,36,1,0,0,0,38,7,1,0,0,0,39,40,5,6,0,0,40,41,5,11,0,
0,41,9,1,0,0,0,42,43,5,5,0,0,43,44,5,7,0,0,44,45,5,15,0,0,45,46,5,8,0,0,
46,47,5,11,0,0,47,11,1,0,0,0,3,15,30,37];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class SimpleLangParser extends antlr4.Parser {

    static grammarFileName = "SimpleLang.g4";
    static literalNames = [ null, "'para'", "'desde'", "'hasta'", "'hacer'", 
                            "'imprimir'", "'salir'", "'('", "')'", "'{'", 
                            "'}'", "';'", "'\"'" ];
    static symbolicNames = [ null, "PARA", "DESDE", "HASTA", "HACER", "IMPRIMIR", 
                             "SALIR", "PAREN_ABRE", "PAREN_CIERRA", "LLAVE_ABRE", 
                             "LLAVE_CIERRA", "PUNTO_Y_COMA", "COMILLAS_D", 
                             "IDENTIFICADOR", "NUMERO", "CADENA", "WS" ];
    static ruleNames = [ "programa", "instruccion", "conteo", "sentencia", 
                         "terminar", "salida" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = SimpleLangParser.ruleNames;
        this.literalNames = SimpleLangParser.literalNames;
        this.symbolicNames = SimpleLangParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, SimpleLangParser.RULE_programa);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 13; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 12;
	            this.instruccion();
	            this.state = 15; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instruccion() {
	    let localctx = new InstruccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, SimpleLangParser.RULE_instruccion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 17;
	        this.conteo();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	conteo() {
	    let localctx = new ConteoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, SimpleLangParser.RULE_conteo);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19;
	        this.match(SimpleLangParser.PARA);
	        this.state = 20;
	        this.match(SimpleLangParser.IDENTIFICADOR);
	        this.state = 21;
	        this.match(SimpleLangParser.DESDE);
	        this.state = 22;
	        this.match(SimpleLangParser.NUMERO);
	        this.state = 23;
	        this.match(SimpleLangParser.HASTA);
	        this.state = 24;
	        this.match(SimpleLangParser.NUMERO);
	        this.state = 25;
	        this.match(SimpleLangParser.HACER);
	        this.state = 26;
	        this.match(SimpleLangParser.LLAVE_ABRE);
	        this.state = 30;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===5 || _la===6) {
	            this.state = 27;
	            this.sentencia();
	            this.state = 32;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 33;
	        this.match(SimpleLangParser.LLAVE_CIERRA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sentencia() {
	    let localctx = new SentenciaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, SimpleLangParser.RULE_sentencia);
	    try {
	        this.state = 37;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 5:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 35;
	            this.salida();
	            break;
	        case 6:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 36;
	            this.terminar();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	terminar() {
	    let localctx = new TerminarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, SimpleLangParser.RULE_terminar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 39;
	        this.match(SimpleLangParser.SALIR);
	        this.state = 40;
	        this.match(SimpleLangParser.PUNTO_Y_COMA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, SimpleLangParser.RULE_salida);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 42;
	        this.match(SimpleLangParser.IMPRIMIR);
	        this.state = 43;
	        this.match(SimpleLangParser.PAREN_ABRE);
	        this.state = 44;
	        this.match(SimpleLangParser.CADENA);
	        this.state = 45;
	        this.match(SimpleLangParser.PAREN_CIERRA);
	        this.state = 46;
	        this.match(SimpleLangParser.PUNTO_Y_COMA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

SimpleLangParser.EOF = antlr4.Token.EOF;
SimpleLangParser.PARA = 1;
SimpleLangParser.DESDE = 2;
SimpleLangParser.HASTA = 3;
SimpleLangParser.HACER = 4;
SimpleLangParser.IMPRIMIR = 5;
SimpleLangParser.SALIR = 6;
SimpleLangParser.PAREN_ABRE = 7;
SimpleLangParser.PAREN_CIERRA = 8;
SimpleLangParser.LLAVE_ABRE = 9;
SimpleLangParser.LLAVE_CIERRA = 10;
SimpleLangParser.PUNTO_Y_COMA = 11;
SimpleLangParser.COMILLAS_D = 12;
SimpleLangParser.IDENTIFICADOR = 13;
SimpleLangParser.NUMERO = 14;
SimpleLangParser.CADENA = 15;
SimpleLangParser.WS = 16;

SimpleLangParser.RULE_programa = 0;
SimpleLangParser.RULE_instruccion = 1;
SimpleLangParser.RULE_conteo = 2;
SimpleLangParser.RULE_sentencia = 3;
SimpleLangParser.RULE_terminar = 4;
SimpleLangParser.RULE_salida = 5;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_programa;
    }

	instruccion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstruccionContext);
	    } else {
	        return this.getTypedRuleContext(InstruccionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_instruccion;
    }

	conteo() {
	    return this.getTypedRuleContext(ConteoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterInstruccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitInstruccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitInstruccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConteoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_conteo;
    }

	PARA() {
	    return this.getToken(SimpleLangParser.PARA, 0);
	};

	IDENTIFICADOR() {
	    return this.getToken(SimpleLangParser.IDENTIFICADOR, 0);
	};

	DESDE() {
	    return this.getToken(SimpleLangParser.DESDE, 0);
	};

	NUMERO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(SimpleLangParser.NUMERO);
	    } else {
	        return this.getToken(SimpleLangParser.NUMERO, i);
	    }
	};


	HASTA() {
	    return this.getToken(SimpleLangParser.HASTA, 0);
	};

	HACER() {
	    return this.getToken(SimpleLangParser.HACER, 0);
	};

	LLAVE_ABRE() {
	    return this.getToken(SimpleLangParser.LLAVE_ABRE, 0);
	};

	LLAVE_CIERRA() {
	    return this.getToken(SimpleLangParser.LLAVE_CIERRA, 0);
	};

	sentencia = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SentenciaContext);
	    } else {
	        return this.getTypedRuleContext(SentenciaContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterConteo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitConteo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitConteo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SentenciaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_sentencia;
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	terminar() {
	    return this.getTypedRuleContext(TerminarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterSentencia(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitSentencia(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitSentencia(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TerminarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_terminar;
    }

	SALIR() {
	    return this.getToken(SimpleLangParser.SALIR, 0);
	};

	PUNTO_Y_COMA() {
	    return this.getToken(SimpleLangParser.PUNTO_Y_COMA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterTerminar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitTerminar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitTerminar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = SimpleLangParser.RULE_salida;
    }

	IMPRIMIR() {
	    return this.getToken(SimpleLangParser.IMPRIMIR, 0);
	};

	PAREN_ABRE() {
	    return this.getToken(SimpleLangParser.PAREN_ABRE, 0);
	};

	CADENA() {
	    return this.getToken(SimpleLangParser.CADENA, 0);
	};

	PAREN_CIERRA() {
	    return this.getToken(SimpleLangParser.PAREN_CIERRA, 0);
	};

	PUNTO_Y_COMA() {
	    return this.getToken(SimpleLangParser.PUNTO_Y_COMA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.enterSalida(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof SimpleLangListener ) {
	        listener.exitSalida(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof SimpleLangVisitor ) {
	        return visitor.visitSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




SimpleLangParser.ProgramaContext = ProgramaContext; 
SimpleLangParser.InstruccionContext = InstruccionContext; 
SimpleLangParser.ConteoContext = ConteoContext; 
SimpleLangParser.SentenciaContext = SentenciaContext; 
SimpleLangParser.TerminarContext = TerminarContext; 
SimpleLangParser.SalidaContext = SalidaContext; 
