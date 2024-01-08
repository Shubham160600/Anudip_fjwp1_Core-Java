/* multilevel inheritance. */

package shubham;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Mammal extends Animal {
    void run() {
        System.out.println("Mammal is running.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog();

        // Calling methods inherited from Animal class
        myDog.eat(); // Inherited from Animal

        // Calling methods inherited from Mammal class
        myDog.run(); // Inherited from Mammal

        // Calling Dog's own method
        myDog.bark(); // Dog's own method
    }
}
