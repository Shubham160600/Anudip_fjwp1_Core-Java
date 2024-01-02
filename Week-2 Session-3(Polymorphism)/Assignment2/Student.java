package Shubh;

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

    // Constructor with name, age, and department parameters
    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}

