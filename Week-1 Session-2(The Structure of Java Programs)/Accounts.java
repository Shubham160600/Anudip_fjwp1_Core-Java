package shubham;

public enum Accounts {
	//Declaring the constants of the enum
	CURRENT (10000.0),
	SAVINGS (5000.0),
	SALARY (2000.0),
	NRI (20000.00);
	//Instance variable of the enum
	double minimumBalance;
	//Constructor
	Accounts(double balance) {
	this.minimumBalance=balance;
	}
	//Enum method, it can be static also
	public static void enumMethod() {
	for (Accounts ac : Accounts.values())
	System.out.printf("Minimum Balance required for %s account is %.2f %n", ac, ac.minimumBalance);
	}
	public static void main(String[] args) {
	enumMethod();
	}
	}
