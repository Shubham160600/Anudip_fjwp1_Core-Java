/* 
Create a base class called Vehicle with the following methods:
● void start(): This method should print "Vehicle started." Create two subclasses of Vehicle called Car and Motorcycle. Override the start() method in each 
subclass to provide a specific implementation:
● Car: Print "Car started."
● Motorcycle: Print "Motorcycle started." Create a class called Garage with a method named serviceVehicle(Vehicle vehicle). Inside this method, call the start() 
method of the provided vehicle object and print "Vehicle serviced." In the Main class, create instances of Car and Motorcycle. Create an instance of the Garage class. 
Call the serviceVehicle() method of the Garage class with instances of both Car and Motorcycle. */

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}
