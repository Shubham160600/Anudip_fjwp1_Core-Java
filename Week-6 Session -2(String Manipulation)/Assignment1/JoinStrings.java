/* Write a program to join two string. */

package shubham;

public class JoinStrings {
    public static void main(String[] args) {
        // Two strings to be joined
        String str1 = "Hello";
        String str2 = "World";

        // Joining the strings using the concat() method
        String result = str1.concat(" ").concat(str2);

        // Alternatively, you can use the + operator for concatenation
        // String result = str1 + " " + str2;

        System.out.println("Joined String: " + result);
    }
}
