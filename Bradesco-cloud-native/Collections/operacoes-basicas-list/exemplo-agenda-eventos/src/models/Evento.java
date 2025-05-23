package models;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String nomeAtracao){
        this.nome = nome;
        this.atracao = nomeAtracao;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "\nEvento [nome=" + nome + ", nomeAtracao=" + atracao + "]";
    }
}
