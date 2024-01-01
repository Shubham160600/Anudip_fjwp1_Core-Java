import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);

        // Take input for average and age
        System.out.print("Enter average: ");
        double average = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display student details based on conditions
        if (average > 70 && age > 21) {
            System.out.println("Student Details:");
            System.out.println("Average: " + average);
            System.out.println("Age: " + age);
        } else {
            System.out.println("Student does not meet the conditions.");
        }
    }
}
