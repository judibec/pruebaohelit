package com.ohelit.interview.createAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private long telefono;

    public Clientes(String nombre, String correo, long telefono){
        this.correo=correo;
        this.telefono=telefono;
        this.nombre=nombre;
    }

    public Clientes(int id, String nombre, String correo, long telefono){
        this.id=id;
        this.correo=correo;
        this.telefono=telefono;
        this.nombre=nombre;
    }

    public Clientes(){
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

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return this.telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

}
