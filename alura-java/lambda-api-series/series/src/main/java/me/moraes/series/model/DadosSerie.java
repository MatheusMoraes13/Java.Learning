package me.moraes.series.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
Classe record para receber os dados retornados pela api e mapear-los para uma classe dentro do projeto, conforme
os dados que serão utilizados pelo projeto. Então utilizamos o JsonIgnoreProperties para que os dados que não estejam
mapeados sejam ignorados.
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie (@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao){
}
