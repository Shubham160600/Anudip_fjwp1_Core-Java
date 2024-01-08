/* Super keyword can also be used to call base class method from overridden method. */

package shubham;

class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show(); // Calls parent's show method using super
        System.out.println("Child's show method");
    }
}

public class SuperInOverridingMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
