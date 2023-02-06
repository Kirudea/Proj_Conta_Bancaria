package com.banco;

import java.util.Scanner;

import com.banco.models.ContaCorrente;
import com.banco.models.ContaPoupanca;
import com.banco.models.Correntista;

public class App {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        Correntista c;

        try {
            while(true) {
                System.out.print("Cadastrar correntista? (s/n) ");
                if(scan.next().charAt(0) == 's'){
                    c = new Correntista(scan.nextLine(), scan.nextLine());
                    c.setEndereco(scan.nextLine());
                    c.setProfissao(scan.nextLine());
                }

                System.out.print("Criar conta p/ o correntista? (s/n) ");
                if(scan.next().charAt(0) == 's'){
                    System.out.print("Criar conta poupança p/ o correntista? (s/n) ");
                    if(scan.next().charAt(0) == 's'){
                        
                    }else{
                        System.out.print("Criar conta corrente p/ o correntista? (s/n) ");
                        if(scan.next().charAt(0) == 's'){
                            
                        }
                    }
                }

                

            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
