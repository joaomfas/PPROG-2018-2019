package org.dei.isep.ipp.pt.pl12_exposicao;

public class Quadro implements Comparable<Quadro> {

    private String designacao;
    private String nomeAutor;
    private double anoCriacao;

    public Quadro(String designacao, String nomeAutor, double anoCriacao) {
        this.designacao = designacao;
        this.nomeAutor = nomeAutor;
        this.anoCriacao = anoCriacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutos) {
        this.nomeAutor = nomeAutos;
    }

    public double getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(double anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        Quadro outroQuadro = (Quadro) outroObjeto;
        return this.getAnoCriacao() == outroQuadro.getAnoCriacao() && this.getDesignacao().equals(outroQuadro.getDesignacao()) && this.getNomeAutor().equals(outroQuadro.getNomeAutor());
    }

    @Override
    public int compareTo(Quadro outroQuadro) {
        String autor = this.getNomeAutor();
        String outroAutor = outroQuadro.getNomeAutor();
        
        return autor.compareTo(outroAutor);
    }

    @Override
    public String toString() {
        return "\nDesignacao: " + designacao + "\nNome do Autor: " + nomeAutor + "\nAno de Criacao: " + anoCriacao;
    }
}
