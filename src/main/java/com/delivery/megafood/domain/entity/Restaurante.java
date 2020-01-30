package com.delivery.megafood.domain.entity;

import com.delivery.megafood.domain.util.EntidadeAbstrata;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Restaurante extends EntidadeAbstrata {

    private String nome;

    @Column(name = "taxa_frete")
    private BigDecimal taxaFrete;

    @ManyToOne
    private Cozinha cozinha;

}
