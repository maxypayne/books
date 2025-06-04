package com.mlucov.files;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Iterator;

public class PathClass implements Path {
    static String absolutePath  = "/Users/maxim/Desktop/Dev/Java/api/print.txt";
    public PathClass() {
//        path = FileSystems.getDefault().getPath("/");

    }

    public static void main(String[] args) {
        Path path = Paths.get(absolutePath);
        System.out.println("Path :" + path.getRoot());
    }
    @Override
    public FileSystem getFileSystem() {
        return null;
    }

    @Override
    public boolean isAbsolute() {
        return false;
    }

    @Override
    public Path getRoot() {
        return null;
    }

    @Override
    public Path getFileName() {
        return null;
    }

    @Override
    public Path getParent() {
        return null;
    }

    @Override
    public int getNameCount() {
        return 0;
    }

    @Override
    public Path getName(int index) {
        return null;
    }

    @Override
    public Path subpath(int beginIndex, int endIndex) {
        return null;
    }

    @Override
    public boolean startsWith(Path other) {
        return false;
    }

    @Override
    public boolean startsWith(String other) {
        return Path.super.startsWith(other);
    }

    @Override
    public boolean endsWith(Path other) {
        return false;
    }

    @Override
    public boolean endsWith(String other) {
        return Path.super.endsWith(other);
    }

    @Override
    public Path normalize() {
        return null;
    }

    @Override
    public Path resolve(Path other) {
        return null;
    }

    @Override
    public Path resolve(String other) {
        return Path.super.resolve(other);
    }

    @Override
    public Path resolveSibling(Path other) {
        return Path.super.resolveSibling(other);
    }

    @Override
    public Path resolveSibling(String other) {
        return Path.super.resolveSibling(other);
    }

    @Override
    public Path relativize(Path other) {
        return null;
    }

    @Override
    public URI toUri() {
        return null;
    }

    @Override
    public Path toAbsolutePath() {
        return null;
    }

    @Override
    public Path toRealPath(LinkOption... options) throws IOException {
        return null;
    }

    @Override
    public File toFile() {
        return Path.super.toFile();
    }

    @Override
    public WatchKey register(WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers) throws IOException {
        return null;
    }

    @Override
    public WatchKey register(WatchService watcher, WatchEvent.Kind<?>... events) throws IOException {
        return Path.super.register(watcher, events);
    }

    @Override
    public Iterator<Path> iterator() {
        return Path.super.iterator();
    }

    @Override
    public int compareTo(Path other) {
        return 0;
    }
}
