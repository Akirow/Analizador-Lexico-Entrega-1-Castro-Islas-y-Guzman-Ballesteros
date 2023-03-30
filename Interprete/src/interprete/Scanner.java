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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scanner {

    private final String source;

    private final List<Token> tokens = new ArrayList<>();

    private int linea = 1;

    private static final Map<String, TipoToken> palabrasReservadas;
    static {
        palabrasReservadas = new HashMap<>();
    }

    Scanner(String source){
        this.source = source;
    }

    List<Token> scanTokens(){
        //Aquí va el corazón del scanner.

        /*
        Analizar el texto de entrada para extraer todos los tokens
        y al final agregar el token de fin de archivo
         */
        char[] x = source.toCharArray();
        String y = "";
        char[] simbolos = {'(',')','{','}',',','.',';','-','+','*','/','!','=','<','>'};
        int flag=0;
        int i=0;
        int temp=0;
        if(Character.isLetter(x[0])){
                flag= 1;
            } else if(Character.isDigit(x[0])){
                flag= 2;
            }
        
            for (char ch : simbolos){
                if (ch == x[0]) {
                    flag=3;
                    
                }
            }
        do{
            
            
            switch(flag){
                case 1:
                    if(Character.isLetter(x[i])){
                        y=y+x[i];
                    }else{
                        if(y.equals("abstract")){
                            tokens.add(new Token(TipoToken.ABSTRACT,y, null, linea));
                            y="";
                        }else if(y.equals("assert")){
                            tokens.add(new Token(TipoToken.ASSERT,y, null, linea));
                            y="";
                        }else if(y.equals("boolean")){
                            tokens.add(new Token(TipoToken.BOOLEAN,y, null, linea));
                            y="";
                        }else if(y.equals("break")){
                            tokens.add(new Token(TipoToken.BREAK,y, null, linea));
                            y="";
                        }else if(y.equals("byte")){
                            tokens.add(new Token(TipoToken.BYTE,y, null, linea));
                            y="";
                        }else if(y.equals("case")){
                            tokens.add(new Token(TipoToken.CASE,y, null, linea));
                            y="";
                        }else if(y.equals("catch")){
                            tokens.add(new Token(TipoToken.CATCH,y, null, linea));
                            y="";
                        }else if(y.equals("char")){
                            tokens.add(new Token(TipoToken.CHAR,y, null, linea));
                            y="";
                        }else if(y.equals("class")){
                            tokens.add(new Token(TipoToken.CLASS,y, null, linea));
                            y="";
                        }else if(y.equals("const")){
                            tokens.add(new Token(TipoToken.CONST,y, null, linea));
                            y="";
                        }else if(y.equals("continue")){
                            tokens.add(new Token(TipoToken.CONTINUE,y, null, linea));
                            y="";
                        }else if(y.equals("default")){
                            tokens.add(new Token(TipoToken.DEFAULT,y, null, linea));
                            y="";
                        }else if(y.equals("do")){
                            tokens.add(new Token(TipoToken.DO,y, null, linea));
                            y="";
                        }else if(y.equals("double")){
                            tokens.add(new Token(TipoToken.DOUBLE,y, null, linea));
                            y="";
                        }else if(y.equals("else")){
                            tokens.add(new Token(TipoToken.ELSE,y, null, linea));
                            y="";
                        }else if(y.equals("enum")){
                            tokens.add(new Token(TipoToken.ENUM,y, null, linea));
                            y="";
                        }else if(y.equals("extends")){
                            tokens.add(new Token(TipoToken.EXTENDS,y, null, linea));
                            y="";
                        }else if(y.equals("final")){
                            tokens.add(new Token(TipoToken.FINAL,y, null, linea));
                            y="";
                        }else if(y.equals("finally")){
                            tokens.add(new Token(TipoToken.FINALLY,y, null, linea));
                            y="";
                        }else if(y.equals("float")){
                            tokens.add(new Token(TipoToken.FLOAT,y, null, linea));
                            y="";
                        }else if(y.equals("for")){
                            tokens.add(new Token(TipoToken.FOR,y, null, linea));
                            y="";
                        }else if(y.equals("goto")){
                            tokens.add(new Token(TipoToken.GOTO,y, null, linea));
                            y="";
                        }else if(y.equals("if")){
                            tokens.add(new Token(TipoToken.IF,y, null, linea));
                            y="";
                        }else if(y.equals("implements")){
                            tokens.add(new Token(TipoToken.IMPLEMENTS,y, null, linea));
                            y="";
                        }else if(y.equals("import")){
                            tokens.add(new Token(TipoToken.IMPORT,y, null, linea));
                            y="";
                        }else if(y.equals("instanceof")){
                            tokens.add(new Token(TipoToken.INSTANCEOF,y, null, linea));
                            y="";
                        }else if(y.equals("long")){
                            tokens.add(new Token(TipoToken.LONG,y, null, linea));
                            y="";
                        }else if(y.equals("native")){
                            tokens.add(new Token(TipoToken.NATIVE,y, null, linea));
                            y="";
                        }else if(y.equals("new")){
                            tokens.add(new Token(TipoToken.NEW,y, null, linea));
                            y="";
                        }else if(y.equals("package")){
                            tokens.add(new Token(TipoToken.PACKAGE,y, null, linea));
                            y="";
                        }else if(y.equals("private")){
                            tokens.add(new Token(TipoToken.PRIVATE,y, null, linea));
                            y="";
                        }else if(y.equals("protected")){
                            tokens.add(new Token(TipoToken.PROTECTED,y, null, linea));
                            y="";
                        }else if(y.equals("public")){
                            tokens.add(new Token(TipoToken.PUBLIC,y, null, linea));
                            y="";
                        }else if(y.equals("return")){
                            tokens.add(new Token(TipoToken.RETURN,y, null, linea));
                            y="";
                        }else if(y.equals("short")){
                            tokens.add(new Token(TipoToken.SHORT,y, null, linea));
                            y="";
                        }else if(y.equals("static")){
                            tokens.add(new Token(TipoToken.STATIC,y, null, linea));
                            y="";
                        }else if(y.equals("strictfp")){
                            tokens.add(new Token(TipoToken.STRICTFP,y, null, linea));
                            y="";
                        }else if(y.equals("super")){
                            tokens.add(new Token(TipoToken.SUPER,y, null, linea));
                            y="";
                        }else if(y.equals("switch")){
                            tokens.add(new Token(TipoToken.SWITCH,y, null, linea));
                            y="";
                        }else if(y.equals("synchronized")){
                            tokens.add(new Token(TipoToken.SYNCHRONIZED,y, null, linea));
                            y="";
                        }else if(y.equals("this")){
                            tokens.add(new Token(TipoToken.THIS,y, null, linea));
                            y="";
                        }else if(y.equals("throw")){
                            tokens.add(new Token(TipoToken.THROW,y, null, linea));
                            y="";
                        }else if(y.equals("throws")){
                            tokens.add(new Token(TipoToken.THROWS,y, null, linea));
                            y="";
                        }else if(y.equals("transient")){
                            tokens.add(new Token(TipoToken.TRANSIENT,y, null, linea));
                            y="";
                        }else if(y.equals("try")){
                            tokens.add(new Token(TipoToken.TRY,y, null, linea));
                            y="";
                        }else if(y.equals("void")){
                            tokens.add(new Token(TipoToken.VOID,y, null, linea));
                            y="";
                        }else if(y.equals("volatile")){
                            tokens.add(new Token(TipoToken.VOLATILE,y, null, linea));
                            y="";
                        }else if(y.equals("while")){
                            tokens.add(new Token(TipoToken.WHILE,y, null, linea));
                            y="";
                        }else{
                            tokens.add(new Token(TipoToken.CADENA,y, null, linea));
                            y="";
                        }
                        if(Character.isDigit(x[i])){
                            flag= 2;
                            i--;
                        }
        
                        for (char ch : simbolos){
                            if (ch == x[i]) {
                                flag=3;
                                i--;
                            }
                        }
                    }
                    if(i==x.length-1){
                        
                        if(y.equals("abstract")){
                            tokens.add(new Token(TipoToken.ABSTRACT,y, null, linea));
                            y="";
                        }else if(y.equals("assert")){
                            tokens.add(new Token(TipoToken.ASSERT,y, null, linea));
                            y="";
                        }else if(y.equals("boolean")){
                            tokens.add(new Token(TipoToken.BOOLEAN,y, null, linea));
                            y="";
                        }else if(y.equals("break")){
                            tokens.add(new Token(TipoToken.BREAK,y, null, linea));
                            y="";
                        }else if(y.equals("byte")){
                            tokens.add(new Token(TipoToken.BYTE,y, null, linea));
                            y="";
                        }else if(y.equals("case")){
                            tokens.add(new Token(TipoToken.CASE,y, null, linea));
                            y="";
                        }else if(y.equals("catch")){
                            tokens.add(new Token(TipoToken.CATCH,y, null, linea));
                            y="";
                        }else if(y.equals("char")){
                            tokens.add(new Token(TipoToken.CHAR,y, null, linea));
                            y="";
                        }else if(y.equals("class")){
                            tokens.add(new Token(TipoToken.CLASS,y, null, linea));
                            y="";
                        }else if(y.equals("const")){
                            tokens.add(new Token(TipoToken.CONST,y, null, linea));
                            y="";
                        }else if(y.equals("continue")){
                            tokens.add(new Token(TipoToken.CONTINUE,y, null, linea));
                            y="";
                        }else if(y.equals("default")){
                            tokens.add(new Token(TipoToken.DEFAULT,y, null, linea));
                            y="";
                        }else if(y.equals("do")){
                            tokens.add(new Token(TipoToken.DO,y, null, linea));
                            y="";
                        }else if(y.equals("double")){
                            tokens.add(new Token(TipoToken.DOUBLE,y, null, linea));
                            y="";
                        }else if(y.equals("else")){
                            tokens.add(new Token(TipoToken.ELSE,y, null, linea));
                            y="";
                        }else if(y.equals("enum")){
                            tokens.add(new Token(TipoToken.ENUM,y, null, linea));
                            y="";
                        }else if(y.equals("extends")){
                            tokens.add(new Token(TipoToken.EXTENDS,y, null, linea));
                            y="";
                        }else if(y.equals("final")){
                            tokens.add(new Token(TipoToken.FINAL,y, null, linea));
                            y="";
                        }else if(y.equals("finally")){
                            tokens.add(new Token(TipoToken.FINALLY,y, null, linea));
                            y="";
                        }else if(y.equals("float")){
                            tokens.add(new Token(TipoToken.FLOAT,y, null, linea));
                            y="";
                        }else if(y.equals("for")){
                            tokens.add(new Token(TipoToken.FOR,y, null, linea));
                            y="";
                        }else if(y.equals("goto")){
                            tokens.add(new Token(TipoToken.GOTO,y, null, linea));
                            y="";
                        }else if(y.equals("if")){
                            tokens.add(new Token(TipoToken.IF,y, null, linea));
                            y="";
                        }else if(y.equals("implements")){
                            tokens.add(new Token(TipoToken.IMPLEMENTS,y, null, linea));
                            y="";
                        }else if(y.equals("import")){
                            tokens.add(new Token(TipoToken.IMPORT,y, null, linea));
                            y="";
                        }else if(y.equals("instanceof")){
                            tokens.add(new Token(TipoToken.INSTANCEOF,y, null, linea));
                            y="";
                        }else if(y.equals("long")){
                            tokens.add(new Token(TipoToken.LONG,y, null, linea));
                            y="";
                        }else if(y.equals("native")){
                            tokens.add(new Token(TipoToken.NATIVE,y, null, linea));
                            y="";
                        }else if(y.equals("new")){
                            tokens.add(new Token(TipoToken.NEW,y, null, linea));
                            y="";
                        }else if(y.equals("package")){
                            tokens.add(new Token(TipoToken.PACKAGE,y, null, linea));
                            y="";
                        }else if(y.equals("private")){
                            tokens.add(new Token(TipoToken.PRIVATE,y, null, linea));
                            y="";
                        }else if(y.equals("protected")){
                            tokens.add(new Token(TipoToken.PROTECTED,y, null, linea));
                            y="";
                        }else if(y.equals("public")){
                            tokens.add(new Token(TipoToken.PUBLIC,y, null, linea));
                            y="";
                        }else if(y.equals("return")){
                            tokens.add(new Token(TipoToken.RETURN,y, null, linea));
                            y="";
                        }else if(y.equals("short")){
                            tokens.add(new Token(TipoToken.SHORT,y, null, linea));
                            y="";
                        }else if(y.equals("static")){
                            tokens.add(new Token(TipoToken.STATIC,y, null, linea));
                            y="";
                        }else if(y.equals("strictfp")){
                            tokens.add(new Token(TipoToken.STRICTFP,y, null, linea));
                            y="";
                        }else if(y.equals("super")){
                            tokens.add(new Token(TipoToken.SUPER,y, null, linea));
                            y="";
                        }else if(y.equals("switch")){
                            tokens.add(new Token(TipoToken.SWITCH,y, null, linea));
                            y="";
                        }else if(y.equals("synchronized")){
                            tokens.add(new Token(TipoToken.SYNCHRONIZED,y, null, linea));
                            y="";
                        }else if(y.equals("this")){
                            tokens.add(new Token(TipoToken.THIS,y, null, linea));
                            y="";
                        }else if(y.equals("throw")){
                            tokens.add(new Token(TipoToken.THROW,y, null, linea));
                            y="";
                        }else if(y.equals("throws")){
                            tokens.add(new Token(TipoToken.THROWS,y, null, linea));
                            y="";
                        }else if(y.equals("transient")){
                            tokens.add(new Token(TipoToken.TRANSIENT,y, null, linea));
                            y="";
                        }else if(y.equals("try")){
                            tokens.add(new Token(TipoToken.TRY,y, null, linea));
                            y="";
                        }else if(y.equals("void")){
                            tokens.add(new Token(TipoToken.VOID,y, null, linea));
                            y="";
                        }else if(y.equals("volatile")){
                            tokens.add(new Token(TipoToken.VOLATILE,y, null, linea));
                            y="";
                        }else if(y.equals("while")){
                            tokens.add(new Token(TipoToken.WHILE,y, null, linea));
                            y="";
                        }else{
                            tokens.add(new Token(TipoToken.CADENA,y, null, linea));
                            y="";
                        }
                    }
                break;
                case 2:
                    if(Character.isDigit(x[i])){
                        y=y+x[i];
                    }else{
                        tokens.add(new Token(TipoToken.NUMERO,y, null, linea));
                        y="";
                        if(Character.isLetter(x[i])){
                            flag= 1;
                            i--;
                        }
        
                        for (char ch : simbolos){
                            if (ch == x[i]) {
                                flag=3;
                                i--;
                                break;
                            }
                        }
                    }
                    if(i== x.length-1){
                        tokens.add(new Token(TipoToken.NUMERO,y, null, linea));
                        y="";
                    }
                break;
                case 3:
                    for (char ch : simbolos){
                            if (ch == x[i]) {
                                y=y+x[i];
                                if(x[i] == '/'){
                                    tokens.add(new Token(TipoToken.DIVISION,y, null, linea));
                                    y="";
                                }else if(x[i] == '('){
                                    tokens.add(new Token(TipoToken.PARENTESIS_IZQ,y, null, linea));
                                    y="";
                                }else if(x[i] == ')'){
                                    tokens.add(new Token(TipoToken.PARENTESIS_DER,y, null, linea));
                                    y="";
                                }else if(x[i] == '{'){
                                    tokens.add(new Token(TipoToken.LLAVE_IZQ,y, null, linea));
                                    y="";
                                }else if(x[i] == '}'){
                                    tokens.add(new Token(TipoToken.LLAVE_DER,y, null, linea));
                                    y="";
                                }else if(x[i] == ','){
                                    tokens.add(new Token(TipoToken.COMA,y, null, linea));
                                    y="";
                                }else if(x[i] == '.'){
                                    tokens.add(new Token(TipoToken.PUNTO,y, null, linea));
                                    y="";
                                }else if(x[i] == ';'){
                                    tokens.add(new Token(TipoToken.PUNTO_COMA,y, null, linea));
                                    y="";
                                }else if(x[i] == '='){
                                    tokens.add(new Token(TipoToken.IGUAL,"=", null, linea));
                                    y="";
                                }else if(x[i] == '<'){
                                    tokens.add(new Token(TipoToken.MENOR,y, null, linea));
                                    y="";
                                }else if(x[i] == '>'){
                                    tokens.add(new Token(TipoToken.MAYOR,y, null, linea));
                                    y="";
                                }else if(x[i] == '!'){
                                    tokens.add(new Token(TipoToken.NEGACION,y, null, linea));
                                    y="";
                                }else if(x[i] == '-'){
                                    tokens.add(new Token(TipoToken.MENOS,y, null, linea));
                                    y="";
                                }else if(x[i] == '+'){
                                    tokens.add(new Token(TipoToken.MAS,y, null, linea));
                                    y="";
                                }else if(x[i] == '*'){
                                    tokens.add(new Token(TipoToken.MULTIPLICACION,y, null, linea));
                                    y="";
                                }
                            }
                        }
                        if(Character.isDigit(x[i])){
                            flag=2;
                            i--;
                        }
                        if(Character.isLetter(x[i])){
                            flag=1;
                            i--;
                        }
                break;
                default:
                    System.out.println("langosta");
            }
        i++;
        }while(i<x.length);
        
        tokens.add(new Token(TipoToken.EOF, "", null, linea));
        return tokens;
    }
}

/*
Signos o símbolos del lenguaje:
(
)
{
}
,
.
;
-
+
*
/
!
!=
=
==
<
<=
>
>=
// -> comentarios (no se genera token)
/* ... * / -> comentarios (no se genera token)
Identificador,
Cadena
Numero
Cada palabra reservada tiene su nombre de token

 */
