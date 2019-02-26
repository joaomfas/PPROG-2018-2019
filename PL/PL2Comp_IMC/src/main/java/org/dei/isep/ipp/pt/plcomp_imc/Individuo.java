package org.dei.isep.ipp.pt.plcomp_imc;

public class Individuo {

    String nome;
    Morada morada;
    double peso;
    double altura;
    int idade;

    public Individuo(String nome, Morada morada, double peso, double altura, int idade) {
        this.nome = nome;
        this.morada = morada;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Morada getMorada() {
        return morada;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "%nNome: " + nome + morada + "%nPeso:" + peso + " kg" + "%nAltura: " + altura + " m" + "%nIdade: " + idade;
    }
}
