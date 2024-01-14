/* Mixing Generic and Non-generic Collections. */

package shubham;

import java.util.ArrayList;
import java.util.List;

public class TestTypeMismatch {
    public static void main(String[] args) {
        List<String> myStringList = new ArrayList<String>(); // Generic list of type String
        myStringList.add("Hi");
        myStringList.add("welcome");
        methodWithRawList(myStringList);

        for (String s : myStringList)
            System.out.println(s);
    }

    static void methodWithRawList(List st) {
        // Method which accepts a raw list of any type.
        try {
            st.add(42); // Will cause error if we add an Integer to our List<String>
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
