package com.mlucov.queue;

import java.util.Arrays;

public class Queue <Type> {
    private int maxSize;
    private int currentSize = 0;
    private int front = 0;
    private int back = -1;
    private Type arr[];

    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = (Type[]) new Object[maxSize];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }
    boolean isFull() {
        return currentSize == maxSize;
    }
    public Type top() {
        return arr[front];
    }

    public void enqueue(Type value) {
        if (isFull()) return;
        back = (back + 1) % maxSize; //to keep the index in range
        arr[back] = value;
        currentSize++;
    }

    public Type dequeue() {
        if (isEmpty()) return null;
        Type temp = arr[front];
        front = (front + 1) % maxSize; //to keep the index in range
        currentSize--;
        return temp;
    }
    public void printArray() {
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }

}
