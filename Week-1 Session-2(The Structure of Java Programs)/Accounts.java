package shubham;

public enum Accounts {
    // Declaring the constants of the enum with their corresponding minimum balance
    CURRENT(10000.0),
    SAVINGS(5000.0),
    SALARY(2000.0),
    NRI(20000.00);

    // Instance variable of the enum to store minimum balance
    double minimumBalance;

    // Constructor to initialize the minimum balance for each account type
    Accounts(double balance) {
        this.minimumBalance = balance;
    }

    // Enum method, it can be static also
    public static void enumMethod() {
        // Iterating over the values of the enum and printing minimum balance information
        for (Accounts ac : Accounts.values()) {
            System.out.printf("Minimum Balance required for %s account is %.2f %n", ac, ac.minimumBalance);
        }
    }

    public static void main(String[] args) {
        // Calling the enumMethod to display minimum balance information
        enumMethod();
    }
}

