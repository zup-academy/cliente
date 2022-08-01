package com.zcoders.cliente.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.zcoders.cliente.model.CategoriaEnum;
import com.zcoders.cliente.model.Cliente;

import java.time.LocalDate;

public class ClienteRequest {

    private String nome;

    private String email;

    private CategoriaEnum categoria;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate nascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    public String getEmail() {
        return email;
    }

    public Cliente toModel() {
        return new Cliente(this.nome, this.email, this.nascimento, this.categoria);
    }
}
