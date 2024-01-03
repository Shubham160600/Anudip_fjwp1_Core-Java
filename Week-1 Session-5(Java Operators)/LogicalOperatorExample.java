package abc;

public class LogicalOperatorExample {
public static void main(String[] args) {
// && operator
System.out.println((10 > 3) && (12 > 5)); // true
System.out.println((10 > 3) && (12 < 5)); // false
// || operator
System.out.println((10 < 3) || (12 > 5)); // true
System.out.println((10 > 3) || (12 < 5)); // true
System.out.println((10 < 3) || (12 < 5)); // false
// ! operator
System.out.println(!(10 == 3)); // true
System.out.println(!(10 > 3)); // false
}
}

