package com.mlucov.streams.collector;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class TestCollector {
    public static void main(String[] args) {
        // 1 Constrire un containeur mutable
        // () -> container mutable
          Supplier supplier = () -> new ArrayList<String>();
        // 2 Accumulateur: Ajoute un element du stream au container mutable
        // (container, e) -> container.add(e)
        BiConsumer<ArrayList<String>, String> biConsumer = (list, e) -> { list.add(e) };// ne retourne rien
        // 3 Combiner: Fussione deux containeurs mutables
        // (container1, container2) -> container2
        BinaryOperator<ArrayList<String>> binaryOperator = (list1, list2) -> {
            list1.addAll(list1);
            return list1;
        };
        // 4 Finisheur:

        // toList()
        // 1 () -> new ArrayList();
        // 2 (list, e) -> list.add(e);
        // 3 (list1, list2) -> {
        //       list1.addAll(list1);
        //       return list1;
        //    };
        // 4 identity()
    }
}
