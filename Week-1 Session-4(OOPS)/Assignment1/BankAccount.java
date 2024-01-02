/* 
● Create a BankAccount class that.
● BankAccount class should have three fields accoundHolderName (String), bankName(String), accountBalance(double).
● Create a constructor that takes account holder’s name, bankname and initial balance.
● Add three methods to the interface - getBalance(), deposit() and withdraw().
● Implement all three methods.
● In the main method create three bank accounts withdifferent account holders names and ICICI, HDFC and SBI as banknames.
● Deposit and withdraw money for each account. Displaytheaccount balance. */

interface BankOperations {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}

class BankAccount implements BankOperations {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    @Override
    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        }
    }

    private void displayBalance() {
        System.out.println("Current Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Shubham", "ICICI", 5000);
        BankAccount account2 = new BankAccount("Ram", "HDFC", 10000);
        BankAccount account3 = new BankAccount("Saurav", "SBI", 15000);

        account1.deposit(2000);
        account2.withdraw(500);
        account3.deposit(3000);
    }
}
