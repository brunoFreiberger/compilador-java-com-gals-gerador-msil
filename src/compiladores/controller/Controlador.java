/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.controller;

import compiladores.analises.AnalysisError;
import compiladores.analises.Lexico;
import compiladores.analises.Semantico;
import compiladores.analises.Sintatico;

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
    
    public String compile(String str, String fileName) throws AnalysisError {
        Sintatico sintatico = new Sintatico();
        Semantico semantico = new Semantico(fileName);
        sintatico.parse(new Lexico(str), semantico);
        return semantico.getCodigo().toString();
    }
    
}
