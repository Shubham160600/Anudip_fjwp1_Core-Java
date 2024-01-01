//package saurabh;

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
