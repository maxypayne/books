# Exercices Java Collections

Ces exercices sont conçus pour vous aider à apprendre et à maîtriser différents concepts des Collections en Java, en progressant du plus simple au plus complexe. Pour chaque exercice, créez une nouvelle classe Java ou ajoutez le code dans votre méthode `main`. Imprimez toujours le résultat pour vérifier votre solution.

---

## Exercice 1 : Manipuler une ArrayList de base (Liste simple)

**Concept :** Création, ajout, accès, modification et suppression d'éléments dans une `ArrayList`.

### Tâche :

- Créez une `ArrayList` de type `String` appelée `listeFruits`.
- Ajoutez les fruits suivants : `"Pomme"`, `"Banane"`, `"Orange"`.
- Affichez `listeFruits` entière.
- Accédez au deuxième fruit de la liste (index 1) et affichez-le.
- Modifiez le fruit à l'index 0 par `"Cerise"`.
- Supprimez `"Banane"` de la liste.
- Affichez la liste après les modifications.
- Vérifiez et affichez si la liste est vide après avoir tout effacé.

### Attendu (exemple d'output) :


---

## Exercice 2 : Utiliser un HashSet (Ensembles sans doublons)

**Concept :** `HashSet` pour stocker des éléments uniques et la gestion des doublons.

### Tâche :

- Créez un `HashSet` de type `Integer` appelé `ensembleNumeros`.
- Ajoutez les numéros suivants : `10`, `20`, `30`, `20`, `40`, `10`.
- Affichez `ensembleNumeros`. Que remarquez-vous concernant les doublons ?
- Vérifiez si le numéro `30` est présent dans l'ensemble et affichez le résultat.
- Supprimez le numéro `20` de l'ensemble.
- Affichez l'ensemble après la suppression.
- Parcourez l'ensemble à l'aide d'une boucle `for-each` et affichez chaque numéro.

### Attendu (exemple d'output) :


---

## Exercice 3 : Opérations de base sur une HashMap (Mappage clé-valeur)

**Concept :** Stockage et récupération de données à l'aide de paires clé-valeur avec `HashMap`.

### Tâche :

- Créez une `HashMap<String, String>` appelée `capitalesDuMonde`.
- Ajoutez les paires suivantes :
    - `"France" -> "Paris"`
    - `"Allemagne" -> "Berlin"`
    - `"Espagne" -> "Madrid"`
- Affichez toute la map `capitalesDuMonde`.
- Obtenez et affichez la capitale de `"France"`.
- Ajoutez `"Italie" -> "Rome"`.
- Mettez à jour la capitale de l’Allemagne à `"Munich"`.
- Supprimez `"Espagne"`.
- Affichez toutes les clés de la map.
- Affichez toutes les valeurs de la map.
- Affichez chaque paire clé-valeur avec `entrySet()`.

### Attendu (exemple d'output) :


---

## Exercice 4 : Utiliser des objets personnalisés dans une Liste (Objets complexes)

**Concept :** Créer une classe personnalisée et la stocker dans une `ArrayList`.

### Tâche :

- Créez une classe `Livre` avec les attributs privés : `String titre`, `String auteur`, `int anneePublication`.
- Ajoutez un constructeur pour initialiser ces attributs.
- Ajoutez les getters.
- Redéfinissez `toString()` pour retourner :  
  `"Titre: [titre], Auteur: [auteur], Année: [annee]"`.
- Dans votre `main`, créez une `ArrayList<Livre>` appelée `bibliotheque`.
- Ajoutez trois objets `Livre`.
- Affichez toute la `bibliotheque`.
- Affichez le titre du livre publié avant 2000.

### Attendu (exemple d'output) :


---

## Exercice 5 : Tri d'une Liste d'objets personnalisés (Comparable et Comparator)

**Concept :** Tri d’objets personnalisés avec `Comparable` et `Comparator`.

### Partie A : Tri par Titre (Comparable)

- Faites implémenter à `Livre` l'interface `Comparable<Livre>`.
- Implémentez `compareTo()` pour trier par titre.
- Créez une `ArrayList<Livre>`, ajoutez des livres dans un ordre aléatoire.
- Utilisez `Collections.sort(listeDeLivres)` pour trier.

### Partie B : Tri par Année de Publication (Comparator)

- Créez une classe `ComparateurLivresParAnnee` qui implémente `Comparator<Livre>`.
- Implémentez `compare()` pour trier par `anneePublication`.
- Utilisez `Collections.sort(listeDeLivres, new ComparateurLivresParAnnee())`.

### Attendu :


---

## Exercice 6 : Utilisation de la Queue (File d'attente)

**Concept :** Implémentation d'une file d'attente FIFO avec `ArrayDeque`.

### Tâche :

- Créez une `Queue<String>` appelée `fileDattenteClients` (utilisez `ArrayDeque`).
- Ajoutez `"Client A"`, `"Client B"`, `"Client C"` via `offer()`.
- Affichez après chaque ajout.
- Retirez un client avec `poll()` et affichez-le.
- Affichez la file après chaque service.
- Affichez le client suivant avec `peek()`.

### Attendu :


---

## Exercice 7 : Compter les fréquences avec une Map (Application pratique)

**Concept :** Utiliser une `HashMap` pour compter les occurrences.

### Tâche :

- Donnez une phrase :  
  `"Java est amusant et Java est puissant et Java est populaire"`
- Convertissez en minuscules puis divisez avec `.split("\\s+")`.
- Créez une `HashMap<String, Integer>` appelée `frequenceMots`.
- Parcourez les mots et mettez à jour la fréquence (avec `getOrDefault()` ou `containsKey()`).
- Affichez la map.

### Attendu :


---

## Exercice 8 : Filtrer et transformer avec les Streams (Fonctionnalités avancées)

**Concept :** Utiliser les **Streams Java 8+** pour filtrer, transformer et collecter des données.

> _À compléter selon les objectifs spécifiques (filtrage, mapping, collecte, etc.)_

---

