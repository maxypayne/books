package com.mlucov.collections;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ArrayListClass<T> implements List, RandomAccess, Cloneable {
    List<String> list = new ArrayList<>();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains("uo");
    }

    @Override
    public Iterator iterator() {
        return list.listIterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public boolean add(Object o) {
        return true;
    }

    //    @Override
    public boolean add(String o) {
        return list.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator spliterator() {
        return List.super.spliterator();
    }

    @Override
    public void addFirst(Object o) {
        List.super.addFirst(o);
    }

    @Override
    public void addLast(Object o) {
        List.super.addLast(o);
    }

    @Override
    public Object getFirst() {
        return List.super.getFirst();
    }

    @Override
    public Object getLast() {
        return List.super.getLast();
    }

    @Override
    public Object removeFirst() {
        return List.super.removeFirst();
    }

    @Override
    public Object removeLast() {
        return List.super.removeLast();
    }

    @Override
    public List reversed() {
        return List.super.reversed();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return list.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
//    ArrayList<T> items;
//    ArrayListClass(ArrayList<T> items) {
//        this.items = items;
//    }
//    public ArrayList<T> clone() {
//        return (ArrayList<T>) items.clone();
//    }
//    public void ensureCapacity() {
//        items.ensureCapacity(1);
//    }
//    public boolean isEmpty() {
//        return items.isEmpty();
//    }
//    public boolean removeIf(Predicate<? super T> filter) {
//        return items.removeIf(filter);
//    }
//    public void removeRange(int start, int end) {
////        return items.remove(s);
//    }
//    public boolean retainAll(ArrayList<T> items) {
//        return items.retainAll(items);
//    }
//    public int size() {
//        return items.size();
//    }
//    public void trimToSize() {
//        items.trimToSize();
//    }
}
