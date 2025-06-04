package com.mlucov.linkedList;

public class Training<T> {
    class Node {
        public T data;
        public Node nextNode;
    }
    int size = 0;
    Node head;

    public void addAtTheBeggining(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = head;
        head = newNode;
        size++;
    }
    public void addAtTheEnd(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        Node current = head;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = newNode;
        size++;
    }
    public void addATPosition(T data, T toSearch) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        Node current = head;
        Node next = head;
        while (!current.nextNode.data.equals(toSearch)) {
            current = current.nextNode;
        }
        current.nextNode = newNode;
        size++;
    }

 }
