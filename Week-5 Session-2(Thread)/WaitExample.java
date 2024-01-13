/* example of how wait(). */

package shubham;

public class WaitExample {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (number <= 10) {
                synchronized (lock) {
                    // Check if it's the Odd thread's turn to print
                    if (number % 2 != 0) {
                        System.out.println("Odd: " + number);
                        number++;
                        lock.notify(); // Notify the other thread to wake up
                    } else {
                        try {
                            lock.wait(); // Release the lock and wait
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (number <= 10) {
                synchronized (lock) {
                    // Check if it's the Even thread's turn to print
                    if (number % 2 == 0) {
                        System.out.println("Even: " + number);
                        number++;
                        lock.notify(); // Notify the other thread to wake up
                    } else {
                        try {
                            lock.wait(); // Release the lock and wait
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }
}
