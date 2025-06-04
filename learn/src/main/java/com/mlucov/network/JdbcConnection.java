package com.mlucov.network;

import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) {
//        get();
//          create();
        update();
    }
    private static void get() {
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql:postgres");
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM users");
            System.out.println(res.getMetaData().getClass());
            while (res.next()) {
                String line = res.getString("email");
                System.out.println("Email is => " + line);
            }
//            String updateReq = "INSERT INTO client VALUES (3,'client 3','prenom 3')";
//            Statement updateStmt = con.createStatement();
//            int nbMaj = updateStmt.executeUpdate(updateReq);
//            log("nb mise a jour = " + nbMaj);
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void create() {
        try {
            //
            Connection con = DriverManager.getConnection("jdbc:postgresql:postgres");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO students VALUES (9,'ola','dola', 'ola@dola.com', 2)");
            System.out.println("Created");
            con.close();
        } catch (Exception e) {
            log("Problem create");
            System.out.println(e.getMessage());
        }
    }

    private static void update() {
        try {
            //
            Connection con = DriverManager.getConnection("jdbc:postgresql:postgres");
            PreparedStatement stmt = con.prepareStatement("UPDATE students SET email = ? WHERE id = ?");

            stmt.setString(1, "maximlucov@gmail.com");
            stmt.setInt(2, 553);
            stmt.executeUpdate();
            log("Updated");
            con.close();
        } catch (Exception e) {
            log("Problem update");
            log(e.getMessage());
        }
    }
    private static void updateMany() {
        try {
            //
            Connection con = DriverManager.getConnection("jdbc:postgresql:postgres");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            for(int i=0; i<10 ; i++) {
                stmt.addBatch("INSERT INTO students VALUES(" + i + ",'ola','dola', 'ola@dola.com', 2)");
            }
            stmt.executeBatch();

            log("Created many items");
            con.close();
        } catch (Exception e) {
            log("Problem update");
            log(e.getMessage());
        }
    }
    private static void log(String message) {
        System.out.println(message);
    }
}



//try {
//            Connection con = DriverManager.getConnection("jdbc:postgresql:postgres");
//            Statement stmt = con.createStatement();
//            ResultSet res = stmt.executeQuery("SELECT * FROM users");
//            System.out.println(res.getMetaData().getClass());
//            while (res.next()) {
//                String line = res.getString("email");
//                System.out.println("Email is => " + line);
//            }
//
//
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }