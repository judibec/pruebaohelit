package com.ohelit.interview.createAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohelit.interview.createAPI.models.Productos;
import com.ohelit.interview.createAPI.models.apiResponse.ProductosResponse;
import com.ohelit.interview.createAPI.services.ProductosServices;

@RestController
@RequestMapping(value = "/producto")
public class ProductosController {
    @Autowired
    ProductosServices productosServices;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getProductos(){
        try{
            return new ResponseEntity<>(new ProductosResponse(productosServices.getProductos()), HttpStatus.ACCEPTED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getProductosById(@PathVariable int id){
        try{
            return new ResponseEntity<>(productosServices.getProductosById(id), HttpStatus.ACCEPTED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProductosById(@PathVariable int id){
        try{
            productosServices.deleteProducto(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(path = "/{nombre}/{disponibilidad}/{costo}", method = RequestMethod.DELETE)
    public ResponseEntity<?> createProducto(@PathVariable String nombre, @PathVariable String disponibilidad, @PathVariable int costo){
        try{
            Producto producto = new Productos(nombre,disponibilidad,costo);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
