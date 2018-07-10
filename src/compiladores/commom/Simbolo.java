/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.commom;

import compiladores.analises.Identificador;

/**
 *
 * @author Bruno Henrique
 */
public class Simbolo {
    
    private Identificador identificador;
    private TipoSimbolo tipo;

    public Simbolo(Identificador identificador, TipoSimbolo tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }

    public TipoSimbolo getTipo() {
        return tipo;
    }

    public void setTipo(TipoSimbolo tipo) {
        this.tipo = tipo;
    }
    
}
