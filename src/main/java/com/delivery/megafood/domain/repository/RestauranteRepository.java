package com.delivery.megafood.domain.repository;

import com.delivery.megafood.domain.entity.Cozinha;
import com.delivery.megafood.domain.entity.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();

    Restaurante buscar(Long id);

    Restaurante salvar (Restaurante restaurante);

    void remover(Restaurante restaurante);

}
