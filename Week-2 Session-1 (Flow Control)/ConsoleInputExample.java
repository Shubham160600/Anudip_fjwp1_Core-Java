package shubham;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader to read input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the entered name using readLine()
        String name = br.readLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Read the entered age as a string using readLine()
        // Convert the string to an integer using parseInt()
        int age = Integer.parseInt(br.readLine());

        // Display the entered name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Close the BufferedReader to release system resources
        br.close();
    }
}
