package com.mlucov.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class TestBufferedWriter {
    protected String destination;

    public TestBufferedWriter(String destination) {
        this.destination = destination;
        traitement();
    }

    public static void main(String args[]) {
        new TestBufferedWriter("print.txt");
    }

    private void traitement() {
        try {
            int num = 123;
            BufferedWriter fichier = new BufferedWriter(new FileWriter(destination));

            fichier.write("bonjour tout le monde");
            fichier.newLine();
            fichier.write("Nous sommes le "+ new Date());
            fichier.write(", le nombre magique est " + num);

            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
