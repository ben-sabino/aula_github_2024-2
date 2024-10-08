import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String cpfCliente;
    private double saldo;
    private List<String> transacoes; // Lista para registrar as transações

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        this.transacoes = new ArrayList<>();
        transacoes.add("Conta criada com saldo inicial de: R$" + saldoInicial);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        transacoes.add("Depósito de: R$" + valor + " | Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add("Saque de: R$" + valor + " | Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
            transacoes.add("Tentativa de saque falhou por saldo insuficiente. Valor: R$" + valor);
        }
    }

    public void emitirRelatorioTransacoes() {
        System.out.println("\nRelatório de Transações:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}