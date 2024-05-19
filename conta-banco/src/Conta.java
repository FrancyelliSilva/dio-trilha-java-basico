public class Conta {
    private int numeroConta;
    private int agencia;
    private int digito;

    public Conta(int numeroConta, int agencia, int digito) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.digito = digito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getDigito() {
        return digito;
    }
}
