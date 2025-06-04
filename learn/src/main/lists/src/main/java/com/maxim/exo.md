## Nouveaux Exercices sur les Collections Java

Voici une série d'exercices supplémentaires pour continuer votre apprentissage des Collections en Java. Chaque exercice est conçu pour explorer des concepts spécifiques ou des utilisations pratiques.

---

### Exercice 1: `LinkedList` et `ListIterator` (Manipulation avancée de listes)

**Concept:** Utilisation des méthodes spécifiques de `LinkedList` et exploration de `ListIterator` pour une navigation et modification bidirectionnelle.

**Tâche:**
1.  Créez une `LinkedList<String>` appelée `destinationsVoyage`.
2.  Ajoutez "Paris" au début de la liste en utilisant `addFirst()`.
3.  Ajoutez "Tokyo" à la fin de la liste en utilisant `addLast()`.
4.  Ajoutez "New York" au début et "Rome" à la fin.
5.  Affichez la liste.
6.  Retirez le premier et le dernier élément et affichez-les. Affichez la liste mise à jour.
7.  Obtenez un `ListIterator` pour la liste `destinationsVoyage`.
8.  Parcourez la liste en avant et affichez chaque destination.
9.  Ensuite, parcourez la liste en arrière (depuis la fin où vous vous êtes arrêté) et affichez chaque destination avec son index précédent (`previousIndex()`).
10. Pendant le parcours en arrière, si vous rencontrez "Paris", remplacez-le par "Berlin" en utilisant `iterator.set("Berlin")`.
11. Affichez la liste finale.

