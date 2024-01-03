package shubham;

public class ArrayTest {
public static void main(String[] args) {
double [] myArr = new double [200];
String [] messages = new String [15];
System.out.println("The length of the double array = " + myArr.length);
// As arrays is also an Object (Base class of all Java class)
// we can invoke Object's method for an array
System.out.println("The hashCode() of String array returned " + messages.hashCode());
}
}
