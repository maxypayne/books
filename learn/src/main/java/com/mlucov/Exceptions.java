package com.mlucov;

import java.util.function.Consumer;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int num = add(3,5);
            System.out.println("Num " + num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Consumer<String> consumer1 = (String param) -> System.out.print(param);
        Consumer<String> consumer = System.out::print;

    }
    public static int add(int x, int y) throws Exception {
        if (x < 10) {
            throw new Exception("This i my exception");
        }
        return x + y;
    }
}
