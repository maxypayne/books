package com.mlucov.lambda;


@FunctionalInterface
public interface ConsumerInterface<T> {
    void accept(T t);
}
