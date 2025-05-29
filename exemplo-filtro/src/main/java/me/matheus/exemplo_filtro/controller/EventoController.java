package me.matheus.exemplo_filtro.controller;

import me.matheus.exemplo_filtro.model.Evento;
import me.matheus.exemplo_filtro.model.TipoEvento;
import me.matheus.exemplo_filtro.service.EventoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    EventoService eventoService;

    public  EventoController(EventoService eventoService){
        this.eventoService = eventoService;
    }

    @GetMapping
    public ResponseEntity todosEventos(){
        return eventoService.todosEventos();
    }

    @GetMapping("/{tipoEvento}")
    public  ResponseEntity eventoFiltradoTipo(@PathVariable TipoEvento tipoEvento){
        return eventoService.filtrarPorTipo(tipoEvento);
    }

    @PostMapping
    public ResponseEntity cadastrarEvento(@RequestBody Evento evento){
        return eventoService.cadastrarEvento(evento);
    }

}
