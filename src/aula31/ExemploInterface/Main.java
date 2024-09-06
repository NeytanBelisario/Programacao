package aula31.ExemploInterface;

public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);
        v1.adiciona("a");
        v1.adiciona("b");
        v1.adiciona("c");
        v1.adiciona("d");
        System.out.println("Qual o tamanho de v1 "+ v1.getTamanho());
        System.out.println(v1);
        System.out.println("Apagando o elemento "+v1.remove());
        System.out.println(v1);

        Lista l1 = new Vetor(5);
        l1.adiciona("teste");
        l1.remove();
        //getTamanho existe apenas em Vetor e não em Lista, Portanto não está disponivel
        //l1.getTamanho();
    }
}
