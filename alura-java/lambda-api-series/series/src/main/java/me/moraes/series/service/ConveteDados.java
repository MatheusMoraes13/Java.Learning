package me.moraes.series.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConveteDados implements IConverteDados{
    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }
}
