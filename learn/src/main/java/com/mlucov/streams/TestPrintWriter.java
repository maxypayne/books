package com.mlucov.streams;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class TestPrintWriter {
    protected String destination;

    public TestPrintWriter(String destination) {
        this.destination = destination;
        traitement();
    }

    public static void main(String args[]) {
        new TestPrintWriter("print.txt");
    }

    private void traitement() {
        try {
            String ligne ;
            int nombre = 123;
            PrintWriter fichier = new PrintWriter(new FileWriter(destination));

            fichier.println("bonjour tout le monde");
            fichier.println("Nous sommes le "+ new Date());
            fichier.println("le nombre magique est " + nombre);

            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
