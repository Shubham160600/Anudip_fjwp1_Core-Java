package shubham;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int age = 18;

        // Checks if the age is below 5.
        if (age < 5) {
            System.out.println("You are eligible for a free ride.");
        }
        // Checks if age is between 5 and 12.
        else if (age < 12) {
            System.out.println("You have to pay half the fare.");
        }
        // Checks any other age (above or equal to 12).
        else {
            System.out.println("Please pay the full fare.");
        }
    }
}
