import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente c = cadastro();
        ContaBancaria conta = new ContaBancaria(c, 1000);

        List<String> options = Arrays.asList("Depositar", "Sacar", "Exibir Saldo","Sair");
        Menu menu = new Menu("Menu Principal", options);

        while (true) {
            int op = menu.getSelection();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibir_saldo();
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    public static Cliente cadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

       
        
        Cliente cliente = criaCliente(nome, cpf);
        return cliente;
        
    }

    public static Cliente criaCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        System.out.println("Cliente criado:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        return cliente;
    }
}


