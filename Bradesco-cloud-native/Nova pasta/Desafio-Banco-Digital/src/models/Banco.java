package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contasList;

    public Banco(){
        this.contasList = new ArrayList<>();
    }

    public void criarContaCorrente(int agencia, int numero){
        contasList.add(new ContaCorrente(agencia, numero));
    }

    public void criarContaPoupanca(int agencia, int numero){
        contasList.add(new ContaPoupanca(agencia, numero));
    }
}
