package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        for (int k=0; k!=1;){
            System.out.println("                ----------------------------");
            System.out.println("                | O QUE VOCÊ DESEJA FAZER? |");
            System.out.println("                |--------------------------|");
            System.out.println("                | 1-Incluir Paciente       |");
            System.out.println("                | 2-Alterar Paciente       |");
            System.out.println("                | 3-Realizar um atendimento|");
            System.out.println("                | 4-Listar os pacientes    |");
            System.out.println("                | 5-Mostrar paciente       |");
            System.out.println("                | 6-Apagar paciente        |");
            System.out.println("                ----------------------------");
            int resposta = ler.nextInt();
            switch (resposta) {
                case 1 -> {
                    System.out.println("Digite o nome do paciente que você deseja cadastrar: ");
                    String nome = ler.nextLine();
                    System.out.println("Digite o sobrenome do paciente: ");
                    String sobrenome = ler.nextLine();
                    System.out.println("Digite a data de nascimento do paciente(DD/MM/AAAA): ");
                    String dataNasc = ler.nextLine();
                    


                }
            }
       }
    }
}
