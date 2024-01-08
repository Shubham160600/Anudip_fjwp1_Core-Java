package shubham;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child's x: " + x);
        // Accessing parent attributes through super keyword
        System.out.println("Parent's x: " + super.x);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
