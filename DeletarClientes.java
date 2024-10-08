import java.util.List;

public class DeletarCliente {

    // Método para deletar cliente pelo nome
    public static void deletarClientePorNome(CadastroClientes cadastro, String nome) {
        List<Cliente> clientes = cadastro.getClientes();
        Cliente clienteParaRemover = null;

        // Percorre a lista de clientes para encontrar o cliente com o nome especificado
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                clienteParaRemover = cliente;
                break;
            }
        }

        // Remove o cliente se encontrado
        if (clienteParaRemover != null) {
            clientes.remove(clienteParaRemover);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
