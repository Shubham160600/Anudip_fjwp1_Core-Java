package shubham;

/*
* Example to explain Do while loops in Java
*/
public class DoWhileExample {
    public static void main(String[] args) {
        int num = 6;

        // Do-while loop
        do {
            System.out.println("Number is: " + num);
            num++;
        } while (num < 5); // Condition is false in the beginning.

        // The following line will be executed after the loop.
        System.out.println("The value of count after the loop is " + num);
    }
}