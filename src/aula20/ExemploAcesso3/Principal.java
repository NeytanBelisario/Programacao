package aula20.ExemploAcesso3;


public class Principal {
    public static void main(String args[]){
        Conta c1 = new Conta("Ana", "123", 10);
        System.out.println("Conta cadastrada com ID: "+c1.getIdentificador());
        Conta c2 = new Conta("Neytan", "1233", 500);
        System.out.println("Conta cadastrada com ID: "+c2.getIdentificador());
        c1.depositar(100);
        c1.sacar(10);
        System.out.println(c1.verificarSaldo());
    }
}
