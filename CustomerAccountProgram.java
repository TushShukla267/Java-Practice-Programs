import java.util.Scanner;

class CustomerAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public CustomerAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " successfully. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully. Current balance: " + balance);
        }
    }

    public void displayBalance() {
        System.out.println("Current balance for " + name + "'s account (" + accountNumber + "): " + balance);
    }}
public class CustomerAccountProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Customer Account System");

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        CustomerAccount customer = new CustomerAccount(name, accountNumber);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Display Balance");
            System.out.println("4) Exit");

            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    customer.withdraw(withdrawAmount);
                    break;
                case 3:
                    customer.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the Customer Account System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1/2/3/4).");}}}}