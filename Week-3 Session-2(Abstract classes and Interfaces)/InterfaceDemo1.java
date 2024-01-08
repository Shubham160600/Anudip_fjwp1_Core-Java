/* New features added in interfaces in JDK 8. */

package com.anudip.example;

// Interface with a method (introduced in JDK 1.8)
interface In1 {
    int a = 10;

    // Default method
    default void display() {
        System.out.println("The value of a is: " + a);
    }
}

// A class that implements the interface.
class InterfaceDemo1 implements In1 {
    // Driver Code
    public static void main(String[] args) {
        InterfaceDemo1 demo = new InterfaceDemo1();
        demo.display();
    }
}
