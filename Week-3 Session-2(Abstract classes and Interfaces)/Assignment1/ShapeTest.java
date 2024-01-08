/* Create an abstract class Shape with an abstract method calculateArea(). Implement two subclasses, Circle and Rectangle, which inherit from 
 * Shape and provide their own implementations of calculateArea(). Write a program to calculate and print the areas of a circle and a rectangle.
  */

package shubham;

//Abstract class Shape
abstract class Shape {
 // Abstract method calculateArea
 abstract double calculateArea();
}

//Circle class extending Shape
class Circle extends Shape {
 double radius;

 // Constructor
 Circle(double radius) {
     this.radius = radius;
 }

 // Override calculateArea for Circle
 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Rectangle class extending Shape
class Rectangle extends Shape {
 double length;
 double width;

 // Constructor
 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Override calculateArea for Rectangle
 @Override
 double calculateArea() {
     return length * width;
 }
}

//Main program
public class ShapeTest {
 public static void main(String[] args) {
     // Create objects of Circle and Rectangle
     Circle circle = new Circle(5);
     Rectangle rectangle = new Rectangle(4, 6);

     // Calculate and print areas
     System.out.println("Area of Circle: " + circle.calculateArea());
     System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 }
}

