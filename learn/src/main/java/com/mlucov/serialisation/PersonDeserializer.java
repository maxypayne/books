package com.mlucov.serialisation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeserializer {
    public static void main(final String argv[]) {
        ObjectInputStream ois = null;

        try {
            final FileInputStream fichier = new FileInputStream("person.ser");
            ois = new ObjectInputStream(fichier);
            System.out.println(ois.available());
            final SerializablePerson person = (SerializablePerson) ois.readObject();
            System.out.println("Personne : ");
            System.out.println("nom : " + person.getNom());
            System.out.println("prenom : " + person.getPrenom());
            System.out.println("taille : " + person.getTaille());
        } catch (final IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
