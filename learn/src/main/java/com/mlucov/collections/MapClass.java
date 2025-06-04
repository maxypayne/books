package com.mlucov.collections;

import java.util.*;

public class MapClass<T, V> {
    Map<T, V>  map = new HashMap<>();
    public void clear() { // Supprimer tous les éléments de la collection
        map.clear();
    }
    public boolean containsKey(T key) { // Indiquer si la clé est contenue dans la collection
        return map.containsKey(key);
    }
    public boolean containsValue(V value) { // Indiquer si la valeur est contenue dans la collection
        return map.containsValue(value);
    }
    public Set<Map.Entry<T,V>> entrySet() { // Renvoyer un ensemble contenant les paires clé/valeur de la collection
        return map.entrySet();
    }
    public V get(T key) { // Renvoyer la valeur associée à la clé fournie en paramètre
        return map.get(key);
    }
    public boolean isEmpty() { //Indiquer si la collection est vide
        return map.isEmpty();
    }
    public Set<T> keySet() { // Renvoyer un ensemble contenant les clés de la collection
        return map.keySet();
    }
    public void put(T key, V value) { // Insèrer la clé et sa valeur associée fournies en paramètres
        map.put(key, value);
    }
    public void putAll(Map<T, V> data) { // Insèrer toutes les clés/valeurs de l'objet fourni en paramètre
        map.putAll(data);
    }
    public Collection<V> values() { // Renvoyer une collection qui contient toutes les valeurs des éléments
        return map.values();
    }
    public void remove(T key) { // Supprimer l'élément dont la clé est fournie en paramètre
        map.remove(key);
    }
    public int size() { // Renvoyer le nombre d'éléments de la collection
        return map.size();
    }
    public void iterate() {
        for (Map.Entry<T, V> element: map.entrySet()) {
            System.out.println("Key  :" + element.getKey() + " Value: " + element.getValue());
        }
        for (T s: map.keySet()) {
            System.out.println("Keys set : " + s);
        }
        for (V s: map.values()) {
            System.out.println("Values set : " + s);
        }
    }
}
