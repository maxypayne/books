package com.mlucov.serialisation;

import java.io.Serializable;

public class SerializablePerson implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nom    = "";
    private String prenom = "";

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    private String secretCode = "";
    private int    taille = 0;

    public SerializablePerson(final String nom, final String prenom, final int taille, String secretCode) {
        this.nom = nom;
        this.taille = taille;
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return this.taille;
    }

    public void setTaille(final int taille) {
        this.taille = taille;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }
}
