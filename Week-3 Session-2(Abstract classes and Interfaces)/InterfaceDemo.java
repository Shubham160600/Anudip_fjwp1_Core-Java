package com.anudip.example;

// Java program to demonstrate the
// real-world example of Interfaces
interface Vehicle {
    // All are abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    // To change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // To increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // To decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;

    // To change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // To increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // To decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + " Gear: " + gear);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Creating an instance of Bicycle
        // Performing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle present state:");
        bicycle.printStates();

        // Creating an instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        System.out.println("Bike present state:");
        bike.printStates();
    }
}
