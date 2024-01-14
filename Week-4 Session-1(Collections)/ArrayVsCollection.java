/* example to understand the differences between Arrays and Collections more easily. */

package com.anudip;

import java.util.ArrayList;

public class ArrayVsCollection {
    public static void main(String[] args) {
        // Arrays
        String[] arr = new String[] { "W", "E", "L", "C", "O", "M", "E" };

        // Trying printing the above array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // New Line
        System.out.println();

        // Collection
        // Let us arbitrarily create an empty ArrayList
        // of string type
        ArrayList<String> al = new ArrayList<String>();

        // Adding elements to the above List
        // using add() method
        al.add("w");
        al.add("e");
        al.add("l");
        al.add("c");
        al.add("o");
        al.add("m");
        al.add("e");

        // Printing all elements of Collection (ArrayList)
        System.out.println(al);
    }
}
