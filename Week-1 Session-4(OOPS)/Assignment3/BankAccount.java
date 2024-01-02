/* 
● Create an enum BankName.
● Create a constructor of the enum which takes a parameter interestRate of type double.
● Create the enum constant -ICICI (6.3), HDFC(5.8), SBI (6.0).
● Now in the BankAccount class of previous exercise, modifythetype of bankName to enum BankName. Change constructor accordingly.
● Modify the instantiation of a new Account accordingly. (Example: new
BankAccount(12000, "Harry", BankName.SBI);
● Print the bankName for each account.
● Add a method which calculates total interest - calculateInterest(int numberOfYears). The interest will be calculated basedoninterest 
rate and available balance. Print total interest. [ Hints: double totalInterest = bankName.interestRate* numberOfYears * accountBalance;].
 */

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
