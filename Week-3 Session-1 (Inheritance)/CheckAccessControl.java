/* Access Control and Inheritance. */

package shubham;

class Baseclass {
    private int privateVariable = 30;
    protected int protectedVariable = 50;

    private void privateMethod() {
        System.out.println("Base class private method");
    }

    protected void protectedMethod() {
        System.out.println("Base class protected method");
    }
}

class Derivedclass extends Baseclass {
    // Derivedclass inherits members from Baseclass
}

// Multilevel inheritance
class AnotherClass extends Baseclass {
    // AnotherClass inherits members from Baseclass
}

public class CheckAccessControl {
    public static void main(String[] args) {
        // Creating an instance of AnotherClass
        AnotherClass an = new AnotherClass();

        // Accessing protected method from AnotherClass
        an.protectedMethod();

        // Accessing protected variable from AnotherClass
        System.out.println(an.protectedVariable);
    }
}
