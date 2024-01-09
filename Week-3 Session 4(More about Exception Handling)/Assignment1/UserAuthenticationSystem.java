/* You are building a user authentication system. Create a custom exception called InvalidCredentialsException to handle cases where the user provides incorrect login credentials. Implement it in a sample login method. 
 * (you have to take value from user and if value is not as value you are expecting the throw exception). */

package shubham;

import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class UserAuthenticationSystem {

    public static void main(String[] args) {
        try {
            login();
            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

    public static void login() throws InvalidCredentialsException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Check if the entered credentials are correct (for demonstration purposes)
        String expectedUsername = "admin";
        String expectedPassword = "password123";

        if (!enteredUsername.equals(expectedUsername) || !enteredPassword.equals(expectedPassword)) {
            // Throw the custom exception if credentials are incorrect
            throw new InvalidCredentialsException("Invalid username or password");
        }

        // Close the scanner
        scanner.close();
    }
}
