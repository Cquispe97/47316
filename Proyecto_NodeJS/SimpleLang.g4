grammar SimpleLang;

// Parser rules
programa: instruccion+ ;

instruccion: conteo ;

conteo: PARA IDENTIFICADOR DESDE NUMERO HASTA NUMERO HACER LLAVE_ABRE sentencia* LLAVE_CIERRA ;

sentencia: salida | terminar ;

terminar: SALIR PUNTO_Y_COMA ;

salida: IMPRIMIR PAREN_ABRE CADENA PAREN_CIERRA PUNTO_Y_COMA ;



//cadena: COMILLAS_D (CARACTER)* COMILLAS_D ;

// Lexer rules
PARA: 'para' ;
DESDE: 'desde' ;
HASTA: 'hasta' ;
HACER: 'hacer' ;
IMPRIMIR: 'imprimir' ;
SALIR: 'salir' ;

PAREN_ABRE: '(' ;
PAREN_CIERRA: ')' ;
LLAVE_ABRE: '{' ;
LLAVE_CIERRA: '}' ;
PUNTO_Y_COMA: ';' ;
COMILLAS_D: '"' ;


IDENTIFICADOR: [a-zA-Z]([a-zA-Z0-9])* ;
NUMERO: [0-9]+ ;
//CARACTER: [a-zA-Z0-9.,?;!:];
CADENA: '"' (~["\r\n])* '"' ;


WS: [ \t\r\n]+ -> skip ;