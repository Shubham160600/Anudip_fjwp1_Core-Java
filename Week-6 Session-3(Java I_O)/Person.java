/* Serialization. */

package shubham;

import java.io.*;

public class Person implements Serializable {
    // User-defined SerialVersionUID
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Deserialize an object from a file
    private static Person deserializeObject(String fileName) {
        Person person = null;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            // Deserialize the object from the file
            person = (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    public static void main(String[] args) {
        Person object = new Person("John", 25);
        String filename = "Person.ser";

        // Serialization
        try {
            // Saving the object to a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            // Method for serialization of object
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        // Deserialization
        Person person = deserializeObject("Person.ser");
        System.out.println("Printing the information of deserialized object");
        System.out.println("Name is " + person.getName());
        System.out.println("Age is " + person.getAge());
    }
}
