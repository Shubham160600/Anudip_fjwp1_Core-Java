/* 
● Write a Java program to create a class called Vehicle with a method called drive(). 
● Vehicle should have attributes such as make (String), model (String) , year (int) and maximumSpeed (int). 
● Create a constructor in Vehicle with all fields as constructor parameters. 
● Create a subclass called Car and override constructor. Call super(). 
● Write a function that overrides the drive() method to print (make + “ ” + model + " Car is driving"). 
● Also create another subclass Bike extending the vehicle class. 
● Override the drive() method to print (make + “ ” + model + " Bike is driving"). 
● Instantiate both Bike and Car class. Print their attributes. */

package shubham;

//Vehicle class
class Vehicle {
 String make;
 String model;
 int year;
 int maximumSpeed;

 // Constructor
 public Vehicle(String make, String model, int year, int maximumSpeed) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.maximumSpeed = maximumSpeed;
 }

 // Drive method
 public void drive() {
     System.out.println(make + " " + model + " is driving");
 }
}

//Car class, subclass of Vehicle
class Car extends Vehicle {
 // Constructor calling super class constructor
 public Car(String make, String model, int year, int maximumSpeed) {
     super(make, model, year, maximumSpeed);
 }

 // Override drive method
 @Override
 public void drive() {
     System.out.println(make + " " + model + " Car is driving");
 }
}

//Bike class, subclass of Vehicle
class Bike extends Vehicle {
 // Constructor calling super class constructor
 public Bike(String make, String model, int year, int maximumSpeed) {
     super(make, model, year, maximumSpeed);
 }

 // Override drive method
 @Override
 public void drive() {
     System.out.println(make + " " + model + " Bike is driving");
 }
}

public class Main {
 public static void main(String[] args) {
     // Instantiate Car
     Car myCar = new Car("Toyota", "Camry", 2022, 200);
     // Call drive method
     myCar.drive();

     // Instantiate Bike
     Bike myBike = new Bike("Honda", "CBR", 2022, 150);
     // Call drive method
     myBike.drive();
 }
}
