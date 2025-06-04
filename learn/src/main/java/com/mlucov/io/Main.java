package com.mlucov.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        init();
    }
    static void init() {
//        System.out.print("Choisir un nombre : ");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.nextInt());

        try {
//            Scanner scanFile = new Scanner(new FileReader("print.txt"));
//            FileReader reader = new FileReader("print.txt");
//            Scanner scanFileBuffer = new Scanner(new BufferedReader(reader));
//            scanFile.useDelimiter(",");
//            while (scanFile.hasNext()) {
//                System.out.println(scanFile.next());
//            }
//            scanFile.close();
            BufferedReader br = new BufferedReader(new FileReader("print.txt"));
//            br.lines();
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("From catch block");
            e.printStackTrace();
        }
    }
}
