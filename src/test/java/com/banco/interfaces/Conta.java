package com.banco.interfaces;

public interface Conta {
    public Boolean fazerDeposito(double valor);
    public Boolean fazerSaque(double valor);
    public Boolean aplicarJuros(double juros);
}
