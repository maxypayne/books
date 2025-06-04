package com.mlucov.Threads;

public class Main {
    public static void main(String[] args) {

        Thread first = new First();
        first.start();
        Thread second = new Second();
//        second.start();
//        new Thread() {
//            @Override
//            public void run() {
//                System.out.println("From anonymous");
//            }
//        }.start();
//        Thread MyRunnableThread = new Thread(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("FRom sdsdsd");
//                try {
//                    first.join();
//                } catch (InterruptedException e) {
//                    System.out.println("InterruptedException" + e.getMessage());
//                }
//            }
//        });
//        MyRunnableThread.start();
//
//        first.interrupt();
//        System.out.println(ANSI_BLUE + "Soumu");
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(500);
//                        System.out.println("Number  = " + i);
//                    } catch (InterruptedException e) {
////                        throw new RuntimeException(e);
//                        System.out.println(e.getMessage());
//                    }
//                }
//                System.out.println("From anonymous Thread");
//            }
//        };
//        thread.start();
//        System.out.println("Name = " + thread.getName());
//        System.out.println("CurrentThread name = " + Thread.currentThread().getName());
//        System.out.println("Id = " + thread.getId());
//        System.out.println("Priority = " + thread.getPriority());
//        System.out.println("ThreadGroup = " + thread.getThreadGroup());
//        System.out.println("ContextClassLoader = " + thread.getContextClassLoader());
//        System.out.println("isAlive = " + thread.isAlive());
//        System.out.println("isInterrupted = " + thread.isInterrupted());
//        System.out.println("isDaemon = " + thread.isDaemon());
//        System.out.println("State = " + thread.getState());
    }
}
