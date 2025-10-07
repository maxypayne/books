package com.mlucov.lambda;

import com.mlucov.person.PersonWithBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;

public class Exercises {
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
        ex41();
        ex42();
        ex43();
        ex44();
        ex45();
    }
    public static void ex1() {
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(2));
    }
    public static void ex2() {
        Predicate<String> p = s -> !s.isEmpty();
        System.out.println(p.test("hello"));
    }
    public static void ex3() {
        Predicate<Integer> isPair = i -> i % 2 == 0;
        Predicate<Integer> isBiggerThan = i -> i > 10;
        Predicate<Integer> biggestAndPair = isPair.and(isBiggerThan);
        System.out.println(biggestAndPair.test(2));
        System.out.println(biggestAndPair.test(21));
        System.out.println(biggestAndPair.test(20));
    }
    public static void ex4() {
        System.out.println("Utilise Predicate<String> pour filtrer une liste de chaînes et ne garder que celles qui commencent par A");
        Predicate<String> pifStartsWithA = string -> string.startsWith("A");

        List<String> list = List.of("Areola", "Baa", "AC");

        List<String> filtered = list.stream().filter(pifStartsWithA).toList();
        System.out.println(filtered);
    }
    public static void ex5() {
        System.out.println("Crée un Predicate<Integer> qui vérifie si un nombre est compris entre 50 et 100.");
        Predicate<Integer> isBetween50and100 = i -> i > 50 && i < 100;
        System.out.println(isBetween50and100.test(60));
    }

    public static void ex6() {
        System.out.println("Crée une Function<String, Integer> qui retourne la longueur d’une chaîne.");
        Function<String, Integer> returnStringLength = String::length;
        System.out.println(returnStringLength.apply("hello"));
    }

    public static void ex7() {
        System.out.println("Crée une Function<Integer, String> qui convertit un nombre en texte.");
        Function<Integer, String> transformToString = Object::toString;
        System.out.println(transformToString.apply(2));
    }
    public static void ex8() {
        System.out.println(" Compose deux fonctions : une qui multiplie un nombre par 2, et une qui ajoute 3.");
        Function<Integer, Integer> multiplyByTwo  = i -> i * 2;
        Function<Integer, Integer> addThree = i -> i + 3;
        Function<Integer, Integer>  multiplyAndAdd = multiplyByTwo.andThen(addThree);

        System.out.println(multiplyAndAdd.apply(2));
    }
    public static void ex9() {
        System.out.println("Applique une Function<String, String> pour mettre en majuscules une liste de mots.");
        Function<String, String> UPPERCASE = String::toUpperCase;
        List<String> list = List.of("dod", "bar", "carT");

        List<String> toUpper = list.stream().map(UPPERCASE).toList();
        System.out.println(toUpper);
    }
    public static void ex10() {
        System.out.println("Crée une Function<Integer, Boolean> qui teste si un entier est premier.");
        Function<Integer, Boolean> checkIfIsPrime = i -> i % 2 == 0;
        checkIfIsPrime.apply(2);
    }
    public static void ex11() {
        System.out.println("Crée un Consumer<String> qui affiche une chaîne en console.");
        Consumer<String> consumer = System.out::println;
        consumer.accept("hello");
    }
    public static void ex12() {
        System.out.println("Crée un Consumer<Integer> qui affiche \"Positif\" si le nombre est >0, sinon \"Négatif\".");
        Consumer<Integer> consumer = i -> System.out.println(i > 0 ? "Positive " : "Negative ");
        consumer.accept(2);
    }
    public static void ex13() {
        System.out.println("Utilise un Consumer<List<Integer>> pour afficher tous les éléments d’une liste.");
        Consumer<List<String>> consumer = System.out::println;
        consumer.accept(List.of("1", "2", "3"));
    }
    public static void ex14() {
        System.out.println("Crée un Consumer<String> qui affiche la chaîne en majuscules.");
        Consumer<String> consumer = s-> System.out.println(s.toUpperCase());
        consumer.accept("hello");
    }
    public static void ex15() {
        PersonWithBuilder max = new PersonWithBuilder.Builder().name("Max").age(23).build();
        System.out.println("Crée un Consumer<Person> (classe simple) qui affiche son nom et son âge.");
//        Consumer<Person> consumer = person -> System.out.println(person.getName() + " " + person.getAge());
//        consumer.accept(max);
    }
    public static void ex16() {
        System.out.println("Crée un Supplier<String> qui retourne Hello World");
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
    public static void ex17() {
        System.out.println("Crée un Supplier<Integer> qui génère un nombre aléatoire entre 1 et 100");
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
        supplier.get();
    }
    public static void ex18() {
        System.out.println("Crée un Supplier<LocalDate> qui retourne la date actuelle.");
        Supplier<LocalDate> supplier = LocalDate::now;
        System.out.println(supplier.get());
    }
    public static void ex19() {
        System.out.println("Crée un Supplier<UUID> qui génère un identifiant unique.");
        Supplier<UUID> supplier = UUID::randomUUID;
        System.out.println(supplier.get());
    }
    public static void ex20() {
        System.out.println("Crée un BiPredicate<String, String> qui vérifie si deux chaînes sont égales.");
        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("hello", "world"));
    }
    public static void ex21() {
        System.out.println("Crée un BiPredicate<Integer, Integer> qui teste si le premier nombre est divisible par le second");
        BiPredicate<Integer, Integer> biPredicate = (a, b) ->  b != 0 && a % b == 0;
        System.out.println(biPredicate.test(1, 2));
    }
    public static void ex22() {
        System.out.println("Crée un BiPredicate<Integer, Integer> qui teste si le premier nombre est divisible par le second.");
        BiPredicate<String, Integer> biPredicate = (a, b) -> a.length() == b;
        System.out.println(biPredicate.test("Hello", 5));
    }
    public static void ex23() {
        System.out.println("Crée un BiPredicate<String, String> qui teste si la première chaîne contient la deuxième.");
        BiPredicate<String, String> biPredicate = String::contains;
        System.out.println(biPredicate.test("Trevor", "vor"));
    }
    public static void ex24() {
        System.out.println("Utilise un BiPredicate<Integer, Integer> pour vérifier si deux entiers sont tous deux pairs.");
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a % 2 == 0 && b % 2 == 0;
        System.out.println("12, 41 : "  +biPredicate.test(12, 41));
    }
    public static void ex25() {
        System.out.println("Crée un BiFunction<Integer, Integer, Integer> qui retourne la somme de deux nombres.");
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        System.out.println("1,2 : " + biFunction.apply(1, 2));
    }
    public static void ex26() {
        System.out.println("Crée un BiFunction<Double, Double, Double> qui calcule la moyenne de deux nombres.");
        BiFunction<Double, Double, Double> biFunction = (a, b) -> a + b / 2;
        System.out.println("2.34, 45.9 : " + biFunction.apply(2.34, 45.9));
    }
    public static void ex27() {
        System.out.println("Crée un BiFunction<String, Integer, String> qui répète une chaîne N fois.");
        BiFunction<String, Integer, String> biFunction = String::repeat;
        System.out.println(biFunction.apply("Hello", 5));
    }

    public static void ex28() {
        System.out.println("Crée un BiFunction<Integer, Integer, Boolean> qui teste si le premier nombre est supérieur au second.");
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
        System.out.println(biFunction.apply(1, 2));
    }
    public static void ex29() {
        System.out.println("Crée un UnaryOperator<Integer> qui calcule le carré d’un nombre.");
        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        System.out.println("3 : " +unaryOperator.apply(3));

    }
    public static void ex30() {
        System.out.println("Utilise un UnaryOperator<Double> pour calculer la racine carrée.");
        UnaryOperator<Double> unaryOperator = x -> x * 2;
        System.out.println("4.5 : " +unaryOperator.apply(4.5));
    }
    public static void ex31() {
        System.out.println("Crée un UnaryOperator<String> qui ajoute un point d’exclamation à la fin.");
        UnaryOperator<String> unaryOperator = x -> x + "!";
        System.out.println("5 : " +unaryOperator.apply("5"));
    }
    public static void ex32() {
        System.out.println("Utilise un UnaryOperator<Integer> pour transformer une liste en doublant chaque élément.");
        UnaryOperator<List<Integer>> unaryOperator = list -> list.stream().map( i -> i * 2).toList();
        System.out.println("List (1,2,3) : " + unaryOperator.apply(List.of(1, 2, 3)));
    }
    public static void ex33() {
        System.out.println("Crée un BinaryOperator<Integer> qui retourne le plus grand de deux nombres.");
        BinaryOperator<Integer> binaryOperator = (a, b) -> a > b ? a : b;
        System.out.println("5, 2 : " +binaryOperator.apply(5, 2));
    }
    public static void ex34() {
        System.out.println("Crée un BinaryOperator<String> qui fusionne deux mots avec un espace.");
        BinaryOperator<String> binaryOperator = (a, b) -> a + " " +  b;
        System.out.println("hello,world" + binaryOperator.apply("hello", "world"));
    }
    public static void ex35() {
        System.out.println("Crée un BinaryOperator<Double> qui calcule le produit de deux doubles");
        BinaryOperator<Double> binaryOperator = (a, b) -> a *  b;
        System.out.println("3.14,4.13" + binaryOperator.apply(3.14,4.13));
    }
    public static void ex36() {
        System.out.println("Utilise un BinaryOperator<Integer> pour calculer le PGCD de deux nombres.");
    }

    public static void ex37() {
        System.out.println("Crée un BinaryOperator<String> qui retourne la plus longue des deux chaînes.");
        BinaryOperator<String> binaryOperator = (a, b) -> a.length() > b.length() ? a : b;
        System.out.println("Trim, Balle : " + binaryOperator.apply("Trim", "Balle"));
    }
    public static void ex38() {
        System.out.println("Utilise Predicate<Integer> avec stream().filter() pour garder uniquement les nombres pairs d’une liste.");
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> predicate = x -> x % 2 == 0;
        List<Integer> filteredList = list.stream().filter(predicate).toList();

        System.out.println("List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10): " + filteredList);
    }
    public static void ex39() {
        System.out.println("Applique une Function<String, List<Integer>> pour transformer une phrase en liste de longueurs des mots");
        Function<String, List<Integer>> function = s -> Arrays.stream(s.split(" ")).map(String::length).toList();
        System.out.println(function.apply("Hello my name is maxim"));
    }
    public static void ex40() {
        System.out.println("Combine Consumer<String> et forEach() pour afficher tous les éléments d’une liste en majuscules.");
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        List<String> list = List.of("one", "two", "three");
        list.forEach(consumer);
    }
    public static void ex41() {
        System.out.println("Utilise un Supplier<LocalDateTime> pour obtenir et afficher l’heure actuelle dans un programme.");
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        System.out.println(supplier.get());
    }
    public static void ex42() {
        System.out.println("Utilise un BiPredicate<String, String> pour filtrer une liste de mots et ne garder que ceux contenant une sous-chaîne donnée.");
        String deiredString = "tel";
        BiPredicate<String, String> biPredicate = String::contains;
        List<String> list = List.of("one", "two", "three", "alcatel", "telephone");
        List<String> filteredList = list.stream().filter(x -> biPredicate.test(x, deiredString)).toList();
        System.out.println("filteredList : " + filteredList);
    }
    public static void ex43() {
        System.out.println("Utilise un BinaryOperator<Integer> avec reduce() pour calculer la somme d’une liste d’entiers.");
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Integer sum = list.stream().reduce((acc, x) -> binaryOperator.apply(acc, x)).get();
//        Integer sum = list.stream().reduce(0, (acc, x) -> binaryOperator.apply(acc, x));
        Integer sum = list.stream().reduce(0, binaryOperator);
        System.out.println("sum : " + sum);
    }
    public static void ex44() {
        System.out.println("Utilise un UnaryOperator<String> avec map() pour transformer tous les mots d’une liste en majuscules.");
        List<String> list = List.of("one", "two", "three", "alcatel", "telephone");
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        List<String> transformedList = list.stream().map(unaryOperator).toList();
        System.out.println("transformedList : " + transformedList);
    }
    public static void ex45() {
        System.out.println("Combine une Function<Integer, Integer> et une Predicate<Integer> pour calculer le carré des nombres pairs uniquement.");
        Function<Integer, Integer> function = i -> i * i;
        Predicate<Integer> predicate = x -> x % 2 == 0;
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredList = list.stream().filter(predicate).map(function).toList();
        System.out.println("filteredList : " + filteredList);
    }
    public static void ex46() {
//        List<Order> orders = List.of(
//            new Order(false, "order 1"),
//            new Order(true, "order 3"),
//            new Order(true, "order 3")
//        );
//
//        Predicate<Order> orderPredicate = Order::isPaid;
//
//        List<Order> filteredList = orders.stream().filter(orderPredicate).toList();
    }
}