package com.mlucov.io;

import java.io.*;
import java.net.URI;

public class ReaderClass extends File {
    public ReaderClass(String pathname) {
        super(pathname);
    }

    public ReaderClass(String parent, String child) {
        super(parent, child);
    }

    public ReaderClass(File parent, String child) {
        super(parent, child);
    }

    public ReaderClass(URI uri) {
        super(uri);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("print.txt");
    }
}
