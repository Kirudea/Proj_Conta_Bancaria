package com.banco;

import com.banco.models.ContaCorrente;
import com.banco.models.ContaPoupanca;
import com.banco.models.Correntista;

public class App {
    public static void main( String[] args ) {
        Correntista cor = new Correntista("111.111.111-11", "Kildere");

        ContaCorrente cc = new ContaCorrente(1, 1, cor);
        ContaPoupanca cp = new ContaPoupanca(2, 1, cor);
        
        System.out.print("\n---CORRENTE---\n");
        cc.setLimite(100);
        System.out.printf("Saque: %b\n", cc.fazerSaque(10));
        System.out.printf("Juros: %b\n", cc.aplicarJuros(10));
        System.out.printf("Deposito: %b\n", cc.fazerDeposito(20));
        System.out.printf("Saldo Final: %.2f\n\n", cc.getSaldo());
        
        System.out.print("---POUPANÇA---\n");
        System.out.printf("Deposito: %b\n", cp.fazerDeposito(10));
        System.out.printf("Saque: %b\n", cp.fazerSaque(20));
        System.out.printf("Juros: %b\n", cp.aplicarJuros(10));
        System.out.printf("Saldo Final: %.2f\n\n", cp.getSaldo());
    }
}
