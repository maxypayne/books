package com.mlucov.serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonSerializator {
    public static void main(String[] args) {
        final SerializablePerson maxim = new SerializablePerson("Ludcov", "Maximka", 170, "nope");
        ObjectOutputStream oos = null;
        try {
            final FileOutputStream fichier = new FileOutputStream("person.ser");
            oos = new ObjectOutputStream(fichier);
            oos.writeUTF("maxim");
            oos.writeObject(maxim);
            oos.flush();
            System.out.println("OBJECT WAS SERIALIZED");
        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
