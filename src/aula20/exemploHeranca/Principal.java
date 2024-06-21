package aula20.exemploHeranca;

public class Principal {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("João", "Silva", 123);
        m1.setSalario(1200);
        m1.setCnh("17898754");
        System.out.println("Nome do motorista: "+m1.getNome()+" "+m1.getSobrenome());
        System.out.println("Recebe: "+String.format("%.2f", m1.getSalario()));

        Engenheiro e1 = new Engenheiro("Marcos", "Aurélio", 123456);
        e1.setSalario(3500);
        e1.setCREA("licenciado");
        System.out.println("Nome do Engenheiro: "+e1.getNome()+" "+e1.getSobrenome());
        System.out.println("Recebe: "+String.format("%.2f", e1.getSalario()));
    }
}
