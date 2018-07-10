/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.commom;

/**
 *
 * @author Bruno Henrique
 */
public enum Tipos {
    
    REAL("float64"), BOOL("bool"), INT("int64"), STRING("string");

    private String descricao;
    
    private Tipos(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
