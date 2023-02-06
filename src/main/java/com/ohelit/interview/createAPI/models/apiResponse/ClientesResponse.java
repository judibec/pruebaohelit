package com.ohelit.interview.createAPI.models.apiResponse;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.ohelit.interview.createAPI.models.Clientes;

public class ClientesResponse {
    @JsonProperty(value = "clientes")
    private List<Clientes> clientes;

    public ClientesResponse() {
    }


    public ClientesResponse(List<Clientes> clientes) {
        this.clientes = clientes;
    }

    public List<Clientes> getClientes() {
        return this.clientes;
    }

    public void setClientes(List<Clientes> clientes) {
        this.clientes = clientes;
    }
    
}
