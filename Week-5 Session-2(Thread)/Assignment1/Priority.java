/* Create three threads: Low, Medium, and High priority. Implement a scenario where each thread prints its name and sleeps for a duration. 
 * Adjust the sleep durations based on thread priorities to observe the effects of priority on thread scheduling. */

package shubham;

class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " executing iteration " + i);
            try {
                // Adjust sleep duration based on thread priorities
                switch (getPriority()) {
                    case Thread.MAX_PRIORITY:
                        Thread.sleep(100);
                        break;
                    case Thread.NORM_PRIORITY:
                        Thread.sleep(300);
                        break;
                    case Thread.MIN_PRIORITY:
                        Thread.sleep(500);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Priority {
    public static void main(String[] args) {
        // Create threads with different priorities
        PriorityThread lowPriorityThread = new PriorityThread("Low Priority", Thread.MIN_PRIORITY);
        PriorityThread mediumPriorityThread = new PriorityThread("Medium Priority", Thread.NORM_PRIORITY);
        PriorityThread highPriorityThread = new PriorityThread("High Priority", Thread.MAX_PRIORITY);

        // Start threads
        lowPriorityThread.start();
        mediumPriorityThread.start();
        highPriorityThread.start();

        // Wait for all threads to finish
        try {
            lowPriorityThread.join();
            mediumPriorityThread.join();
            highPriorityThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
