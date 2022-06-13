package com.study.appbackend.controllers;

import com.study.appbackend.domain.Cliente;
import com.study.appbackend.services.ClienteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/clientes")
public class ClienteController {

    @Autowired
    private ClienteInterface clienteInterface;

    @GetMapping
    public List<Cliente> getAll() {
        return clienteInterface.findAll();
    }

    @GetMapping(path = "/{id}")
    public Cliente getById(@PathVariable(value = "id") Integer id) {
        return clienteInterface.findById(id);
    }
}
