package shubham;

public class Unboxing {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive to wrapper class object
        Integer wrapperInt = 42;
        Double wrapperDouble = 3.14;
        Character wrapperChar = 'A';

        // Display the values of wrapper objects
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Wrapper Character: " + wrapperChar);

        // Unboxing: Converting wrapper class object back to primitive
        int unboxedInt = wrapperInt; // Unboxing
        double unboxedDouble = wrapperDouble; // Unboxing
        char unboxedChar = wrapperChar; // Unboxing

        // Display the unboxed values
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Unboxed double: " + unboxedDouble);
        System.out.println("Unboxed char: " + unboxedChar);
    }
}
