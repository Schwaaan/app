package com.study.appbackend.services;

import com.study.appbackend.domain.Categoria;

import java.util.List;

public interface CategoriaInterface {

    Categoria findById(Integer id);

    List<Categoria> findAll();
}
