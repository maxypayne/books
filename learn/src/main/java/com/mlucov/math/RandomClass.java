package com.mlucov.math;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomClass {
//    public static void main(String[] args) {
//
//        Random rand = new Random(); // pas de seed => seed basée sur le temps système
//
//        int randomInt = rand.nextInt();           // entier aléatoire
//        int randomBounded = rand.nextInt(10);     // entre 0 (inclus) et 10 (exclu)
//        double randomDouble = rand.nextDouble();  // entre 0.0 et 1.0
//        boolean randomBool = rand.nextBoolean();  // true ou false
//
//        System.out.println(randomInt);
//        System.out.println(randomBounded);
//        System.out.println(randomDouble);
//        System.out.println(randomBool);
//
//        var randomChar =(char) ('A' + new Random().nextInt(26));
//        System.out.println(randomChar);
//
//        ex_1();
//        ex_2();
//        ex_3();
//        ex_4();
//        ex_5();
//        ex_6();
//        ex_7();
//        ex_8();
//        ex_9();
//        ex_10();
//    }
//    public static String randomString(int length) {
//        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        Random rand = new Random();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < length; i++) {
//
//        }
//    }

    public void checkThrow() throws FileAlreadyExistsException {
        throw new FileAlreadyExistsException("tot.pdf");
    }

    private static void ex_1() {
        System.out.println("****************ex_1**************");
        // Génère un entier aléatoire entre 0 et 9
        Random rand = new Random();
        int n = rand.nextInt(10);
        System.out.println("Nombre aléatoire : " + n);
    }

    private static void ex_2() {
        System.out.println("****************ex_2**************");
        // Génère un nombre aléatoire entre 1 et 6 (simule un dé)
//        System.out.println("Dé : " + dice);
    }

    private static void ex_3() {
        System.out.println("****************ex_3**************");
        // Choisit un élément aléatoire dans une liste
        List<String> couleurs = List.of("Rouge", "Bleu", "Vert", "Jaune", "Noir");
//        System.out.println("Couleur choisie : " + couleur);
    }

    private static void ex_4() {
        System.out.println("****************ex_4**************");
        // Génère une lettre majuscule aléatoire
//        System.out.println("Lettre aléatoire : " + randomChar);
    }

    private static void ex_5() {
        System.out.println("****************ex_5**************");
        // Génère un mot aléatoire de 8 caractères (A–Z)
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        System.out.println("Mot généré : " + sb);
    }

    private static void ex_6() {
        System.out.println("****************ex_6**************");
        // Simule pile ou face
//        System.out.println(pile ? "Pile" : "Face");
    }

    private static void ex_7() {
        System.out.println("****************ex_7**************");
        // Génère un double entre 0 et 10
//        System.out.println("Nombre décimal : " + d);
    }

    private static void ex_8() {
        System.out.println("****************ex_8**************");
        // Mélange une liste (shuffle)
        List<Integer> nombres = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
//        System.out.println("Liste mélangée : " + nombres);
    }

    private static void ex_9() {
        System.out.println("****************ex_9**************");
        // Génère un mot de passe aléatoire (lettres + chiffres)
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder pass = new StringBuilder();
//        System.out.println("Mot de passe : " + pass);
    }

    private static void ex_10() {
        System.out.println("****************ex_10**************");
        // Tire un nombre aléatoire jusqu’à obtenir 7
        Random rand = new Random();
//        System.out.println("Trouvé 7 après " + essais + " essais !");
    }
}


//private static void ex_1() {
//        System.out.println("****************ex_1**************");
//        // Génère un entier aléatoire entre 0 et 9
//        Random rand = new Random();
//        int n = rand.nextInt(10);
//        System.out.println("Nombre aléatoire : " + n);
//    }
//
//    private static void ex_2() {
//        System.out.println("****************ex_2**************");
//        // Génère un nombre aléatoire entre 1 et 6 (simule un dé)
//        int dice = new Random().nextInt(6) + 1;
//        System.out.println("Dé : " + dice);
//    }
//
//    private static void ex_3() {
//        System.out.println("****************ex_3**************");
//        // Choisit un élément aléatoire dans une liste
//        List<String> couleurs = List.of("Rouge", "Bleu", "Vert", "Jaune", "Noir");
//        String couleur = couleurs.get(new Random().nextInt(couleurs.size()));
//        System.out.println("Couleur choisie : " + couleur);
//    }
//
//    private static void ex_4() {
//        System.out.println("****************ex_4**************");
//        // Génère une lettre majuscule aléatoire
//        char randomChar = (char) ('A' + new Random().nextInt(26));
//        System.out.println("Lettre aléatoire : " + randomChar);
//    }
//
//    private static void ex_5() {
//        System.out.println("****************ex_5**************");
//        // Génère un mot aléatoire de 8 caractères (A–Z)
//        Random rand = new Random();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 8; i++) {
//            sb.append((char) ('A' + rand.nextInt(26)));
//        }
//        System.out.println("Mot généré : " + sb);
//    }
//
//    private static void ex_6() {
//        System.out.println("****************ex_6**************");
//        // Simule pile ou face
//        boolean pile = new Random().nextBoolean();
//        System.out.println(pile ? "Pile" : "Face");
//    }
//
//    private static void ex_7() {
//        System.out.println("****************ex_7**************");
//        // Génère un double entre 0 et 10
//        double d = new Random().nextDouble() * 10;
//        System.out.println("Nombre décimal : " + d);
//    }
//
//    private static void ex_8() {
//        System.out.println("****************ex_8**************");
//        // Mélange une liste (shuffle)
//        List<Integer> nombres = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
//        Collections.shuffle(nombres);
//        System.out.println("Liste mélangée : " + nombres);
//    }
//
//    private static void ex_9() {
//        System.out.println("****************ex_9**************");
//        // Génère un mot de passe aléatoire (lettres + chiffres)
//        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        Random rand = new Random();
//        StringBuilder pass = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            pass.append(chars.charAt(rand.nextInt(chars.length())));
//        }
//        System.out.println("Mot de passe : " + pass);
//    }
//
//    private static void ex_10() {
//        System.out.println("****************ex_10**************");
//        // Tire un nombre aléatoire jusqu’à obtenir 7
//        Random rand = new Random();
//        int n;
//        int essais = 0;
//        do {
//            n = rand.nextInt(10);
//            essais++;
//            System.out.println("Essai " + essais + " → " + n);
//        } while (n != 7);
//        System.out.println("Trouvé 7 après " + essais + " essais !");
//    }