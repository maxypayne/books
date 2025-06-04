package com.mlucov.Threads.test;

public class SecondThread implements Runnable {
    private int counter;
    static public void main(String[] argv) {
        SecondThread p1 = new SecondThread(0);
    }
    public SecondThread (int counter) {
        this.counter = counter;

        for (int i = 0; i < 5; i++) {
            (new Thread(this)).start();
        }
    }
    public void run() {
        try {
            for(int i = 0; i < 500; i++) {
                System.out.println("Valeur du compteur == " + counter++);
                Thread.sleep(30);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
