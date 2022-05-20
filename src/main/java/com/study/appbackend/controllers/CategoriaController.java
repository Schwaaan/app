package com.study.appbackend.controllers;

import com.study.appbackend.domain.Categoria;
import com.study.appbackend.services.CategoriaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaInterface categoriaInterface;

    @GetMapping
    public List<Categoria> getAll() {
        return categoriaInterface.findAll();
    }

    @GetMapping(path = "/{id}")
    public Categoria getById(@PathVariable(value = "id") Integer id) {
        return categoriaInterface.findById(id);
    }
}
