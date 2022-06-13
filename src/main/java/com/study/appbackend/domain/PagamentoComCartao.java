package com.study.appbackend.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("pagamentoComCartao")
@Entity
public class PagamentoComCartao extends Pagamento {

    private static final long serialVersionUID = 1L;
    private Integer numeroDeParcelas;

}
