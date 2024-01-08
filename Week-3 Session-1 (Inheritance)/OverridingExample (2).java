/* Method overriding. */

package shubham;

class Animal {
    // Basic implementation defined in the base class
    public void makeSound() {
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        // Method with the same signature but a different implementation
        System.out.println("Woof!"); // Different implementation
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        // Creating an instance of Dog and assigning it to a reference of Animal
        Animal an = new Dog();

        // Calling the overridden method in the Dog class using the reference of Animal
        an.makeSound();
    }
}
