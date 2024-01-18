/* Write a program in Java to create a Map Interface where we can store the cricketer name in it along with his scores and search for the 
 * batsman name and display his score. [Hint:use containsKey() method to search batsman name]. */

package shubham;

import java.util.HashMap;
import java.util.Map;

public class CricketScores {

    public static void main(String[] args) {
        // Create a Map to store cricketer names and scores
        Map<String, Integer> cricketScores = new HashMap<>();

        // Add cricketers and their scores to the Map
        cricketScores.put("Virat Kohli", 120);
        cricketScores.put("Rohit Sharma", 90);
        cricketScores.put("Steve Smith", 80);

        // Search for a batsman and display his score
        String batsmanName = "Rohit Sharma";
        if (cricketScores.containsKey(batsmanName)) {
            System.out.println(batsmanName + "'s score: " + cricketScores.get(batsmanName));
        } else {
            System.out.println("Batsman not found");
        }
    }
}
