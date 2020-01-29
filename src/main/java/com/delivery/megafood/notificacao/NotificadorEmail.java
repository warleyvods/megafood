package com.delivery.megafood.notificacao;

import com.delivery.megafood.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    private Notificador notificador;

    public NotificadorEmail(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atraves do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
