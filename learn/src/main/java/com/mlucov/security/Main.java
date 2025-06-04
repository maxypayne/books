package com.mlucov.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Provider[] list = Security.getProviders();
//        for (Provider x:list) {
//            System.out.println("x = " + x.getName());
//            System.out.println("x = " + x.getServices());
//        }
        encrypt();
//        String monMessage = "Mon message";
//
//        calculerValeurDeHachage("MD2", monMessage);
//        calculerValeurDeHachage("MD5", monMessage);
//        calculerValeurDeHachage("SHA-1", monMessage);
//        calculerValeurDeHachage("SHA-256", monMessage);
//        calculerValeurDeHachage("SHA-384", monMessage);
//        calculerValeurDeHachage("SHA-512", monMessage);
    }
    public static String bytesToHex(byte[] b) {
        char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        StringBuffer buf = new StringBuffer();
        for (int j = 0; j < b.length; j++) {
            buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
            buf.append(hexDigit[b[j] & 0x0f]);
        }
        return buf.toString();
    }
    public static byte[] calculerValeurDeHachage(String algorithme, String monMessage) {
        byte[] digest = null;
        try {
            MessageDigest sha = MessageDigest.getInstance(algorithme);
            sha.update(monMessage.getBytes());
            digest = sha.digest();
            System.out.println("algorithme : " + algorithme);
            System.out.println(bytesToHex(digest));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return digest;
    }
    public static void encrypt() {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hashedPassword = md.digest();
            System.out.println(hashedPassword.toString());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}