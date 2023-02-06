package com.banco.models;

class Conta {
    private int numero;
    private int agencia;
    private Correntista correntista;
    private int saldo = 0;

    public Conta(int numero, int agencia, Correntista correntista) {
        this.numero = numero;
        this.agencia = agencia;
        this.correntista = correntista;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public Boolean fazerDeposito(double valor) {
        saldo += valor;
        return true;
    }

    public Boolean fazerSaque(double valor) {
        saldo -= valor;
        return true;
    }

    public Boolean aplicarJuros(double juros){
        saldo *= 1+(juros/100);
        return true;
    }
}
