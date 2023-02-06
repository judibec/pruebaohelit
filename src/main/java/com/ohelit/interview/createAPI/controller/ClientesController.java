package com.ohelit.interview.createAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ohelit.interview.createAPI.services.ClientesServices;

@RestController
@RequestMapping(value = "/cliente")
public class ClientesController {
    @Autowired
    ClientesServices clientesServices;
}
