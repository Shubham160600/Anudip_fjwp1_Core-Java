/* Write a Java program to simulate the "Hot Potato" game using a queue. In this game, players stand in a circle and pass a potato 
(or any other object) while music plays. When the music stops, the player holding the potato is out. 
● Create a queue to represent the circle of players. 
● Enqueue player names. 
● Dequeue players one by one and enqueue them again to simulate passing the potato. 
● Repeat the dequeue and enqueue process, simulating the music stopping and players being eliminated until only one player remains. */

package shubham;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {
    public static void main(String[] args) {
        // Create a queue to represent the circle of players
        Queue<String> playerQueue = new LinkedList<>();

        // Enqueue player names
        playerQueue.add("Player1");
        playerQueue.add("Player2");
        playerQueue.add("Player3");
        playerQueue.add("Player4");
        playerQueue.add("Player5");

        // Simulate passing the potato until only one player remains
        while (playerQueue.size() > 1) {
            String currentPlayer = playerQueue.poll();
            System.out.println(currentPlayer + " has the potato!");

            // Simulate some delay (you can replace this with actual music playing logic)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(currentPlayer + " is out!");

            // Enqueue the player again to simulate passing the potato
            playerQueue.add(currentPlayer);
        }

        // The remaining player is the winner
        System.out.println("Winner: " + playerQueue.poll());
    }
}
