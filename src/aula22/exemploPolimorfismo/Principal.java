package aula22.exemploPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        Aluno a1 = new Aluno();
        a1.setNome("Neytan");
        a1.setSobrenome("Belisário");
        a1.setMatricula("ad1342");

        System.out.println(p1.obterDados());
        System.out.println(a1.obterDados());
    }
}
