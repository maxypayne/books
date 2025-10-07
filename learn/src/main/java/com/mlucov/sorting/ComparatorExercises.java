package com.mlucov.sorting;

import com.mlucov.person.Person;
import com.mlucov.person.PersonWithBuilder;
import com.mlucov.person.PersonWithComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExercises {
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
    }
    // =====================
// Exercices Comparator
// =====================

    public static void ex1() {
        Comparator<String> comparator = (a, b) -> a.compareTo(b);
        System.out.println("Trie une liste de String par ordre alphabétique avec Comparator.naturalOrder().");
        List<String> list = new ArrayList<>(List.of("Banane", "Pomme", "Abricot"));
        Collections.sort(list, comparator);

        Collections.sort(list, Comparator.naturalOrder());
        Collections.sort(list, String::compareTo);
        Collections.sort(list, String::compareToIgnoreCase);
        System.out.println(list);


    }

    public static void ex2() {
        System.out.println("Trie une liste de String par ordre alphabétique inverse avec Comparator.reverseOrder().");
        List<String> list = new ArrayList<>(List.of("Banane", "Pomme", "Abricot"));
        Collections.sort(list, Comparator.reverseOrder());
    }

    public static void ex3() {
        System.out.println("Trie une liste d'Integer du plus petit au plus grand.");
        List<Integer> list = new ArrayList<>(List.of(5, 1, 8, 3));
        Comparator<Integer> comparator = (a, b) -> {
            if (a.compareTo(b) > 0) {
                return 1;
            }
            if (a.compareTo(b) < 0) {
                return -1;
            }
            return 0;
        };
        Comparator<Integer> comparator2 = Integer::compareTo;
        Comparator<Integer> comparator3 = (a, b) -> Integer.compare(a, b);
        Comparator<Integer> comparator4 = Integer::compare;
        Collections.sort(list, comparator);
        Collections.sort(list, Comparator.naturalOrder());
        list.sort(comparator);
        list.sort(comparator2);
        list.sort(comparator3);
        list.sort(comparator4);

        List<Integer> sorted = list.stream().sorted().toList();

    }

    public static void ex4() {
        System.out.println("Trie une liste d'Integer du plus grand au plus petit.");
        List<Integer> list = new ArrayList<>(List.of(5, 1, 8, 3));
        list.sort(Comparator.reverseOrder());
    }

    public static void ex5() {
        System.out.println("*****************************ex5**************");
        System.out.println("Trie une liste de Person par nom (utilise Comparator.comparing).");
//    class Person { String name; int age; }
        List<PersonWithComparable> people = new ArrayList<>(List.of(
            new PersonWithComparable("Max", 12),
            new PersonWithComparable("Bob", 22),
            new PersonWithComparable("Jack", 33),
            new PersonWithComparable("Lola", 18)
        ));
        people.sort(Comparator.comparing(PersonWithComparable::getName));
        System.out.println(people);

        List<Person> people2 = new ArrayList<>(List.of(
            new Person("Max", 12),
            new Person("Bob", 22),
            new Person("Jack", 33),
            new Person("Lola", 18)
        ));
        System.out.println("Liste de Persons d'une liste.");

        Comparator<Person> comparator = Comparator.comparing(Person::getName);
        Comparator<Person> comparator2 = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.age, o2.age);
            }
        };
        Comparator<Person> comparator3 = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Person> comparator4 = new ComparatotImpl();

