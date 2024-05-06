import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		CustomerOperations customerOperations = new CustomerOperations();
        AccountOperations accountOperations = new AccountOperations();

		while (true) {
			Menu mainMenu = new Menu("[ Menu Principal ]", Arrays.asList(
                "Conta",
                "Cliente",
                "Operacoes",
                "Sair"
			));

			Menu accountMenu = new Menu("[ Menu Conta ]", Arrays.asList(
                "Abrir Conta",
                "Listar Contas",
                "Realizar Transacao",
                "Visualizar Saldo",
                "Voltar"
			));

			Menu customerMenu = new Menu("[ Menu Cliente ]", Arrays.asList(
                "Cadastrar Cliente",
                "Listar Clientes",
                "Voltar"
			));

			Menu operationMenu = new Menu("[ Menu Operacoes ]", Arrays.asList(
                "Depositar",
                "Sacar",
                "Transferir",
                "Gerar Relatorio de Transacoes",
                "Voltar"
			));

			System.out.println("\n--------------------------------\n");
			int mainOption = mainMenu.getSelection();
			switch (mainOption) {
				case 1:
					System.out.println("\n--------------------------------\n");
					int accountOption = accountMenu.getSelection();
					handleAccountOption(accountOption, accountOperations);
					break;
				case 2:
					System.out.println("\n--------------------------------\n");
					int customerOption = customerMenu.getSelection();
					handleCustomerOption(customerOption, customerOperations);
					break;
				case 3:
					System.out.println("\n--------------------------------\n");
					int operationOption = operationMenu.getSelection();
					handleOperationOption(operationOption);
					break;
				case 4:
					return;
				default:
					System.out.println("Opção inválida!");
			}
		}
    }

    private static void handleAccountOption(int option, AccountOperations accountOperations) {
        switch (option) {
            case 1:
                accountOperations.openAccount();
                break;
            case 2:
                accountOperations.listAccounts();
                break;
            case 3:
                System.out.println("Realizando Transacao...");
                break;
            case 4:
                System.out.println("Visualizando Saldo...");
                break;
            case 5:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void handleCustomerOption(int option, CustomerOperations customerOperations) {
		System.out.println();
        switch (option) {
            case 1:
				customerOperations.registerCustomer();
                break;
            case 2:
				customerOperations.listCustomers();
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void handleOperationOption(int option) {
        switch (option) {
            case 1:
                System.out.println("Realizando Depósito...");
                break;
            case 2:
                System.out.println("Realizando Saque...");
                break;
            case 3:
                System.out.println("Realizando Transferência...");
                break;
            case 4:
                System.out.println("Gerando Relatório...");
                break;
            case 5:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
