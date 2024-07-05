package aula22.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static int lerNumero(String mensagem){
        int numero = 0;
        boolean correto=false;
        Scanner ler = new Scanner(System.in);
        do{
            try {
                System.out.println(mensagem+ ": ");
                numero = ler.nextInt();
                correto=true;
            } catch (InputMismatchException erro) {
                System.out.println("precisa ser número");
                ler.next();
                correto=false;
            }
        }while(!correto);
        return numero;
    }
    public static void main(String[] args) {
        int n1 = lerNumero("Digite um número");
    }
}
