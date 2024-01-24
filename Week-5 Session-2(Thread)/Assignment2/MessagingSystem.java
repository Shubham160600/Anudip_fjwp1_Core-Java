/* Create a messaging system with a shared message queue. Implement two threads: a sender thread that adds messages to the queue and a 
 * receiver thread that removes messages from the queue. Use wait() and notifyAll() to ensure that the sender waits if the queue is full and 
 * the receiver waits if the queue is empty. */

package shubham;

import java.util.LinkedList;
import java.util.Queue;

class MessageQueue {
    private final Queue<String> queue;
    private final int maxSize;

    public MessageQueue(int maxSize) {
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void sendMessage(String message) {
        while (queue.size() == maxSize) {
            try {
                // Queue is full, sender waits
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        queue.add(message);
        System.out.println("Sent: " + message);

        // Notify waiting threads (in case there are receivers waiting)
        notifyAll();
    }

    public synchronized String receiveMessage() {
        while (queue.isEmpty()) {
            try {
                // Queue is empty, receiver waits
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String message = queue.poll();
        System.out.println("Received: " + message);

        // Notify waiting threads (in case there are senders waiting)
        notifyAll();

        return message;
    }
}

class SenderThread extends Thread {
    private final MessageQueue messageQueue;

    public SenderThread(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            messageQueue.sendMessage("Message " + i);
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReceiverThread extends Thread {
    private final MessageQueue messageQueue;

    public ReceiverThread(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            messageQueue.receiveMessage();
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MessagingSystem {
    public static void main(String[] args) {
        // Create a shared message queue with a maximum size of 5
        MessageQueue sharedMessageQueue = new MessageQueue(5);

        // Create sender and receiver threads
        SenderThread senderThread = new SenderThread(sharedMessageQueue);
        ReceiverThread receiverThread = new ReceiverThread(sharedMessageQueue);

        // Start threads
        senderThread.start();
        receiverThread.start();

        // Wait for threads to finish
        try {
            senderThread.join();
            receiverThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
