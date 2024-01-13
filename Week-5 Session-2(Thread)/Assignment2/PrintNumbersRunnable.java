/* Write a thread program to print 1 to 100 using runnable interface. */

package shubham;

class PrintNumbersRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new PrintNumbersRunnable());
        thread.start();
    }
}
