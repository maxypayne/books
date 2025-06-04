package com.mlucov.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(8585);
            System.out.println("En attente");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connexion etablie avec le client");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            System.out.println(bufferedReader.readLine());
            printWriter.println("Bien recu");


            printWriter.close();
            bufferedReader.close();
            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
