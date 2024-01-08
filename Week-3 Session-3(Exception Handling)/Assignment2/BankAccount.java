/* Write a Java program to simulate a simple banking application. 
 * ● Create a class BankAccount with a balance and methods for deposit and withdrawal. 
 * ● Implement exception handling for withdrawal operations to prevent overdrawing. 
 * ● Handle the scenario when the withdrawal amount is greater than the balance. */

package shubham;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        try {
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        scanner.close();
    }
}
