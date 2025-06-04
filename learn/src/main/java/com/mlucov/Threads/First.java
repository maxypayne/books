package com.mlucov.Threads;

public class First extends Thread {
    @Override
    public void run() {
        System.out.println("From first");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
