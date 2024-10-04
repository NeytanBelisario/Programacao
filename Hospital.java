package Hospital;

import java.time.LocalDate;
import java.util.ArrayList;
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
            System.out.println("                | 0-Sair                   |");
            System.out.println("                ----------------------------");
            int resposta = ler.nextInt();
            switch (resposta) {
                case 1 -> {
                    System.out.println("Digite o nome do paciente que você deseja cadastrar: ");
                    String nome = ler.next();
                    System.out.println("Digite o sobrenome do paciente: ");
                    String sobrenome = ler.next();
                    System.out.print("Digite o dia de nascimento: ");
                    int dia = ler.nextInt();
                    System.out.print("Digite o mês de nascimento: ");
                    int mes = ler.nextInt();
                    System.out.print("Digite o ano de nascimento: ");
                    int ano = ler.nextInt();
                    LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
                    Paciente paciente = new Paciente(nome, sobrenome);
                    paciente.setDataNascimento(dataNascimento);
                    paciente.setAtivo(true);
                    pacientes.add(paciente);
                    System.out.println(pacientes);
                }
                case 2 -> {
                    try{
                        ler.nextLine();
                        System.out.print("Digite o nome completo do paciente que deseja alterar: ");
                        String nomeCompleto = ler.nextLine();
                        System.out.println(nomeCompleto);
                        for(Paciente paciente: pacientes){
                            System.out.println(paciente);
                            if(nomeCompleto.equals(paciente.getNome())){
                                System.out.print("Digite o primeiro nome do paciente: ");
                                String nomeAlterar = ler.next();
                                System.out.print("Digite o sobrenome do paciente: ");
                                String sobrenomeAlterar = ler.next();
                                paciente.setNome(nomeAlterar);
                                paciente.setSobrenome(sobrenomeAlterar);
                            }else{
                                System.out.println("Paciente não encontrado!");
                            }

                        }
                    }catch (Exception e){
                        System.out.println("[ERRO] O nome digitado não é um texto!");
                    }
                }
                case 3 -> {
                    ler.nextLine();
                    System.out.print("Digite o nome completo do paciente que você deseja atender: ");
                    String nomeCompleto = ler.nextLine();
                    for (Paciente paciente : pacientes) {
                        if (nomeCompleto.equals(paciente.getNome())){
                            Atendimento atendimento = new Atendimento();
                            System.out.println("Digite a descrição do atendimento: ");
                            String descricao = ler.nextLine();
                            atendimento.setDescricao(descricao);
                            System.out.print("Digite o dia do atendimento: ");
                            int dia = ler.nextInt();
                            System.out.print("Digite o mês do atendimento ");
                            int mes = ler.nextInt();
                            System.out.print("Digite o ano do atendimento ");
                            int ano = ler.nextInt();
                            LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
                            atendimento.setData(dataNascimento);
                            paciente.adicionarConsulta(atendimento);
                        }
                        else{
                            System.out.println("Nome não encontrado");
                        }
                    }
                }
                case 4 -> {
                    for(Paciente paciente: pacientes){
                        if(paciente.isAtivo()){
                            System.out.println(paciente+ " ,ativo");
                        }
                        else{
                            System.out.println(paciente+ " ,desativo");
                        }
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }
                }
                case 5 -> {
                    try {
                        ler.nextLine();
                        System.out.print("Digite o nome completo do paciente que deseja mostrar: ");
                        String nomeCompleto = ler.nextLine();
                        for (Paciente paciente : pacientes) {
                            if (nomeCompleto.equals(paciente.getNome())){
                                System.out.println(paciente);
                                int i =1;
                                for (Atendimento a : paciente.getAtendimentos()) {
                                    if(i==5){
                                        System.out.println(a);
                                        System.out.println("-----------------------------------------------------------");
                                        i = 1;
                                        System.out.println(i);
                                    }else {
                                        System.out.println(a);
                                        ++i;
                                    }
                                    if(a == null){
                                        System.out.println("Paciente não marcou consulta");
                                    }
                                }

                            }
                        }
                    }catch (Exception e){
                        System.out.println("Erro: "+e);
                    }
                }
                case 6 -> {
                    ler.nextLine();
                    System.out.print("Digite o nome completo do paciente que deseja apagar: ");
                    String nomeCompleto = ler.nextLine();
                    for (Paciente paciente : pacientes) {
                        if (nomeCompleto.equals(paciente.getNome())){
                            pacientes.remove(paciente);
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    k=1;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
