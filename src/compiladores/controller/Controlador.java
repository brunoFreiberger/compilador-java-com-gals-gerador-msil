/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.controller;

import compiladores.lexico.LexicalError;
import compiladores.lexico.Lexico;
import compiladores.lexico.Token;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Henrique
 */
public class Controlador {

    public Controlador() {
        this.init();
    }
    
    public void init() {
        
    }
    
    public Token[] lexicalVerification(String str) throws LexicalError {
        Lexico lexico = new Lexico(str);
        List<Token> tokens = new ArrayList<>();
        Token token = null;
        while ((token = lexico.nextToken()) != null) {
            tokens.add(token);
        }
        return tokens.toArray(new Token[tokens.size()]);
    }
    
}
