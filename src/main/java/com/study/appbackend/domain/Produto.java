package com.study.appbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;

    private Set<ItemPedido> itens = new HashSet<>();


    public List<Pedido> pedidos() {
        List<Pedido> pedidosList = new ArrayList<>();

        for (ItemPedido itemPedido : this.itens) {
            pedidosList.add(itemPedido.getPedido());
        }

        return pedidosList;
    }

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA",
            joinColumns = @JoinColumn(name = "produto_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias = new ArrayList<>();

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
