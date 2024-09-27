package aula33;

import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Sla1");
        pilha.push("Sla2");
        pilha.push("Sla3");
        pilha.push("Sla4");
        pilha.push("Sla5");
        pilha.push("Sla6");
        System.out.println(pilha);
        System.out.println("Desempilhando "+pilha.pop());
        System.out.println(pilha);
    }
}
