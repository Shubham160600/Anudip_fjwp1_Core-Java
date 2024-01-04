package shubham;

public class Autoboxing {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive to wrapper class object
        int primitiveInt = 42;
        Integer wrapperInt = primitiveInt; // Autoboxing

        double primitiveDouble = 3.14;
        Double wrapperDouble = primitiveDouble; // Autoboxing

        char primitiveChar = 'A';
        Character wrapperChar = primitiveChar; // Autoboxing

        // Display the values
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);

        System.out.println("Primitive char: " + primitiveChar);
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
