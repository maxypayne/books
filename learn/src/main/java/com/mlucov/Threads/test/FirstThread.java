package com.mlucov.Threads.test;

public class FirstThread extends Thread {
    private String threadName;
    static public void main(String argv[]) {
        FirstThread thr1 = new FirstThread("Toto");
        FirstThread thr2 = new FirstThread("Tata");
    }
    public FirstThread(String threadName) {
        this.threadName = threadName;
        this.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 500; i++) {
                System.out.println("Thread nommé : " + this.threadName + " - itération : " + i);
                Thread.sleep(30);
            }
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}
