package com.amoelcodigo.crud.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document
public class Torre {
    @Id
    @org.springframework.data.annotation.Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idTorre;
    private String nombreTorre;
    private int cantidadAptos;

    public Torre() {
    }

    public Torre(String nombreTorre, int cantidadAptos) {
        this.nombreTorre = nombreTorre;
        this.cantidadAptos = cantidadAptos;
    }

    public String getIdTorre() {
        return idTorre;
    }

    public void setIdTorre(String idTorre) {
        this.idTorre = idTorre;
    }

    public String getNombreTorre() {
        return nombreTorre;
    }

    public void setNombreTorre(String nombreTorre) {
        this.nombreTorre = nombreTorre;
    }

    public int getCantidadAptos() {
        return cantidadAptos;
    }

    public void setCantidadAptos(int cantidadAptos) {
        this.cantidadAptos = cantidadAptos;
    }
}
