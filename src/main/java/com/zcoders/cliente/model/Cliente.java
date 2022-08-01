package com.zcoders.cliente.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    @Enumerated(EnumType.STRING)
    private CategoriaEnum categoria;

    private LocalDate nascimento;

    private LocalDateTime incluidoEm;

    private LocalDateTime atualizadoEm;

    public Cliente() {
    }

    public Cliente(String nome, String email, LocalDate nascimento, CategoriaEnum categoria) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.incluidoEm = LocalDateTime.now();
        this.atualizadoEm = LocalDateTime.now();
        this.categoria = categoria;
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

    public CategoriaEnum getCategoria() {
        return categoria;
    }
}
