package compiladores.commom;

public class Token {

    //classes
    public static final String PALAVRA_RESERVADA = "palavra reservada";
    public static final String IDENTIFICADOR = "identificador";
    public static final String SIMBOLO_ESPECIAL = "símbolo especial";
    public static final String CONSTANTE_CHAR = "constante caractere";
    public static final String CONSTANTE_INTEIRA = "constante inteira";
    public static final String CONSTANTE_REAL = "constante real";

    private int id;
    private String lexeme;
    private int position;

    public Token(int id, String lexeme, int position) {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
    }

    public final String getTokenClass() {
        switch (id) {
            case Constants.t_identificador:
                return IDENTIFICADOR;
            case Constants.t_constanteChar:
                return CONSTANTE_CHAR;
            case Constants.t_constanteInteira:
                return CONSTANTE_INTEIRA;
            case Constants.t_constanteReal:
                return CONSTANTE_REAL;
        }

        if (id >= Constants.t_bool && id <= Constants.t_var) {
            return PALAVRA_RESERVADA;
        }

        if (id >= Constants.t_TOKEN_27 && id <= Constants.t_TOKEN_44) {
            return SIMBOLO_ESPECIAL;
        }
        throw new RuntimeException("Indentificador inválido");
    }

    public final int getId() {
        return id;
    }

    public final String getLexeme() {
        return lexeme;
    }

    public final int getPosition() {
        return position;
    }

    public String toString() {
        return id + " ( " + lexeme + " ) @ " + position;
    }
;

}
