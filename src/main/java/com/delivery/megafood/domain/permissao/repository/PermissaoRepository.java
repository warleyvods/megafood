package com.delivery.megafood.domain.permissao.repository;

import com.delivery.megafood.domain.permissao.entity.Permissao;

import java.util.List;

public interface PermissaoRepository {

    List<Permissao> listar();
    Permissao buscar(Long id);
    Permissao salvar(Permissao permissao);
    void excluir(Permissao permissao);

}
