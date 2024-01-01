package shubham;

import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private short year;
    private int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        short year = scanner.nextShort();

        System.out.print("Price: ");
        int price = scanner.nextInt();

        Car car = new Car(make, model, year, price);

        System.out.println("\nCar details:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Price: " + car.price);
    }
}
