package org.dei.tributaveis;

public class MainTributaveis {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "encarnado");
        System.out.println("V1: " + v1);

        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);
        System.out.println("V2: " + v2);

        Veiculo v3 = new Veiculo("11-22-BB", 1400, Veiculo.VERDE);
        System.out.println("V3: " + v3);

        Moradia m1 = new Moradia("Rua do Bocage", 90, Moradia.CINZENTO);
        System.out.println("M3: " + m1);

        Tributavel obj;

        obj = v2;
        System.out.println("\nObj (v2): " + obj);
        System.out.println("Imposto Obj (v2): " + obj.calcularImposto());

        obj = m1;
        System.out.println("Obj (m1): " + obj);
        System.out.println("Imposto Obj (m1): " + obj.calcularImposto());

        System.out.println("Imposto v2: " + v2.calcularImposto());
        System.out.println("Imposto m1: " + m1.calcularImposto());
    }

}
