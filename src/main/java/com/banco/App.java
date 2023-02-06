package com.banco;

import com.banco.models.ContaCorrente;
import com.banco.models.ContaPoupanca;
import com.banco.models.Correntista;

public class App {
    public static void main( String[] args ) {
        Correntista cor = new Correntista("111.111.111-11", "Kildere");

        ContaCorrente cc = new ContaCorrente(1, 1, cor);
        ContaPoupanca cp = new ContaPoupanca(2, 1, cor);
        
        cc.fazerDeposito(20);
        cc.setLimite(100);
        cc.fazerSaque(10);
        cc.aplicarJuros(10);

        cp.fazerSaque(10);
        cp.fazerDeposito(20);
        cp.aplicarJuros(10);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
