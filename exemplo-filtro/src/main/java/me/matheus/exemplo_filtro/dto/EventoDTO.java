package me.matheus.exemplo_filtro.dto;

import me.matheus.exemplo_filtro.model.TipoEvento;

import java.time.LocalDate;

public record EventoDTO(long id, String nome, String imagem, String descricao, LocalDate data, TipoEvento tipoEvento) {
}
