/* Write a program to the pass by value concept. */

public class PassByValue {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before calling the method: " + num);

        // Call a method that increments the value
        incrementValue(num);

        System.out.println("After calling the method: " + num);
    }

    // Method to increment the value (pass by value)
    public static void incrementValue(int x) {
        x++;
        System.out.println("Inside the method: " + x);
    }
}
