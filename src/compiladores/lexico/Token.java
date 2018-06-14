package compiladores.lexico;

public class Token
{
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
    private int line;

    public Token(int id, String lexeme, int position, int line) {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
        this.line = line;
    }
    
    public Token(int id, String lexeme, int position)
    {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
    }
    
    public final String getTokenClass() {
        String name = null;
        
        if (id >= Constants.t_TOKEN_25 && id <= Constants.t_TOKEN_42) {
            name = SIMBOLO_ESPECIAL;
        }
        
        if(id >= Constants.t_bool && id <= Constants.t_var){
            name = PALAVRA_RESERVADA;
        }
        
        switch(id) {
            case Constants.t_identificador:
                name = IDENTIFICADOR;
                break;
            case Constants.t_constanteChar:
                name = CONSTANTE_CHAR;
                break;
            case Constants.t_constanteInteira:
                name = CONSTANTE_INTEIRA;
                break;
            case Constants.t_constanteReal:
                name = CONSTANTE_REAL;
                break;            
        }

        return name;
        
    }

    public final int getId()
    {
        return id;
    }

    public final String getLexeme()
    {
        return lexeme;
    }

    public final int getPosition()
    {
        return position;
    }

    public String toString()
    {
        return id+" ( "+lexeme+" ) @ "+position;
    };

    /**
     * @return the line
     */
    public int getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(int line) {
        this.line = line;
    }
    
    
}
