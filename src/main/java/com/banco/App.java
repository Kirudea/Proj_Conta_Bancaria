package com.banco;

import java.util.Scanner;

import com.banco.models.ContaCorrente;
import com.banco.models.ContaPoupanca;
import com.banco.models.Correntista;

public class App {
    final String[] menu = {
        "1 - Cadastrar correntista\n"+
        "2 - Listar correntistas\n"+
        "3 - Selecionar \n", 
        
        "1 - Criar conta poupança\n"+
        "2 - Criar conta corrente\n"+
        "3 - Listar contas\n"+
        "4 - Selecionar conta\n",

        "1 - Fazer deposito\n"+
        "2 - Fazer saque\n"+
        "3 - Aplicar juros\n"+
        "4 - Mudar limite"
    };

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        Correntista c;

        try {
            while(true) {
                
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
