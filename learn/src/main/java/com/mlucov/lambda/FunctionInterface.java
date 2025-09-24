package com.mlucov.lambda;

@FunctionalInterface
public interface FunctionInterface<R, T> {
    R apply(T t);
}
