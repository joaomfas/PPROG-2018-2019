package org.dei.isep.ipp.pt.pl7_contadoresdomesticos;

public class ContElectSimples extends ContElect {

    private static double borderlinePotenciaContratada = 6.9;
    private static double tarifaMenor = 0.13;
    private static double tarifaMaior = 0.16;

    private double potenciaContratada;
    private String nome;

    public ContElectSimples(String nome, double potenciaContratada, int consumo) {
        super(nome, consumo);
        this.potenciaContratada = potenciaContratada;
    }

    public static double getBorderlinePotenciaContratada() {
        return borderlinePotenciaContratada;
    }

    public static void setBorderlinePotenciaContratada(double borderlinePotenciaContratada) {
        ContElectSimples.borderlinePotenciaContratada = borderlinePotenciaContratada;
    }

    public static double getTarifaMenor() {
        return tarifaMenor;
    }

    public static void setTarifaMenor(double tarifaMenor) {
        ContElectSimples.tarifaMenor = tarifaMenor;
    }

    public static double getTarifaMaior() {
        return tarifaMaior;
    }

    public static void setTarifaMaior(double tarifaMaior) {
        ContElectSimples.tarifaMaior = tarifaMaior;
    }

    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    public void setPotenciaContratada(double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcConsumoMesActual() {
        if (potenciaContratada < borderlinePotenciaContratada) {
            return getConsumo() * tarifaMenor;
        }
        return getConsumo() * tarifaMaior;
    }
}
