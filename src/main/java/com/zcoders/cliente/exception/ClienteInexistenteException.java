package com.zcoders.cliente.exception;

public class ClienteInexistenteException extends RuntimeException{

    public ClienteInexistenteException() {
        super("Não encontramos cliente cadastrado em nossa base de dados com esse id");
    }
}
