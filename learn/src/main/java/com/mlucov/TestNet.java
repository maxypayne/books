package com.mlucov;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class TestNet {
    TestNet() throws Throwable {
        handeUrl();
    }

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("Address local = "+ inetAddress.getHostAddress());
            InetAddress adrServeur = InetAddress.getByName("java.sun.com");
            System.out.println("Adresse Sun = "+adrServeur.getHostAddress());
            InetAddress[] adrServeurs = InetAddress.getAllByName("www.microsoft.com");
            System.out.println("Adresses Microsoft : ");
            for (InetAddress serveur : adrServeurs) {
                System.out.println("     " + serveur.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
        }
    }

    protected void handeUrl() throws Throwable {
        URL url = new URL("https://www.w3schools.com");
        System.out.println("auto" + url.getAuthority());
        System.out.println("port" + url.getDefaultPort());
        System.out.println("prot" + url.getProtocol());
        System.out.println("ref" + url.getRef());
    }
}
