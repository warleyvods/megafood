package com.delivery.megafood.api.cozinha.service;

import com.delivery.megafood.api.cozinha.entity.Cozinha;
import com.delivery.megafood.api.cozinha.repository.CozinhaRespository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRespository {

    @PersistenceContext
    EntityManager manager;

    @Override
    public List<Cozinha> listar() {
        return manager.createQuery("From Cozinha", Cozinha.class).getResultList();
    }

    @Override
    public Cozinha buscar(Long id) {
        return manager.find(Cozinha.class, id);
    }

    @Override
    @Transactional
    public Cozinha salvar(Cozinha cozinha) {
        return manager.merge(cozinha);
    }

    @Override
    @Transactional
    public void remover(Cozinha cozinha) {
        cozinha = buscar(cozinha.getId());
        manager.remove(cozinha);
    }
}
