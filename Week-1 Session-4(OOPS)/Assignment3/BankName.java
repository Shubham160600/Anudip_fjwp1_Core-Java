//package Assignment3;

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