//package shubham;

import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalCatDog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        int choice = scanner.nextInt();

        Animal animal;

        switch (choice) {
            case 1:
                animal = new Dog();
                break;
            case 2:
                animal = new Cat();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to a generic animal.");
                animal = new Animal();
                break;
        }

        System.out.println("The chosen animal:");
        animal.makeSound();
    }
}
