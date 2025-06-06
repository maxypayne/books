package com.mlucov.queue;

import com.mlucov.stack.Stack;

public class Main {
    public static void main(String[] args) {
        int maxSize = 20;
        Queue<Integer> queue = new Queue<>(maxSize);
        for (int i = 0; i < maxSize; i++) {
            queue.enqueue(i);
        }
        System.out.println("Current size of queue :" + queue.getCurrentSize());
        System.out.println("Max size of queue :" + queue.getMaxSize());

//        findBin(12);
        reverseK(queue, 6);
    }

    public static String[] findBin(int number) {
        String[] result = new String[number];
        Queue<String> queue = new Queue<String>(number + 1);

        queue.enqueue("1");

        for (int i = 0; i < number; i++) {
            result[i] = queue.dequeue();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.enqueue(s1);
            queue.enqueue(s2);
        }

        return result; //For number = 3 , result = {"1","10","11"};
    }
    public static void reverseK(Queue<Integer> queue, int k) {
        queue.printArray();
        Stack<Integer> stack = new Stack<>(k);

        while(!stack.isFull()) {
            stack.push(queue.dequeue());
        }

        while(!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
//
        int size = queue.getCurrentSize();
        for(int i = 0; i < size - k; i++) {
            queue.enqueue(queue.dequeue());
        }
        stack.printArray();
        queue.printArray();
    }
}
