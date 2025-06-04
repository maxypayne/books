Pour combler le manque d'objets adaptés, la version 2 du J.D.K. apporte un framework complet pour gérer les collections. Cette bibliothèque contient un ensemble de classes et interfaces. Elle fournit également un certain nombre de classes abstraites qui implémentent partiellement certaines interfaces.

Les interfaces à utiliser par des objets qui gèrent des collections sont :
-

- **Collection** : interface qui est implémentée par la plupart des objets qui gèrent des collections
- **Map** : interface qui définit des méthodes pour des objets qui gèrent des collections sous la forme clé/valeur
- **Set** : interface pour des objets qui n'autorisent pas de doublons dans l'ensemble
- **List** : interface pour des objets qui autorisent des doublons et un accès direct à un élément
- **SortedSet** : interface qui étend l'interface Set et permet d'ordonner l'ensemble
- **SortedMap** : interface qui étend l'interface Map et permet d'ordonner l'ensemble

Certaines méthodes définies dans ces interfaces sont dites optionnelles : leur définition est donc obligatoire mais si l'opération n'est pas supportée alors la méthode doit lever une exception particulière. Ceci permet de réduire le nombre d'interfaces et de répondre au maximum de cas.

Le framework propose plusieurs objets qui implémentent ces interfaces et qui peuvent être directement utilisés :

HashSet : Hashtable qui implémente l'interface Set
TreeSet : arbre qui implémente l'interface SortedSet
ArrayList : tableau dynamique qui implémente l'interface List
LinkedList : liste doublement chaînée (parcours de la liste dans les deux sens) qui implémente l'interface List
HashMap : Hashtable qui implémente l'interface Map
TreeMap : arbre qui implémente l'interface SortedMap
Le framework définit aussi des interfaces pour faciliter le parcours des collections et leur tri :

Iterator : interface pour le parcours des collections
ListIterator : interface pour le parcours des listes dans les deux sens et pour modifier les éléments lors de ce parcours
Comparable : interface pour définir un ordre de tri naturel pour un objet
Comparator : interface pour définir un ordre de tri quelconque
Deux classes existantes dans les précédentes versions du JDK ont été modifiées pour implémenter certaines interfaces du framework :

Vector : tableau à taille variable qui implémente maintenant l'interface List
Hashtable : table de hachage qui implémente maintenant l'interface Map