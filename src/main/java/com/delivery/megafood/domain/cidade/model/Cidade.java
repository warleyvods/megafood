package com.delivery.megafood.domain.cidade.model;

import com.delivery.megafood.domain.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Cidade extends EntidadeAbstrata {

    private String nome;

}
