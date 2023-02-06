package com.ohelit.interview.createAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {
    
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "disponibilidad")
    private String disponibilidad;
    @Column(name = "costo")
    private int costo;


    public Productos(int id, String nombre, String disponibilidad, int costo) {
        this.id = id;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.costo = costo;
    }

    public Productos(String nombre, String disponibilidad, int costo) {
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.costo = costo;
    }

    public Productos() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCosto() {
        return this.costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }


}
