package me.matheus.exemplo_filtro.service;

import me.matheus.exemplo_filtro.model.Evento;
import me.matheus.exemplo_filtro.model.TipoEvento;
import me.matheus.exemplo_filtro.repository.EventoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository){
        this.eventoRepository = eventoRepository;
    }

    public ResponseEntity cadastrarEvento(Evento evento){

        eventoRepository.save(evento);

        return ResponseEntity.ok().body("Evento Cadastrado com sucesso");
    }

    public ResponseEntity<List<Evento>> filtrarPorTipo(TipoEvento tipoEvento){
        List<Evento> eventosFiltrados = eventoRepository.findByTipoEvento(tipoEvento);

        if (eventosFiltrados.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(eventosFiltrados);
    }

    public ResponseEntity<List<Evento>> todosEventos(){
        List<Evento> todosEventos = eventoRepository.findAll();

        if (todosEventos.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(todosEventos);
    }

}
