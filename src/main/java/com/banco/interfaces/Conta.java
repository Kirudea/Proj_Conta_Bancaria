package com.banco.interfaces;

import java.lang.reflect.Constructor;

public interface Conta {
    public double getSaldo();
    public double getJuros();
    public Boolean fazerDeposito(double valor_depositado);
    public Boolean fazerRetirada(double valor_retirado);
}
