package shubham;

public class Balloon {
    private String color;

    // Default constructor
    public Balloon() {
    }

    // Parameterized constructor
    public Balloon(String c) {
        this.color = c;
    }

    // Getter method for retrieving the color
    public String getColor() {
        return color;
    }

    // Setter method for setting the color
    public void setColor(String color) {
        this.color = color;
    }
}
