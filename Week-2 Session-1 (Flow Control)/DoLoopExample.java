package shubham;

/*
A simple program to explain Do loop in Java
*/
public class DoLoopExample {
    public static void main(String[] args) {
        int count = 0;

        // While loop to iterate as long as the condition (count < 5) is true
        while (count < 5) {
            System.out.println("Count is: " + count);
            count++; // Increment count in each iteration
        }

        // The following line will be executed after the loop.
        System.out.println("The value of count after the loop is " + count);
    }
}
