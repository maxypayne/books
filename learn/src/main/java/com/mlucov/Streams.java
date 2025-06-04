package com.mlucov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


//map(), mapToInt(), flatMap(), mapToDouble(), filter(), distinct(), sorted(), peek(), limit(), skip(), parallel(), sequential(), unordered()

//forEach(), forEachOrdered(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny(), iterator()
public class Streams {
    Streams() {
        bytesToHex();
    }
    public static void main(String[] args) {
//        handleArray();
//        write();
        read();
    }
    public void bytesToHex () {
//        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
//        StringBuffer buf = new StringBuffer();
        System.out.println("buf");
    }
    public void handleArr() {
        List<Integer> liste = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        Iterator<Integer> it = liste.iterator();
//        LongAdder some = new LongAdder();
//        liste.forEach(some::add);
////        while(it.hasNext()) {
////            int valeur = it.next();
////            if (valeur < 10) {
////                some += valeur;
////            }
////        }
//        System.out.println(some);
        // streams
//        long somme = liste.stream().filter(x -> x > 4).count();
//        System.out.println("somme " + somme);
//
        Integer biggest = liste.stream().max(Comparator.comparing(x -> x)).get();
        System.out.println("Biggest " + biggest);
//        Stream<Integer> stream2 = Stream.of(new Integer[] {1,2,3,4,5,6,7});

        try {
            Stream<String> lignes = Files.lines(Paths.get("myTxt.js"), Charset.defaultCharset());
            long nbLignes = lignes.count();
            lignes.close();
            System.out.println("Nb lignes = " + nbLignes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get("myTxt.js"));
            Stream<String> lines = reader.lines();
            lines.forEach(System.out::println);
            lines.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void handleArray() {
        List<Integer> way = Arrays.asList(1,2,3,4,5,6,7,8);
        long somme = way.stream().mapToInt(i -> i).sum();
        System.out.println(way);
        for (Integer integer : way) {
            System.out.println("Item: " + integer);
        }
        System.out.println("Total: " + somme);
        Stream<Integer> stream = Stream.of(2,3,4);
    }
    public static void write() {
        try {
            FileWriter writer = new FileWriter("createdByFileWriter.txt");
            writer.write(3);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void read() {
        try {
            FileReader reader = new FileReader("createdByFileWriter.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String line ;
            while ((line = buffer.readLine()) != null) {
                System.out.println("Readed line : " + line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
