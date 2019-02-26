package org.dei.pl1_cumprimentar;

public class Cumprimentar {

    private String nome;
    private int idade;

    private static final String NOME_POR_OMISSAO = "SEM NOME";
    private static final int IDADE_POR_OMISSAO = 0;

    public Cumprimentar(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

     public Cumprimentar() {
        this.idade = IDADE_POR_OMISSAO;
        this.nome = NOME_POR_OMISSAO;
    }
    
    public Cumprimentar(int idade) {
        this.idade = idade;
        this.nome = NOME_POR_OMISSAO;
    }

    public Cumprimentar(String nome) {
        this.nome = nome;
        this.idade = IDADE_POR_OMISSAO;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public String toString() {
        return String.format("%s tem %d anos", nome, idade);
    }
}
