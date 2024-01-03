package shubham;

/*
* Example to explain Do while loops in Java
*/
public class DoWhileExample {
public static void main(String[] args) {
int num = 6;
do {
System.out.println("Number is: " + num);
num++;
}
while (num <5); // Condition is false in the beginning.
System.out.println("The value of count after the loop is " + num);
}
}