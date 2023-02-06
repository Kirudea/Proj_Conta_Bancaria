package com.banco.models;

public class ContaP extends Conta {

    public ContaP(int numero, int agencia) {
        super(numero, agencia);
    }
    
    @Override
    public Boolean fazerSaque(double valor) {
        if(valor > getSaldo())
            return false;
        return super.fazerSaque(valor);
    }

}
