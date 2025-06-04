package com.mlucov.files;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

public class MyWatcher extends Thread {

    private boolean running = true;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(final boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        WatchService watcher;
        try {
            watcher = FileSystems.getDefault().newWatchService();
            final Path dir = Paths.get("c:/java/test");

            WatchKey key = dir.register(watcher,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);

            while (running) {
                try {
                    // key = watcher.take();
                    key = watcher.poll(1000, TimeUnit.MILLISECONDS);
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }

                if (key != null) {
                    for (final WatchEvent<?> event : key.pollEvents()) {
                        final Path name = (Path) event.context();
                        System.out.format(event.kind() + " " + "%s\n", name);
                    }
                    boolean reset = key.reset();
                    if (!reset) {
                        running = false;
                    }
                }
            }
        } catch (final IOException ioe) {
            ioe.printStackTrace();
        }
    }
}