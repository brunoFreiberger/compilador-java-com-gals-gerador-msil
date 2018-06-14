package compiladores.lexico;

public class LexicalError extends AnalysisError {
    
    public LexicalError(String msg, int position) {
        super(msg, position);
    }

}
