package saurabh;

public class Employee {
    // Instance variables
    int id;
    String name;
    boolean isPermanent;

    // Getter and setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for isPermanent
    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean isPermanent) {
        this.isPermanent = isPermanent;
    }

    // No constructor is explicitly defined, so a default constructor is provided by the compiler

    public static void main(String[] args) {
        // Creating an instance without explicitly creating any constructor
        // Because Java compiler provides a default constructor.
        Employee emp = new Employee();

        // Accessing the method of the instance.
        emp.setName("John");
        System.out.println(emp.getName());
    }
}
