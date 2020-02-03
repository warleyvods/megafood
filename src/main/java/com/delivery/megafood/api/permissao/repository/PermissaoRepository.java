package com.delivery.megafood.api.permissao.repository;

import com.delivery.megafood.api.permissao.entity.Permissao;

import java.util.List;

public interface PermissaoRepository {

    List<Permissao> listar();
    Permissao buscar(Long id);
    Permissao salvar(Permissao permissao);
    void excluir(Permissao permissao);

}
