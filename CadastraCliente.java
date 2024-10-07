import java.util.Scanner;

public class CadastraCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        CadastraCliente cadastraCliente = new CadastraCliente();
        cadastraCliente.criaCliente(nome, cpf);

        scanner.close();
    }

    public void criaCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        System.out.println("Cliente criado:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
    }
}
