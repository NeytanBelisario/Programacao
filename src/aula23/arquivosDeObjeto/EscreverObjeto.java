package aula23.arquivosDeObjeto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EscreverObjeto {
    public static void main(String[] args) {
        //Objeto para manipular o caminho para o arquivo
        File caminho = new File("C:/Users/Cimol/Documents/aula23_tarde");
        //Testando se o caminho existe
        if(caminho.exists()){
            System.out.println("A pasta existe.");
        }else{
            //Criando ele se não existir
            caminho.mkdirs();
            System.out.println("Caminho criado.");
        }
        //Declarando o arquivo para salvar a Pessoa
        File arquivo = new File(caminho,"pessoa.db");
        //Mostrar o caminho completo do arquivo
        System.out.println(arquivo.getAbsolutePath());
        try{
            ObjectOutputStream arquivoObj =
                    new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            Pessoa[] lista = new Pessoa[10];
            Scanner ler = new Scanner(System.in);
            String opc;
            int cont=0;
            do{
                System.out.println("Lendo informação da Pessoa: "+(cont+1));
                System.out.println("Qual o nome: ");
                String nome = ler.next();
                System.out.println("Qual o sobrenome: ");
                String sobrenome = ler.next();
                lista[cont] = new Pessoa();
                lista[cont].setNome(nome);
                lista[cont].setSobrenome(sobrenome);
                System.out.println("Tem mais Pessoa? (s/n)");
                opc = ler.next().toLowerCase();
                cont++;
            }while(opc.equals("s"));
            //Criar uma instância de Pessoa
//            Pessoa p1 = new Pessoa();
//            p1.setNome("Jonas");
//            p1.setSobrenome("Da Silva");
            //Gravar a pessoa no arquivo
            arquivoObj.writeObject(lista);
            //Fechar o arquivo
            arquivoObj.close();
        }catch(IOException e){
            System.out.println("Erro ao criar o arquivo");
        }
    }
}
