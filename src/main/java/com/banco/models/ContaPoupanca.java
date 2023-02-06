package com.banco.models;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, int agencia, Correntista correntista) {
        super(numero, agencia, correntista);
    }
    
    @Override
    public Boolean fazerSaque(double valor) {
        if(valor > getSaldo())
            return false;
        return super.fazerSaque(valor);
    }
}