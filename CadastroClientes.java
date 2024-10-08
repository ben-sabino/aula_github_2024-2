import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
    private List<Cliente> clientes;

    public CadastroClientes() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Lista de Clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
