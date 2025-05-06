public class BankApplication {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(500);

        // Perform operations
        savings.deposit(200); // Depositing money
        savings.withdraw(100); // Allowed withdrawal
        savings.withdraw(550); // Withdrawal denied (balance would fall below minimum)
        System.out.println("Final balance: " + savings.getBalance());
    }
}