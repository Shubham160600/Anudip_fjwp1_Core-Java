package shubham;

public class StaticInitializationBlockTest {
private static int count;
// Static initialization block
static {
count = 0;
System.out.println("Static initialization block executed.");
}
// Constructor
public StaticInitializationBlockTest () {
count++;
System.out.println("Constructor executed.");
}
public static void displayCount() {
System.out.println("Count: " + count);
}
public static void main(String[] args) {
StaticInitializationBlockTest obj1 = new StaticInitializationBlockTest();
StaticInitializationBlockTest obj2 = new StaticInitializationBlockTest();
StaticInitializationBlockTest.displayCount();
}
}
