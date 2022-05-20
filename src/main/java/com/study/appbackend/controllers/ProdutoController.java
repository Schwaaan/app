package com.study.appbackend.controllers;

import com.study.appbackend.domain.Produto;
import com.study.appbackend.services.ProdutoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoInterface produtoInterface;


    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoInterface.createProduto(produto);
    }

    @GetMapping
    public List<Produto> getAll() {
        return produtoInterface.findAll();
    }

    @GetMapping(path = "/{id}")
    public Produto getById(@PathVariable(value = "id") Integer id) {
        return produtoInterface.findById(id);
    }
}
