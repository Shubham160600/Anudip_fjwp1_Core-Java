/* Overriding only hashCode() method. */

package shubham;

import java.util.*;

class HashCheck {
    String name;
    int id;

    HashCheck(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class TestHashCode1 {
    public static void main(String[] args) {
        HashCheck g1 = new HashCheck("Ajay", 1);
        HashCheck g2 = new HashCheck("Ajay", 1);

        Map<HashCheck, String> map = new HashMap<HashCheck, String>();
        map.put(g1, "History");
        map.put(g2, "Mathematics");

        for (HashCheck check : map.keySet()) {
            System.out.println(map.get(check).toString());
        }
    }
}
