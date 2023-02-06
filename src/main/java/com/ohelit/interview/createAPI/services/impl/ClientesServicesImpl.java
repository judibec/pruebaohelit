package com.ohelit.interview.createAPI.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohelit.interview.createAPI.models.Clientes;
import com.ohelit.interview.createAPI.repositories.ClientesRepository;
import com.ohelit.interview.createAPI.services.ClientesServices;

@Service
public class ClientesServicesImpl implements ClientesServices{
    @Autowired
    ClientesRepository clientesRepository;

    @Override
    public List<Clientes> getClientes() {
        return (List<Clientes>) clientesRepository.findAll();
    }

    @Override
    public Optional<Clientes> getClientesById(int id) {
        return clientesRepository.findById(id);
    }

    @Override
    public void createCliente(Clientes clientes) {
        List<Clientes> clientesTotales = (List<Clientes>) clientesRepository.findAll();
        clientes.setId(clientesTotales.size()+1);
        clientesRepository.save(clientes);
        
    }

    @Override
    public void deleteCliente(int id) {
        clientesRepository.deleteById(id);
        
    }

    @Override
    public boolean updateCliente(int id, long telefono) {
        if(clientesRepository.existsById(id)){
            Optional<Clientes> cliente = clientesRepository.findById(id);
            String nombre = cliente.get().getNombre();
            String correo = cliente.get().getCorreo();
            clientesRepository.save(new Clientes(id,nombre,correo,telefono));
            return true;
        }else{
            return false;
        }
    }
}
