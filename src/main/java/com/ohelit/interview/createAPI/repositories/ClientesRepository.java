package com.ohelit.interview.createAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ohelit.interview.createAPI.models.Clientes;

@Repository
public interface ClientesRepository extends CrudRepository<Clientes,Integer>{
    
}
