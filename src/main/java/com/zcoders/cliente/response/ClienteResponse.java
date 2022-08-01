package com.zcoders.cliente.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.zcoders.cliente.model.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClienteResponse {

    private Long id;

    private String nome;

    private String email;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate nascimento;

    @JsonFormat(pattern = "dd-MM-yyyy HH:MM:ss")
    private LocalDateTime incluidoEm;

    @JsonFormat(pattern = "dd-MM-yyyy HH:MM:ss")
    private LocalDateTime atualizadoEm;

    public ClienteResponse(Long id, String nome, String email, LocalDate nascimento, LocalDateTime incluidoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.incluidoEm = incluidoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public LocalDateTime getIncluidoEm() {
        return incluidoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public static ClienteResponse build(Cliente cliente) {
        return new ClienteResponse(cliente.getId(),
                cliente.getNome(), cliente.getEmail(),
                cliente.getNascimento(), cliente.getIncluidoEm(),
                cliente.getAtualizadoEm());

    }
}
