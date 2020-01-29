package com.delivery.megafood.notificacao;

import com.delivery.megafood.modelo.Cliente;

public interface Notificador {
    public void notificar(Cliente cliente, String mensagem);
}
