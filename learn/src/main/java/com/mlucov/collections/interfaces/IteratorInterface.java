package com.mlucov.collections.interfaces;

public interface IteratorInterface {
    boolean hasNext();
    Object next();
    void remove(); // Supprimer le dernier élément parcouru
}
