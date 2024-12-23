package com.example.examenrepassimple.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Empleat {

    @JsonProperty("nom")
    private String nom;

    @JsonProperty("edat")
    private int edat;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Empleat{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }
}
