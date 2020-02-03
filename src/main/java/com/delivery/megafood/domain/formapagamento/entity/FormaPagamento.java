package com.delivery.megafood.domain.formapagamento.entity;

import com.delivery.megafood.domain.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class FormaPagamento extends EntidadeAbstrata {

    private String descricao;

}
