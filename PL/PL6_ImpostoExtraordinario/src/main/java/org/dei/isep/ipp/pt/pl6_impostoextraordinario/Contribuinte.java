package org.dei.isep.ipp.pt.pl6_impostoextraordinario;

public abstract class Contribuinte {

    private String nome;
    private Morada morada;
    private static int numContr;

    public Contribuinte(String nome, Morada morada) {
        this.nome = nome;
        this.morada = morada;
        numContr++;
    }

    public String getNome() {
        return nome;
    }

    public static int getNumContr() {
        return numContr;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\n" + morada;
    }

    public abstract double calcularTaxa();

}
