package abc;

public class ExampleCondtionalOperator {
public static void main(String[] args) {
int daysInFebruary = 29;
String result;
// ternary operator
result = (daysInFebruary == 28) ? "Not a leap year" : "Leap year";
// Above statement is same as writing;
// if (daysInFebruary == 28) {
// result="Not a leap year";
// }
// else {
// result="Leap year";
// }
System.out.println(result);
}
}
