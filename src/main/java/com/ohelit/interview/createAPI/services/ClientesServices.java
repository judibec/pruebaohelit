package com.ohelit.interview.createAPI.services;

import java.util.List;
import java.util.Optional;

import com.ohelit.interview.createAPI.models.Clientes;

public interface ClientesServices {
    List<Clientes> getClientes();

    Optional<Clientes> getClientesById(int id);

    void createCliente(Clientes clientes);

    void deleteCliente(int id);

    boolean updateCliente (int id,long telefono);
}
