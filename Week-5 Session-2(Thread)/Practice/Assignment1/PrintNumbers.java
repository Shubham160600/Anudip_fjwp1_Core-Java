/* Write a thread program to print 1 to 100. */

package shubham;

class PrintNumbers extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNumbers thread = new PrintNumbers();
        thread.start();
    }
}
