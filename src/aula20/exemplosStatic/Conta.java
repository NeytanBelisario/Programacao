package aula20.exemplosStatic;

import java.util.Random;

public class Conta {
    String titular;
    String identificador;
    String senha;
    float saldo;
    static String nomeBanco;

    Conta(String titular, String senha, float deposito) {
        this.titular = titular;
        this.senha = senha;
        saldo = deposito;
        geraIdentificador();
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    void geraIdentificador(){
        Random aleatorio = new Random();
        String identificador = "";
        for(int i=0; i<4; i++){
            identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000, 2000);
        this.identificador = identificador;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }

    public float verificarSaldo() {
        return saldo;
    }
}