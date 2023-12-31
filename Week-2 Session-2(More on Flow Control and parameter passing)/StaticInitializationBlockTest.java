package shubham;

public class StaticInitializationBlockTest {
    private static int count;

    // Static initialization block
    static {
        count = 0;
        System.out.println("Static initialization block executed.");
    }

    // Constructor
    public StaticInitializationBlockTest() {
        count++;
        System.out.println("Constructor executed.");
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Creating two instances of StaticInitializationBlockTest
        StaticInitializationBlockTest obj1 = new StaticInitializationBlockTest();
        StaticInitializationBlockTest obj2 = new StaticInitializationBlockTest();

        // Calling the static method to display the count
        StaticInitializationBlockTest.displayCount();
    }
}
