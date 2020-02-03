package com.delivery.megafood.domain.estado.entity;

import com.delivery.megafood.domain.cidade.model.Cidade;
import com.delivery.megafood.domain.util.EntidadeAbstrata;
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
