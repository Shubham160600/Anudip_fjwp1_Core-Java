package saurabh;

public class OuterClass {
    // Outer class members and methods
    int nonStatic = 30;
    static int staticVar = 10;

    // Static nested class
    public static class StaticNestedClass {
        // Static nested class members and methods
        int innerVal = 100;

        void testMethod() {
            // This is not allowed as we cannot access
            // non-static member of the outer class.
            // nonStatic = 30;

            // Accessing static variable of the outer class.
            // This is allowed.
            staticVar = 40;
            System.out.println(staticVar);
        }

        static void message() {
            System.out.println("Static Method");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the StaticNestedClass
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();

        // Accessing the variable of the nested class.
        System.out.println(nestedObj.innerVal);

        // Calling the methods of the nested class.
        nestedObj.testMethod();

        // No need to create an instance of the static nested class
        // to call the static method.
        OuterClass.StaticNestedClass.message();
    }
}
