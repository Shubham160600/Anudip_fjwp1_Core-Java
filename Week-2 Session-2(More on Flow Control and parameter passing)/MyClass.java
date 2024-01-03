package shubham;

public class MyClass {
private int x;
private int y;
// Instance initialization block
{
x = 10;
y = 20;
System.out.println("Instance initialization block executed.");
}
// Constructor
public MyClass() {
System.out.println("Constructor executed.");
}
public void display() {
System.out.println("x: " + x + ", y: " + y);
}
public static void main(String[] args) {
MyClass obj = new MyClass();
obj.display();
}
}
