package com.ohelit.interview.createAPI.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohelit.interview.createAPI.models.Productos;
import com.ohelit.interview.createAPI.repositories.ProductosRepository;
import com.ohelit.interview.createAPI.services.ProductosServices;

@Service
public class ProductosServicesImpl implements ProductosServices{
    @Autowired
    ProductosRepository productosRepository;

    @Override
    public List<Productos> getProductos() {
        return (List<Productos>) productosRepository.findAll();
    }

    @Override
    public Optional<Productos> getProductosById(int id) {
        return productosRepository.findById(id);
    }

    @Override
    public void createProducto(Productos productos) {
        String disponibilidad = productos.getDisponibilidad();
        List<Productos> productosTotales = (List<Productos>) productosRepository.findAll();
        productos.setId(productosTotales.size()+1);
        if(disponibilidad == null){
            productos.setDisponibilidad("en stock");
        }
        productosRepository.save(productos);
    }

    @Override
    public void deleteProducto(int id) {
        productosRepository.deleteById(id);
        
    }

    @Override
    public boolean updateProducto(int id, String disponibilidad, int costo) {
        if(productosRepository.existsById(id)){
            Optional<Productos> producto = productosRepository.findById(id);
            String nombre = producto.get().getNombre();
            productosRepository.save(new Productos(id,nombre,disponibilidad,costo));
            return true;
        }else{
            return false;
        }
    }
}
