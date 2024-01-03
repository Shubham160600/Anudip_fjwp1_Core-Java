package shubham;

public class WrapperConversion {
public static void main(String[] argv){
Integer i2 = Integer.valueOf(64);
byte b = i2.byteValue();
short s = i2.shortValue();
double d = i2.doubleValue();
System.out.println("Value of d= " + d);
Float f2 = Float.valueOf(9.234f);
s = f2.shortValue();
System.out.println("Value of s= " + s);
}
}
