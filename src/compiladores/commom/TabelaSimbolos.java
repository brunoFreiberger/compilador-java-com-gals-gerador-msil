/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.commom;

import compiladores.analises.Identificador;
import compiladores.analises.SemanticError;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bruno Henrique
 */
public class TabelaSimbolos {
    
    private Map<String, Simbolo> simbolos = new HashMap<>();
    
    public void adicionaSimbolo(Identificador identificador, Token token, TipoSimbolo tipo) throws SemanticError {
        Simbolo simbolo = new Simbolo(identificador, tipo);
        this.simbolos.put(simbolo.getIdentificador().getNome(), simbolo);
    }

    public Map<String, Simbolo> getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(Map<String, Simbolo> simbolos) {
        this.simbolos = simbolos;
    }
 
}
