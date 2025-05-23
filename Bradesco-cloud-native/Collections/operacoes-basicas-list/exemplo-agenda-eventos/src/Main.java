import java.time.LocalDate;
import java.time.Month;

import models.*;

public class Main {
    public static void main(String[] args) throws Exception {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY,10), "Evento 3", "Atracao 3");

        agendaEventos.exibirAgenda();
    }
}