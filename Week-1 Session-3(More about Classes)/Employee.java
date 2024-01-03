package saurabh;

public class Employee {
int id;
String name;
boolean isPermanent;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public boolean isPermanent() {
return isPermanent;
}
public void setPermanent(boolean isPermanent) {
this.isPermanent = isPermanent;
}
// No constructor is explicitly defined
public static void main(String[] args) {
// We are creating an instance without
// creating any constructor.
// Because Java compiler provides default constructor.
Employee emp = new Employee ();
//Accessing the method of the instance.
emp.setName("John");
System.out.println(emp.getName());
}
}
