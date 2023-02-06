package com.banco.models;

import com.banco.interfaces.Conta;

public class ContaPoupanca implements Conta {
    private int numero;
    private int agencia;
    private int saldo = 0;

    public ContaPoupanca(int numero, int agencia) {
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
    
    @Override
    public Boolean fazerDeposito(double valor) {
        if(valor < 0)  
            return false;
        saldo += valor;
        return true;
    }

    @Override
    public Boolean fazerSaque(double valor) {
        if(valor < 0 || saldo - valor < 0)
            return false;
        saldo -= valor;
        return true;
    }

    @Override
    public Boolean aplicarJuros(double juros){
        juros /= 100;
        if(juros < 0)
            return false;
        saldo *= 1+juros;
        return true;
    }
}
