package com.mlucov.streams.strings;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestString {

    public static void main(String[] args) {
//        splitString();
        flatLines();
    }
    public static void splitString() {
        String string = "Hello worlds here!";

        String[] strings = string.split(" ");
        Stream<String> stream = Arrays.stream(strings);

        Pattern pattern = Pattern.compile(" ");
        Stream<String> stream1 = pattern.splitAsStream(string);

        IntStream intStream = string.chars();
        intStream.forEach(System.out::println);
    }

    public static void flatLines() {
        String s1 = "My name is";
        String s2 = "Slim Shady";
        String s3 = "My name is ouh";
        Function<String, Stream<String>> splitStrings = line -> Pattern.compile(" ").splitAsStream(line);
        List<String> flattedWords = Stream.of(s1, s2, s3).flatMap(splitStrings).toList();
        System.out.println(flattedWords);
        // [My, name, is, Slim, Shady, My, name, is, ouh]
    }
}
