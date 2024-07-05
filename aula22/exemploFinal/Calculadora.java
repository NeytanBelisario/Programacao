package aula22.exemploFinal;

public class Calculadora {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        //op.valor = 100; não é possível pois ele é final.
        System.out.println(op.pi);
    }
}
