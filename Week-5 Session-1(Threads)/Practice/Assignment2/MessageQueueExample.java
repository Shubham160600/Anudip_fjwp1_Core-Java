/* Create a messaging system with a shared message queue. Implement two threads: a sender thread that adds messages to the queue and a 
receiver thread that removes messages from the queue. Use wait() and notifyAll() to ensure that the sender waits if the queue is full and 
the receiver waits if the queue is empty. */

package shubham;

import java.util.LinkedList;
import java.util.Queue;

class MessageQueue {
    private Queue<String> messages = new LinkedList<>();
    private static final int MAX_SIZE = 5;

    public synchronized void sendMessage(String message) {
        while (messages.size() >= MAX_SIZE) {
            try {
                System.out.println("Queue is full. Sender thread " + Thread.currentThread().getName() + " is waiting.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        messages.add(message);
        System.out.println("Sent message: " + message);
        notifyAll();
    }

    public synchronized String receiveMessage() {
        while (messages.isEmpty()) {
            try {
                System.out.println("Queue is empty. Receiver thread " + Thread.currentThread().getName() + " is waiting.");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        String message = messages.poll();
        System.out.println("Received message: " + message);
        notifyAll();
        return message;
    }
}

class SenderThread implements Runnable {
    private MessageQueue messageQueue;

    public SenderThread(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            messageQueue.sendMessage("Message " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ReceiverThread implements Runnable {
    private MessageQueue messageQueue;

    public ReceiverThread(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            messageQueue.receiveMessage();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class MessageQueueExample {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();

        Thread senderThread = new Thread(new SenderThread(messageQueue));
        Thread receiverThread = new Thread(new ReceiverThread(messageQueue));

        senderThread.start();
        receiverThread.start();
    }
}
