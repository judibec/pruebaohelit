package com.ohelit.interview.createAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "clienteproducto")
public class ClientesProductos {
    @Column(name = "idusuario")
    private int idUsuario;
    @Column(name = "idproducto")
    private int idProducto;

    public ClientesProductos() {
    }

    public ClientesProductos(int idUsuario, int idProducto) {
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
    }


    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

}
