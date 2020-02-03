package com.delivery.megafood.domain.restaurante.repository;

import com.delivery.megafood.domain.restaurante.entity.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();

    Restaurante buscar(Long id);

    Restaurante salvar (Restaurante restaurante);

    void remover(Restaurante restaurante);

}
