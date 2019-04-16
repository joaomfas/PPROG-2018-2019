package org.dei.isep.ipp.pt.pl12_exposicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exposicao implements Comparable<Exposicao> {

    private String designacao;
    private double anoRealizacao;
    private List<Quadro> quadros = new ArrayList<>();

    public Exposicao(String designacao, double anoRealizacao) {
        this.designacao = designacao;
        this.anoRealizacao = anoRealizacao;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public double getAnoRealizacao() {
        return anoRealizacao;
    }

    public void setAnoRealizacao(double anoRealizacao) {
        this.anoRealizacao = anoRealizacao;
    }

    public boolean addQuadro(Quadro quadro) {
        return quadros.add(quadro);
    }

    public boolean removeQuadro(Quadro quadro) {
        return quadros.remove(quadro);
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        Exposicao outraExpo = (Exposicao) outroObjeto;

        return this.getAnoRealizacao() == outraExpo.getAnoRealizacao() && this.getDesignacao().equals(outraExpo.getDesignacao()) && this.quadros.equals(outraExpo.quadros);
    }

    @Override
    public String toString() {
        Collections.sort(quadros);
        return "\nDesignacao: " + designacao + "\nAno de Realizacao: " + anoRealizacao + "\nQuadros" + quadros;
    }

    @Override
    public int compareTo(Exposicao outraExpo) {
        double ano = this.getAnoRealizacao();
        double outroAno = outraExpo.getAnoRealizacao();

        if (ano < outroAno) {
            return -1;
        } else if (ano > outroAno) {
            return 1;
        } else {
            return 0;
        }
    }
}
