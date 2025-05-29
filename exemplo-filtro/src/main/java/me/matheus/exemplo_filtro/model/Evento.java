package me.matheus.exemplo_filtro.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String nome;
    @Column(nullable = false)
    String imagem;
    @Column(nullable = false)
    String descricao;
    @Column(nullable = false)
    LocalDate data;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    TipoEvento tipoEvento;

}
