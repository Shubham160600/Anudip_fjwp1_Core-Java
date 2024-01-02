/* 
Write a Java program that uses a method to calculate the area of a rectangle and
compare them using Relational Operator
Steps:
● Create a class Rectangle.
● The Rectangle class should have two attributes length and width of type int.
● Create a constructor that accepts length and width as parameters.
● Area should be calculated as length*area.
● Instantiate two Rectangle classes with random values.
● Compare the areas of the two rectangles using the Relational Operator.
● If the first one is bigger than the second one, print “Rectangle1 > Rectangle2”.
● If the first one is smaller print “Rectangle1 < Rectangle2”.
● Otherwise print “They are equal”. */

class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int calculateArea() {
		return length * width;
	}
}
public class RectangleArea {
	public static void main(String args[]) {
        // Instantiate two Rectangle classes with random values
		Rectangle rectangle1 = new Rectangle(5,8);
		Rectangle rectangle2 = new Rectangle(4,9);
		
        // Instantiate two Rectangle classes with random values
		int area1 = rectangle1.calculateArea();
		int area2 = rectangle2.calculateArea();
		
        // Compare areas and print the result
		if (area1 > area2) {
			System.out.println("Rectangle1 > Rectangle2");
		}
		else if (area1 < area2) {
			System.out.println("Rectangle1 < Rectangle2");
		}
		else {
			System.out.println("They are equal");
		}
	}
}
