package models;

public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public Conta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void trasferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Agencia: "+ agencia);
        System.out.println("Numero: "+ numero);
        System.out.println("Saldo: R$"+ saldo);
    }

    @Override
    public String toString() {
        return "\nConta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
    }
    
}
