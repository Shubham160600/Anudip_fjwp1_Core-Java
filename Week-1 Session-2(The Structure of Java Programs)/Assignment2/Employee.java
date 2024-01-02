/* 
● Create a new class Employee.
● Add member variables: id and age of type int, name of type String and isPermanent of type boolean.
● Now assign values 35.5 to age; See the error message.
● How can you avoid this error? Correct the error by casting.
● Make all the members protected.
● Add a main method to it. Print message “Successfully started”.
● Compile the class. */

public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        System.out.println("Successfully started");
    }
}
