package shubham;

public class Patient {
    private String name;
    private int age;
    private double height;

    // User-defined no-argument constructor
    public Patient() {
        // Member variables are assigned fixed values as no values were
        // passed as parameters
        this.name = "Unknown";
        this.age = 10;
        height = 168.5;
    }

    // Rest of the getters and setters

    public static void main(String[] args) {
        // Instantiation using new
        Patient p = new Patient();
        p.setAge(35);
        p.setHeight(159.5);
        p.setName("John Doe");
        System.out.println("Patient Name is " + p.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
