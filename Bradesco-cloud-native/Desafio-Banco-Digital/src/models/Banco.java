package models;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private String nome;
    private Map<Integer, Conta> contas;

    public Banco(){
        this.contas = new HashMap<Integer, Conta>();
    }

    public void criarContaCorrente(int numero, Conta conta){
        contas.put(numero, conta);
    }

    public void criarContaPoupanca(int numero, Conta conta){
        contas.put(numero, conta);
    }

    public Conta imprimirConta(int numero){
        return contas.get(numero);
    }
}
