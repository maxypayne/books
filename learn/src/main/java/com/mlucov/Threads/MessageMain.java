package com.mlucov.Threads;

import java.util.Random;

public class MessageMain {
    public static void main(String[] args) {
        Message message = new Message();
        new Thread(new Writer(message)).start();
        new Thread(new Reader(message)).start();
    }
}


class Message {
    private String message;
    private boolean isEmpty = true;
    public synchronized String read() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isEmpty = true;
        notifyAll();
        return message;
    }
    public synchronized void write(String message) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isEmpty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    public Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {
                "Maria mirabela",
                "lolita guraca",
                "datik porta",
                "Eugeniu migaevschi",
        };
        Random r = new Random();
        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(r.nextInt(2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        message.write("Finished");
    };
}
class Reader implements Runnable {
    private Message message;
    public Reader(Message message) {
        this.message = message;
    }
    public void run() {
        Random r = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
            latestMessage = message.read();
            System.out.println("latestMessage = " + latestMessage);
            try {
                Thread.sleep(r.nextInt(2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}