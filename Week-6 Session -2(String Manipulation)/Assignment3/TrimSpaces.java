/* Write a program to trim the unwanted space of the variables. */

package shubham;

public class TrimSpaces {
    public static void main(String[] args) {
        // String variable with leading and trailing spaces
        String input = "   Trim   ";
        
        // Using trim() method to remove leading and trailing spaces
        String trimmedString = input.trim();
        
        // Print the original and trimmed strings
        System.out.println("Original String: '" + input + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
