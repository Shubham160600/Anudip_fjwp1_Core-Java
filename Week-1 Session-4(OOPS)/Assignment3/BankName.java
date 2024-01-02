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

public enum BankName {
    ICICI(6.3),
    HDFC(5.8),
    SBI(6.0);

    private double interestRate;

    // Constructor
    BankName(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}