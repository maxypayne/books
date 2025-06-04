package com.mlucov.collections;

public class NavigableSet<T> {
    NavigableSet<T> navigableSet;
    public T ceiling(T el) {
        return navigableSet.ceiling(el);
    }
    public T floor(T el) {
        return navigableSet.floor(el);
    }
    public T headSet(T el) {
        return navigableSet.headSet(el);
    }
    public T higher(T el) {
        return navigableSet.higher(el);
    }
    public T lower(T el) {
        return navigableSet.lower(el);
    }
    public T pollFirst(T el) {
        return navigableSet.pollFirst(el);
    }
    public T pollLast(T el) {
        return navigableSet.pollLast(el);
    }
}
