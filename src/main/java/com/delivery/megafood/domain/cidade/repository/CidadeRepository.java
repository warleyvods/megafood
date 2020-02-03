package com.delivery.megafood.domain.cidade.repository;

import com.delivery.megafood.domain.cidade.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> listar ();
    Cidade buscar(Long id);
    Cidade salvar(Cidade cidade);
    void excluir(Cidade cidade);

}
