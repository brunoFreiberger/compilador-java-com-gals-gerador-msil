/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.analises;

import compiladores.commom.Tipos;

/**
 *
 * @author Bruno Henrique
 */
public class Identificador {
    
    private String nome;
    private Tipos tipo;

    public Identificador() {
    }
    
    public Identificador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }
    
}
