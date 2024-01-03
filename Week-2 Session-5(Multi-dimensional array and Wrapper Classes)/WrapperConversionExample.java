package shubham;

public class WrapperConversionExample {
public static void main(String[] args) {
// Using parseXXX() methods
int intPrimitive = Integer.parseInt("126");
double doublePrimitive = Double.parseDouble("5.27");
// Using auto-boxing
Float floatWrapper = 99.99f;
Long longWrapper = 1000L;
System.out.println("Parsed int primitive: " + intPrimitive);
System.out.println("Parsed double primitive: " + doublePrimitive); 
System.out.println("Float wrapper (auto-boxing): " + floatWrapper);
System.out.println("Long wrapper (auto-boxing): " + longWrapper);
}
}
