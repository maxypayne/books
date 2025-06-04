package com.mlucov.files;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyWatchService {

    public static void main(final String[] args) {
        final Path source = Paths.get("c:/java/test/fichier.txt");
        final Path copie = Paths.get("c:/java/test/fichier_copie.txt");
        final Path renomme = Paths.get("c:/java/test/fichier_nouveau.txt");

        final MyWatcher monWatcher = new MyWatcher();
        monWatcher.start();

        try {
            Thread.sleep(1000);
            System.out.println("Copie " + source + " -> " + copie);
            Files.copy(source, copie, REPLACE_EXISTING, COPY_ATTRIBUTES);

            Thread.sleep(2000);
            System.out.println("Deplacement " + copie + " -> " + renomme);
            Files.move(copie, renomme, REPLACE_EXISTING, ATOMIC_MOVE);

            Thread.sleep(2000);
            System.out.println("Supression fichier " + renomme);
            Files.deleteIfExists(renomme);

            Thread.sleep(5000);
        } catch (final IOException ioe) {
            ioe.printStackTrace();
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }

        monWatcher.setRunning(false);
    }
}
