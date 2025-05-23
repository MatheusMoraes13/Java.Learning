package models;

abstract class Ingressos {
    protected Filme filme;
    protected float preco; 

    public String getFilmeIngresso() {
        return filme.getNome();
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
