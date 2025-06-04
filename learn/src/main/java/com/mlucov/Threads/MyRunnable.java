package com.mlucov.Threads;

import static learn.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void  run() {
        System.out.println(ANSI_RED + "MY RUNNABLE");
    }
}
