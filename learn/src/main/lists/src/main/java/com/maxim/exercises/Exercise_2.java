package com.maxim.exercises;

import java.util.HashSet;

public class Exercise_2 {
    //Créez un HashSet de type Integer appelé ensembleNumeros.
    //Ajoutez les numéros suivants : 10, 20, 30, 20, 40, 10.
    //Affichez ensembleNumeros. Que remarquez-vous concernant les doublons ?
    //Vérifiez si le numéro 30 est présent dans l'ensemble et affichez le résultat.
    //Supprimez le numéro 20 de l'ensemble.
    //Affichez l'ensemble après la suppression.
    //Parcourez l'ensemble à l'aide d'une boucle for-each et affichez chaque numéro.
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(10);
        System.out.println("First Set: " + set);

        if(set.contains(30)) {
            System.out.println("Thirty is here");
        }
        set.remove(20);
        System.out.println("Second Set: " + set);
        set.forEach(System.out::println);
    }
}
