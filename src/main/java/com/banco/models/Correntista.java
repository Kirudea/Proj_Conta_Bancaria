package com.banco.models;

public class Correntista {
    public enum Profissao  {
        PROFESSOR, ADVOGADO, MILITAR;
    }
    
    private String cpf;
    private String nome;
    private String endereco;
    private Profissao profissao;
}
