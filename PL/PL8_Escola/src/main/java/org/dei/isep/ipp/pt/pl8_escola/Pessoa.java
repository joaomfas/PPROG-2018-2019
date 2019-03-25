package org.dei.isep.ipp.pt.pl8_escola;

public class Pessoa {

    private String nome;

    private String email;

    private int nif;

    public Pessoa(String nome, String email, int nif) {
        this.nome = nome;
        this.email = email;
        this.nif = nif;
    }

    public Pessoa() {
        this("Sem nome", "Sem E-Mail", 999999999);
    }

    /**
     * @return nome da Pessoa
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @return email da Pessoa
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return nif da Pessoa
     */
    public int getNif() {
        return this.nif;
    }

    /**
     * @param nome novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param email novo email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param nif novo nif
     */
    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s  E-Mail: %s  NIF: %d", this.nome, this.email, this.nif);
    }
}
