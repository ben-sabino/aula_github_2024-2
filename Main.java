import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Consultar Saldo", "Emitir Relatório de Transações"));
		System.out.println(mainMenu.getSelection() + "foi selecionada");
		System.out.println("Fim");
	}

}