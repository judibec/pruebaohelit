package com.ohelit.interview.createAPI.models.apiResponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ohelit.interview.createAPI.models.Productos;

public class ProductosResponse {
    @JsonProperty(value = "productos")
    private List<Productos> productos;


    public ProductosResponse() {
    }

    public ProductosResponse(List<Productos> productos) {
        this.productos = productos;
    }


    public List<Productos> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

}
