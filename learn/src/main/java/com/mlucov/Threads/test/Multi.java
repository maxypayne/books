package com.mlucov.Threads.test;

import java.util.concurrent.*;
public class Multi {
    public static void main(String[] args) {
//        Executor ex = Executors.newSingleThreadExecutor();
//        ExecutorService ex = Executors.newSingleThreadExecutor();
//        ExecutorService ex = Executors.newCachedThreadPool();
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task2 = () -> {
            for (int i = 5; i < 9; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        ex.execute(task1);
        ex.execute(task2);

        Future<?> fut1 = ex.submit(task1, "I'm the first and  I finish");
        Future<?> fut2 = ex.submit(task2, "I'm the second and  I finish");

        while (!fut1.isDone() || !fut2.isDone()) {
            System.out.println("Waiting...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(fut1.isDone()) {
            try {
                System.out.println(fut1.get());
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(fut2.isDone()) {
            try {
                System.out.println(fut2.get());
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        ex.shutdown();
    }
}
