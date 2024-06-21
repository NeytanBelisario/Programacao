package aula20.exemploHeranca;

public class Engenheiro extends Funcionario{
    private String CREA;

    public Engenheiro(String nome, String sobrenome, int matricula){
        super(nome,sobrenome,matricula);
    }

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }
}
