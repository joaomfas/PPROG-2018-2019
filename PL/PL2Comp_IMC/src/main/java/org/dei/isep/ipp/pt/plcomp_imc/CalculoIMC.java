package org.dei.isep.ipp.pt.plcomp_imc;

public class CalculoIMC {

    public static double calculoIMC(double peso, double altura) {
        double imc = 0;

        imc = peso / (altura * altura);

        return imc;
    }
}
