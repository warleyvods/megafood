package com.delivery.megafood.domain.cozinha.entity;

import com.delivery.megafood.domain.util.EntidadeAbstrata;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Cozinha extends EntidadeAbstrata {

    @Column(name = "nome_cozinha", nullable = false)
    private String nome;

}
