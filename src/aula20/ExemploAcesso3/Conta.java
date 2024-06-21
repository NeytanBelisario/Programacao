package aula20.ExemploAcesso3;

import java.util.Random;

public class Conta {
    private String titular;
    private String identificador;
    private String senha;
    private float saldo;
    static String nomeBanco;

    Conta(String titular, String senha, float deposito) {
        this.titular = titular;
        this.senha = senha;
        saldo = deposito;
        geraIdentificador();
    }

    public String getTitular(){
        return titular;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    private void geraIdentificador(){
        Random aleatorio = new Random();
        identificador = "";
        for(int i=0; i<4; i++){
            identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000, 2000);
        this.identificador = identificador;
    }

    public String getIdentificador(){
        return identificador;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }

    public float verificarSaldo() {
        return saldo;
    }
}