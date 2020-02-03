package com.delivery.megafood.api.formapagamento.entity;

import com.delivery.megafood.api.util.EntidadeAbstrata;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class FormaPagamento extends EntidadeAbstrata {

    private String descricao;

}
