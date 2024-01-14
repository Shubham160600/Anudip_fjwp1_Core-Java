/* Overriding hashCode(). */

package shubham;

import java.io.*;
import java.util.*;

class HashCheck {
    String name;
    int id;

    HashCheck(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        HashCheck check = (HashCheck) obj;
        return (check.name.equals(this.name) && check.id == this.id);
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class TestHashCode {
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
