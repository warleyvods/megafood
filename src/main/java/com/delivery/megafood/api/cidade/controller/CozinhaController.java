package com.delivery.megafood.api.cidade.controller;


import com.delivery.megafood.api.cozinha.entity.Cozinha;
import com.delivery.megafood.api.cozinha.repository.CozinhaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRespository cozinhaRespository;

    @GetMapping
    public List<Cozinha> listar() {
        return cozinhaRespository.listar();
    }

}
