package section_14_streams.ex_253.dev.lpa;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
//                .filter(Character::isAlphabetic)
//                .map(Character::toUpperCase)
//                .distinct()
////                .dropWhile(i -> Character.toUpperCase(i) <= 'E')
////                .takeWhile(i -> i < 'a')
////                .skip(5)
////                .filter(i -> Character.toUpperCase(i) > 'E')
//                .forEach(d -> System.out.printf("%c ", d));
//
//        System.out.println();
//        Random random = new Random();
//
//        Stream.generate(() -> random.nextInt((int)'A', (int)'Z' + 1))
//                .limit(50)
////                .distinct()
//                .sorted()
//                .forEach(d -> System.out.printf("%c ", d));

        h();

    }

    public static void h(){
        IntStream.iterate(0, i -> i + 1).limit(14).forEach(System.out::print);
    }
}
