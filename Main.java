import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		System.out.println(mainMenu.getSelection() + "foi selecionada");
		System.out.println("Fim");
	}

}
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
        int selection = mainMenu.getSelection();
        System.out.println((selection + 1) + " foi selecionada");

        CadastroClientes cadastro = new CadastroClientes();
        Scanner scanner = new Scanner(System.in);

        if (selection == 1) { // Se a opção "Cliente" for selecionada
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o email do cliente: ");
            String email = scanner.nextLine();

            Cliente novoCliente = new Cliente(nome, email);
            cadastro.adicionarCliente(novoCliente);
            cadastro.listarClientes(); // Opcional: lista os clientes após adicionar
        }

        System.out.println("Fim");
    }
}
