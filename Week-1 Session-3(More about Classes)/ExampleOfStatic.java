package saurabh;

public class ExampleOfStatic {
    // Static variables
    static String countryName = "India";
    static String currency = "INR";

    // Static method
    static void display() {
        System.out.println("Welcome!");
    }

    // Non-static field
    int nonStaticField = 20;

    public static void main(String[] args) {
        // Calling static fields and method using the class name
        System.out.println(ExampleOfStatic.countryName);
        System.out.println(ExampleOfStatic.currency);
        ExampleOfStatic.display();

        // The following line will produce a compilation error
        // because a non-static field cannot be accessed by the class name.
        // System.out.println(ExampleOfStatic.nonStaticField);
    }
}
