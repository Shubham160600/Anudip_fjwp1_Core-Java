package com.anudip.example;

// Interface with an abstract method and a static method
interface MathOperation {
    // Regular abstract method
    int sub(int a, int b);

    // Static method in interface
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodDemo implements MathOperation {
    public static void main(String[] args) {
        StaticMethodDemo demo = new StaticMethodDemo();
        int x = 10;
        int y = 5;

        // Using the static method from the interface
        int sum = MathOperation.add(x, y);
        System.out.println("Sum: " + sum);

        // Creating an instance of a class that implements the interface
        int diff = demo.sub(x, y);
        System.out.println("Difference: " + diff);
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
