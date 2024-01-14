/* Mixing Generic and Non-generic Collections. */

package shubham;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawTypeCollection {
    public static void main(String[] args) {
        // Created a List of Integer and assigned
        // to a raw List.
        List rawList = new ArrayList<Integer>(); // Non-generic List
        rawList.add(42);
        rawList.add(132);
        rawList.add(412);
        rawList.add(123);
        rawList.add("Hello"); // There will be no compilation/runtime error here
        System.out.println(rawList);

        for (Object obj : rawList) {
            Integer a = (Integer) obj; // But here, there is a chance of runtime error
            System.out.println(a);
        }
    }
}
