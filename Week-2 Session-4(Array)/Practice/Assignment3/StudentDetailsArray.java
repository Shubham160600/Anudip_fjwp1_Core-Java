package shubham;

import java.util.Scanner;

class Student {
    private int stdId;
    private String stdName;
    private double stdMark;

    // Constructor to initialize student details
    public Student(int stdId, String stdName, double stdMark) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdMark = stdMark;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + stdId);
        System.out.println("Student Name: " + stdName);
        System.out.println("Student Marks: " + stdMark);
        System.out.println();
    }
}

public class StudentDetailsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of Student objects
        Student[] students = new Student[3];

        // Input student details from the user
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            int stdId = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Student Name: ");
            String stdName = sc.nextLine();
            System.out.print("Student Marks: ");
            double stdMark = sc.nextDouble();

            // Create a Student object and store it in the array
            students[i] = new Student(stdId, stdName, stdMark);
        }

        // Display student details
        System.out.println("Student Details:");
        for (Student student : students) {
            student.displayDetails();
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
