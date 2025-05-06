package models;

public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;
    private String tipoConta;

    public Conta (int agencia, int numero, double saldo, String tipoConta){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
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

    public String getTipoConta() {
        return tipoConta;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "\nConta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", tipoConta=" + tipoConta
                + "]";
    }
    
}
