package com.mlucov.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("myTxt.js");
            boolean isCreated = myFile.createNewFile();
            System.out.println("is file created: " + isCreated);
            FileWriter fileWriter = new FileWriter("myTxt.js");
            fileWriter.write("const data = 40;");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error ocured " + e.getMessage());
        }
    }
}
