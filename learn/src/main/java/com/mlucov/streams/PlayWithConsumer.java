package com.mlucov.streams;

import java.util.function.Consumer;

public class PlayWithConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer1 = s -> System.out.println("s1 " + s);
        Consumer<String> consumer2 = s -> System.out.println("s2 " + s);

        Consumer<String> consumer3 = s -> {
                consumer1.accept(s);
                consumer2.accept(s);
        };
        consumer3.accept("Bonjour");

        Consumer<String> c4 = consumer1.andThen(consumer2);
        c4.accept("Test c4");
    }
}
