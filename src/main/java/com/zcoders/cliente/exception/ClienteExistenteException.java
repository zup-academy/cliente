package com.zcoders.cliente.exception;

public class ClienteExistenteException extends RuntimeException{

    public ClienteExistenteException() {
        super("Já possuímos um cliente cadastrado em nossa base de dados com esse mesmo e-mail");
    }
}
