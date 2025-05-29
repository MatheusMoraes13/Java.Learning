package me.matheus.exemplo_filtro.model;

public enum TipoEvento {
    SHOW("show"),
    PALESTRA("palestra"),
    WORKSHOP("workshop"),
    EXPOSICAO("exposicao");

    private String tipo;

    TipoEvento(String tipo){
        this.tipo = tipo;
    }

    public String getTipoEvento(){
        return tipo;
    }

}
