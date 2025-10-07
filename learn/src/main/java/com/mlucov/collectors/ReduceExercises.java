package com.mlucov.collectors;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReduceExercises {
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
        ex31();
        ex32();
        ex33();
        ex34();
        ex35();
        ex36();
        ex37();
        ex38();
        ex39();
        ex40();
    }

    public static void ex1() {
        System.out.println("************************ex1**************");
        System.out.println("Somme de tous les entiers d'une liste.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void ex2() {
        System.out.println("************************ex2**************");
        System.out.println("Produit de tous les entiers d'une liste.");
        List<Integer> numbers = List.of(2, 3, 4);
        int product = numbers.stream().reduce(1, (a, x) -> a * x);
        System.out.println(product);
    }

    public static void ex3() {
        System.out.println("************************ex3**************");
        System.out.println("Concatène tous les mots d'une liste.");
        List<String> mots = List.of("Java", "is", "fun");
        String result = mots.stream().reduce("", (a, x) -> a + x);
        System.out.println(result.trim());
    }

    public static void ex4() {
        System.out.println("************************ex4**************");
        System.out.println("Trouve le maximum d'une liste d'entiers.");
        List<Integer> numbers = List.of(5, 9, 1, 4);
        Optional<Integer> max = numbers.stream().reduce((a, b) -> a > b ? a : b);
        System.out.println(max.get());
    }

    public static void ex5() {
        System.out.println("************************ex5**************");
        System.out.println("Trouve le minimum d'une liste d'entiers.");
        List<Integer> numbers = List.of(5, 9, 1, 4);
        Optional<Integer> min = numbers.stream().reduce((a, b) -> a < b ? a : b);
        System.out.println(min.get());
    }

    public static void ex6() {
        System.out.println("************************ex6**************");
        System.out.println("Compte le nombre de mots de plus de 3 lettres avec reduce.");
        List<String> mots = List.of("apple", "car", "banana", "dog");
        int count = mots.stream().reduce(
            0,
            (currentCount, mot) -> mot.length() > 3 ? currentCount + 1 : currentCount, // Accumulator
            Integer::sum
        );
        System.out.println(count);
    }

    public static void ex7() {
        System.out.println("************************ex7**************");
        System.out.println("Calcule la somme des carrés.");
        List<Integer> numbers = List.of(2, 3, 4);
        int sumSquares = numbers.stream().reduce(0, (a, b) -> a + (b * b));
        System.out.println(sumSquares);
    }

    public static void ex8() {
        System.out.println("************************ex8**************");
        System.out.println("Calcule la différence cumulée entre les nombres.");
        List<Integer> numbers = List.of(10, 3, 2);
        int result = numbers.stream().reduce(0, (a, b) -> a - b);
        System.out.println(result);
    }

    public static void ex9() {
        System.out.println("************************ex9**************");
        System.out.println("Concatène des chaînes en majuscules.");
        List<String> mots = List.of("java", "stream", "api");
        String result = mots.stream().reduce("", (a, b) -> a + b.toUpperCase());
        System.out.println(result);
    }

    public static void ex10() {
        System.out.println("************************ex10**************");
        System.out.println("Calcule la somme des nombres pairs.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int sum = numbers.stream().reduce(0, (a, b) -> a + (b % 2 == 0 ? b : 0));
        System.out.println(sum);
    }

    public static void ex11() {
        System.out.println("************************ex11**************");
        System.out.println("Calcule le total des longueurs de mots.");
        List<String> mots = List.of("apple", "banana", "pear");
        int total = mots.stream().reduce(0, (a, b) -> a + b.length(), (x, y) -> x + y);
        System.out.println(total);
    }

    public static void ex12() {
        System.out.println("************************ex12**************");
        System.out.println("Trouve le mot le plus long avec reduce.");
        List<String> mots = List.of("cat", "elephant", "dog");
        String longest = mots.stream().reduce("", (a, b) -> b.length() > a.length() ? b : a);
        System.out.println(longest);
    }

    public static void ex13() {
        System.out.println("************************ex13**************");
        System.out.println("Vérifie si la somme dépasse 100.");
        List<Integer> numbers = List.of(20, 50, 10);
        boolean over100 = numbers.stream().reduce(0, Integer::sum)  > 100;
        System.out.println(over100);
    }

    public static void ex14() {
        System.out.println("************************ex14**************");
        System.out.println("Multiplie seulement les nombres positifs.");
        List<Integer> numbers = List.of(-1, 2, 3, -4, 5);
        int result = numbers.stream().reduce(1, (a, b) -> b > 0 ? a * b : a);
        System.out.println(result);
    }

    public static void ex15() {
        System.out.println("************************ex15**************");
        System.out.println("Concatène les premières lettres de chaque mot.");
        List<String> mots = List.of("Java", "Stream", "Reduce");
        String result = mots.stream().reduce("", (a, b) -> a + b.charAt(0));
        System.out.println(result);
    }

    public static void ex16() {
        System.out.println("************************ex16**************");
        System.out.println("Somme pondérée (chaque nombre multiplié par son index).");
        List<Integer> numbers = List.of(10, 20, 30);
        int sum = IntStream.range(0, numbers.size())
                        .map(i -> i * numbers.get(i))
                        .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void ex17() {
        System.out.println("************************ex17**************");
        System.out.println("Compte les mots contenant la lettre 'a'.");
        List<String> mots = List.of("cat", "dog", "apple");
        int count = mots.stream().reduce(0, (a, b) -> b.charAt(0) == 'a' ? a + 1 : a, Integer::sum);
        System.out.println(count);
    }

    public static void ex18() {
        System.out.println("************************ex18**************");
        System.out.println("Concatène les nombres séparés par une virgule.");
        List<Integer> numbers = List.of(1, 2, 3, 4);
//        String result =
//        System.out.println(result);
    }

    public static void ex19() {
        System.out.println("************************ex19**************");
        System.out.println("Trouve la somme maximale de deux éléments consécutifs.");
        List<Integer> numbers = List.of(1, 5, 3, 8, 2);
//        int maxSum =
//        System.out.println(maxSum);
    }

    public static void ex20() {
        System.out.println("************************ex20**************");
        System.out.println("Calcule la moyenne manuellement avec reduce.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double average = numbers.stream().reduce(0, Integer::sum) / numbers.size();
        System.out.println(average);
    }

    public static void ex21() {
        System.out.println("************************ex21**************");
        System.out.println("Calcule le total des ventes (double) avec reduce.");
        List<Double> ventes = List.of(120.5, 300.0, 450.75);
        double total = ventes.stream().reduce(0.0, Double::sum);
        System.out.println(total);
    }

    public static void ex22() {
        System.out.println("************************ex22**************");
        System.out.println("Trouve la chaîne la plus longue avec reduce.");
        List<String> mots = List.of("java", "stream", "api", "reduce");
        String longest = mots.stream().reduce((a, b) -> a.length() >= b.length() ? a : b).get();
        System.out.println(longest);
    }

    public static void ex23() {
        System.out.println("************************ex23**************");
        System.out.println("Somme des longueurs de mots avec reduce.");
        List<String> mots = List.of("java", "spring", "boot");
        int total = mots.stream().map(String::length).reduce(0, Integer::sum);
        System.out.println(total);
    }

    public static void ex24() {
        System.out.println("************************ex24**************");
        System.out.println("Somme des salaires par département avec groupingBy + reducing.");
        record Employe(String nom, String departement, int salaire) {}
        List<Employe> employes = List.of(
            new Employe("Alice", "IT", 3000),
            new Employe("Bob", "IT", 2500),
            new Employe("Claire", "HR", 2000)
        );
//        Map<String, Integer> salaires = employes.stream().collect(Collectors.groupingBy(Employe::departement, Collectors.reducing(0, (a, b) -> a + b.salaire(), Integer::sum)));
        Map<String, Integer> salaires = employes.stream().collect(Collectors.groupingBy(Employe::departement, Collectors.reducing(0, Employe::salaire, Integer::sum)));
        System.out.println(salaires);
    }

    public static void ex25() {
        System.out.println("************************ex25**************");
        System.out.println("Trouve le salaire total par département (groupingBy + reducing).");
        record Employe(String nom, String dept, int salaire) {}
        List<Employe> employes = List.of(
            new Employe("Alice", "IT", 3000),
            new Employe("Bob", "IT", 2500),
            new Employe("Eve", "HR", 2700)
        );
        Map<String, Integer> maxSalaire = employes.stream().collect(Collectors.groupingBy(Employe::dept, Collectors.reducing(
            0,
            Employe::salaire,
            Integer::sum
        )));
        System.out.println(maxSalaire);
    }

    public static void ex26() {
        System.out.println("************************ex26**************");
        System.out.println("Calcule la moyenne manuelle avec reduce et count.");
        List<Integer> notes = List.of(10, 15, 20);
        double moyenne = (double) notes.stream().reduce(0, Integer::sum) / notes.size();
        System.out.println(moyenne);
    }

    public static void ex27() {
        System.out.println("************************ex27**************");
        System.out.println("Concatène les prénoms avec un séparateur avec reduce.");
        List<String> prenoms = List.of("Alice", "Bob", "Charlie");
        String result = prenoms.stream().reduce("", (a, b) -> a + "-" + b).substring(1);
        System.out.println(result);
    }

    public static void ex28() {
        System.out.println("************************ex28**************");
        System.out.println("Produit de tous les éléments sauf ceux à zéro.");
        List<Integer> nombres = List.of(2, 0, 5, 3, 4);
        int produit = nombres.stream().reduce(1, (a, b) -> a * (b > 0 ? b : 1));
        System.out.println(produit);
    }

    public static void ex29() {
        System.out.println("************************ex29**************");
        System.out.println("Combine reduce + groupingBy : somme des carrés par parité.");
        List<Integer> nombres = List.of(1, 2, 3, 4, 5);
        Map<String, Integer> result = nombres.stream().collect(
            Collectors.groupingBy((a) -> a % 2 == 0 ? "pair" : "impair", Collectors.reducing(1, (a, b) -> a * b))
        );
        System.out.println(result);
    }

    public static void ex30() {
        System.out.println("************************ex30**************");
        System.out.println("Compte manuellement avec reduce.");
        List<String> mots = List.of("a", "b", "c", "d");
        long count = mots.stream().reduce(0, (a, b) -> a + 1, Integer::sum);
        System.out.println(count);
    }

    public static void ex31() {
        System.out.println("************************ex31**************");
        System.out.println("Calcule la somme des salaires pour les employés actifs (partitioningBy + reducing).");
        record Employe(String nom, boolean actif, int salaire) {}
        List<Employe> employes = List.of(
            new Employe("Alice", true, 3000),
            new Employe("Bob", false, 2000),
            new Employe("Claire", true, 2500)
        );
        Map<Boolean, Integer> result = employes.stream().collect(Collectors.partitioningBy(Employe::actif, Collectors.reducing(0, Employe::salaire, Integer::sum)));
        System.out.println(result.get(true));
    }

    public static void ex32() {
        System.out.println("************************ex32**************");
        System.out.println("Concatène les noms par département avec reducing.");
        record Employe(String nom, String dept) {}
        List<Employe> employes = List.of(
            new Employe("Alice", "IT"),
            new Employe("Bob", "IT"),
            new Employe("Eve", "HR")
        );
        Map<String, String> result = employes.stream().collect(Collectors.groupingBy(
                Employe::dept,
                Collectors.reducing("", e -> e.nom, (a, b) -> a.isEmpty() ? b : a + ", " + b)
            ));
        System.out.println(result);
    }

    public static void ex33() {
        System.out.println("************************ex33**************");
        System.out.println("Utilise reduce pour compter le nombre de chaînes contenant 'a'.");
        List<String> mots = List.of("apple", "pear", "banana", "fig");
        int count = mots.stream().reduce(0,
            (acc, s) -> acc + (s.contains("a") ? 1 : 0),
            Integer::sum);
        System.out.println(count);
    }

    public static void ex34() {
        System.out.println("************************ex34**************");
        System.out.println("Combine reduce et mapToInt pour un total propre.");
        List<String> mots = List.of("java", "stream", "api");
        int total = mots.stream().mapToInt(String::length).reduce(0, Integer::sum);
        System.out.println(total);
    }

    public static void ex35() {
        System.out.println("************************ex35**************");
        System.out.println("Crée une Map somme par longueur avec groupingBy + reducing.");
        List<String> mots = List.of("hi", "java", "moon", "sun");
        Map<Integer, Integer> result =
            mots.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.reducing(0, String::length, Integer::sum)
            ));
        System.out.println(result);
    }

    public static void ex36() {
        System.out.println("************************ex36**************");
        System.out.println("Calcule la différence cumulée via reduce (a - b).");
        List<Integer> nombres = List.of(100, 20, 10, 5);
//        int diff =
//        System.out.println(diff);
    }

    public static void ex37() {
        System.out.println("************************ex37**************");
        System.out.println("Combine reduce et flatMap pour aplatir des listes et sommer.");
        List<List<Integer>> listes = List.of(List.of(1, 2), List.of(3, 4, 5));
        int sum = listes.stream().flatMap(Collection::stream).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void ex38() {
        System.out.println("************************ex38**************");
        System.out.println("Regroupe par longueur et trouve la longueur max dans chaque groupe.");
        List<String> mots = List.of("cat", "dog", "elephant", "bee", "mouse");
        Map<Integer, Optional<Integer>> result =
            mots.stream().collect(Collectors.groupingBy(
                s -> s.length() % 2,
                Collectors.mapping(String::length, Collectors.reducing(Integer::max))
         ));
        System.out.println(result);
    }

    public static void ex39() {
        System.out.println("************************ex39**************");
        System.out.println("Partitionne les entiers selon s’ils sont > 10, puis somme chaque groupe avec reducing.");
        List<Integer> nombres = List.of(5, 15, 20, 3, 8);
        Map<Boolean, Integer> result = nombres.stream().collect(Collectors.partitioningBy(x -> x > 10, Collectors.reducing(0, Integer::sum)));
        System.out.println(result);
    }

    public static void ex40() {
        System.out.println("************************ex40**************");
        System.out.println("Utilise reducing pour compter les mots par première lettre (similaire à groupingBy + counting).");
        List<String> mots = List.of("apple", "avocado", "banana", "blue");
        Map<Character, Integer> result = mots.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.reducing(0, mot -> 1, Integer::sum)));
        System.out.println(result);
    }
}