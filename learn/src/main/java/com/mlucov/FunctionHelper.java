package com.mlucov;

import java.util.function.Function;

public class FunctionHelper {
    public static void main(String[] args) {
        Function<Long, Long> doubler = (i) -> {
            long resultat = (long) i * 2;
            System.out.println("doubler=" + resultat);
            return resultat;
        };

        Function<Long, Long> laMoitie = (i) -> {
            long resultat = i / 2;
            System.out.println("laMoitie=" + resultat);
            return resultat;
        };
        System.out.println(doubler.andThen(laMoitie).apply(4L));
        System.out.println(doubler.compose(laMoitie).apply(4L));
    }
}
