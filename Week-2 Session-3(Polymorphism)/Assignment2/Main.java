package Shubh;

public class Main {
    public static void main(String[] args) {
        // Create instances of Student using each constructor
        Student student1 = new Student();
        Student student2 = new Student("Shubham", 23);
        Student student3 = new Student("Rahul", 25, "Computer Science");

        // Print details of each student
        System.out.println("Student 1: Name=" + student1.name + ", Age=" + student1.age + ", Department=" + student1.department);
        System.out.println("Student 2: Name=" + student2.name + ", Age=" + student2.age + ", Department=" + student2.department);
        System.out.println("Student 3: Name=" + student3.name + ", Age=" + student3.age + ", Department=" + student3.department);
    }
}
