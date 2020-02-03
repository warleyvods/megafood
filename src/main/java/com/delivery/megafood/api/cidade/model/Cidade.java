package com.delivery.megafood.api.cidade.model;

import com.delivery.megafood.api.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Cidade extends EntidadeAbstrata {

    private String nome;

}
