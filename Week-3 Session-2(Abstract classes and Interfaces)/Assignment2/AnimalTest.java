/* Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. 
 * ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound." 
 * ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively. 
 * ● The program should allow the user to create and display objects of each class. [Hint:Use multilevel inheritance]*/

package shubham;

//Abstract class Shape
//Animal class
class Animal {
 // Method makeSound
 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Dog class extending Animal
class Dog extends Animal {
 // Override makeSound for Dog
 @Override
 void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Cat class extending Animal
class Cat extends Animal {
 // Override makeSound for Cat
 @Override
 void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main program
public class AnimalTest {
 public static void main(String[] args) {
     // Create objects of Animal, Dog, and Cat
     Animal genericAnimal = new Animal();
     Dog myDog = new Dog();
     Cat myCat = new Cat();

     // Demonstrate method overriding
     genericAnimal.makeSound(); // Output: The animal makes a sound.
     myDog.makeSound();         // Output: The dog barks.
     myCat.makeSound();         // Output: The cat meows.
 }
}
