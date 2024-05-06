import java.util.List;
import java.util.Scanner;

public class Menu {
    private String title;
    private List<String> options;

    public Menu(List<String> options) {
        this("Menu", options);
    }

    public Menu(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    public int getSelection() {
        int op = 0;
        Scanner scanner = new Scanner(System.in);

        while (op == 0) {
            System.out.println(title + "\n");
            int i = 1;

            for (String option : options) {
                System.out.println(i++ + " - " + option);
            }

            System.out.println("Informe a opcao desejada: ");
            String input = scanner.nextLine();

            try {
                op = Integer.parseInt(input);

                if (op < 1 || op > options.size()) {
                    System.out.println("Opcao errada! Por favor, escolha uma opcao válida.\n");
                    op = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opcao invalida! Por favor, digite um número correspondente a uma opcao do menu.\n");
            }
        }

        return op;
    }
}
