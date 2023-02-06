package com.ohelit.interview.createAPI.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohelit.interview.createAPI.repositories.ClientesProductosRepository;
import com.ohelit.interview.createAPI.services.ClientesProductosServices;

@Service
public class ClientesProductosServicesImpl implements ClientesProductosServices{
    @Autowired
    ClientesProductosRepository clientesProductosRepository;
}
