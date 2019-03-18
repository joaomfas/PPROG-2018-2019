package org.dei.isep.ipp.pt.pl7_contadoresdomesticos;

public abstract class Contador {

    private String id;
    private String nome;
    private int consumo;
    private int consumo2;

    public Contador() {

    }

    public Contador(String nome, int consumo) {
        this.nome = nome;
        this.id = init();
        this.consumo = consumo;
    }

    public Contador(String nome, int consumoVazio, int consumoForaVazio) {
        this.nome = nome;
        this.id = init();
        this.consumo = consumoVazio;
        this.consumo2 = consumoForaVazio;
    }

    public String getId() {
        return id;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getConsumo2() {
        return consumo2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String init();

    public abstract double calcConsumoMesActual();

    @Override
    public String toString() {
        return String.format("Nome: %s%nID: %s%nConsumo: %s", nome, id, consumo);
    }
}
