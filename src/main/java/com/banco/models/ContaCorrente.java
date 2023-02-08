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
        return valor <= getSaldo() + limite && super.fazerSaque(valor);
    }

    @Override
    public Boolean aplicarJuros(double juros) {
        return getSaldo() < 0 && super.aplicarJuros(juros);
    }
}
