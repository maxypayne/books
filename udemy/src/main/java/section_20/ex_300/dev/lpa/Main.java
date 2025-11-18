package section_20.ex_300.dev.lpa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

//        useFile("testfile.txt");
//        usePath("pathfile.txt");

//        createFile();
        readFile();
    }

    private static void useFile(String fileName) {

        File file = new File(fileName);
        boolean fileExists = file.exists();

        System.out.printf("File '%s' %s%n", fileName,
                fileExists ? "exists." : "does not exist.");

        if (fileExists) {
            System.out.println("Deleting File: " + fileName);
            fileExists = !file.delete();
        }

        if (!fileExists) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
            System.out.println("Created File: " + fileName);
            if (file.canWrite()) {
                System.out.println("Would write to file here");
            }
        }
    }


    private static void createFile() {
        File file = new File("testfile.txt");

        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println("Created File: " + file.getName());
        } catch (IOException e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
    }

    private static void readFile() {
        File file = new File("testfile.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong" + e.getMessage());
        } finally {

        }
    }

    private static void usePath(String fileName) {

        Path path = Path.of(fileName);
        boolean fileExists = Files.exists(path);

        System.out.printf("File '%s' %s%n", fileName,
                fileExists ? "exists." : "does not exist.");

        if (fileExists) {
            System.out.println("Deleting File: " + fileName);
            try {
                Files.delete(path);
                fileExists = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (!fileExists) {
            try {
                Files.createFile(path);
                System.out.println("Created File: " + fileName);
                if (Files.isWritable(path)) {
                    Files.writeString(path, """
                            Here is some data,
                            For my file,
                            just to prove,
                            Using the Files class and path are better!
                            """);
                }
                System.out.println("And I can read too");
                System.out.println("-------------------------");
                Files.readAllLines(path).forEach(System.out::println);
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
        }
    }
}
