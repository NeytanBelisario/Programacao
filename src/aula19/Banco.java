package aula19;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Conta p1 = new Conta();
        System.out.println("Digite o nome de titular:");
        p1.titular = ler.nextLine();
        System.out.println("Digite o identificador da conta:");
        p1.identificador = ler.nextLine();
        System.out.println("Digite a senha da conta:");
        p1.senha = ler.nextLine();
        for(int i=0; i!=4;) {
            System.out.println("-------------------------");
            System.out.println("O que você deseja fazer?");
            System.out.println("1-Efetuar um saque");
            System.out.println("2-Efetuar um depósito");
            System.out.println("3-Verificar Saldo");
            System.out.println("4-sair do programa");
            System.out.println("-------------------------");
            i = ler.nextInt();

            ler.nextLine();

            switch (i){
                case 1 -> {
                    float saldo = p1.saldo;
                    if(saldo <= 0){
                        System.out.println("Você não pode sacar. O saldo tem que ser positivo.");
                    }else{
                        System.out.println("Quanto você deseja sacar? ");
                        float valor = ler.nextFloat();

                        ler.nextLine();

                        for (int f=0; f!=1;){
                            System.out.println("Digite a senha: ");
                            String senha = ler.nextLine();
                            if (!senha.equals(p1.senha)){
                                System.out.println("Senha errada.");
                            }else{
                                p1.sacar(valor);
                                System.out.println("Saque efetuado com Sucesso!");
                                f=1;
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Quanto você deseja depositar? ");
                    float valor = ler.nextFloat();

                    ler.nextLine();

                    for (int f=0; f!=1;){
                        System.out.println("Digite a senha: ");
                        String senha = ler.nextLine();
                        if (!senha.equals(p1.senha)){
                            System.out.println("Senha errada.");
                        }else{
                            p1.depositar(valor);
                            System.out.println("Depósito efetuado com Sucesso!");
                            f=1;
                        }
                    }
                }
                case 3 -> {
                    for (int f=0; f!=1;){
                        System.out.println("Digite a senha: ");
                        String senha = ler.nextLine();
                        if (!senha.equals(p1.senha)){
                            System.out.println("Senha errada.");
                        }else{
                            float valor = p1.verificarSaldo();
                            System.out.println("O seu saldo é de: R$ "+valor);
                            f=1;
                        }
                    }
                }
                case 4 -> System.out.println("Você Saiu");
            }
        }
    }
}

