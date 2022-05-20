package com.study.appbackend.services.impl;

import com.study.appbackend.domain.Categoria;
import com.study.appbackend.repositories.CategoriaRepository;
import com.study.appbackend.services.CategoriaInterface;
import com.study.appbackend.utils.AssertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaInterface {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria findById(Integer id) throws RuntimeException {
        return AssertUtils.found(categoriaRepository.findById(id), "Categoria não encontrada");
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }
}
