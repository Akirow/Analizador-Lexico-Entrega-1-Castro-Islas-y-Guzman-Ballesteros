/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interprete;

/**
 *
 * @author Coatl
 */
public enum TipoToken {
    // Crear un tipoToken por palabra reservada
    // Crear un tipoToken: identificador, una cadena y numero
    NUMERO, CADENA,
    // Crear un tipoToken por cada "Signo del lenguaje" (ver clase Scanner)
    PARENTESIS_IZQ, PARENTESIS_DER, LLAVE_IZQ, LLAVE_DER, COMA, PUNTO, PUNTO_COMA, MENOS, MAS, MULTIPLICACION, DIVISION, NEGACION, DIFERENTE, IGUAL, IDENTICO, MAYOR, MAYOR_IGUAL,
    MENOR, MENOR_IGUAL,
    // Palabras clave:
    ABSTRACT, ASSERT, BOOLEAN, BREAK, BYTE, CASE,CATCH,CHAR,CLASS,CONST,CONTINUE, DEFAULT, DO, DOUBLE, ELSE, ENUM, EXTENDS,
    FINAL, FINALLY, FLOAT, LONG, FOR, GOTO,
    IF, IMPLEMENTS, IMPORT, 
    INSTANCEOF, INT, 
    INTERFACE,
    NATIVE,
    NEW,PACKAGE, PRIVATE, PROTECTED, PUBLIC, RETURN, SHORT, STATIC, STRICTFP,SUPER, SWITCH, SYNCHRONIZED, THIS, THROW,
    THROWS, TRANSIENT, TRY,VOID,VOLATILE,WHILE,
    
    // Final de cadena
    EOF
}
