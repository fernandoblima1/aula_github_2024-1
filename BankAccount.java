public class BankAccount {
    private String accountNumber;
    private String accountType;
    private double balance;
    private String customerName;

    public BankAccount(String accountNumber, String accountType, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

}
