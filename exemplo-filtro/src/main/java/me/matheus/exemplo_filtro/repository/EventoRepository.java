package me.matheus.exemplo_filtro.repository;

import java.util.List;
import me.matheus.exemplo_filtro.model.Evento;
import me.matheus.exemplo_filtro.model.TipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, String> {

    List<Evento> findByTipoEvento(TipoEvento tipoEvento);

}
