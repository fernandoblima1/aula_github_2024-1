import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerOperations {
    private List<Customer> customers;

    public CustomerOperations() {
        this.customers = new ArrayList<>();
    }

    public void registerCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cadastrar Cliente ---");

        System.out.print("Nome: ");
        String firstName = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String lastName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String phone = scanner.nextLine();

        Customer customer = new Customer(firstName, lastName, email, phone);
        customers.add(customer);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listCustomers() {
        System.out.println("Lista de Clientes:");

        if (customers.isEmpty()) {
            System.out.println("Vazia!");
            return;
        }

        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". " + customers.get(i).getFullName());
        }
    }
}
