/* Example Without Generics. */

package shubham;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenericsExample {
    public static void main(String[] args) {
        List items = new ArrayList();
        items.add("Hello");
        items.add(42);
        items.add(true);

        String firstItem = (String) items.get(0);      // Need casting
        int secondItem = (int) items.get(1);           // Need casting
        boolean thirdItem = (boolean) items.get(2);    // Need casting

        System.out.println(firstItem);
        System.out.println(secondItem);
        System.out.println(thirdItem);
    }
}
