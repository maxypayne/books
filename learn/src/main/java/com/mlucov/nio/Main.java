package com.mlucov.nio;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
        readDirectory();
    }

    public static void init() {
        Path path = FileSystems.getDefault().getPath("sql", "create.sql");
        Path path2 = Paths.get(".", "sql", "create.sql");
        Path path3 = Paths.get("/Users/maxim/Desktop/Dev/Java/api/", "sql", "create.sql");
//        System.out.println(path.);
        try {
            BufferedReader br = Files.newBufferedReader(path2);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            Path abs = Paths.get(".");
            System.out.println(abs);
            System.out.println(abs.toAbsolutePath());
            Path source = Paths.get("/Users/maxim/Desktop/Dev/Java/api/", "sql", "create.sql");
            Path target = Paths.get("/Users/maxim/Desktop/Dev/Java/api/", "sql", "view.sql");

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            BasicFileAttributes bsa = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println(bsa.isDirectory());
            System.out.println("Path3 = " + Files.exists(path3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readDirectory() {
        Path directory = FileSystems.getDefault().getPath("sql");
        try {
            DirectoryStream<Path> contents = Files.newDirectoryStream(directory, "*.sql");
            for (Path file: contents) {
                System.out.println("File = " + file.getFileName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
