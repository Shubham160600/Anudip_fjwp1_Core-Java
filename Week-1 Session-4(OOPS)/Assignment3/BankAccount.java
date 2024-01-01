//package Assignment3;

public class BankAccount {
    private double accountBalance;
    private String accountHolderName;
    private BankName bankName;

    // Constructor
    public BankAccount(double accountBalance, String accountHolderName, BankName bankName) {
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
    }

    public void printBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public void calculateInterest(int numberOfYears) {
        double totalInterest = bankName.getInterestRate() * numberOfYears * accountBalance;
        System.out.println("Total Interest: " + totalInterest);
    }

    public static void main(String[] args) {
        // Instantiation
        BankAccount account = new BankAccount(12000, "Harry", BankName.SBI);

        // Print bank name
        account.printBankName();

        // Calculate and print total interest
        account.calculateInterest(3); // Assuming 3 years for example
    }
}
