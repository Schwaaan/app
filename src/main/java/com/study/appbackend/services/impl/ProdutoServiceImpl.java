package com.study.appbackend.services.impl;

import com.study.appbackend.domain.Produto;
import com.study.appbackend.repositories.ProdutoRepository;
import com.study.appbackend.services.ProdutoInterface;
import com.study.appbackend.utils.AssertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoInterface {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto findById(Integer id) {
        return AssertUtils.found(produtoRepository.findById(id), "Not Found");
    }

    @Override
    public Produto createProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}
