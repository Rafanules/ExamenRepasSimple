package com.example.examenrepassimple.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Empreses {

    // por el { vacio

    @JsonProperty("empresa")
    private Empresa empresa;

    public Empreses() {
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
