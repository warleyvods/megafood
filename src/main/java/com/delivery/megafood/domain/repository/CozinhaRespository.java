package com.delivery.megafood.domain.repository;

import com.delivery.megafood.domain.entity.Cozinha;
import com.delivery.megafood.domain.entity.Restaurante;

import java.util.List;

public interface CozinhaRespository {

    List<Cozinha> listar();

    Cozinha buscar(Long id);

    Cozinha salvar (Cozinha cozinha);

    void remover(Cozinha cozinha);

}
