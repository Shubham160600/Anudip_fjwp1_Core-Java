/* Write a Java program to check if a given string is a palindrome. Use a stack to help you compare characters from the beginning and end of the string. 
 * Do not use any String functionalities to reverse the String. Use Stack data structure. You can use (A string is called Palindrome if the reverse of 
 * the string is the same as the original string. Example: “racecar”). */

package shubham;

import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Example usage
        String inputString = "racecar";

        if (isPalindrome(inputString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push half of the characters into the stack
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            stack.push(input.charAt(i));
        }

        // Compare remaining characters with the characters popped from the stack
        int startIndex = (length % 2 == 0) ? length / 2 : length / 2 + 1;
        for (int i = startIndex; i < length; i++) {
            if (input.charAt(i) != stack.pop()) {
                return false; // Characters do not match
            }
        }

        return true; // All characters match, string is a palindrome
    }
}
