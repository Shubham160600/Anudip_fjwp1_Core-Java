/* Create a Student class that takes studentName and studentID Now override both equal() and hashCode() based on studentID only. 
(Note: Students can use the Objects.hash() method to generate hashcodes or else they can write custom logic to generate unique hashcodes).
Add a constructor. Create a few students and add them to a Hashset. Now add another student with the same studentID to the set. 
Is it possible to add the new student or it just replaced the previous student ? */

package shubham;

import java.util.HashSet;
import java.util.Objects;

class Student {
    private int studentID;
    private String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Charlie");

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        Student studentWithSameID = new Student(1, "SameIDStudent");
        boolean added = studentSet.add(studentWithSameID);

        System.out.println("Student added to set: " + added);

        System.out.println("Students in the set:");
        for (Student student : studentSet) {
            System.out.println(student.studentID + ": " + student.studentName);
        }
    }
}
