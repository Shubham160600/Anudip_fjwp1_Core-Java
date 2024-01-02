/*  
Create a class called Student. Inside the Student class, implement the following instance variables (fields):
● String name
● int age
● String department Implement the following constructors in the Student class:
● A default constructor that initializes the name to "Unknown", age to 20, and department to "Unassigned".
● A constructor that takes two parameters: name and age, and initializes the department to "IT".
● A constructor that takes three parameters: name, age, and department. In the Main class, create instances of the Student class using 
each constructor. Printoutthedetailsofeachstudent, includingtheirname, age, and department. */

class Student {
    String name;
    int age;
    String department;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with name and age parameters, department set to "IT"
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    this.name=name;this.age=age;this.department=department;
}
