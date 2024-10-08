public class Conta {
    private String cpfCliente;
    private double saldo;

    public Conta(String cpfCliente) {
        this.cpfCliente = cpfCliente;
        this.saldo = 0.0;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public double getSaldo() {
        return 0;
    }

    public void depositar(double valor) {
    }

    public boolean sacar(double valor) {
        return true;
    }
}
