package com.mlucov.files;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws Exception {
        writeFile();
        System.out.println("=== 1. BufferedReader + FileReader ===");
        lireAvecBufferedReader();
        System.out.println("\n=== 2. BufferedReader + InputStreamReader (UTF-8) ===");
        lireAvecEncodage();
        System.out.println("\n=== 3. Files.readAllLines() ===");
        lireToutLeFichier();
        System.out.println("\n=== 4. Files.lines() ===");
        lireAvecFilesLines();
        System.out.println("\n=== 5. Scanner ===");
        lireAvecScanner();
        System.out.println("\n=== 6. Lecture binaire (BufferedInputStream) ===");
        lireBinaire();
        System.out.println("\n=== 7. Lecture via FileChannel (NIO) ===");
        lireAvecFileChannel();

    }

    private static void writeFile() {
        try {
            File myFile = new File("myTxt.js");
            boolean isCreated = myFile.createNewFile();
            System.out.println("is file created: " + isCreated);
            FileWriter fileWriter = new FileWriter("myTxt.js");
            fileWriter.write("const data = 40;");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error ocured " + e.getMessage());
        }
    }

    // 1️⃣ Lecture classique texte
    // BufferedReader + FileReader
    // Méthode classique pour lire des fichiers texte.
    // Bonne performance grâce à BufferedReader.
    static void lireAvecBufferedReader() throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Ligne : " + line);
            }
        }
    }
    // 2️⃣ Lecture avec encodage UTF-8 (méthode recommandée)
    // BufferedReader + InputStreamReader (UTF-8)
    // La version recommandée :
    // ✔ permet de choisir l’encodage
    // ✔ toujours fiable
    static void lireAvecEncodage() throws Exception {
        try (BufferedReader br = new BufferedReader(
            new InputStreamReader(
                new FileInputStream("data.txt"),
                StandardCharsets.UTF_8
            ))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Ligne UTF-8 : " + line);
            }
        }
    }
    // 3️⃣ Lire tout le fichier en une liste de lignes
    // Files.readAllLines()
    //• Charge tout le fichier dans une liste de chaînes.
    //• Très simple, mais pas pour les fichiers énormes.
    static void lireToutLeFichier() throws Exception {
        List<String> lignes = Files.readAllLines(Path.of("data.txt"), StandardCharsets.UTF_8);
        for (String l : lignes) {
            System.out.println("→ " + l);
        }
    }
    // 4️⃣ Lire avec un stream moderne
    static void lireAvecFilesLines() throws Exception {
        try (var lines = Files.lines(Path.of("data.txt"), StandardCharsets.UTF_8)) {
            lines.forEach(l -> System.out.println("Stream : " + l));
        }
    }
    // 5️⃣ Lire avec Scanner
    static void lireAvecScanner() throws Exception {
        try (Scanner sc = new Scanner(new File("data.txt"), "UTF-8")) {
            while (sc.hasNextLine()) {
                System.out.println("Scanner : " + sc.nextLine());
            }
        }
    }
    // 6️⃣ Lecture binaire
    static void lireBinaire() throws Exception {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("image.png"))) {
            int b;
            int count = 0;
            while ((b = bis.read()) != -1) {
                System.out.print(b + " "); // Affiche les bytes
                if (++count > 20) break;   // On limite l'affichage
            }
        }
    }
    // 7️⃣ Lecture avec FileChannel (NIO)
    static void lireAvecFileChannel() throws Exception {
        try (FileChannel channel = FileChannel.open(Path.of("data.txt"))) {
            ByteBuffer buffer = ByteBuffer.allocate(64);
            while (channel.read(buffer) > 0) {
                buffer.flip(); // prêt à lecture
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear(); // prêt pour un nouveau remplissage
            }
        }
    }


}
