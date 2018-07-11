package compiladores.analises;

import compiladores.commom.Constants;
import compiladores.commom.Simbolo;
import compiladores.commom.Tipos;
import compiladores.commom.Token;
import compiladores.commom.TabelaSimbolos;
import compiladores.commom.TipoSimbolo;
import java.util.Arrays;
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
    private Token token;
    private final String fileName;
    private Tipos tipoAux;
    private Integer contadorRotulos;

    public Semantico(String fileName) {
        this.fileName = fileName;
    }

    public void executeAction(int action, Token token) throws SemanticError {
        this.token = token;
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
    
    // Ações

    private void action1() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\tadd\n");
    }

    private void action2() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\tsub\n");
    }

    private void action3() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\tmul\n");
    }

    private void action4() throws SemanticError {
        this.verificaTiposOperacaoAritmeticaBinaria();
        codigo.append("\tdiv\n");
    }

    private void action5() {
        pilha_tipos.push(Tipos.INT);
        codigo.append("\tldc.i8 ").append(token.getLexeme()).append("\n");
        codigo.append("\tconv.r8\n");
    }

    private void action6() {
        pilha_tipos.push(Tipos.REAL);
        codigo.append("\tldc.r8 ").append(token.getLexeme()).append("\n");
    }

    private void action7() throws SemanticError {
        verificaTiposOperacaoAritmeticaUnaria();
    }

    private void action8() throws SemanticError {
        Tipos tipo = verificaTiposOperacaoAritmeticaUnaria();
        codigo.append("\tldc.i8 -1\n");
        if (Tipos.INT.equals(tipo)) {
            codigo.append("\tconv.r8\n");
        }
        codigo.append("\tmul\n");
    }

    private void action9() {
        operador = token.getLexeme();
    }

    private void action10() throws SemanticError {
        Tipos tipo1 = pilha_tipos.pop();
        Tipos tipo2 = pilha_tipos.pop();
        if (this.verificaTiposValidos(tipo1, tipo2)) {
            pilha_tipos.push(Tipos.BOOL);
        } else {
            throw new SemanticError("Tipos incompatíveis em operação relacional", token.getPosition());
        }
        switch (operador) {
            case "=":
                codigo.append("\tceq\n");
                break;
            case "<":
                codigo.append("\tclt\n");
                break;
            case ">":
                codigo.append("\tcgt\n");
                break;
        }
    }

    private void action11() {
        pilha_tipos.push(Tipos.BOOL);
        codigo.append("\tldc.i4.1\n");
    }

    private void action12() {
        pilha_tipos.push(Tipos.BOOL);
        codigo.append("\tldc.i4.0\n");
    }

    private void action13() throws SemanticError {
        Tipos tipo = pilha_tipos.pop();
        if (tipo == Tipos.BOOL) {
            pilha_tipos.push(tipo);
        } else {
            throw new SemanticError("Tipo incompatível em operação lógica unária", token.getPosition());
        }
        codigo.append("\tldc.i4.1\n");
        codigo.append("\txor\n");
    }

    private void action14() {
        Tipos tipo = pilha_tipos.pop();
        if (Tipos.INT.equals(tipo)) {
            codigo.append("\tconv.i8\n");
        }
        codigo.append("\tcall void [mscorlib]System.Console::Write(");
        codigo.append(tipo.getDescricao());
        codigo.append(")\n");
    }

    private void action15() {
        codigo.append(".assembly extern mscorlib {}\n");
        codigo.append(".assembly ").append(this.fileName).append("{}\n");
        codigo.append(".module ").append(this.fileName).append(".exe\n\n");
        codigo.append(".class public _UNICA{\n\n");
        codigo.append(".method static public void _principal() {\n");
        codigo.append("\t.entrypoint\n");
    }

    private void action16() {
        codigo.append("\tret\n");
        codigo.append("\t}\n");
        codigo.append("}\n");
    }

    private void action17() {
        codigo.append("\tldstr \"\\n\"\n");
        codigo.append("\tcall void [mscorlib]System.Console::Write(string)\n");
    }

    private void action18() throws SemanticError {
        Tipos tipo1 = pilha_tipos.pop();
        Tipos tipo2 = pilha_tipos.pop();
        if (tipo1 != Tipos.BOOL || tipo2 != Tipos.BOOL) {
            throw new SemanticError("Tipos incompatíveis em operação lógica binária", token.getPosition());
        }
        codigo.append("\tand\n");
    }

    private void action19() throws SemanticError {
        Tipos tipo1 = pilha_tipos.pop();
        Tipos tipo2 = pilha_tipos.pop();
        if (tipo1 != Tipos.BOOL || tipo2 != Tipos.BOOL) {
            throw new SemanticError("Tipos incompatíveis em operação lógica binária", token.getPosition());
        }
        codigo.append("\tor\n");
    }

    private void action20() {
        pilha_tipos.push(Tipos.STRING);
        codigo.append("\tldstr ").append(this.token.getLexeme()).append("\n");
    }

    private void action21() {
        if (token.getLexeme().equalsIgnoreCase("int")) {
            tipoAux = Tipos.INT;
        } else if (token.getLexeme().equalsIgnoreCase("float")) {
            tipoAux = Tipos.REAL;
        } else if (token.getLexeme().equalsIgnoreCase("bool")) {
            tipoAux = Tipos.BOOL;
        } else if (token.getLexeme().equalsIgnoreCase("str")) {
            tipoAux = Tipos.STRING;
        }
    }

    private void action22() {
        lista_de_identificadores.push(new Identificador(token.getLexeme()));
    }

    private void action23() throws SemanticError {
        codigo.append("\t.locals (");
        String codAux = null;
        for (Identificador id : lista_de_identificadores) {
            if (this.tabela_simbolos.getSimbolos().containsKey(id.getNome())) {
                throw new SemanticError("Identificador " + id.getNome() + " já declarado", this.token.getPosition());
            }

            this.tabela_simbolos.adicionaSimbolo(id, token, TipoSimbolo.VARIAVEL, this.tipoAux);
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

        for (Identificador id : lista_de_identificadores) {
            if (!this.tabela_simbolos.getSimbolos().containsKey(id.getNome())) {
                throw new SemanticError("Identificador " + id.getNome() + " não declarado", this.token.getPosition());
            }
            Simbolo simbolo = this.tabela_simbolos.getSimbolos().get(id.getNome());
            codigo.append("\tcall string [mscorlib]System.Console::ReadLine()");
            codigo.append("\n");
            switch (simbolo.getIdentificador().getTipo()) {
                case REAL:
                    codigo.append("\tcall float64 [mscorlib]System.Double::Parse(string)");
                    codigo.append("\n");
                    break;
                case INT:
                    codigo.append("\tcall int64 [mscorlib]System.Int64::Parse(string)");
                    codigo.append("\n");
                    break;
                case STRING:
                    codigo.append("\tcall string [mscorlib]System.String::Parse(string)");
                    codigo.append("\n");
                    break;
                case BOOL:
                    codigo.append("\tcall bool [mscorlib]System.Boolean::Parse(string)");
                    codigo.append("\n");
                    break;

            }
            codigo.append("\tstloc ");
            codigo.append(simbolo.getIdentificador().getNome());
            codigo.append("\n");
        }
        lista_de_identificadores.clear();
    }

    private void action25() throws SemanticError {
        String id = this.token.getLexeme();
        if (!this.tabela_simbolos.getSimbolos().containsKey(id)) {
            throw new SemanticError("Identificador " + id + " não declarado", this.token.getPosition());
        }
        Simbolo simbolo = this.tabela_simbolos.getSimbolos().get(id);
        pilha_tipos.push(simbolo.getIdentificador().getTipo());
        codigo.append("\tldloc ");
        codigo.append(simbolo.getIdentificador().getNome());
        codigo.append("\n");

        if (Tipos.INT.equals(simbolo.getIdentificador().getTipo())) {
            codigo.append("\tconv.r8\n");
        }
    }

    private void action26() throws SemanticError {
        Identificador id = this.lista_de_identificadores.pop();
        if (!this.tabela_simbolos.getSimbolos().containsKey(id.getNome())) {
            throw new SemanticError("Identificador " + id + " não declarado", this.token.getPosition());
        }
        Simbolo simbolo = this.tabela_simbolos.getSimbolos().get(id.getNome());
        Tipos tipoId = simbolo.getIdentificador().getTipo();
        Tipos tipoExp = pilha_tipos.pop();
        if (tipoId != tipoExp) {
            throw new SemanticError("Tipos incompatíveis em atribuição", token.getPosition());
        }

        if (Tipos.INT.equals(simbolo.getIdentificador().getTipo())) {
            codigo.append("\tconv.i8\n");
        }

        codigo.append("\tstloc ");
        codigo.append(simbolo.getIdentificador().getNome());
        codigo.append("\n");
    }

    private void action27() {
        String rotulo = getRotulo();
        codigo.append("\n\t").append(rotulo);
        codigo.append(": \n");
        this.pilha_rotulos.push(rotulo);
    }

    private void action28() {
        String rotulo = this.getRotulo();
        switch (token.getLexeme()) {
            case "ifFalse":
                pilha_rotulos.pop();
                codigo.append("\tbrtrue ").append(rotulo).append("\n");
                break;
            case "ifTrue":
                pilha_rotulos.pop();
                codigo.append("\tbrfalse ").append(rotulo).append("\n");
                break;
            case "whileTrue":
                codigo.append("\tbrfalse ").append(rotulo).append("\n");
                break;
            case "whileFalse":
                codigo.append("\tbrtrue ").append(rotulo).append("\n");
                break;
        }
        pilha_rotulos.push(rotulo);
    }

    private void action29() {
        codigo.append("\t").append(pilha_rotulos.pop()).append(": \n");
    }

    private void action30() {
        String rotulo = getRotulo();
        codigo.append("\tbr ").append(rotulo).append("\n");
        codigo.append("\t").append(pilha_rotulos.pop()).append(":\n");
        pilha_rotulos.push(rotulo);
    }

    private void action31() {
        String ultimo = pilha_rotulos.pop();
        String penultimo = pilha_rotulos.pop();
        codigo.append("\tbr ").append(penultimo).append("\n");
        codigo.append("\t").append(ultimo).append(":\n");
    }

    private void action32() throws SemanticError {
        for (Identificador id : lista_de_identificadores) {
            if (tabela_simbolos.getSimbolos().containsKey(id.getNome())) {
                throw new SemanticError(id + " já declarado", token.getPosition());
            }
        }
        // TODO adicionar na tabela de simbolos
        lista_de_identificadores.clear();
    }
    
    // Métodos auxiliares
    
    private void verificaTiposOperacaoAritmeticaBinaria() throws SemanticError {
        Tipos tipo1 = pilha_tipos.pop();
        Tipos tipo2 = pilha_tipos.pop();
        if (!tipoValido(tipo1) || !tipoValido(tipo2)) {
            throw new SemanticError("Tipos incompativeis em operação aritmética binária", token.getPosition());
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
            throw new SemanticError("Tipo incompatível em operação aritmética unária", token.getPosition());
        }
        return tipo;
    }

    private boolean tipoValido(Tipos tipo) {
        return tipo != Tipos.STRING && tipo != Tipos.BOOL;
    }

    // Definição da tabela de tipos da expressão
    private boolean verificaTiposValidos(Tipos tipo1, Tipos tipo2) {
        List<String> operadores = Arrays.asList("!=", "<", "<=", ">", ">=", "=");
        return (operadores.contains(this.operador) && (Tipos.INT.equals(tipo1) || Tipos.REAL.equals(tipo1)) && (Tipos.INT.equals(tipo2) || Tipos.REAL.equals(tipo2)))
                || (operadores.contains(this.operador) && (Tipos.STRING.equals(tipo1) && Tipos.STRING.equals(tipo2)))
                || (this.operador.equals("!") && (Tipos.BOOL.equals(tipo1) && tipo2 == null))
                || ((this.operador.equals("&&") || this.operador.equals("||")) && (Tipos.BOOL.equals(tipo1) && Tipos.BOOL.equals(tipo2)));
    }

    private String getRotulo() {
        String rotulo = "label" + ++contadorRotulos;
        return rotulo;
    }

}
