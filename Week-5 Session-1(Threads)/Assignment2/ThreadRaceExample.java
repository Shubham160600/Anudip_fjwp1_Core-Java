/* Create three threads in Java to simulate a race among them. Each thread should have a name and display its name and current iteration number. 
 * Use Thread.sleep() to introduce a delay between iterations. Also, set different priorities for the threads. */

package shubham;

public class ThreadRaceExample {
    public static void main(String[] args) {
        // Creating three threads
        RaceThread thread1 = new RaceThread("Thread 1", 10);
        RaceThread thread2 = new RaceThread("Thread 2", 10);
        RaceThread thread3 = new RaceThread("Thread 3", 10);

        // Setting priorities
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RaceThread extends Thread {
    private int iterations;

    public RaceThread(String name, int iterations) {
        super(name);
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for (int i = 1; i <= iterations; i++) {
            System.out.println(Thread.currentThread().getName() + ": Iteration " + i);
            try {
                Thread.sleep(100); // Introducing a delay of 100 milliseconds between iterations
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished the race!");
    }
}
