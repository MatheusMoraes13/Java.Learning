package models;

public abstract class Conta {
    private final int agencia;
    private final int numero;
    private double saldo;
    private final String tipoConta;

    public Conta (int agencia, int numero, String tipoConta){
        this.agencia = agencia;
        this.numero = numero;
        this.tipoConta = tipoConta;
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

    public String getTipoConta(){
        return tipoConta;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino){
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
