package com.mlucov;

import java.io.FileWriter;
import java.io.IOException;

public class AccesFichier {
    private FileWriter file;
    public AccesFichier(String s) {
        try {
            file = new FileWriter(s);
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
//    protected void finalize() throws Throwable {
//        super.finalize(); // obligatoire : appel finalize heritee
//        System.out.println("Appel de la méthode finalize");
//        termine();
//    }

    public static void main(String[] args) {
        AccesFichier af = new AccesFichier("./data.txt");
        System.exit(0);
    }
    public void termine() {
        if (file != null) {
            try {
                file.close();
            } catch (IOException e) {
                System.out.println("Impossible de fermer le fichier");
            }
            file = null;
        }
    }
}
