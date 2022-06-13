package com.study.appbackend.services.impl;

import com.study.appbackend.domain.Cliente;
import com.study.appbackend.repositories.ClienteRepository;
import com.study.appbackend.services.ClienteInterface;
import com.study.appbackend.utils.AssertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteInterface {

    @Autowired
    private ClienteRepository ClienteRepository;

    @Override
    public Cliente findById(Integer id) throws RuntimeException {
        return AssertUtils.found(ClienteRepository.findById(id), "Cliente não encontrada");
    }

    @Override
    public List<Cliente> findAll() {
        return ClienteRepository.findAll();
    }
}
