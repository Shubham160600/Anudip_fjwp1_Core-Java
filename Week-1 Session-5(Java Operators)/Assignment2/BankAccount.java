/* 
Write a Java program that allows the user to create a bank account and
perform transactions such as deposit, withdrawal, and balance inquiry. Using a
conditional operator (ternary operator ), display the message whether minimum balance
is maintained or not.
Steps:
● Create a class BankAccount
● Add three member variables: String accountHolderName , int accountNumber
and int balance;
● Add a constructors using all three members
● Add getters and setters.
● Add method deposit (int), withdraw(int)
● Implement the methods by increasing or decreasing the balance
● In the main method create a bank account
● Withdraw money from this account and/or deposit into this account
● Get the balance
● Create a string variable “status” inside the main method
● Assign values to status as “Minimum Balance Maintained” if balance is above or
equal to 5000. Otherwise values of status will be “Minimum Balance not
Maintained”. Use conditional operator (ternary operator ) to assign the values of
the status.
● Display the status. */

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
