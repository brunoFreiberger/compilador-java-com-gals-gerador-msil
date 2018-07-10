package compiladores.analises;

import compiladores.commom.Constants;
import compiladores.commom.Simbolo;
import compiladores.commom.Tipos;
import compiladores.commom.Token;
import compiladores.commom.TabelaSimbolos;
import compiladores.commom.TipoSimbolo;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import java.util.Stack;

public class Semantico implements Constants {

    private String operador;
    private StringBuilder codigo;
    private Stack<Tipos> pilha_tipos;
    private LinkedList<Identificador> lista_de_identificadores;
    private Stack<String> pilha_rotulos;
    private TabelaSimbolos tabela_simbolos;
    private Token currentToken;
    private String fileName;
    private Tipos tipoAux;

    public Semantico(String fileName) {
        this.fileName = fileName;
    }

    public void executeAction(int action, Token token) throws SemanticError {
        this.currentToken = token;
        switch (action) {
            case 1:
                action1();
                break;
            case 2:
                action2();
                break;
            case 3:
                action3();
                break;
            case 4:
                action4();
                break;
            case 5:
                action5();
                break;
            case 6:
                action6();
                break;
            case 7:
                action7();
                break;
            case 8:
                action8();
                break;
            case 9:
                action9();
                break;
            case 10:
                action10();
                break;
            case 11:
                action11();
                break;
            case 12:
                action12();
                break;
            case 13:
                action13();
                break;
            case 14:
                action14();
                break;
            case 15:
                action15();
                break;
            case 16:
                action16();
                break;
            case 17:
                action17();
                break;
            case 18:
                action18();
                break;
            case 19:
                action19();
                break;
            case 20:
                action20();
                break;
            case 21:
                action21();
                break;
            case 22:
                action22();
                break;
            case 23:
                action23();
                break;
            case 24:
                action24();
                break;
            case 25:
                action25();
                break;
            case 26:
                action26();
                break;
            case 27:
                action27();
                break;
            case 28:
                action28();
                break;
            case 29:
                action29();
                break;
            case 30:
                action30();
                break;
            case 31:
                action31();
                break;
            case 32:
                action32();
                break;
        }
    }

