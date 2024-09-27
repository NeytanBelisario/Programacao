package aula33;

import java.util.ArrayDeque;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();
        fila.add("Joao1");
        fila.add("Joao2");
        fila.add("Joao3");
        fila.add("Joao4");
        fila.add("Joao5");
        fila.add("Joao6");
        fila.add("Joao7");
        fila.add("Joao8");
        System.out.println("O próximo na fila é "+fila.peek());
        System.out.println("Atendendo "+fila.remove());
        System.out.println(fila);
    }
}
