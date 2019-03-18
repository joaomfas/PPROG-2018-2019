package org.dei.isep.ipp.pt.pl7_contadoresdomesticos;

public class ContGas extends Contador {

    private static int numContadoresGas = 0;
    private static double custoUnitario = 0.8;

    public ContGas(String nome, int consumo) {
        super(nome, consumo);
    }

    public static int getNumContadoresGas() {
        return numContadoresGas;
    }

    public static void setNumContadoresGas(int numContadoresGas) {
        ContGas.numContadoresGas = numContadoresGas;
    }

    public static double getCustoUnitario() {
        return custoUnitario;
    }

    public static void setCustoUnitario(double custoUnitario) {
        ContGas.custoUnitario = custoUnitario;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String init() {
        numContadoresGas++;
        return String.format("GAS-%d", numContadoresGas);
    }

    @Override
    public double calcConsumoMesActual() {
        return getConsumo() * custoUnitario;
    }
}
