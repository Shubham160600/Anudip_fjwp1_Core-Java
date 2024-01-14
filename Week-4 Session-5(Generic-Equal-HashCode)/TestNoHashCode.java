/* Overriding only the equals(Object) method. */

package shubham;

import java.util.*;

class EqualsOnly {
    // No overridden hashCode() method here.
    String name;
    int id;

    EqualsOnly(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        EqualsOnly check = (EqualsOnly) obj;
        return (check.name.equals(this.name) && check.id == this.id);
    }
}

public class TestNoHashCode {
    public static void main(String[] args) {
        EqualsOnly g1 = new EqualsOnly("Ajay", 1);
        EqualsOnly g2 = new EqualsOnly("Ajay", 1);

        Map<EqualsOnly, String> map = new HashMap<EqualsOnly, String>();
        map.put(g1, "History");
        map.put(g2, "Mathematics");

        for (EqualsOnly check : map.keySet()) {
            System.out.println(map.get(check).toString());
        }
    }
}
