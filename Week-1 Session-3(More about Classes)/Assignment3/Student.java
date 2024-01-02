/* 
● Create a Java Bean Class Student.
● Add three attributes ○ private String name; ○ private int age; ○ private String department;
● Add a constructor that takes all three attributes as parameters.
● Add setter and getter methods
● Compile the program. */

//package Student_Java_Bean_Class;

public class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter and Setter methods

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        // Create an instance of the Student class and use getter and setter methods
        Student student = new Student("Shubham Saurabh", 23, "Computer Science");

        // Display student details
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
    }
}
