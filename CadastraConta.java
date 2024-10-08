import java.util.ArrayList;
import java.util.List;

public class CadastraConta {
    private List<Conta> contas;

    public CadastraConta() {
        this.contas = new ArrayList<>();
    }

    public void cadastrarConta(String cpfCliente) {
        Conta novaConta = new Conta(cpfCliente);
        contas.add(novaConta);
        System.out.println("Conta cadastrada com sucesso para o CPF: " + cpfCliente);
    }

    public List<Conta> getContas() {
        return contas;
    }
}
