package com.delivery.megafood.domain.cozinha.repository;

import com.delivery.megafood.domain.cozinha.entity.Cozinha;

import java.util.List;

public interface CozinhaRespository {

    List<Cozinha> listar();

    Cozinha buscar(Long id);

    Cozinha salvar (Cozinha cozinha);

    void remover(Cozinha cozinha);

}
