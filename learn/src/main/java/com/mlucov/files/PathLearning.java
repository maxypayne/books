package com.mlucov.files;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PathLearning {

    public static void main(String[] args) {
        try {
//        getData();
//        searchData();
//        createFleOrDirectory();
//        deleteFileOrDirectory();
//        testDirectoryStream();
//        testFileSystemSeparator();
//        getRootDirectories();
//        filesMethods();
//        createAndWriteToFile();
//        testGetOwner();
//          getFileMetaData();
//          readFileAsAstream();
//            getFileStore();
            getSpace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void getData() {
        String pathToFile = "/Users/maxim/Desktop/gnsrecfluid.magasins.json";
        Path path = FileSystems.getDefault().getPath(pathToFile);
        System.out.println("toString()     = " + path.toString());
        System.out.println("getFileName()  = " + path.getFileName());
        System.out.println("getRoot()      = " + path.getRoot());
        System.out.println("getName(0)     = " + path.getName(0));
        System.out.println("getNameCount() = " + path.getNameCount());
        System.out.println("getParent()    = " + path.getParent());
        System.out.println("subpath(0,3)   = " + path.subpath(0,3));
        Path paths = Paths.get(pathToFile);
        System.out.println("normalize()   = " + path.normalize());
    }
    public  static void searchData() {
        Path pathToCombine = Paths.get("Users/maxim/Desktop/");
        pathToCombine.resolve("Dev/api/server.js");

        String pattern = "*.{js, html}";
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
        String fileName = "/data.js";
        if (pathMatcher.matches(Path.of(fileName))) {
            System.out.println("Filename: " + fileName);
        }
    }
    public static void createFleOrDirectory() {
        try {
            Path myDirectory = Paths.get("/Users/maxim/Desktop/Dev/Java/api/myDirectory");
            Path file = Files.createDirectory(myDirectory);
            System.out.println(file.getFileName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            Path myFile = Paths.get("/Users/maxim/Desktop/Dev/Java/api/myDirectory/myFile.js");
            Path file = Files.createFile(myFile);
            System.out.println(file.getFileName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void deleteFileOrDirectory() throws IOException {
        Path path = Paths.get("/Users/maxim/Desktop/Dev/Java/api/myDirectory");
        try {
            Files.delete(path);
            // Files.deleteIfExists(pathToDelete); delete without exception
        } catch (NoSuchFileException nsfe) {
            System.err.println("File or directory " + path + " doesn't exist");
        } catch (DirectoryNotEmptyException dnee) {
            System.err.println("directory " + path + " isn't empty");
        } catch (IOException ioe) {
            System.err.println("Impossible to delete " + path + " : " + ioe);
        }
    }
    public static void testDirectoryStream() throws IOException {
        Path path = Paths.get("/Users/maxim/Desktop/Dev/Java/api");
        String searchingPattern = "*.{html, zip}";
        DirectoryStream stream = Files.newDirectoryStream(path, searchingPattern); // filter with pattern
        try {
            Iterator<Path> iterator = stream.iterator();
            while (iterator.hasNext()) {
                Path p = iterator.next();
                System.out.println("fileName : " + p);
            }
        } finally {
            stream.close();
        }
    }
    private static void testFileSystemSeparator() {
        String separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);
    }
    private static void getRootDirectories() throws IOException {
        Iterable<Path> paths = FileSystems.getDefault().getRootDirectories();
        for (Path path : paths) {
            System.out.println("Root path: " + path);
        }
    }
    public static void filesMethods() throws IOException {
        Path path = Paths.get("/Users/maxim/Desktop/Dev/Java/api/pom.xml");
        Stream<String> stream = Files.lines(path);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//        for (String line: lines) {
//            System.out.println("line : " + line);
//        }
        for (int i = 0; i < lines.size(); i++) {
            System.out.println("line " + i + " : " + lines.get(i));
        }
        stream.close();
    }
    public static void createAndWriteToFile() throws IOException {
        Path pathToRead = Paths.get("/Users/maxim/Desktop/Dev/Java/api/pom.xml");
        Path pathToWrite = Paths.get("/Users/maxim/Desktop/Dev/Java/api/myDirectory/file.xml");
        Path pathToWrite2 = Paths.get("/Users/maxim/Desktop/Dev/Java/api/myDirectory/file2.txt");
        List<String> list = Files.readAllLines(pathToRead);
        Files.write(pathToWrite, list);


        List<String> liste = new ArrayList<>(5);
        liste.add("1");
        liste.add("2");
        liste.add("3");
        liste.add("4");
        liste.add("5");
        Files.write(pathToWrite2, liste);
    }
    public static void testGetOwner() throws IOException {
        Path fichier = Paths.get("/Users/maxim/Desktop/Dev/Java/api/pom.xml");
        UserPrincipal owner = Files.getOwner(fichier);
        System.out.println(owner);
    }
    public static void getFileMetaData() throws IOException {
        Path path = Paths.get("/Users/maxim/Desktop/Dev/Java/api/pom.xml");
        BasicFileAttributes basicAttrs = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("creationTime     = " + basicAttrs.creationTime());
        System.out.println("lastAccessTime   = " + basicAttrs.lastAccessTime());
        System.out.println("lastModifiedTime = " + basicAttrs.lastModifiedTime());
        System.out.println("isDirectory      = " + basicAttrs.isDirectory());
        System.out.println("isOther          = " + basicAttrs.isOther());
        System.out.println("isRegularFile    = " + basicAttrs.isRegularFile());
        System.out.println("isSymbolicLink   = " + basicAttrs.isSymbolicLink());
        System.out.println("size             = " + basicAttrs.size());
        System.out.println("fileKey          = " + basicAttrs.fileKey());
    }
    public static void setLastModifiedTime() throws IOException {
        Path fichier = Paths.get("/Users/maxim/Desktop/Dev/Java/api/file.xml");
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis(currentTime);
        Files.setLastModifiedTime(fichier, ft);
    }
    public static void readFileAsAstream() throws IOException {
        Path fichier = Paths.get("/Users/maxim/Desktop/Dev/Java/api/file.xml");
        InputStream stream = Files.newInputStream(fichier);
//        stream.forEach(System.out::println);
        stream.read();
        // todo finish
    }

    public static void getFileStore() throws IOException {
        Iterable<FileStore> fileStores = FileSystems.getDefault().getFileStores();
        for (FileStore fileStore : fileStores) {
            System.out.println(fileStore);
            System.out.println("name : "+ fileStore.name() + ", type : "
                    + fileStore.type());
        }
    }
    public static void getSpace() throws IOException {
        final int UN_GIGA = 1024 * 1024 * 1024;
        for (FileStore store : FileSystems.getDefault().getFileStores()) {
            try {
                long total = store.getTotalSpace() / UN_GIGA;
                long used = (store.getTotalSpace() - store.getUnallocatedSpace()) / UN_GIGA;
                long avail = store.getUsableSpace() / UN_GIGA;
                System.out.format("%-20s total=%5dGo used=%5dGo avail=%5dGo%n", store,
                        total, used, avail);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}


//Path : encapsule un chemin dans le système de fichiers
//Files : contient des méthodes statiques pour manipuler les éléments du système de fichiers
//FileSystemProvider : service provider qui interagit avec le système de fichiers sous-jacent
//FileSystem : encapsule un système de fichiers
//FileSystems : fabrique qui permet de créer une instance de FileSystem