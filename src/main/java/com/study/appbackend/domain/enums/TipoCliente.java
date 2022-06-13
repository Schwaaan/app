package com.study.appbackend.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private int codigo;
    private String descricao;

    public static TipoCliente getEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (TipoCliente x : TipoCliente.values()) {
            if (code.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Codigo de cliente inválido");
    }
}
