/* Create two thread.one thread is finding the average of the first 10 numbers and another thread is printing the square of the number stored in 
 * array arr={1,20,50,15,30} and make sure both threads can execute one by one. */

package shubham;

public class ThreadExample {
    private static int[] arr = {1, 20, 50, 15, 30};
    private static double average;
    private static boolean averageThreadFinished = false;

    public static void main(String[] args) {
        // Creating thread for finding average
        Thread averageThread = new Thread(() -> {
            average = calculateAverage();
            System.out.println("Average Thread: The average is " + average);
            averageThreadFinished = true;
        });

        // Creating thread for printing squares
        Thread squareThread = new Thread(() -> {
            // Wait for the averageThread to finish before proceeding
            while (!averageThreadFinished) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printSquares();
        });

        // Starting threads
        averageThread.start();
        squareThread.start();
    }

    private static double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i + 1;
        }
        return (double) sum / 10;
    }

    private static void printSquares() {
        for (int num : arr) {
            System.out.println("Square Thread: Square of " + num + " is " + (num * num));
        }
    }
}
