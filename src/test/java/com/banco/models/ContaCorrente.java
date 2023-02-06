package com.banco.models;

import com.banco.interfaces.Conta;

public class ContaCorrente implements Conta {
    private int numero;
    private int agencia;
    private int saldo = 0;
    private double limite = 0;

    public ContaCorrente(int numero, int agencia) {
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
    
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public Boolean fazerDeposito(double valor) {
        if(valor < 0)  
            return false;
        saldo += valor;
        return true;
    }

    @Override
    public Boolean fazerSaque(double valor) {
        if(valor < 0 || valor > getSaldo() + limite)
            return false;
        saldo -= valor;
        return true;
    }
    
    @Override
    public Boolean aplicarJuros(double juros){
        juros /= 100;
        if(juros < 0 || juros > 1 || saldo > 0)
            return false;
        saldo *= 1-juros;
        return true;
    }
}
