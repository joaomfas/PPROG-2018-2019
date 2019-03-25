package org.dei.isep.ipp.pt.pl8_escola;

public class Professor extends Pessoa implements Encargos {

    private String categoria;

    private static float taxaPAdjunto = 20;

    private static float taxaPCoordenador = 50;

    private static float vencimentoBase = 1500;

    public static final String ASSISTENTE = "Assistente";

    public static final String ADJUNTO = "Adjunto";

    public static final String COORDENADOR = "Coordenador";

    public Professor(String nome, String email, int nif, String categoria) {
        super(nome, email, nif);
        this.categoria = categoria;
    }

    public Professor() {
        this("Sem Nome", "Sem E-Mail", 999999999, "Sem Categoria");
    }

    public Professor(Professor outroProf) {
        this(outroProf.getNome(), outroProf.getEmail(), outroProf.getNif(), outroProf.getCategoria());
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return String.format("PROFESSOR%n%s%nCategoria: Professor %s%n", super.toString(), this.categoria);
    }

    public float vencimento() {
        if (this.categoria.equals(Professor.ADJUNTO)) {
            return (Professor.vencimentoBase * (1 + Professor.taxaPAdjunto / 100));
        } else if (this.categoria.equals(Professor.COORDENADOR)) {
            return (Professor.vencimentoBase * (1 + Professor.taxaPCoordenador / 100));
        } else {
            return Professor.vencimentoBase;
        }
    }

    public static float getTaxaPAdjunto() {
        return taxaPAdjunto;
    }

    public static float getTaxaPCoordenador() {
        return taxaPCoordenador;
    }

    public static float getVencimentoBase() {
        return vencimentoBase;
    }

    public static void setTaxaPAdjunto(float aTaxaPAdjunto) {
        taxaPAdjunto = aTaxaPAdjunto;
    }

    public static void setTaxaPCoordenador(float aTaxaPCoordenador) {
        taxaPCoordenador = aTaxaPCoordenador;
    }

    public static void setVencimentoBase(float aVencimentoBase) {
        vencimentoBase = aVencimentoBase;
    }

    @Override
    public float encargo() {
        return vencimento();
    }
}
