package com.ohelit.interview.createAPI.services;

import java.util.List;
import java.util.Optional;

import com.ohelit.interview.createAPI.models.Productos;

public interface ProductosServices {

    List<Productos> getProductos();

    Optional<Productos> getProductosById(int id);

    void createProducto(Productos productos);

    void deleteProducto(int id);

    boolean updateProducto (int id, String disponibilidad, int costo);
    
}
