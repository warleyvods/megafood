package com.delivery.megafood.service;

import com.delivery.megafood.modelo.Cliente;
import com.delivery.megafood.notificacao.Notificador;
import com.delivery.megafood.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }


}
