package aula22.exemploExcecoes;

public class Operacoes {
    public int divide(int n1, int n2) throws ArithmeticException{
        if(n2==0){
            throw  new ArithmeticException("Não pode dividr por 0");
        }
        return n1/n2;
    }
}
