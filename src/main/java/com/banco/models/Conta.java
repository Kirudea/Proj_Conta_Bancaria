package com.banco.models;

public class Conta {
    private int numero;
    private int agencia;
    private int saldo = 0;

    public Conta(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public Boolean fazerDeposito(double valor) {
        saldo += valor;
        return true;
    }

    public Boolean fazerSaque(double valor) {
        saldo -= valor;
        return true;
    }

    public Boolean aplicarJuros(double juros){
        saldo *= 1+(juros/100);
        return true;
    }
}
