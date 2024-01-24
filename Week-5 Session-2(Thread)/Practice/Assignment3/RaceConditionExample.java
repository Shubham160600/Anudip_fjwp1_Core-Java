/* Write a program to implement concurrency problem. */

package shubham;

class Counter {
    private int count = 0;

    public void increment() {
        int temp = count;
        // Simulate some processing time
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count = temp + 1;
    }

    public int getCount() {
        return count;
    }
}

class Incrementer implements Runnable {
    private Counter counter;

    public Incrementer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread thread1 = new Thread(new Incrementer(counter));
        Thread thread2 = new Thread(new Incrementer(counter));

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final count
        System.out.println("Final Count: " + counter.getCount());
    }
}
