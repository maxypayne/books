package com.mlucov.collections;

import java.util.*;
import java.util.function.UnaryOperator;

public class ListClass<T> {
    List<T> list;
    ListClass(List<T> items) {
        this.list = items;
    }
    public void add(T item) {
        list.add(item);
    }
    public void addAll(List<T> items) {
        list.addAll(items);
    }
    public void clear() {
        list.clear();
    }
    public boolean contains(T item) {
        return list.contains(item);
    }
    public boolean containsAll(List<T> items) {
        return list.containsAll(items);
    }
    public boolean equals(List<T> items) {
        return list.equals(items);
    }
    public T get(int index) {
        return this.list.get(index);
    }
    public int hasCode() {
        return list.hashCode();
    }
    public int indexOf(T toFind) {
        return this.list.indexOf(toFind);
    }
    public int lastIndexOf(T toFind) {
        return this.list.lastIndexOf(toFind);
    }
    public void remove(int index) {
        this.list.remove(index);
    }
    public void removeAll(List<T> items) {
        this.list.removeAll(items);
    }
    public void replaceAll(UnaryOperator<T> item) {
        this.list.replaceAll(item);
    }
    public void set(int index, T elem) {
        this.list.set(index, elem);
    }
    public List<T> subList(int start, int end) {
        return this.list.subList(start, end);
    }
}
//