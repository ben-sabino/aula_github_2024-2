import java.util.ArrayList;
import java.util.List;

class Conta {
    private double saldo;
    private List<String> transacoes; // Lista para registrar as transações

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
        transacoes.add("Conta criada com saldo inicial de: R$" + saldoInicial);
    }

    // Método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        saldo += valor;
        transacoes.add("Depósito de: R$" + valor + " | Saldo atual: R$" + saldo);
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add("Saque de: R$" + valor + " | Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
            transacoes.add("Tentativa de saque falhou por saldo insuficiente. Valor: R$" + valor);
        }
    }

    // Método para emitir o relatório de transações
    public void emitirRelatorioTransacoes() {
        System.out.println("\nRelatório de Transações:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}