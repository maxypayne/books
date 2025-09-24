package com.mlucov.lambda;

@FunctionalInterface
public interface PredicateInterface<T> {
    boolean test(T s);
}
