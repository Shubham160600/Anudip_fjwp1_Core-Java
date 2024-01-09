/* Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. 
 * ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound." 
 * ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively. 
 * ● The program should allow the user to create and display objects of each class. */

package shubham;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Method overriding demonstration
        genericAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
