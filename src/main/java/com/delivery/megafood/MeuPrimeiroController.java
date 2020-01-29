package com.delivery.megafood;

import com.delivery.megafood.modelo.Cliente;
import com.delivery.megafood.service.AtivacaoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {


    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        Cliente cliente = new Cliente("Joao", "joao@ggmail.com" , "1231521");
        ativacaoClienteService.ativar(cliente);

        return "hello!";
    }
}
