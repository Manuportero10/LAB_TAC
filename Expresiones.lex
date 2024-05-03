/*--------------------------------Seccion codigo-usuario --------------------------*/
import java_cup.runtime.Symbol;
%%

/*--------------------------------Seccion de opciones y declaraciones --------------------------*/
%cup

%%
/*--------------------------------Codigo --------------------------*/

"public" {return new Symbol(sym.PUBLIC);}
"class" {return new Symbol(sym.CLASS);}
"main" {return new Symbol(sym.MAIN); }
"static" {return new Symbol(sym.STATIC); }
"void" {return new Symbol(sym.VOID); }
"for" {return new Symbol(sym.FOR); }
"while" {return new Symbol(sym.WHILE); }
"do" {return new Symbol(sym.DO); }
"if" {return new Symbol(sym.IF); }
"true" | "false" {return new Symbol(sym.LOGICO, yytext()); }
"int" | "boolean" {return new Symbol(sym.VAR_TYPE, yytext()); }
"return" {return new Symbol(sym.RETURN); }
[a-zA-Z][a-zA-Z0-9_]* {return new Symbol(sym.ID, yytext()); }
[0-9]*[0-9] {return new Symbol(sym.NUMERO, yytext()); }
"=" {return new Symbol(sym.ASSIGN); }
"++" | "--" {return new Symbol(sym.OP_ASSIGN, yytext()); }
"+" | "-" |  "*" | "/" {return new Symbol(sym.ARITHMETIC, yytext()); } 
"<" | "<=" | ">" | ">=" | "==" | "!="  {return new Symbol(sym.RELATIONAL, yytext()); }
"&&" | "||" {return new Symbol(sym.LOGICAL, yytext()); }
"!" {return new Symbol(sym.NEG, yytext()); }
";" {return new Symbol(sym.SEMICOLON); }
"," {return new Symbol(sym.COMMA); }
"(" {return new Symbol(sym.OPEN_PARENTHESIS); }
")" {return new Symbol(sym.CLOSE_PARENTHESIS); }
"{" {return new Symbol(sym.OPEN_BRACKET); }
"}" {return new Symbol(sym.CLOSE_BRACKET); }
[ \t\n\r\f] {}   // Ignorar espacios en blanco y caracteres de control
