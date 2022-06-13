package com.study.appbackend.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    PAGO(2, "Pago"),
    CANCELADO(3, "Cancelado");

    private int codigo;
    private String descricao;

    public static EstadoPagamento getEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (code.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Codigo do estado de pagamento inválido");
    }
}
