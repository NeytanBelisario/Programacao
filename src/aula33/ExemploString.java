package aula33;

public class ExemploString {
    public static void main(String[] args) {
        String Nome = "Jonas ";
        String Sobrenome = "Da silva";
        String nomeCompleto = Nome.concat(Sobrenome);
        System.out.println("Nome Completo: "+nomeCompleto);
        nomeCompleto = nomeCompleto.toUpperCase();
        System.out.println("Nome: "+nomeCompleto);
        nomeCompleto = nomeCompleto.toLowerCase();
        System.out.println("Nome: "+nomeCompleto);
        System.out.println("Qual a posição da letra 'a' na String: "+ nomeCompleto.indexOf("a"));
        System.out.println("Qual a posição da última letra 'a' na String: "+ nomeCompleto.lastIndexOf("a"));
        System.out.println("A string começa com a letra j: "+nomeCompleto.startsWith("j"));
        System.out.println("A string termina com a letra j: "+nomeCompleto.endsWith("j"));

        String frase = "Aula de Programação";
        System.out.println(frase);
        frase = frase.replace("Programação", "Programação 2");
        System.out.println(frase);
        String[] vetor = frase.split(" ");
        for(String palavra:vetor)
            System.out.println(palavra);
    }
}
