package com.maxim.exercises;

import java.util.ArrayList;

public class Exercise_1 {
    public static void main(String[] args) {
        // 1. Créez une ArrayList de type String appelée listeFruits
        ArrayList<String> listeFruits = new ArrayList<>();

        // 2. Ajoutez les fruits suivants : "Pomme", "Banane", "Orange"
        listeFruits.add("Pomme");
        listeFruits.add("Banane");
        listeFruits.add("Orange");

        // 3. Affichez listeFruits entière
        System.out.println("Liste initiale des fruits : " + listeFruits);

        // 4. Accédez au deuxième fruit de la liste (index 1) et affichez-le
        System.out.println("Deuxième fruit : " + listeFruits.get(1));

        // 5. Modifiez le fruit à l'index 0 par "Cerise"
        listeFruits.set(0, "Cerise");

        // 6. Supprimez "Banane" de la liste
        listeFruits.remove("Banane");

        // 7. Affichez la liste après les modifications
        System.out.println("Liste après modifications : " + listeFruits);

        // 8. Effacez tous les éléments de la liste
        listeFruits.clear();

        // 9. Vérifiez et affichez si la liste est vide
        System.out.println("La liste est-elle vide ? " + listeFruits.isEmpty());
    }
}
