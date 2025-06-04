package com.mlucov.streams.comparator;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface CustomComparator<T> {
    int compare(T t1, T t2);

    default CustomComparator<T> thenComparing(CustomComparator<T> other) {
        Objects.requireNonNull(other);
        return (T t1, T t2) -> {
            int compare = this.compare(t1, t2);
            return compare == 0 ? other.compare(t1, t2) : compare;
        };
    }
    static <T, U extends Comparable<U>> CustomComparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (p1, p2) -> {
            U name1 = keyExtractor.apply(p1);
            U name2 = keyExtractor.apply(p2);
            return name1.compareTo(name2);
        };
    }
}
