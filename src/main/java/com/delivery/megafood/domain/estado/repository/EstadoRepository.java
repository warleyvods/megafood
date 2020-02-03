package com.delivery.megafood.domain.estado.repository;

import com.delivery.megafood.domain.estado.entity.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> listar();
    Estado buscar(Long id);
    Estado salvar(Estado estado);
    void excluir(Estado estado);

}
