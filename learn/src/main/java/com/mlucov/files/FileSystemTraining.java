package com.mlucov.files;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
import java.util.stream.*;

/**
 * Comprehensive Java File System Training Project
 * Covers File, Files, Path, and FileSystem APIs
 */
public class FileSystemTraining {

    private static final String BASE_DIR = "training_workspace";

    public static void main(String[] args) {
        try {
            FileSystemTraining trainer = new FileSystemTraining();
            trainer.runAllExercises();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void runAllExercises() throws IOException {
        System.out.println("=== Java File System Training ===\n");

        // 1. Path Operations
        exercisePathOperations();

        // 2. File/Directory Creation
        exerciseFileCreation();

        // 3. File Reading/Writing
        exerciseFileReadWrite();

        // 4. Directory Operations
        exerciseDirectoryOperations();

        // 5. File Attributes
        exerciseFileAttributes();

        // 6. File Copy/Move/Delete
        exerciseFileCopyMoveDelete();

        // 7. Walking File Trees
        exerciseFileTreeWalking();

        // 8. File System Operations
        exerciseFileSystem();

        // 9. Stream Operations
        exerciseStreamOperations();

        System.out.println("\n=== All exercises completed! ===");
    }

    // Exercise 1: Path Operations
    private void exercisePathOperations() {
        System.out.println("--- Exercise 1: Path Operations ---");

        // Creating paths
        Path path1 = Paths.get(BASE_DIR, "folder1", "file.txt");
        Path path2 = Path.of(BASE_DIR, "folder2", "data.csv");

        System.out.println("Path 1: " + path1);
        System.out.println("Path 2: " + path2);

        // Path components
        System.out.println("File name: " + path1.getFileName());
        System.out.println("Parent: " + path1.getParent());
        System.out.println("Root: " + path1.getRoot());
        System.out.println("Name count: " + path1.getNameCount());

        // Path manipulation
        Path resolved = path1.resolve("subfolder/file2.txt");
        System.out.println("Resolved path: " + resolved);

        Path relative = path1.relativize(path2);
        System.out.println("Relative path: " + relative);

        Path normalized = Paths.get(BASE_DIR, "folder1", "..", "folder2").normalize();
        System.out.println("Normalized: " + normalized);

        Path absolute = path1.toAbsolutePath();
        System.out.println("Absolute: " + absolute);

        System.out.println();
    }

    // Exercise 2: File and Directory Creation
    private void exerciseFileCreation() throws IOException {
        System.out.println("--- Exercise 2: File/Directory Creation ---");

        // Create base directory
        Path baseDir = Paths.get(BASE_DIR);
        Files.createDirectories(baseDir);
        System.out.println("Created directory: " + baseDir);

        // Create single directory
        Path dir1 = baseDir.resolve("folder1");
        if (!Files.exists(dir1)) {
            Files.createDirectory(dir1);
            System.out.println("Created: " + dir1);
        }

        // Create nested directories
        Path nestedDir = baseDir.resolve("deep/nested/structure");
        Files.createDirectories(nestedDir);
        System.out.println("Created nested: " + nestedDir);

        // Create files
        Path file1 = dir1.resolve("test.txt");
        Files.createFile(file1);
        System.out.println("Created file: " + file1);

        // Create temp file
        Path tempFile = Files.createTempFile(baseDir, "temp_", ".tmp");
        System.out.println("Created temp file: " + tempFile);

        // Create temp directory
        Path tempDir = Files.createTempDirectory(baseDir, "temp_dir_");
        System.out.println("Created temp directory: " + tempDir);

        System.out.println();
    }

    // Exercise 3: File Reading and Writing
    private void exerciseFileReadWrite() throws IOException {
        System.out.println("--- Exercise 3: File Reading/Writing ---");

        Path baseDir = Paths.get(BASE_DIR);
        Path textFile = baseDir.resolve("sample.txt");

        // Write string to file
        String content = "Hello, Java NIO!\nThis is line 2.\nThis is line 3.";
        Files.writeString(textFile, content);
        System.out.println("Wrote string to file");

        // Read string from file
        String readContent = Files.readString(textFile);
        System.out.println("Read content: " + readContent.substring(0, 20) + "...");

        // Write lines to file
        List<String> lines = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        Path listFile = baseDir.resolve("fruits.txt");
        Files.write(listFile, lines);
        System.out.println("Wrote lines to file");

        // Read all lines
        List<String> readLines = Files.readAllLines(listFile);
        System.out.println("Read lines: " + readLines);

        // Write bytes
        byte[] bytes = "Binary data".getBytes();
        Path binaryFile = baseDir.resolve("data.bin");
        Files.write(binaryFile, bytes);
        System.out.println("Wrote bytes to file");

        // Read bytes
        byte[] readBytes = Files.readAllBytes(binaryFile);
        System.out.println("Read bytes: " + new String(readBytes));

        // Using BufferedWriter
        Path bufferedFile = baseDir.resolve("buffered.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(bufferedFile)) {
            writer.write("Line 1\n");
            writer.write("Line 2\n");
            writer.write("Line 3\n");
        }
        System.out.println("Wrote using BufferedWriter");

        // Using BufferedReader
        try (BufferedReader reader = Files.newBufferedReader(bufferedFile)) {
            String line;
            System.out.print("Read using BufferedReader: ");
            while ((line = reader.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // Exercise 4: Directory Operations
    private void exerciseDirectoryOperations() throws IOException {
        System.out.println("--- Exercise 4: Directory Operations ---");

        Path baseDir = Paths.get(BASE_DIR);
        Path testDir = baseDir.resolve("dir_ops");
        Files.createDirectories(testDir);

        // Create multiple files
        for (int i = 1; i <= 5; i++) {
            Files.createFile(testDir.resolve("file" + i + ".txt"));
        }

        // List directory contents
        System.out.println("Directory contents:");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(testDir)) {
            for (Path entry : stream) {
                System.out.println("  - " + entry.getFileName());
            }
        }

        // List with glob pattern
        System.out.println("Filtered (*.txt):");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(testDir, "*.txt")) {
            for (Path entry : stream) {
                System.out.println("  - " + entry.getFileName());
            }
        }

        // Check if directory is empty
        boolean isEmpty = Files.list(testDir).findAny().isEmpty();
        System.out.println("Directory empty: " + isEmpty);

        System.out.println();
    }

    // Exercise 5: File Attributes
    private void exerciseFileAttributes() throws IOException {
        System.out.println("--- Exercise 5: File Attributes ---");

        Path baseDir = Paths.get(BASE_DIR);
        Path file = baseDir.resolve("sample.txt");

        // Basic attributes
        System.out.println("Exists: " + Files.exists(file));
        System.out.println("Is regular file: " + Files.isRegularFile(file));
        System.out.println("Is directory: " + Files.isDirectory(file));
        System.out.println("Is readable: " + Files.isReadable(file));
        System.out.println("Is writable: " + Files.isWritable(file));
        System.out.println("Is executable: " + Files.isExecutable(file));
        System.out.println("Is hidden: " + Files.isHidden(file));
        System.out.println("Size: " + Files.size(file) + " bytes");

        // Get last modified time
        FileTime lastModified = Files.getLastModifiedTime(file);
        System.out.println("Last modified: " + lastModified);

        // Set last modified time
        FileTime newTime = FileTime.fromMillis(System.currentTimeMillis());
        Files.setLastModifiedTime(file, newTime);
        System.out.println("Updated last modified time");

        // Get owner
        UserPrincipal owner = Files.getOwner(file);
        System.out.println("Owner: " + owner.getName());

        // Get all attributes at once
        BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
        System.out.println("Creation time: " + attrs.creationTime());
        System.out.println("Is symbolic link: " + attrs.isSymbolicLink());

        // Get attribute by name
        Object sizeAttr = Files.getAttribute(file, "basic:size");
        System.out.println("Size via getAttribute: " + sizeAttr);

        System.out.println();
    }

    // Exercise 6: Copy, Move, Delete Operations
    private void exerciseFileCopyMoveDelete() throws IOException {
        System.out.println("--- Exercise 6: Copy/Move/Delete ---");

        Path baseDir = Paths.get(BASE_DIR);
        Path source = baseDir.resolve("source.txt");
        Files.writeString(source, "Source file content");

        // Copy file
        Path copy1 = baseDir.resolve("copy1.txt");
        Files.copy(source, copy1, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copied to: " + copy1);

        // Copy with attributes
        Path copy2 = baseDir.resolve("copy2.txt");
        Files.copy(source, copy2, StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println("Copied with attributes to: " + copy2);

        // Move file
        Path moved = baseDir.resolve("moved.txt");
        Files.move(copy1, moved, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Moved to: " + moved);

        // Delete file
        Files.delete(moved);
        System.out.println("Deleted: " + moved);

        // Delete if exists
        boolean deleted = Files.deleteIfExists(copy2);
        System.out.println("Delete if exists result: " + deleted);

        // Copy directory
        Path srcDir = baseDir.resolve("src_dir");
        Path destDir = baseDir.resolve("dest_dir");
        Files.createDirectories(srcDir);
        Files.createFile(srcDir.resolve("file.txt"));

        Files.copy(srcDir, destDir);
        System.out.println("Copied directory: " + destDir);

        System.out.println();
    }

    // Exercise 7: Walking File Trees
    private void exerciseFileTreeWalking() throws IOException {
        System.out.println("--- Exercise 7: Walking File Trees ---");

        Path baseDir = Paths.get(BASE_DIR);

        // Create a sample tree structure
        Path treeRoot = baseDir.resolve("tree_walk");
        Files.createDirectories(treeRoot.resolve("level1/level2"));
        Files.createFile(treeRoot.resolve("root.txt"));
        Files.createFile(treeRoot.resolve("level1/file1.txt"));
        Files.createFile(treeRoot.resolve("level1/level2/file2.txt"));

        // Walk file tree
        System.out.println("Walking file tree:");
        Files.walk(treeRoot)
            .forEach(path -> System.out.println("  " + treeRoot.relativize(path)));

        // Walk with depth limit
        System.out.println("\nWalking with max depth 1:");
        Files.walk(treeRoot, 1)
            .forEach(path -> System.out.println("  " + treeRoot.relativize(path)));

        // Find files with filter
        System.out.println("\nFinding .txt files:");
        Files.find(treeRoot, Integer.MAX_VALUE,
                (path, attrs) -> path.toString().endsWith(".txt"))
            .forEach(path -> System.out.println("  " + path.getFileName()));

        // Custom FileVisitor
        System.out.println("\nUsing FileVisitor:");
        Files.walkFileTree(treeRoot, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                System.out.println("  Visiting file: " + file.getFileName());
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                System.out.println("  Entering directory: " + dir.getFileName());
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println();
    }

    // Exercise 8: FileSystem Operations
    private void exerciseFileSystem() throws IOException {
        System.out.println("--- Exercise 8: FileSystem Operations ---");

        // Get default file system
        FileSystem fs = FileSystems.getDefault();
        System.out.println("File system: " + fs);
        System.out.println("Separator: " + fs.getSeparator());
        System.out.println("Is open: " + fs.isOpen());
        System.out.println("Is read-only: " + fs.isReadOnly());

        // Get file stores
        System.out.println("\nFile stores:");
        for (FileStore store : fs.getFileStores()) {
            System.out.println("  Name: " + store.name());
            System.out.println("  Type: " + store.type());
            System.out.println("  Total space: " + store.getTotalSpace() / (1024 * 1024 * 1024) + " GB");
            System.out.println("  Usable space: " + store.getUsableSpace() / (1024 * 1024 * 1024) + " GB");
        }

        // Get root directories
        System.out.println("\nRoot directories:");
        for (Path root : fs.getRootDirectories()) {
            System.out.println("  " + root);
        }

        // Path matcher (glob patterns)
        PathMatcher matcher = fs.getPathMatcher("glob:*.txt");
        Path testPath = Paths.get("test.txt");
        System.out.println("\nDoes 'test.txt' match '*.txt': " + matcher.matches(testPath));

        // Regex pattern
        PathMatcher regexMatcher = fs.getPathMatcher("regex:.*\\.(txt|log)");
        System.out.println("Does 'file.log' match regex: " + regexMatcher.matches(Paths.get("file.log")));

        System.out.println();
    }

    // Exercise 9: Stream Operations on Files
    private void exerciseStreamOperations() throws IOException {
        System.out.println("--- Exercise 9: Stream Operations ---");

        Path baseDir = Paths.get(BASE_DIR);
        Path dataFile = baseDir.resolve("numbers.txt");

        // Create sample data
        List<String> numbers = Arrays.asList("10", "25", "30", "15", "40", "5");
        Files.write(dataFile, numbers);

        // Process file with streams
        System.out.println("Sum of numbers:");
        int sum = Files.lines(dataFile)
            .mapToInt(Integer::parseInt)
            .sum();
        System.out.println("  Total: " + sum);

        // Find files in directory stream
        System.out.println("\nLarge files (> 10 bytes):");
        Files.list(baseDir)
            .filter(Files::isRegularFile)
            .filter(path -> {
                try {
                    return Files.size(path) > 10;
                } catch (IOException e) {
                    return false;
                }
            })
            .forEach(path -> System.out.println("  " + path.getFileName()));

        // Count files by extension
        System.out.println("\nFiles by extension:");
        Map<String, Long> extensionCount = Files.walk(baseDir)
            .filter(Files::isRegularFile)
            .collect(Collectors.groupingBy(
                path -> {
                    String name = path.getFileName().toString();
                    int dotIndex = name.lastIndexOf('.');
                    return dotIndex > 0 ? name.substring(dotIndex) : "no-extension";
                },
                Collectors.counting()
            ));
        extensionCount.forEach((ext, count) ->
            System.out.println("  " + ext + ": " + count));

        System.out.println();
    }
}