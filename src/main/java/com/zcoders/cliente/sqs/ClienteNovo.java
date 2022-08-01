package com.zcoders.cliente.sqs;

import com.zcoders.cliente.model.CategoriaEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClienteNovo {

    private Long id;

    private String nome;

    private String email;

    private LocalDate nascimento;

    private LocalDateTime incluidoEm;

    private LocalDateTime atualizadoEm;

    public ClienteNovo(Long id, String nome, String email, LocalDate nascimento, LocalDateTime incluidoEm, LocalDateTime atualizadoEm) {
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

    @Override
    public String toString() {
        return "ClienteNovo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nascimento=" + nascimento +
                ", incluidoEm=" + incluidoEm +
                ", atualizadoEm=" + atualizadoEm +
                '}';
    }
}
