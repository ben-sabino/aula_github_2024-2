import java.util.List;
import java.util.Scanner;

public class Menu {
    private String titulo;
    private List<String> opcoes;

    public Menu(String titulo, List<String> opcoes) {
        this.titulo = titulo;
        this.opcoes = opcoes;
    }

    public int getSelection() {
        int op = 0;
        boolean valid = false;
        Scanner scanner = new Scanner(System.in);
        
        while (!valid) {
            System.out.println(titulo);
            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println((i + 1) + ". " + opcoes.get(i));
            }
            System.out.print("Informe a opção desejada: ");
            String str = scanner.nextLine();

            try {
                op = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                op = 0; // Define a opção como 0 em caso de erro
            }

            if (op < 1 || op > opcoes.size()) {
                System.out.println("Opção errada!");
                op = 0; // Define a opção como 0 para continuar no loop
            } else {
                valid = true; // Opção válida
            }
        }
        return op - 1; // Retorna o índice baseado em 0
    }
}
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private String title;
	private List<String> options;

	public Menu(List<String> options) {
		this.title = "Menu";
		this.options = options;
	}

	public Menu(String title, List<String> options) {
		this.title = title;
		this.options = options;
	}

	public int getSelection() {
		int op = 0;
		while (op==0){
			System.out.println(title+"\n");
			int i=1;
			for (String option : options) {
				System.out.println(i++ + " - " + option);
			}

			System.out.println("Informe a opcao desejada. ");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			try {
				op = Integer.parseInt(str);
			}
			catch (NumberFormatException e) {
				op =0;
			}
			if (op>=i){
				System.out.println("Opcao errada!");
				op=0;
			}

		}
		return op;
	}
}
