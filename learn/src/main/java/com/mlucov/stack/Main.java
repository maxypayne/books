package com.mlucov.stack;

public class Main {

    public static void main(String[] args) {
        sortValues();
    }

    public static void sortValues() {
        Stack<Integer> sortedStack = new Stack<>(6);
        sortedStack.push(1);
        sortedStack.push(2);
        sortedStack.push(3);
        sortedStack.push(5);
        sortedStack.push(8);
        sortedStack.push(9);
    }
}
