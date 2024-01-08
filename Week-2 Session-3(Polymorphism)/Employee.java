package shubham;

public class Employee {
    int id;
    String name;
    int Empid;

    // Empty no-argument constructor
    public Employee() {
        this.id = 0;
        this.name = "Not Available";
    }

    // Overloaded constructor with parameter id (int)
    public Employee(int id) {
        this.id = id;
        this.name = "Not Available";
    }

    // Overloaded constructor with id and name parameters
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Info: ");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Calling empty constructor
        Employee e1 = new Employee();
        e1.display();

        // Calling one-parameter constructor
        Employee e2 = new Employee(15);
        e2.display();

        // Calling two-parameter constructor
        Employee e3 = new Employee(11, "John Doe");
        e3.display();
    }
}
