public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }

    public static void main(String[] args) {
        // Create a bank account
        BankAccount myAccount = new BankAccount("John Doe", 123456, 6000);

        // Withdraw and deposit
        myAccount.withdraw(2000);
        myAccount.deposit(1000);

        // Get the balance
        System.out.println("Balance: " + myAccount.getBalance());

        // Determine status using ternary operator
        String status = (myAccount.getBalance() >= 5000) ? "Minimum Balance Maintained"
                : "Minimum Balance not Maintained";

        // Display the status
        System.out.println("Status: " + status);
    }
}
