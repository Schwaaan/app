package com.study.appbackend.services;

import com.study.appbackend.domain.Produto;

import java.util.List;

public interface ProdutoInterface {

    List<Produto> findAll();

    Produto findById(Integer id);

    Produto createProduto(Produto produto);

}
