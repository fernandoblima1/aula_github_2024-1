import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountOperations {
    private List<BankAccount> accounts;

    public AccountOperations() {
        this.accounts = new ArrayList<>();
    }

    public void openAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Abrir Conta ---");

        System.out.print("Número da Conta: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Tipo da Conta (Corrente/Poupança): ");
        String accountType = scanner.nextLine();

        System.out.print("Saldo Inicial: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nome do Cliente: ");
        String customerName = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountType, initialBalance, customerName);
        accounts.add(account);

        System.out.println("Conta aberta com sucesso!");
    }

    public void listAccounts() {
        System.out.println("Lista de Contas:");

        if (accounts.isEmpty()) {
            System.out.println("Vazia!");
            return;
        }

        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ". " + accounts.get(i).getAccountNumber() + " - " +
                accounts.get(i).getAccountType() + " - " +
                accounts.get(i).getCustomerName());
        }
    }
}
