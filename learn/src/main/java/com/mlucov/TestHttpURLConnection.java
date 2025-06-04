package com.mlucov;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestHttpURLConnection {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL("https://www.java.sun.com");
            connection = (HttpURLConnection) url.openConnection();

            connection.setAllowUserInteraction(true);

            DataInputStream in = new DataInputStream(connection.getInputStream());
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                System.out.println(connection.getResponseMessage());
            } else {
                System.out.print((char) in.readUnsignedByte());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            connection.disconnect();
        }
        System.exit(20);
    }
}
