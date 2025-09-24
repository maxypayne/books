package com.mlucov.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class LambdaPlayground {
    public static void main(String[] args) {
//        calculate((a, b) -> a + b, 1,2);
//        consumer();
//        supplier();
        exercise_1();
        String[] arrays = new String[]{"one", "two", "three"};
        Arrays.setAll(arrays, index -> arrays[index].trim());


    }
    public static <T> T calculate(Operation<T> function, T value1, T value2) {
        T result = function.operate(value1, value2);
        System.out.println("Result: " + result);
        return result;
    }

    public static <T> T calculateBIF(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result: " + result);
        return result;
    }


    private static void consumer() {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        Comparator<String> comparator = Comparator.naturalOrder();

        list.forEach(consumer);
    }

    private static void supplier() {
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());
    }

    private void predicate() {
        Predicate<String> predicate = (String s) -> s.length() > 2;

        System.out.println(predicate.test("a"));
        System.out.println(predicate.test("aLI"));
    }

    private void unaryOperator() {
        UnaryOperator<String> unaryOperator = String::toUpperCase;

        System.out.println(unaryOperator.apply("a"));
    }

    private static void exercise_1() {
        String[][] arr = {{"a"}, {"b"}, {"c"}};
        String[] arr2 = new String[]{"a", "b", "c"};
        String s = Arrays.deepToString(arr);
    }
}
