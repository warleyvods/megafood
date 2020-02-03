package com.delivery.megafood.domain.permissao.entity;

import com.delivery.megafood.domain.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Permissao extends EntidadeAbstrata {

    private String nome;
    private String descricao;

}