//        people.sort(Comparator.comparing(PersonWithComparable::getName));
//        people2.sort(Comparator.comparing(Person::getAge));
//        people2.sort(comparator);
//        people2.sort(comparator2);
//        people2.sort(comparator3);
//        people2.sort(comparator4);
//        people2.sort(Comparator.naturalOrder());
        people2.sort(Comparator.nullsFirst(comparator));
        System.out.println(people2);
    }

    public static void ex6() {
        System.out.println("*****************************ex6**************");
        System.out.println("Trie une liste de Person par âge croissant puis par nom en cas d'égalité.");
    }

    public static void ex7() {
        System.out.println("Trie une liste de Person par longueur du nom.");
    }

    public static void ex8() {
        System.out.println("Trie une liste de Person par âge décroissant.");
    }

    public static void ex9() {
        System.out.println("Trie une liste de Person par initiale du nom (première lettre).");
    }

    public static void ex10() {
        System.out.println("Trie une liste de Person en plaçant les noms null en premier.");
//    people.sort(Comparator.comparing(Person::getName, Comparator.nullsFirst(Comparator.naturalOrder())));
    }

    public static void ex11() {
        System.out.println("Trie une liste de Person par âge, puis inverse uniquement ce tri.");
    }

    public static void ex12() {
        System.out.println("Trie une liste de String par longueur croissante, puis par ordre alphabétique.");
    }

    public static void ex13() {
        System.out.println("Trie une liste de String en mettant les chaînes null à la fin.");
    }

    public static void ex14() {
        System.out.println("Trie une liste de Person par âge, mais si égalité, trie par longueur du nom.");
    }

    public static void ex15() {
        System.out.println("Trie une liste de Person par ordre alphabétique insensible à la casse.");
    }


        public static void ex21() {
            System.out.println("************ ex1 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par nom alphabétique
            people.sort(Comparator.comparing(Person::getName));
            people.forEach(System.out::println);
            System.out.println("Tri par nom alphabétique.\n");
        }

        public static void ex22() {
            System.out.println("************ ex2 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par âge croissant
            people.sort(Comparator.comparing(Person::getAge));
            people.forEach(System.out::println);
            System.out.println("Tri par âge croissant.\n");
        }

        public static void ex23() {
            System.out.println("************ ex3 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par âge décroissant
            people.sort(Comparator.comparing(Person::getAge).reversed());
            people.forEach(System.out::println);
            System.out.println("Tri par âge décroissant.\n");
        }

        public static void ex24() {
            System.out.println("************ ex4 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 22),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par âge croissant puis par nom
            people.sort(
                Comparator.comparing(Person::getAge)
                    .thenComparing(Person::getName)
            );
            people.forEach(System.out::println);
            System.out.println("Tri par âge croissant puis par nom.\n");
        }

        public static void ex25() {
            System.out.println("************ ex5 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 22),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par nom en ignorant la casse
            people.sort(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER));
            people.forEach(System.out::println);
            System.out.println("Tri par nom insensible à la casse.\n");
        }

        public static void ex26() {
            System.out.println("************ ex6 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 22),
                new Person("Jack", 22),
                new Person("Lola", 18),
                new Person("Alice", 12),
                new Person(null, 20)
            ));
            // Tri par âge croissant puis nom, avec nullsFirst sur le nom
            people.sort(
                Comparator.comparing(Person::getAge)
                    .thenComparing(Person::getName, Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER))
            );
            people.forEach(System.out::println);
            System.out.println("Tri par âge croissant puis nom, nullsFirst.\n");
        }

        public static void ex27() {
            System.out.println("************ ex7 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person(null, 22),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par nom, nullsLast
            people.sort(Comparator.comparing(Person::getName, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)));
            people.forEach(System.out::println);
            System.out.println("Tri par nom, nullsLast.\n");
        }

        public static void ex28() {
            System.out.println("************ ex8 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", null),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par âge, nullsFirst
            people.sort(Comparator.comparing(Person::getAge, Comparator.nullsFirst(Integer::compareTo)));
            people.forEach(System.out::println);
            System.out.println("Tri par âge, nullsFirst.\n");
        }

        public static void ex29() {
            System.out.println("************ ex9 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", null),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par âge, nullsLast
            people.sort(Comparator.comparing(Person::getAge, Comparator.nullsLast(Integer::compareTo)));
            people.forEach(System.out::println);
            System.out.println("Tri par âge, nullsLast.\n");
        }

        public static void ex30() {
            System.out.println("************ ex10 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 22),
                new Person("Jack", 22),
                new Person("Lola", 18)
            ));
            // Tri par nom longueur du nom
            people.sort(Comparator.comparing(p -> p.getName().length()));
            people.forEach(System.out::println);
            System.out.println("Tri par longueur du nom.\n");
        }

        public static void ex31() {
            System.out.println("************ ex11 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 22),
                new Person("Jack", 22),
                new Person("Lola", 18)
            ));
            // Tri par longueur du nom puis âge
            people.sort(
                Comparator.comparing((Person p) -> p.getName().length())
                    .thenComparing(Person::getAge)
            );
            people.forEach(System.out::println);
            System.out.println("Tri par longueur du nom puis âge.\n");
        }

        public static void ex32() {
            System.out.println("************ ex12 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 12),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par âge puis nom insensible à la casse
            people.sort(
                Comparator.comparing(Person::getAge)
                    .thenComparing(Person::getName, String.CASE_INSENSITIVE_ORDER)
            );
            people.forEach(System.out::println);
            System.out.println("Tri par âge puis nom insensible à la casse.\n");
        }

        public static void ex33() {
            System.out.println("************ ex13 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 22),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par âge modulo 10
            people.sort(Comparator.comparing(p -> p.getAge() % 10));
            people.forEach(System.out::println);
            System.out.println("Tri par âge modulo 10.\n");
        }

        public static void ex34() {
            System.out.println("************ ex14 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person(null, 22),
                new Person("Bob", 22),
                new Person("Jack", 33),
                new Person("Lola", 18)
            ));
            // Tri par nom, nullsFirst puis âge
            people.sort(
                Comparator.comparing(Person::getName, Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER))
                    .thenComparing(Person::getAge)
            );
            people.forEach(System.out::println);
            System.out.println("Tri par nom nullsFirst puis âge.\n");
        }

        public static void ex35() {
            System.out.println("************ ex15 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person("Max", 12),
                new Person("Bob", 22),
                new Person("Jack", 22),
                new Person("Lola", 18)
            ));
            // Tri par âge décroissant puis nom
            people.sort(
                Comparator.comparing(Person::getAge).reversed()
                    .thenComparing(Person::getName)
            );
            people.forEach(System.out::println);
            System.out.println("Tri par âge décroissant puis nom.\n");
        }

        public static void ex36() {
            System.out.println("************ ex16 ************");
            List<Person> people = new ArrayList<>(List.of(
                new Person(null, 12),
                new Person("Bob", 22),
                new Person("Jack", 22),
                new Person("Lola", 18)
            ));
            // Tri par âge croissant puis nom, noms nullsLast
            people.sort(
                Comparator.comparing(Person::getAge)
                    .thenComparing(Person::getName, Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER))
            );
            people.forEach(System.out::println);
            System.out.println("Tri par âge croissant puis nom, noms nullsLast.\n");
        }
    }


//    list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//    list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//    list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//    list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//    people.sort(Comparator.comparing(Person::getName));
//    people.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
//    people.sort(Comparator.comparing(p -> p.getName().length()));
//    people.sort(Comparator.comparing(Person::getAge).reversed());
//    people.sort(Comparator.comparing(p -> p.getName().charAt(0)));
//    people.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));
//    list.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
//    list.sort(Comparator.nullsLast(Comparator.naturalOrder()));
//    people.sort(Comparator.comparing(Person::getAge).thenComparing(p -> p.getName().length()));
//    people.sort(Comparator.comparing(Person::getName, String.CASE_INSENSITIVE_ORDER));
