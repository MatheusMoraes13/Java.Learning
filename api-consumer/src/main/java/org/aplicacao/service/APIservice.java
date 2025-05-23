package org.aplicacao.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aplicacao.dto.AddressDTO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIservice {

    AddressDTO addressDTO = new AddressDTO();

    public AddressDTO getAddres(String cep){
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();
            AddressDTO addressDto = mapper.readValue(response.body(), AddressDTO.class);

            addressDTO = addressDto;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return addressDTO;
    }
}
