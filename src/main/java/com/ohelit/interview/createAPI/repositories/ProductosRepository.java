package com.ohelit.interview.createAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ohelit.interview.createAPI.models.Productos;

@Repository
public interface ProductosRepository extends CrudRepository<Productos,Integer> {
    
}
