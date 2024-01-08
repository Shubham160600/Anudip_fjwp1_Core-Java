package abc;

public class RelationalOperatorExample {
    public static void main(String[] args) {
        int a = 9, b = 15;

        // Print the values of 'a' and 'b'
        System.out.println("a =" + a + " and b=" + b);

        // == operator
        // Note: Additional parenthesis is used as operators have precedence
        System.out.println("(a == b) is " + (a == b)); // false

        // != operator
        System.out.println("(a != b) is " + (a != b)); // true

        // > operator
        System.out.println("(a > b) is " + (a > b)); // false

        // < operator
        System.out.println("(a < b) is " + (a < b)); // true

        // >= operator
        System.out.println("(a >= b) is " + (a >= b)); // false

        // <= operator
        System.out.println("(a <= b) is " + (a <= b)); // true
    }
}
