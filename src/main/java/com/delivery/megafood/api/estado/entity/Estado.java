package com.delivery.megafood.api.estado.entity;

import com.delivery.megafood.api.cidade.model.Cidade;
import com.delivery.megafood.api.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Estado extends EntidadeAbstrata {

    private String nome;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;
}
