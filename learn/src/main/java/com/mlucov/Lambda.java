package com.mlucov;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Supplier;

public class Lambda {
    // x -> System.out.println(x)
    // System.out::println
    //
    // (x, y) -> Math.pow(x, y)
    // Math::pow
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        comparator.compare("turk", "lok");
        Function<Integer, Boolean> compare = (Integer v1) -> { return v1 < 4; };
        LongFunction<Long> longFunction = x -> x * 2;
        IntFunction<Integer> intFunction  = x -> x * 2;
        Callable<String> monCallable = () -> "Mon traitement";
        Supplier<String> monSupplier = () -> "Mon traitement";

    }
}
