package com.mlucov;

import com.mlucov.person.PersonWithBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Path path = Path.of(".");

        Paths.get(path.toString()).normalize();
        System.out.println(path);

//        path.
    }
}