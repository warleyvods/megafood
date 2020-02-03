package com.delivery.megafood.api.permissao.entity;

import com.delivery.megafood.api.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Permissao extends EntidadeAbstrata {

    private String nome;
    private String descricao;

}
