public class Conta {
    private String cpfCliente;
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }