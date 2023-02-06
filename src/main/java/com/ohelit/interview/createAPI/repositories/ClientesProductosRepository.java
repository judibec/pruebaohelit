package com.ohelit.interview.createAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ohelit.interview.createAPI.models.ClientesProductos;

@Repository
public interface ClientesProductosRepository extends CrudRepository<ClientesProductos,Integer>{
    
}
