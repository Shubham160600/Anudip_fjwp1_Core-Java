import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);

        // Take input for marks of five subjects
        System.out.println("Enter marks for five subjects (out of 100):");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();
        System.out.print("Subject 5: ");
        int subject5 = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate total marks and average
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double average = totalMarks / 5.0;

        // Assign grades based on average marks
        String grade;
        if (average > 90) {
            grade = "Ex";
        } else if (average > 80) {
            grade = "A";
        } else if (average > 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Display the result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
