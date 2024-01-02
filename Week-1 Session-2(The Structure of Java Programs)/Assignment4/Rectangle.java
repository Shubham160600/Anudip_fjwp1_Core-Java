/* 
● Create a class Rectangle.
● Add a member variable width and height of type double.
● Create an enum Color with values RED, GREEN, BLUE.
● Create a member variable boxColor of type Color.
● Add a main method.
● In main method just print the enum Color.BLUE (You will notice that Java prints the enum name as it is).
● Compile and run the class. */

public class Rectangle {
    private double width;
    private double height;

    enum Color {
        RED, GREEN, BLUE
    }

    private Color boxColor;

    public static void main(String[] args) {
        System.out.println(Color.BLUE);
    }
}
