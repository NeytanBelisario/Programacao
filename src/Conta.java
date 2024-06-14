public class Conta {
    String titular;
    String identificador;
    String senha;
    float saldo;

    public Conta() {
        saldo = 0;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void sacar(float valor) {
        saldo -= valor;
    }

    public float verificarSaldo() {
        return saldo;
    }
}