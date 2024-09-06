package aula31.ExemploInterface;

public class Vetor implements Lista{
    private String[] elementos;
    private int tamanho;
    /**
    * Cria uma instância de Vetor com capacidade elementos
    * @param capacidade capacidade incial da lista
    */
    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }

    /**
     * Método que permite adicionar um elemento ao final da lista
     * @param elemento elemento que será adicionado
     */

    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }

    /**
     * Método remove o ultimo elemento da lista
     * @return retorna o elemento removido
     */

    @Override
    public String remove(){
        if(tamanho>0){
            return elementos[--tamanho];
        }
        return null;
    }

    /**
     * Retorna a quantidade de elementos atualmente na lista
     * @return um inteiro contendo a quantidade de elementos
     */

    public int getTamanho(){
        return tamanho;
    }

    /**
     * Monta uma String com os elementos presentes na lista
     * @return um elemento vazio nas listas vazias = [] ou um conjunto com os elementos da lista = ['A' 'B' 'n']
     */
    @Override
    public String toString(){
        String resultado = "[";
        if(tamanho>0){
            for(int i=0; i< tamanho; i++){
                resultado+=elementos[i]+" ";
            }
        }
        resultado+="]";
        return resultado;
    }
}
