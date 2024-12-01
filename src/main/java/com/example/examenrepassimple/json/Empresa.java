package com.example.examenrepassimple.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Empresa {

    @JsonProperty("nom")
    private String nom;

    @JsonProperty("empleats")
    private List<Empleat> empleats;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Empleat> getEmpleats() {
        return empleats;
    }

    public void setEmpleats(List<Empleat> empleats) {
        this.empleats = empleats;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nom='" + nom + '\'' +
                ", empleats=" + empleats +
                '}';
    }
}
