/* Write a Java program to simulate the "Hot Potato" game using a queue. In this game, players stand in a circle and pass a potato 
(or any other object) while music plays. When the music stops, the player holding the potato is out. 
● Create a queue to represent the circle of players. 
● Enqueue player names. 
● Dequeue players one by one and enqueue them again to simulate passing the potato. 
● Repeat the dequeue and enqueue process, simulating the music stopping and players being eliminated until only one player 
remains. */

package shubham;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame 
{
    public static void main(String[] args)
    {
        Queue<String> playersQueue = new LinkedList<>();
        String[] playerNames = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Enqueue player names to create the initial circle
        for (String playerName : playerNames)
        {
            playersQueue.offer(playerName);
        }

        int passes = 3; // Simulate passing the potato 3 times
        while (playersQueue.size() > 1) 
        {
            for (int i = 0; i < passes - 1; i++)
            {
                // Dequeue and enqueue to simulate passing the potato
                playersQueue.offer(playersQueue.poll());
            }
            
            // The player holding the potato is eliminated
            System.out.println(playersQueue.poll() + " is out!");
        }

        // The last player remaining wins
        System.out.println("Winner: " + playersQueue.poll());
    }
}
