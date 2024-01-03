package abc;

interface Shape {
    void draw();
}

public class DriverClassToTestShapes {
    public static void main(String[] args) {
        // Polymorphism: creating an instance of Circle through the Shape interface
        Shape shp = new Circle(30);
        
        // User only creates an instance of Shape and calls its method without bothering about implementation details.
        shp.draw();
    }
}


