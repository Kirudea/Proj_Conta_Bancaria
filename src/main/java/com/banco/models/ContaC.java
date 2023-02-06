package com.banco.models;

public class ContaC extends Conta {
    private double limite = 0;

    public ContaC(int numero, int agencia) {
        super(numero, agencia);
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public Boolean fazerSaque(double valor) {
        if(valor > getSaldo() + limite)
            return false;
        return super.fazerSaque(valor);
    }

    @Override
    public Boolean aplicarJuros(double juros) {
        if(juros < 0 || getSaldo() > 0)
            return false;
        return super.aplicarJuros(juros*(-1));
    }
}