**Attendu (exemple d'output partiel):**

Liste initiale: [New York, Paris, Tokyo, Rome]
Premier retiré: New York, Dernier retiré: Rome
Liste après retraits: [Paris, Tokyo]
...
Parcours en arrière:
Index précédent: 1, Destination: Tokyo
Index précédent: 0, Destination: Paris
Liste finale après remplacement: [Berlin, Tokyo]


---

### Exercice 2: `TreeSet` avec `Comparator` et `NavigableSet` (Ensembles triés avancés)

**Concept:** Utilisation d'un `TreeSet` avec un `Comparator` personnalisé pour des objets, et exploration des méthodes de `NavigableSet`.

**Tâche:**
1.  Créez une classe `Produit` avec les attributs `String nom`, `double prix`, et `int stock`.
2.  Implémentez un constructeur et des getters. Redéfinissez `toString()`.
3.  Créez un `Comparator<Produit>` qui trie les produits par prix décroissant. Si les prix sont égaux, triez par nom alphabétique.
4.  Créez un `TreeSet<Produit>` en utilisant ce `Comparator` dans le constructeur du `TreeSet`.
5.  Ajoutez plusieurs instances de `Produit` à l'ensemble.
6.  Affichez l'ensemble trié.
7.  Créez un `Produit` de référence avec un prix spécifique (par exemple, 50.0).
8.  Utilisez les méthodes de `NavigableSet`:
    * `ceiling(referenceProduit)`: Trouvez le premier produit dont le prix est supérieur ou égal à 50.0 (selon votre comparateur, donc inférieur ou égal si on considère le tri décroissant).
    * `floor(referenceProduit)`: Trouvez le premier produit dont le prix est inférieur ou égal à 50.0.
    * `headSet(referenceProduit, true)`: Obtenez tous les produits "avant" le produit de référence (prix supérieurs), y compris le produit de référence si son prix correspond.
    * `tailSet(referenceProduit, false)`: Obtenez tous les produits "après" le produit de référence (prix inférieurs), sans inclure le produit de référence.
9.  Affichez les résultats de ces opérations.

**Attendu (exemple d'output partiel):**

Ensemble de produits triés (prix décroissant, puis nom):
[Produit{nom='Laptop', prix=1200.0, stock=10}, Produit{nom='Tablette', prix=300.0, stock=25}, ...]
Produit 'ceiling' pour prix ~50.0: Produit{nom='Souris', prix=25.0, stock=100} (car tri décroissant)
Ensemble 'headSet' (prix > 50.0): [...]


---

### Exercice 3: `LinkedHashMap` et `TreeMap` (Ordre et tri des Maps)

**Concept:** Comprendre la différence d'ordre entre `LinkedHashMap` (ordre d'insertion) et `TreeMap` (ordre naturel ou personnalisé des clés).

**Tâche:**
1.  **Partie A: `LinkedHashMap`**
    * Créez une `LinkedHashMap<Integer, String>` appelée `tachesInsertion`.
    * Ajoutez plusieurs paires clé-valeur (par exemple, `1 -> "Faire les courses"`, `3 -> "Appeler le médecin"`, `2 -> "Payer les factures"`).
    * Parcourez et affichez les entrées de la map. Observez l'ordre.
2.  **Partie B: `TreeMap` (ordre naturel)**
    * Créez une `TreeMap<String, String>` appelée `contactsNaturel`.
    * Ajoutez plusieurs contacts (par exemple, `"Charlie" -> "555-0103"`, `"Alice" -> "555-0101"`, `"Bob" -> "555-0102"`).
    * Parcourez et affichez les entrées. Observez l'ordre des clés.
3.  **Partie C: `TreeMap` (ordre personnalisé des clés)**
    * Créez une `TreeMap<Integer, String>` appelée `scoresPersonnalises` qui trie les clés (scores) en ordre décroissant. Utilisez un `Comparator.reverseOrder()` ou une lambda.
    * Ajoutez des scores : `150 -> "JoueurA"`, `200 -> "JoueurB"`, `100 -> "JoueurC"`.
    * Parcourez et affichez les entrées. Observez l'ordre.

**Attendu (exemple d'output partiel):**

LinkedHashMap (ordre d'insertion):
1 -> Faire les courses
3 -> Appeler le médecin
2 -> Payer les factures

TreeMap (ordre naturel des clés String):
Alice -> 555-0101
Bob -> 555-0102
Charlie -> 555-0103

TreeMap (ordre décroissant des clés Integer):
200 -> JoueurB
150 -> JoueurA
100 -> JoueurC


---

### Exercice 4: `PriorityQueue` et `ArrayDeque` comme Pile (Files à priorité et Piles)

**Concept:** Utilisation d'une `PriorityQueue` avec des objets personnalisés et `ArrayDeque` pour implémenter une pile (LIFO).

**Tâche:**
1.  **Partie A: `PriorityQueue` avec objets personnalisés**
    * Créez une classe `TacheUrgence` avec `String description` et `int priorite` (1 étant la plus haute).
    * Implémentez `Comparable<TacheUrgence>` pour que la `PriorityQueue` traite les tâches par priorité (la plus petite valeur de `priorite` sort en premier).
    * Créez une `PriorityQueue<TacheUrgence>`.
    * Ajoutez plusieurs tâches avec différentes priorités.
    * Retirez et affichez les tâches de la file jusqu'à ce qu'elle soit vide. Observez l'ordre.
2.  **Partie B: `ArrayDeque` comme Pile pour inverser une chaîne**
    * Créez une `Deque<Character>` (utilisez `ArrayDeque`).
    * Prenez une chaîne de caractères, par exemple "Java Collections".
    * Parcourez la chaîne et poussez chaque caractère sur la pile (deque) en utilisant `push()`.
    * Ensuite, retirez les caractères de la pile (deque) en utilisant `pop()` et construisez une nouvelle chaîne.
    * Affichez la chaîne inversée.

**Attendu (exemple d'output partiel):**

Tâches par priorité (la plus haute en premier):
TacheUrgence{description='Réparer fuite d'eau', priorite=1}
TacheUrgence{description='Envoyer email important', priorite=2}
...
Chaîne originale: Java Collections
Chaîne inversée: snoitcelloC avaJ


---

### Exercice 5: Utilitaires `Collections` (Fonctions d'aide)

**Concept:** Utilisation de méthodes statiques de la classe `Collections`.

**Tâche:**
1.  Créez une `ArrayList<Integer>` et ajoutez-y les nombres de 1 à 7.
2.  Utilisez `Collections.shuffle()` pour mélanger la liste et affichez-la.
3.  Utilisez `Collections.reverse()` pour inverser l'ordre des éléments et affichez-la.
4.  Ajoutez quelques éléments dupliqués à la liste (par exemple, ajoutez 3 et 5 à nouveau).
5.  Utilisez `Collections.replaceAll()` pour remplacer toutes les occurrences de 3 par 30. Affichez la liste.
6.  Utilisez `Collections.frequency()` pour compter le nombre d'occurrences de 5. Affichez le résultat.
7.  Utilisez `Collections.max()` et `Collections.min()` pour trouver le plus grand et le plus petit élément. Affichez-les.

**Attendu (exemple d'output partiel):**

Liste mélangée: [3, 1, 5, 7, 2, 4, 6] (exemple)
Liste inversée: [6, 4, 2, 7, 5, 1, 3] (exemple)
Liste après remplacement (3 par 30): [6, 4, 2, 7, 5, 1, 30, 30, 5] (exemple)
Fréquence de 5: 2
Max: 30, Min: 1


---

### Exercice 6: Opérations `Map` avancées (`computeIfAbsent`, `merge`)

**Concept:** Utilisation de méthodes modernes et efficaces pour manipuler les `Map`.

**Tâche:**
1.  **Partie A: `computeIfAbsent` pour regrouper des chaînes par longueur**
    * Créez une `List<String>` de mots : `["Java", "est", "un", "langage", "puissant", "et", "flexible"]`.
    * Créez une `HashMap<Integer, List<String>>` appelée `motsParLongueur`.
    * Parcourez la liste de mots. Pour chaque mot, utilisez `computeIfAbsent` sur `motsParLongueur`. La clé sera la longueur du mot. Si la clé n'existe pas, `computeIfAbsent` doit créer une nouvelle `ArrayList` pour cette longueur, puis y ajouter le mot courant. Si la clé existe, ajoutez simplement le mot à la liste existante.
    * Affichez la map `motsParLongueur`.
2.  **Partie B: `merge` pour compter les fréquences d'éléments**
    * Créez une `List<String>` de fruits : `["Pomme", "Banane", "Orange", "Pomme", "Orange", "Pomme"]`.
    * Créez une `HashMap<String, Integer>` appelée `compteFruits`.
    * Parcourez la liste de fruits. Pour chaque fruit, utilisez `compteFruits.merge(fruit, 1, Integer::sum)`. Cela ajoute le fruit avec un compte de 1 s'il n'est pas présent, ou ajoute 1 au compte existant s'il est déjà là.
    * Affichez la map `compteFruits`.

**Attendu (exemple d'output partiel):**

Mots groupés par longueur:
{2=[est, un, et], 4=[Java], 7=[langage], 8=[puissant, flexible]} (l'ordre des listes internes peut varier)

Compte des fruits:
{Orange=2, Banane=1, Pomme=3} (l'ordre des clés peut varier)


---

### Exercice 7: Problème Pratique - Trouver les éléments communs

**Concept:** Résoudre un problème courant en utilisant les collections de manière efficace.

**Tâche:**
1.  Créez deux `ArrayList<Integer>`: `liste1` et `liste2`.
    * `liste1` : `[1, 2, 3, 4, 5, 6]`
    * `liste2` : `[4, 5, 6, 7, 8, 9]`
2.  Trouvez les éléments communs aux deux listes et stockez-les dans une nouvelle `List<Integer>` appelée `communs`.
3.  **Approche 1 (avec `retainAll`)**: Convertissez une des listes (ou les deux) en `HashSet` pour l'efficacité si les listes sont grandes, puis utilisez la méthode `retainAll()`.
4.  **Approche 2 (manuelle avec `HashSet` pour lookup)**: Parcourez une liste, et pour chaque élément, vérifiez s'il est présent dans l'autre liste. Pour une vérification efficace, convertissez la deuxième liste en `HashSet`.
5.  Affichez la liste `communs`.

**Attendu (exemple d'output):**

Éléments communs: [4, 5, 6] (l'ordre peut varier si vous utilisez des Sets en interne avant de reconvertir en List)


---

Bonne continuation avec ces exercices ! Ils devraient vous aider à solidifier votre compréhension et à découvrir de nouvelles facettes des Collections Java.
