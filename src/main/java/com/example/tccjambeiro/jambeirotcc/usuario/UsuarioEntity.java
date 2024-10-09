package com.example.tccjambeiro.jambeirotcc.usuario;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "tabUsuarioJack")
@Entity
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "serie")
    private String serie;
}