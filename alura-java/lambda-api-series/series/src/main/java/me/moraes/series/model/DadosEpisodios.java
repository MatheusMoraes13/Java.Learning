package me.moraes.series.model;


/*
Classe record para receber os dados referentes aos episódios, conforme o que será utilizado na aplicação. Também
utilizaremos o JsonIgnoreProperties. Veja também, que utilizamos o JsonAlias para adicionarmos um "apelido" a
propriedade, fazendo com que possamos mapear dos dados da API para o nome de variável que preferirmos conforme o padrão
 adotado pelo projeto.
 */

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodios (@JsonAlias("Title") String titulo,
                              @JsonAlias("Episode") Integer numero,
                              @JsonAlias("imdbRating") String avaliacao,
                              @JsonAlias("Released") String dataLancamento){
}
