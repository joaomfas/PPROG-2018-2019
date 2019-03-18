package org.dei.isep.ipp.pt.pl7_contadoresdomesticos;

public class ContElectBihorario extends ContElect {

    private static double tarifaVazio = 0.066;
    private static double tarifaForaVazio = 0.14;

    private double potenciaContratada;

    public ContElectBihorario(String nome, double potenciaContratada, int consumoV, int consumoFV
    ) {
        super(nome, consumoV, consumoFV);
        this.potenciaContratada = potenciaContratada;
    }

    public static double getTarifaVazio() {
        return tarifaVazio;
    }

    public static void setTarifaVazio(double tarifaMenor) {
        ContElectBihorario.tarifaVazio = tarifaMenor;
    }

    public static double getTarifaForaVazio() {
        return tarifaForaVazio;
    }

    public static void setTarifaForaVazio(double tarifaMaior) {
        ContElectBihorario.tarifaForaVazio = tarifaMaior;
    }

    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    public void setPotenciaContratada(double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
    }

    @Override
    public String toString() {
       return String.format("Nome: %s%nID: %s%nConsumoV: %d%nConsumo FV: %d", getNome(), getId(), getConsumo(), getConsumo2());
    }

    @Override
    public double calcConsumoMesActual() {
        return getConsumo() * tarifaVazio + getConsumo2() * tarifaForaVazio;
    }
}
