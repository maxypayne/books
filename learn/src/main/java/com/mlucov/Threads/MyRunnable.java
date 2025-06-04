package com.mlucov.Threads;

import static com.mlucov.Threads.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void  run() {
        System.out.println(ANSI_RED + "MY RUNNABLE");
    }
}
