package com.mlucov;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathHelper {
    public static void main(String[] args) throws IOException {
        Path fichier = FileSystems.getDefault().getPath("/Users/maxim/Desktop/Dev/Java/learn/demo.js");
        Path file = Files.createFile(fichier);
//        System.out.println(file);
        Path path2 = Paths.get("/Users/maxim/Desktop/Dev/Java/learn/demo.js");
        for (Path name: path2) {
            System.out.println(name);
        }
    }
}
