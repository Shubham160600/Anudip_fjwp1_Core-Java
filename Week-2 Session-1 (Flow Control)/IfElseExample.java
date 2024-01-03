package shubham;

public class IfElseExample {
    public static void main(String[] args) {
        int age = 10;

        // Checks if age is greater than or equal to 18 and executes the following block.
        if (age >= 18) {
            System.out.println("You are an adult."); // Output from if
        }
        // Executes this block if the number is less than 18.
        else {
            System.out.println("You are a minor."); // Output from else
        }

        // This statement will be executed irrespective of the outcome of the if...else statement.
        System.out.println("Statement outside if...else block");
    }
}
