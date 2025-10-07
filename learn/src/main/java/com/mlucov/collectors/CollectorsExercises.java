package com.mlucov.collectors;

import com.mlucov.person.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExercises {
    // Collectors – 30 exercices
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
        System.out.println("Collecte une liste en List.");
        List<String> noms = List.of("Alice", "Bob", "Charlie");
        List<String> result = noms.stream().collect(Collectors.toList());
        System.out.println(result);
    }

    public static void ex2() {
        System.out.println("Collecte une liste en Set (supprime les doublons).");
        List<String> noms = List.of("Alice", "Bob", "Alice");
        Set<String> result = noms.stream().collect(Collectors.toSet());
        System.out.println(result);
    }

    public static void ex3() {
        System.out.println("Transforme une liste en Map avec nom -> longueur.");
        List<String> noms = List.of("Alice", "Bob", "Charlie");
        Map<String, Integer> result = noms.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(result);
    }

    public static void ex4() {
        System.out.println("Jointure des noms séparés par virgule.");
        List<String> noms = List.of("Alice", "Bob", "Charlie");
        String result = noms.stream().collect(Collectors.joining(","));
        System.out.println(result);
    }

    public static void ex5() {
        System.out.println("************************ex5***************");
        System.out.println("Compte le nombre d'éléments.");
        List<String> noms = List.of("Alice", "Bob", "Charlie");
//        Long count = noms.stream().collect(Collectors.counting());
        Long count = noms.stream().count();
        System.out.println(count);
    }

    public static void ex6() {
        System.out.println("************************ex6***************");
        System.out.println("Calcule la somme des longueurs des noms.");
        List<String> noms = List.of("Alice", "Bob", "Charlie");
        int sum = noms.stream().collect(Collectors.summingInt(x -> x.length()));
        System.out.println(sum);
    }

    public static void ex7() {
        System.out.println("************************ex7***************");
        System.out.println("Calcule la moyenne des longueurs.");
        List<String> noms = List.of("Alice", "Bob", "Charlie");
//        double avg = noms.stream().collect(Collectors.averagingInt(x -> x.length()));
        double avg = noms.stream().collect(Collectors.averagingInt(String::length));
        System.out.println(avg);
    }

    public static void ex8() {
        System.out.println("************************ex8***************");
        System.out.println("Résumé statistique des longueurs.");
        List<String> noms = List.of("Alice", "Bob", "Charlie");
        IntSummaryStatistics stats = noms.stream()
            .collect(Collectors.summarizingInt(String::length));
        System.out.println(stats);
    }

    public static void ex9() {
        System.out.println("************************ex9***************");
        System.out.println("Groupement des noms par longueur.");
        List<String> noms = List.of("Alice", "Bob", "Charlie", "Max");
        Map<Integer, Long> groupes = noms.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(groupes);
    }

    public static void ex10() {
        System.out.println("************************ex10***************");

        System.out.println("Partitionne en noms de plus de 3 lettres.");
        List<String> noms = List.of("Bob", "Alice", "Tom");
        Map<Boolean, List<String>> result = noms.stream().collect(Collectors.partitioningBy(p -> p.length() > 3));
        System.out.println(result);
    }

    public static void ex11() {
        System.out.println("************************ex11***************");
        System.out.println("Groupement et comptage par longueur.");
        List<String> noms = List.of("Alice", "Bob", "Charlie", "Tom");
        Map<Integer, String> result = noms.stream()
            .collect(Collectors.groupingBy(String::length,
                Collectors.joining(", ")));
        System.out.println(result);
    }

    public static void ex12() {
        System.out.println("Groupement et concaténation des noms par longueur.");
        List<String> noms = List.of("Alice", "Bob", "Charlie", "Tom");

//        System.out.println(result);
    }

    public static void ex13() {
        System.out.println("************************ex13***************");
        System.out.println("Partitionne et compte les noms.");
        List<String> noms = List.of("Alice", "Bob", "Tom");
        Map<Boolean, Long> result = noms.stream().collect(Collectors.partitioningBy(nom -> nom.length() > 3, Collectors.counting()));
//        Map<Boolean, Long> result = noms.stream().collect(Collectors.partitioningBy(nom -> nom.length() > 3, (acc, y) -> acc + y));
        System.out.println(result);
    }

    public static void ex14() {
        System.out.println("************************ex14***************");
        System.out.println("Crée une Map nom -> majuscules.");
        List<String> noms = List.of("Alice", "Bob");
        Map<String, String> result = noms.stream()
            .collect(Collectors.toMap(Function.identity(), String::toUpperCase));
        System.out.println(result);
    }

    public static void ex15() {
        System.out.println("************************ex15***************");
        System.out.println("Trie puis collecte en liste.");
        List<Integer> numbers = List.of(5, 2, 9, 1);
        List<Integer> result = numbers.stream().sorted().toList();
        System.out.println(result);
    }

    public static void ex16() {
        System.out.println("************************ex16***************");
        System.out.println("Supprime les doublons via toSet().");
        List<Integer> numbers = List.of(1, 2, 2, 3);
//        Set<Integer> result = numbers.stream().collect(Collectors.toSet());
        Set<Integer> result = new HashSet<>(numbers);
        System.out.println(result);
    }

    public static void ex17() {
        System.out.println("************************ex17***************");
        System.out.println("Transforme les nombres en chaînes et les joint.");
        List<Integer> numbers = List.of(1, 2, 3, 4);
//        String result = numbers.stream().map(Object::toString).collect(Collectors.joining(","));
        String result = numbers.stream()
            .map(String::valueOf)
            .collect(Collectors.joining("-"));
        System.out.println(result);
    }

    public static void ex18() {
        System.out.println("************************ex18**************");
        System.out.println("Trouve la valeur max avec maxBy.");
        List<Integer> numbers = List.of(1, 7, 3, 9);
        Optional<Integer> max = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(max);
    }

    public static void ex19() {
        System.out.println("************************ex19**************");
        System.out.println("Trouve la valeur min avec minBy.");
        List<Integer> numbers = List.of(1, 7, 3, 9);
        Optional<Integer> min = numbers.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(min);
    }

    public static void ex20() {
        System.out.println("************************ex20**************");
        System.out.println("Concatène les noms avec préfixe et suffixe.");
        List<String> noms = List.of("Alice", "Bob");
        String result = noms.stream()
            .collect(Collectors.joining(", ", "(", ")"));
        System.out.println(result);
    }

    public static void ex21() {
        System.out.println("************************ex21**************");
        System.out.println("Groupement par première lettre.");
        List<String> noms = List.of("Alice", "Bob", "Charlie", "Ala");
        Map<String, List<String>> result = noms.stream().collect(Collectors.groupingBy(x -> x.substring(0, 1)));
        System.out.println(result);
    }

    public static void ex22() {
        System.out.println("************************ex22**************");
        System.out.println("Partitionne les nombres pairs et impairs.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(result);
    }

    public static void ex23() {
        System.out.println("************************ex23**************");
        System.out.println("Somme des entiers avec reducing.");
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void ex24() {
        System.out.println("************************ex24**************");
        System.out.println("Produit des entiers avec reducing.");
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }

    public static void ex25() {
        System.out.println("************************ex25**************");
        System.out.println("Liste immuable avec toUnmodifiableList.");
        List<String> noms = List.of("Alice", "Bob");
        List<String> result = noms.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(result);
    }

    public static void ex26() {
        System.out.println("************************ex26**************");
        System.out.println("Set immuable avec toUnmodifiableSet.");
        List<String> noms = List.of("Alice", "Bob");
        Set<String> result = noms.stream().collect(Collectors.toUnmodifiableSet());
        System.out.println(result);
    }

    public static void ex27() {
        System.out.println("************************ex27**************");
        System.out.println("Map immuable avec toUnmodifiableMap.");
        List<String> noms = List.of("Alice", "Bob");
        Map<String, Integer> result = noms.stream()
            .collect(Collectors.toUnmodifiableMap(n -> n, String::length));
        System.out.println(result);
    }

    public static void ex28() {
        System.out.println("************************ex28**************");
        System.out.println("Compter les occurrences des mots.");
        List<String> mots = List.of("a", "b", "a", "c", "b");
        Map<String, Long> result = mots.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }

    public static void ex29() {
        System.out.println("************************ex29**************");
        System.out.println("Concaténer les mots groupés par première lettre.");
        List<String> mots = List.of("apple", "avocado", "banana", "blue");
        Map<String, List<String>> result = mots.stream().collect(Collectors.groupingBy(x -> x.substring(0, 1)));
        System.out.println(result);
    }

    public static void ex30() {
        System.out.println("************************ex30**************");
        System.out.println("Somme des longueurs par première lettre.");
        List<String> mots = List.of("apple", "avocado", "banana", "blue");
        Map<String, Integer> result = mots.stream().collect(Collectors.groupingBy(x -> x.substring(0, 1), Collectors.summingInt(x -> x.length())));

        System.out.println(result);
    }
    public static void ex31() {
        System.out.println("************************ex31**************");
        System.out.println("Regroupe les personnes par ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 25, "Paris")
        );

        Map<String, List<Person>> result =
            people.stream().collect(Collectors.groupingBy(p -> p.city));

        System.out.println(result);
    }

    public static void ex32() {
        System.out.println("************************ex32**************");
        System.out.println("Compte le nombre de personnes par ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 25, "Paris")
        );

        Map<String, Long> result =
            people.stream().collect(Collectors.groupingBy(p -> p.city, Collectors.counting()));

        System.out.println(result);
    }

    public static void ex33() {
        System.out.println("************************ex33**************");
        System.out.println("Calcule la moyenne d’âge par ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 35, "Paris")
        );

        Map<String, Double> result =
            people.stream().collect(Collectors.groupingBy(p -> p.city, Collectors.averagingInt(p -> p.age)));

        System.out.println(result);
    }

    public static void ex34() {
        System.out.println("************************ex34**************");
        System.out.println("Récupère la personne la plus âgée par ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 35, "Paris")
        );

        Map<String, Optional<Person>> result =
            people.stream().collect(Collectors.groupingBy(p -> p.city, Collectors.maxBy(Comparator.comparingInt(p -> p.age))));

        System.out.println(result);
    }

    public static void ex35() {
        System.out.println("************************ex35**************");
        System.out.println("Liste les noms par ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 35, "Paris")
        );

        Map<String, List<String>> result =
            people.stream().collect(Collectors.groupingBy(p -> p.city, Collectors.mapping(p -> p.name, Collectors.toList())));

        System.out.println(result);
    }

    public static void ex36() {
        System.out.println("************************ex36**************");
        System.out.println("Concatène les noms des personnes d’une même ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 35, "Paris")
        );

        Map<String, String> result =
            people.stream().collect(Collectors.groupingBy(
                p -> p.city,
                Collectors.mapping(p -> p.name, Collectors.joining(", "))
            ));

        System.out.println(result);
    }

    public static void ex37() {
        System.out.println("************************ex37**************");
        System.out.println("Regroupe les personnes par tranche d’âge (moins de 30, 30 ou plus).");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 32, "Lyon"),
            new Person("Charlie", 40, "Paris")
        );

        Map<String, List<Person>> result =
            people.stream().collect(Collectors.groupingBy(
                p -> p.age < 30 ? "Jeune" : "Adulte"
            ));

        System.out.println(result);
    }

    public static void ex38() {
        System.out.println("************************ex38**************");
        System.out.println("Partitionne les personnes en majeures et mineures.");
        List<Person> people = List.of(
            new Person("Alice", 17, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 19, "Paris")
        );

        Map<Boolean, List<Person>> result =
            people.stream().collect(Collectors.partitioningBy(p -> p.age >= 18));

        System.out.println(result);
    }

    public static void ex39() {
        System.out.println("************************ex39**************");
        System.out.println("Calcule la somme des âges par ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 35, "Paris")
        );

        Map<String, Integer> result =
            people.stream().collect(Collectors.groupingBy(p -> p.city, Collectors.summingInt(p -> p.age)));

        System.out.println(result);
    }

    public static void ex40() {
        System.out.println("************************ex40**************");
        System.out.println("Nombre de lettres total des noms par ville.");
        List<Person> people = List.of(
            new Person("Alice", 25, "Paris"),
            new Person("Bob", 30, "Lyon"),
            new Person("Charlie", 35, "Paris")
        );

        Map<String, Integer> result =
            people.stream().collect(Collectors.groupingBy(
                p -> p.city,
                Collectors.summingInt(p -> p.name.length())
            ));

        System.out.println(result);
    }

}