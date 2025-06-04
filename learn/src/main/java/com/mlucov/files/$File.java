package com.mlucov.files;

import java.io.File;
import java.io.IOException;

public class $File {
    File file;
    public boolean canRead() { // Indiquer si le fichier peut être lu
        return file.canRead();
    };
    public boolean canWrite() { // Indiquer si le fichier peut être modifié
        return file.canRead();
    };
    public boolean createNewFile() throws IOException { // Indiquer si le fichier peut être modifié
        return file.createNewFile();
    };
    public void createTempFile(String x, String y) {

    }
    public void createTempFile(String x, String y, File f) { // Créer un nouveau fichier temporaire. Les trois arguments sont le nom, le suffixe du fichier et le répertoire

    }
}
