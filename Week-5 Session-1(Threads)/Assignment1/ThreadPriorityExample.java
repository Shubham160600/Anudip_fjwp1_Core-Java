/* Threads with Different Priorities. */

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
