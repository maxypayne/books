package com.mlucov.serialisation;

import java.io.*;

public class PersonSerDeser {
    public static void main(String[] args) {
        SerializablePerson personne = new SerializablePerson("Dupond", "Jean", 175, "1234");
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            final FileOutputStream fichierOut = new FileOutputStream("personne.ser");
            oos = new ObjectOutputStream(fichierOut);
            oos.writeObject(personne);
            oos.flush();
            final FileInputStream fichierIn = new FileInputStream("personne.ser");
            ois = new ObjectInputStream(fichierIn);
            personne = (SerializablePerson) ois.readObject();
            System.out.println("Personne : ");
            System.out.println("nom : " + personne.getNom());
            System.out.println("prenom : " + personne.getPrenom());
            System.out.println("taille : " + personne.getTaille());
            System.out.println("codeSecret : " + personne.getSecretCode());
        } catch (final IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
