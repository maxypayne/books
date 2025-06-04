package com.mlucov.streams;

import java.util.*;

public class StreamClass{
    public static void main(String[] args) {
        transformListToString();

    }
    public static void transformListToString() {
        System.out.println("result result result");
        List<String> list = List.of("a", "b");
        StringBuilder result = list.stream().collect(
            () -> new StringBuilder(),
            (a, b) -> a.append(b),
            (x, y) -> x.append(",").append(y)
        );
        System.out.println(result.toString());


        String result2 = list.parallelStream()
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println("result2");
        System.out.println(result2);
    }
}
