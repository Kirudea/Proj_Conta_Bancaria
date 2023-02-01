package com.banco.models;

import com.banco.interfaces.Conta;

public class ContaPoupanca implements Conta {
    private double saldo = 0;
    private double juros;

    public ContaPoupanca(double juros){
        this.juros = juros;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public double getJuros() {
        return juros;
    }

    @Override
    public Boolean fazerDeposito(double valor_depositado) {
        saldo += valor_depositado;
        return true;
    }
    
    @Override
    public Boolean fazerRetirada(double valor_retirado) {
        saldo -= valor_retirado;
        return null;
    }
    
}
