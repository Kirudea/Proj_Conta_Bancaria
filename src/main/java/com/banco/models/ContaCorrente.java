package com.banco.models;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, int agencia, Correntista correntista) {
        super(numero, agencia, correntista);
        this.limite = 0;
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
        return super.aplicarJuros(juros);
    }
}
