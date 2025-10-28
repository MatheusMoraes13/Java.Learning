package me.moraes.series;

import me.moraes.series.model.DadosEpisodios;
import me.moraes.series.model.DadosSerie;
import me.moraes.series.service.ConsumoApi;
import me.moraes.series.service.ConveteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SeriesApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
        var json2 = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6585022c");
        System.out.println(json);
        ConveteDados conversor = new ConveteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        DadosEpisodios dadosEpisodios = conversor.obterDados(json, DadosEpisodios.class);
        System.out.println(dados);
        System.out.println("\n===========================\n");
        System.out.println(dadosEpisodios);
    }
}
