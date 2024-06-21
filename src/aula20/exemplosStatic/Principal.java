package aula20.exemplosStatic;

public class Principal {
    public static void main(String args[]){
        Conta c1 = new Conta("Ana", "123", 10);
        System.out.println("Conta cadastrada com ID: "+c1.identificador);
        Conta c2 = new Conta("Neytan", "1233", 500);
        System.out.println("Conta cadastrada com ID: "+c2.identificador);
        c1.nomeBanco = "Banco Cimol";
        System.out.println("Nome do banco c1: "+ c1.nomeBanco);
        System.out.println("Nome do banco c2: "+ c2.nomeBanco);
        Conta.nomeBanco = "Santander";
        System.out.println("Nome do banco c1: "+ c1.nomeBanco);
        System.out.println("Nome do banco c2: "+ c2.nomeBanco);
    }
}
