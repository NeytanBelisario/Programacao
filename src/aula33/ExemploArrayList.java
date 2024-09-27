package aula33;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> Lista = new ArrayList<>();
        //Adicionar um elemento na Lista
        Lista.add("A");
        Lista.add("B");
        Lista.add("U");
        Lista.add("L");
        Lista.add("P");
        Lista.add("J");
        Lista.add(3,"D");
        System.out.println(Lista);
        Lista.sort(null);
        System.out.println(Lista);
        System.out.println("A lista tem um 'B'? "+Lista.contains("B"));
        System.out.println("Onde está o 'B' na lista? "+Lista.indexOf("B"));
        System.out.println("Onde está a última ocorrência de 'J' na lista? "+ Lista.lastIndexOf("J"));
        Lista.add("J");
        System.out.println("Onde está aúltima ocorrência de 'J' na lista? "+ Lista.lastIndexOf("J"));
        System.out.println("Removendo o elemento 'D' da lista "+ Lista.remove(("D")));
        System.out.println("Removendo o elemento da posição 2 "+ Lista.remove((2)));
        System.out.println(Lista);
        System.out.println("A lista está vazia? "+ Lista.isEmpty());
        Lista.clear();
        System.out.println("A lista está vazia? "+ Lista.isEmpty());
    }
}
