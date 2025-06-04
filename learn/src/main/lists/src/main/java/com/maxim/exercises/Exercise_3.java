package com.maxim.exercises;

import java.util.HashMap;

public class Exercise_3 {
    //Créez une HashMap<String, String> appelée capitalesDuMonde.
    //Ajoutez les paires suivantes :
    //"France" -> "Paris"
    //"Allemagne" -> "Berlin"
    //"Espagne" -> "Madrid"
    //Affichez toute la map capitalesDuMonde.
    //Obtenez et affichez la capitale de "France".
    //Ajoutez "Italie" -> "Rome".
    //Mettez à jour la capitale de l’Allemagne à "Munich".
    //Supprimez "Espagne".
    //Affichez toutes les clés de la map.
    //Affichez toutes les valeurs de la map.
    //Affichez chaque paire clé-valeur avec entrySet().
    public static void main(String[] args) {
        HashMap<String, String> capitalesDuMonde = new HashMap<>();
        capitalesDuMonde.put("France", "Paris");
        capitalesDuMonde.put("Allemagne", "Berlin");
        capitalesDuMonde.put("Espagne", "Madrid");
        System.out.println(capitalesDuMonde.get("France"));
        capitalesDuMonde.put("Italie", "Rome");
        System.out.println(capitalesDuMonde);
        capitalesDuMonde.remove("France");
        System.out.println("Keys : " + capitalesDuMonde.keySet());
        System.out.println("Values : " + capitalesDuMonde.values());
        System.out.println("Values : " + capitalesDuMonde.entrySet());
        capitalesDuMonde.entrySet().forEach(System.out::println);

    }
}
