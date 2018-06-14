package compiladores.analises;

import compiladores.commom.Constants;
import compiladores.commom.ScannerConstants;
import compiladores.commom.Token;

public class Lexico implements Constants
{
    private int position;
    private String input;

    public Lexico(String input)
    {
        this.input = input;
        position = 0;
    }

    public Token nextToken() throws LexicalError
    {
        if ( ! hasInput() )
            return null;

        int start = position;

        int state = 0;
        int lastState = 0;
        int endState = -1;
        int end = -1;

        while (hasInput())
        {
            lastState = state;
            state = nextState(nextChar(), state);

            if (state < 0)
                break;

            else
            {
                if (tokenForState(state) >= 0)
                {
                    endState = state;
                    end = position;
                }
            }
        }
        if (endState < 0 || (endState != state && tokenForState(lastState) == -2))   {
            String errorMessage = SCANNER_ERROR[lastState];
            
            if(errorMessage.equals(ScannerConstants.ERRO_SIMBOLO_INVALIDO)){
                errorMessage = this.input.charAt(this.position - 1) + " " + errorMessage;
            } else if(errorMessage.equals(ScannerConstants.ERRO_BLOCO_COMENTARIO_INVALIDO)) {
                this.position = this.input.substring(0, this.position).lastIndexOf("/*") + 1;
            }
            throw new LexicalError(errorMessage, getLine());
        }
             

        position = end;

        int token = tokenForState(endState);

        if (token == 0)
            return nextToken();
        else
        {
            String lexeme = input.substring(start, end);
            token = lookupToken(token, lexeme);
            return new Token(token, lexeme, start, this.getLine());
        }
    }
    
    

    private int nextState(char c, int state)
    {
        int start = SCANNER_TABLE_INDEXES[state];
        int end   = SCANNER_TABLE_INDEXES[state+1]-1;

        while (start <= end)
        {
            int half = (start+end)/2;

            if (SCANNER_TABLE[half][0] == c)
                return SCANNER_TABLE[half][1];
            else if (SCANNER_TABLE[half][0] < c)
                start = half+1;
            else  //(SCANNER_TABLE[half][0] > c)
                end = half-1;
        }

        return -1;
    }

    private int tokenForState(int state)
    {
        if (state < 0 || state >= TOKEN_STATE.length)
            return -1;

        return TOKEN_STATE[state];
    }

    public int lookupToken(int base, String key)
    {
        int start = SPECIAL_CASES_INDEXES[base];
        int end   = SPECIAL_CASES_INDEXES[base+1]-1;

        key = key.toUpperCase();

        while (start <= end)
        {
            int half = (start+end)/2;
            int comp = SPECIAL_CASES_KEYS[half].compareTo(key);

            if (comp == 0)
                return SPECIAL_CASES_VALUES[half];
            else if (comp < 0)
                start = half+1;
            else  //(comp > 0)
                end = half-1;
        }

        return base;
    }

    private boolean hasInput()
    {
        return position < input.length();
    }
    
    private int getLine() {
        String subsAux = this.input.substring(0, position-1);
        int line = 1;
        for(int i = 0; i < position; i++){
            char next = subsAux.charAt(i);
            if(next == '\n'){
                line++;
            }
        }
        return line;
    }

    private char nextChar()
    {
        if (hasInput())
            return input.charAt(position++);
        else
            return (char) -1;
    }
}
