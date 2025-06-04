package com.mlucov.collections;

import java.util.SortedSet;

public class SortedSetClass<T> {
    SortedSet<T> list;
    public T first() {
        return list.first();
    }
    public T last() {
        return list.last();
    }
    public SortedSet<T> headSet(T e) {
        return list.headSet(e);
    }
    public SortedSet<T> tailSet(T e) {
        return list.tailSet(e);
    }
    public SortedSet<T> subSet(T from, T to) {
        return list.subSet(from, to);
    }
}
