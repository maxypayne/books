package com.mlucov.map;

import com.mlucov.person.PersonWithBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class MapExercices {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
        ex17();
        ex18();
        ex19();
        ex20();
        ex21();
        ex22();
        ex23();
        ex24();
        ex25();
        ex26();
        ex27();
        ex28();
        ex29();
        ex30();
    }

    public static void ex1() {
        System.out.println("Crée une HashMap<String, Integer> pour stocker des noms et âges. Ajoute 3 personnes et affiche-les.");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 2);
        map.put("Jack", 3);
        System.out.println(map);
    }

    public static void ex2() {
        System.out.println("Ajoute une personne avec un nom déjà existant : observe le comportement.");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
    }

    public static void ex3() {
        System.out.println("Vérifie si 'Alice' est dans la map.");
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 1);

        if (map.containsKey("Alice")) {
            System.out.println("Map contains Alice");
        }
    }

    public static void ex4() {
        System.out.println("Supprime 'Bob' de la map.");
        Map<String, Integer> map = new HashMap<>();
        map.put("Bob", 1);
        map.remove("Bob");
        System.out.println(map);
    }

    public static void ex5() {
        System.out.println("Parcours les clés avec keySet().");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.remove("John");
    }

    public static void ex6() {
        System.out.println("Parcours les valeurs avec values().");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Jane");
        map.put(3, "Jack");
        System.out.println(map.values());
    }

    public static void ex7() {
        System.out.println("Parcours les paires avec entrySet().");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 2);
        Set<Map.Entry<String, Integer>> list = map.entrySet();
        System.out.println(list);
    }

    public static void ex8() {
        System.out.println("Compte combien d’éléments il y a avec size().");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 2);
        map.put("Jack", 3);
        System.out.println(map.size());
    }

    public static void ex9() {
        System.out.println("Vérifie si la map est vide.");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 2);
        System.out.println(map.isEmpty());
    }

    public static void ex10() {
        System.out.println("Vide complètement la map avec clear().");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Jane", 2);
        map.clear();
        System.out.println(map);
    }

    public static void ex11() {
        System.out.println("Crée un dictionnaire Français–Anglais (Map<String, String>). Traduis 3 mots.");
        Map<String, String> map = new HashMap<>();
        map.put("Hier", "Yesterday");
        map.put("Aujourd'hui", "Today");
        map.put("Demain", "Tomorrow");

        System.out.println(map);
    }

    public static void ex12() {
        System.out.println("Associe des pays à leurs capitales. Affiche la capitale de la France.");
        Map<String, String> map = new HashMap<>();
    }

    public static void ex13() {
        System.out.println("Associe des produits à leurs prix. Affiche le prix moyen.");
        Map<String, Double> map = new HashMap<>();
    }

    public static void ex14() {
        System.out.println("Crée une Map<Integer, String> pour stocker 5 étudiants (id → nom). Affiche-les.");
        Map<Integer, String> map = new HashMap<>();
    }

    public static void ex15() {
        System.out.println("Crée une Map<String, String> login → mot de passe. Vérifie une authentification simple.");
        Map<String, String> map = new HashMap<>();
    }

    public static void ex16() {
        System.out.println("Stocke une liste de villes avec leur nombre d’habitants. Trouve la plus peuplée.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex17() {
        System.out.println("Associe une plaque d’immatriculation à une marque de voiture.");
        Map<String, String> map = new HashMap<>();
    }

    public static void ex18() {
        System.out.println("Associe un joueur à son score. Trouve le meilleur joueur.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex19() {
        System.out.println("Associe une année à un événement historique. Affiche celui de 1789.");
        Map<Integer, String> map = new HashMap<>();
    }

    public static void ex20() {
        System.out.println("Associe une couleur à son code hexadécimal. Affiche le code du rouge.");
        Map<String, String> map = new HashMap<>();
    }

    public static void ex21() {
        System.out.println("Ajoute 10 produits dans une Map<String, Double>. Supprime ceux en dessous de 10€.");
        Map<String, Double> map = new HashMap<>();
    }

    public static void ex22() {
        System.out.println("Fusionne deux maps de capitales en une seule.");
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>(map1);
        map3.putAll(map2);
    }

    public static void ex23() {
        System.out.println("Vérifie si une valeur existe dans une map (containsValue).");
        Map<String, String> map = new HashMap<>();
    }

    public static void ex24() {
        System.out.println("********************ex24*****************");
        System.out.println("Remplace toutes les valeurs par leur double (replaceAll).");
        Map<String, Integer> map = new HashMap<>();
        map.put("Jane", 1);
        map.put("John", 2);
        map.replaceAll((k, v) -> v * 2);
        System.out.println(map);
    }

    public static void ex25() {
        System.out.println("********************ex25*****************");
        System.out.println("Ajoute un étudiant seulement s’il n’existe pas déjà (putIfAbsent).");
        Map<Integer, String> map = new HashMap<>();
        map.put(25, "Max");
        map.put(26, "Min");
        map.putIfAbsent(25, "Max");
        System.out.println(map);
    }

    public static void ex26() {
        System.out.println("********************ex26*****************");
        System.out.println("Supprime un joueur seulement si son score correspond (remove(key, value)).");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.remove("John", 1);
    }

    public static void ex27() {
        System.out.println("********************ex27*****************");
        System.out.println("Utilise getOrDefault pour gérer une clé inexistante.");
        Map<String, Integer> map = new HashMap<>();
        map.getOrDefault("John", 1);
    }

    public static void ex28() {
        System.out.println("********************ex28*****************");
        System.out.println("Parcours une map avec forEach((k,v) -> …).");
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("John", 1);
        map.putIfAbsent("Jane", 2);
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void ex29() {
        System.out.println("********************ex29*****************");
        System.out.println("Trie une HashMap par clés avec un TreeMap.");
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("John", 1);
        map.putIfAbsent("Jane", 2);
        map.putIfAbsent("Mar", 3);
        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

    }

    public static void ex30() {
        System.out.println("Trie une HashMap par valeurs (avec Stream).");
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("John", 1);
        map.putIfAbsent("Jane", 2);
        map.putIfAbsent("Mar", 3);
        map.putIfAbsent("Carol", 3);

        Map<String, Integer> treeMap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    public static void ex31() {
        System.out.println("Simule une billetterie : clé = numéro de billet, valeur = nom du client.");
        Map<Integer, String> map = new HashMap<>();
    }

    public static void ex32() {
        System.out.println("Implémente une carte d’identité : clé = numéro, valeur = objet Person.");
        Map<Integer, PersonWithBuilder> map = new HashMap<>();
    }

    public static void ex33() {
        System.out.println("Stocke une liste de livres (isbn → titre). Recherche un titre par isbn.");
        Map<String, String> map = new HashMap<>();
    }

    public static void ex34() {
        System.out.println("Simule une boutique : produit → stock disponible. Décrémente après un achat.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex35() {
        System.out.println("Simule un carnet d’adresses : nom → téléphone. Recherche un numéro.");
        Map<String, String> map = new HashMap<>();
    }

    public static void ex36() {
        System.out.println("Simule un panier : produit → quantité. Calcule le total.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex37() {
        System.out.println("Associe une région → nombre de départements. Trouve la plus grande région.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex38() {
        System.out.println("Associe une langue → nombre de locuteurs. Trie par ordre décroissant.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex39() {
        System.out.println("Associe une équipe de foot → nombre de victoires. Trouve la meilleure.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex40() {
        System.out.println("Associe un film → note moyenne. Trouve le mieux noté.");
        Map<String, Double> map = new HashMap<>();
    }
    public static void ex41() {
        System.out.println("Convertis une List<String> en Map<String, Integer> (mot → longueur).");
        List<String> words = Arrays.asList("Java", "Spring", "Map");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex42() {
        System.out.println("Convertis une List<Person> en Map<String, Person> (clé = nom).");
        List<PersonWithBuilder> personWithBuilders = new ArrayList<>();
        Map<String, PersonWithBuilder> map = new HashMap<>();
    }

    public static void ex43() {
        System.out.println("Compte les occurrences de chaque mot dans une phrase avec Map<String, Integer>.");
        String phrase = "java java spring boot map java";
        Map<String, Integer> map = new HashMap<>();
    }

//    public static void ex44() {
//        System.out.println("Grouper des étudiants par leur classe (Map<String, List<Student>>).");
//        List<Student> students = new ArrayList<>();
//        Map<String, List<Student>> map = new HashMap<>();
//    }
//
//    public static void ex45() {
//        System.out.println("Grouper des produits par catégorie (Map<String, List<Product>>).");
//        List<Product> products = new ArrayList<>();
//        Map<String, List<Product>> map = new HashMap<>();
//    }

    public static void ex46() {
        System.out.println("Convertir une Map<String, Double> en une nouvelle avec TVA appliquée.");
        Map<String, Double> map = new HashMap<>();
    }

    public static void ex47() {
        System.out.println("Filtrer une Map pour ne garder que les valeurs > 100.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex48() {
        System.out.println("Trouver la clé correspondant à la valeur max avec Stream.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex49() {
        System.out.println("Trier une map par clés en ordre décroissant avec Stream.");
        Map<String, Integer> map = new HashMap<>();
    }

    public static void ex50() {
        System.out.println("Trier une map par valeurs en ordre décroissant avec Stream.");
        Map<String, Integer> map = new HashMap<>();
    }
    public static void ex51() {
        System.out.println("Utilise LinkedHashMap pour garder l’ordre d’insertion.");
        Map<String, Integer> map = new LinkedHashMap<>();
    }

    public static void ex52() {
        System.out.println("Utilise TreeMap pour trier automatiquement les clés.");
        Map<String, Integer> map = new TreeMap<>();
    }

    public static void ex53() {
        System.out.println("Crée une Hashtable et compare avec HashMap.");
        Map<String, Integer> map = new Hashtable<>();
    }

    public static void ex54() {
        System.out.println("Utilise EnumMap avec une enum DayOfWeek.");
//        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
    }

    public static void ex55() {
        System.out.println("Crée une WeakHashMap et observe le comportement avec GC.");
        Map<Object, String> map = new WeakHashMap<>();
    }

    public static void ex56() {
        System.out.println("Crée une ConcurrentHashMap et teste avec threads.");
        Map<String, Integer> map = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public static void ex57() {
        System.out.println("Implémente un cache LRU avec LinkedHashMap.");
        Map<String, String> cache = new LinkedHashMap<>(16, 0.75f, true);
    }

    public static void ex58() {
        System.out.println("Crée une Properties (Map spécialisée pour config).");
        Properties props = new Properties();
    }

    public static void ex59() {
        System.out.println("Charge un fichier .properties dans une Map.");
        Properties props = new Properties();
    }

    public static void ex60() {
        System.out.println("Compare les performances de HashMap et TreeMap avec 100000 éléments.");
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
    }

}
