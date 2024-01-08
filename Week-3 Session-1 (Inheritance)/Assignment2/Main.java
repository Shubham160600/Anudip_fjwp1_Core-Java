/* 
● Write a Java program to create a class called Shape with a method called getArea(). 
● Create a subclass called Circle and create a constructor that takes the value of radius(int) as input parameter. 
● Override the getArea() method. 
● Create a class called square that takes an attribute length. Create a constructor that takes length as input. 
● Override the getArea() method. 
● Create a subclass of Shape called Rectangle that takes width and height as input to the constructor. 
● Override the getArea() method to calculate the area of a rectangle. Instantiate and call getArea() method. */

package shubham;

//Shape class
class Shape {
 // Method to get area, to be overridden by subclasses
 public double getArea() {
     return 0.0;
 }
}

//Circle class, subclass of Shape
class Circle extends Shape {
 int radius;

 // Constructor
 public Circle(int radius) {
     this.radius = radius;
 }

 // Override getArea method
 @Override
 public double getArea() {
     return Math.PI * Math.pow(radius, 2);
 }
}

//Square class, subclass of Shape
class Square extends Shape {
 int length;

 // Constructor
 public Square(int length) {
     this.length = length;
 }

 // Override getArea method
 @Override
 public double getArea() {
     return Math.pow(length, 2);
 }
}

//Rectangle class, subclass of Shape
class Rectangle extends Shape {
 int width;
 int height;

 // Constructor
 public Rectangle(int width, int height) {
     this.width = width;
     this.height = height;
 }

 // Override getArea method
 @Override
 public double getArea() {
     return width * height;
 }
}

public class Main {
 public static void main(String[] args) {
     // Instantiate Circle
     Circle myCircle = new Circle(5);
     // Call getArea method for Circle
     System.out.println("Circle Area: " + myCircle.getArea());

     // Instantiate Square
     Square mySquare = new Square(4);
     // Call getArea method for Square
     System.out.println("Square Area: " + mySquare.getArea());

     // Instantiate Rectangle
     Rectangle myRectangle = new Rectangle(6, 8);
     // Call getArea method for Rectangle
     System.out.println("Rectangle Area: " + myRectangle.getArea());
 }
}
