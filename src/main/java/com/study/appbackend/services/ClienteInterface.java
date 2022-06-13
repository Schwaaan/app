package com.study.appbackend.services;

import com.study.appbackend.domain.Cliente;

import java.util.List;

public interface ClienteInterface {

    Cliente findById(Integer id);

    List<Cliente> findAll();
}
