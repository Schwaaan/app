package com.study.appbackend.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    PAGO(2, "Pago"),
    CANCELADO(3, "Cancelado");

    private int codigo;
    private String descricao;

}
