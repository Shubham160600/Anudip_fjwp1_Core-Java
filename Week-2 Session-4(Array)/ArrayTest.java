package shubham;

public class ArrayTest {
    public static void main(String[] args) {
        double[] myArr = new double[200];
        String[] messages = new String[15];

        // Print the length of the double array
        System.out.println("The length of the double array = " + myArr.length);

        // As arrays are also objects (Base class of all Java classes),
        // we can invoke Object's method for an array
        System.out.println("The hashCode() of String array returned " + messages.hashCode());
    }
}
