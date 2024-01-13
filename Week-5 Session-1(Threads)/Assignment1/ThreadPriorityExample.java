/* Create three threads: Low, Medium, and High priority. Implement a scenario where each thread prints its name and sleeps for a duration.
Adjust the sleep durations based on thread priorities to observe the effects of priority on thread scheduling. */

package shubham;

class PrintThread extends Thread {
    public PrintThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            try {
                // Adjust sleep duration based on thread priority
                Thread.sleep(100 / getPriority());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread lowPriorityThread = new PrintThread("Low", Thread.MIN_PRIORITY);
        Thread mediumPriorityThread = new PrintThread("Medium", Thread.NORM_PRIORITY);
        Thread highPriorityThread = new PrintThread("High", Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        mediumPriorityThread.start();
        highPriorityThread.start();
    }
}
