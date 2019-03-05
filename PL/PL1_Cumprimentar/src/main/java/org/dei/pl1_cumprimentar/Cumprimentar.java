package org.dei.pl1_cumprimentar;

public class Cumprimentar {

    private String nome;
    private int idade;

    private static final String NOME_POR_OMISSAO = "SEM NOME";
    private static final int IDADE_POR_OMISSAO = 0;

    /**
     * 
     * Construtor com todos os parametros (nome e idade)
     * 
     * @param nome
     * @param idade 
     */
    public Cumprimentar(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    /**
     * 
     * Construtor sem parametros
     * 
     */
     public Cumprimentar() {
        this.idade = IDADE_POR_OMISSAO;
        this.nome = NOME_POR_OMISSAO;
    }
    
     
     /**
      * 
      * Construtor apenas com a idade como parametro
      * 
      * @param idade 
      */
    public Cumprimentar(int idade) {
        this.idade = idade;
        this.nome = NOME_POR_OMISSAO;
    }

    /**
     * 
     * Construtor apenas com o nome como parametro
     * 
     * @param nome 
     */
    public Cumprimentar(String nome) {
        this.nome = nome;
        this.idade = IDADE_POR_OMISSAO;
    }
    
    /**
     * 
     * Método para definir o valor da variável nome
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * Método para definir o valor da variável idade
     * 
     * @param idade 
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * 
     * Método para obter o valor da variável nome
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * 
     * Método para obter o valor da variável idade
     * 
     * @return 
     */
    public int getIdade(){
        return idade;
    }
    
    /**
     * 
     * Retorna uma string com os dados da pessoa
     * 
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%s tem %d anos", nome, idade);
    }
}
