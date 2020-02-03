package com.delivery.megafood.api.cidade.repository;

import com.delivery.megafood.api.cidade.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> listar ();
    Cidade buscar(Long id);
    Cidade salvar(Cidade cidade);
    void excluir(Cidade cidade);

}
