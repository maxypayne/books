package com.mlucov.Threads;

public class CountDownTest {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();

        CountDownThread  countDownThread1 = new CountDownThread(countDown);
        countDownThread1.setName("Thread 1");
        CountDownThread  countDownThread2 = new CountDownThread(countDown);
        countDownThread2.setName("Thread 2");

        countDownThread1.start();
        countDownThread2.start();
    }
}

class CountDown {
    public synchronized void doCount() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_BLUE;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_CYAN;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
        }
    }
}

class CountDownThread extends Thread {
    private CountDown threadCountDown;
    CountDownThread(CountDown countDown) {
        threadCountDown = countDown;
    }
    public void run() {
        threadCountDown.doCount();
    }
}