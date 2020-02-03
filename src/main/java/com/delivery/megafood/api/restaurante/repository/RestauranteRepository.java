package com.delivery.megafood.api.restaurante.repository;

import com.delivery.megafood.api.restaurante.entity.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();

    Restaurante buscar(Long id);

    Restaurante salvar (Restaurante restaurante);

    void remover(Restaurante restaurante);

}
