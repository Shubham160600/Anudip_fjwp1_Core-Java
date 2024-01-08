package Shubh;

import java.io.Console;

public class ConsoleInputExample1 {
    public static void main(String[] args) {
        // Obtain a reference to the console
        Console console = System.console();

        // Check if the console is available
        if (console == null) {
            System.out.println("Console not available. Please run this program from a console environment.");
            return;
        }

        // Read the user's name using readLine() from the console
        String name = console.readLine("Enter your name: ");

        // Display a greeting using the entered name
        System.out.println("Hello, " + name + "!");
    }
}