    private void action1() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\t\tadd\n");
    }

    private void action2() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\t\tsub\n");
    }

    private void action3() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\t\tmul\n");
    }

    private void action4() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\t\tdiv\n");
    }

    private void action5() {
        pilha_tipos.push(Tipos.INT);
        codigo.append("\t\tldc.i8 ").append(currentToken.getLexeme()).append("\n");
        codigo.append("\t\tconv.r8\n");
    }

    private void action6() {
        pilha_tipos.push(Tipos.REAL);
        codigo.append("\t\tldc.r8 ").append(currentToken.getLexeme()).append("\n");
    }

    private void action7() throws SemanticError {
        verificaTiposOperacaoAritmeticaUnaria();
    }

    private void action8() throws SemanticError {
        Tipos tipo = verificaTiposOperacaoAritmeticaUnaria();
        codigo.append("\t\tldc.i8 -1\n");
        if (Tipos.INT.equals(tipo)) {
            codigo.append("\t\tconv.r8\n");
        }
        codigo.append("\t\tmul\n");
    }

    private void action9() {
        operador = currentToken.getLexeme();
    }

    private void action10() throws SemanticError {
        Tipos tipo1 = pilha_tipos.pop();
        Tipos tipo2 = pilha_tipos.pop();
        if (this.verificaTiposValidos(tipo1, tipo2)) { // TODO
            pilha_tipos.push(Tipos.BOOL);
        } else {
            throw new SemanticError("Tipos incompatíveis em operação relacional", currentToken.getPosition());
        }
        switch (operador) {
            case "=":
                codigo.append("\t\tceq\n");
                break;
            case "<":
                codigo.append("\t\tclt\n");
                break;
            case ">":
                codigo.append("\t\tcgt\n");
                break;
        }
    }

    private void action11() {
        pilha_tipos.push(Tipos.BOOL);
        codigo.append("\t\tldc.i4.1\n");
    }

    private void action12() {
        pilha_tipos.push(Tipos.BOOL);
        codigo.append("\t\tldc.i4.0\n");
    }

    private void action13() throws SemanticError {
        Tipos tipo = pilha_tipos.pop();
        if (tipo == Tipos.BOOL) {
            pilha_tipos.push(tipo);
        } else {
            throw new SemanticError("Tipo incompatível em operação lógica unária", currentToken.getPosition());
        }
        codigo.append("\t\tldc.i4.1\n");
        codigo.append("\t\txor\n");
    }

    private void action14() {
        // TODO
        Tipos tipo = pilha_tipos.pop();
        codigo.append("\t\tcall void [mscorlib]System.Console::Write(");
        codigo.append(tipo.getDescricao());
        codigo.append(")\n");
    }

    private void action15() {
        codigo.append(".assembly extern mscorlib {}\n");
        codigo.append(".assembly ").append(fileName).append("{}\n");
        codigo.append(".module ").append(fileName).append(".exe\n\n");
        codigo.append(".class public _UNICA{\n\n");
        codigo.append(".method static public void _principal() {\n");
        codigo.append("\t.entrypoint\n");
    }

    private void action16() {
    }

    private void action17() {
    }

    private void action18() {
    }

    private void action19() {
    }

    private void action20() {
    }

    private void action21() {
        if (currentToken.getLexeme().equalsIgnoreCase("int")) {
            tipoAux = Tipos.INT;
        } else if (currentToken.getLexeme().equalsIgnoreCase("float")) {
            tipoAux = Tipos.REAL;
        }
    }

    private void action22() {
        lista_de_identificadores.push(new Identificador(currentToken.getLexeme()));
    }

    private void action23() throws SemanticError {
        Collections.reverse(lista_de_identificadores);
        codigo.append("\t.locals (");
        String codAux = null;
        for (Identificador id : lista_de_identificadores) {
            if (this.tabela_simbolos.getSimbolos().containsKey(id.getNome())) {
                throw new SemanticError("Identificador " + id.getNome() + " já declarado", this.currentToken.getPosition());
            }
            this.tabela_simbolos.adicionaSimbolo(id, currentToken, TipoSimbolo.VARIAVEL);
            if (codAux == null) {
                codAux = id.getTipo().getDescricao();
            } else {
                codAux += (", " + id.getTipo().getDescricao());
            }
        }
        codigo.append(codAux);
        codigo.append(")");
        codigo.append("\n");
        lista_de_identificadores.clear();
    }

    private void action24() throws SemanticError {
        Collections.reverse(lista_de_identificadores);
        for (Identificador id : lista_de_identificadores) {
            if (!this.tabela_simbolos.getSimbolos().containsKey(id.getNome())) {
                throw new SemanticError("Identificador " + id.getNome() + " não declarado", this.currentToken.getPosition());
            }
            Simbolo simbolo = this.tabela_simbolos.getSimbolos().get(id.getNome());
            codigo.append("\t\tcall string [mscorlib]System.Console::ReadLine()");
            codigo.append("\n");
            switch (simbolo.getIdentificador().getTipo()) {
                case REAL:
                    codigo.append("\t\tcall float64 [mscorlib]System.Double::Parse(string)");
                    codigo.append("\n");
                    break;
                case INT:
                    codigo.append("\t\tcall int64 [mscorlib]System.Int64::Parse(string)");
                    codigo.append("\n");
                    break;
            }
            codigo.append("\t\tstloc ");
            codigo.append(simbolo.getIdentificador().getNome());
            codigo.append("\n");
        }
        lista_de_identificadores.clear();
    }

    private void action25() throws SemanticError {
        String id = this.currentToken.getLexeme();
        if (!this.tabela_simbolos.getSimbolos().containsKey(id)) {
            throw new SemanticError("Identificador " + id + " não declarado", this.currentToken.getPosition());
        }
        Simbolo simbolo = this.tabela_simbolos.getSimbolos().get(id);
        pilha_tipos.push(simbolo.getIdentificador().getTipo());
        codigo.append("\t\tldloc ");
        codigo.append(simbolo.getIdentificador().getNome());
        codigo.append("\n");
        
        if (Tipos.INT.equals(simbolo.getIdentificador().getTipo())) {
            codigo.append("\t\tconv.r8\n");
        }
    }

    private void action26() throws SemanticError {
        String id = this.currentToken.getLexeme();
        if (!this.tabela_simbolos.getSimbolos().containsKey(id)) {
            throw new SemanticError("Identificador " + id + " não declarado", this.currentToken.getPosition());
        }
        Simbolo simbolo = this.tabela_simbolos.getSimbolos().get(id);
        Tipos tipoId = simbolo.getIdentificador().getTipo();
        Tipos tipoExp = pilha_tipos.pop();
        if (tipoId != tipoExp) {
                throw new SemanticError("Tipos incompatíveis em atribuição", currentToken.getPosition());
        }
        
        if (Tipos.INT.equals(simbolo.getIdentificador().getTipo())) {
            codigo.append("\t\tconv.r8\n");
        }
        
        codigo.append("\t\tstloc ");
        codigo.append(simbolo.getIdentificador().getNome());
        codigo.append("\n");
    }

    private void action27() {
    }

    private void action28() {
    }

    private void action29() {
    }

    private void action30() {
    }

    private void action31() {
    }

    private void action32() {
    }

    private void verificaTiposOperacaoAritmeticaBinaria() throws SemanticError {
        Tipos tipo1 = pilha_tipos.pop();
        Tipos tipo2 = pilha_tipos.pop();
        if (!tipoValido(tipo1) || !tipoValido(tipo2)) {
            throw new SemanticError("Tipos incompativeis em operação aritmética binária", currentToken.getPosition());
        }
        if (tipo1 == Tipos.REAL || tipo2 == Tipos.REAL) {
            pilha_tipos.push(Tipos.REAL);
        } else {
            pilha_tipos.push(Tipos.INT);
        }
    }

    private Tipos verificaTiposOperacaoAritmeticaUnaria() throws SemanticError {
        Tipos tipo = pilha_tipos.pop();
        if (tipo == Tipos.INT || tipo == Tipos.REAL) {
            pilha_tipos.push(tipo);
        } else {
            throw new SemanticError("Tipo incompatível em operação aritmética unária", currentToken.getPosition());
        }
        return tipo;
    }

    private boolean tipoValido(Tipos tipo) {
        return tipo != Tipos.STRING && tipo != Tipos.BOOL;
    }
    
    // Definição da tabela de tipos da expressão
    private boolean verificaTiposValidos(Tipos tipo1, Tipos tipo2) {
        List<String> operadores = Arrays.asList("!=", "<", "<=", ">", ">=", "=");
        return 
            (operadores.contains(this.operador) && (Tipos.INT.equals(tipo1) || Tipos.REAL.equals(tipo1) ) && (Tipos.INT.equals(tipo2) || Tipos.REAL.equals(tipo2)))
        ||  (operadores.contains(this.operador) && (Tipos.STRING.equals(tipo1) && Tipos.STRING.equals(tipo2)))
        ||  (this.operador.equals("!") && (Tipos.BOOL.equals(tipo1) && tipo2 == null))
        ||  ((this.operador.equals("&&") || this.operador.equals("||")) && (Tipos.BOOL.equals(tipo1) && Tipos.BOOL.equals(tipo2)));
    }

}
