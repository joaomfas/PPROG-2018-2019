package org.dei.isep.ipp.pt.pl7_contadoresdomesticos;

import java.util.HashSet;
import java.util.Set;

public class MainContadores {

    public static void main(String[] args) {
        Contador cont1 = new ContGas("João", 20);
        Contador cont2 = new ContElectSimples("Luís", 4.6, 20);
        Contador cont3 = new ContElectSimples("André", 10.2, 20);
        Contador cont4 = new ContElectBihorario("Carlos", 6.9, 30, 10);
        Contador cont5 = new ContGas("Maria", 30);

        Contador[] contadores = new Contador[10];
        contadores[1] = cont1;
        contadores[2] = cont2;
        contadores[3] = cont3;
        contadores[4] = cont4;
        contadores[5] = cont5;
        
        for (Contador conts : contadores) {
            if (conts != null) {
                System.out.println(conts.toString());
            }
        }
        
        System.out.println("\n#contadores de eletricidade: "+ContElect.getNumContadoresElect());
        
        System.out.println("\nContadores de eletricidade bi-horários: ");
        for (Contador conts : contadores) {
            if (conts != null) {
                                if (conts instanceof ContElectBihorario) {
                    System.out.println(conts.getId());
                }
            }
        }
        
        for (Contador conts : contadores) {
            if (conts != null) {
                System.out.println("\nID: "+conts.getId()+"\nCusto do mês: "+conts.calcConsumoMesActual());
            }
        }
        
        double maiorConsumGas = 0;
        for (Contador conts : contadores) {
            if (conts != null) {
                if (conts instanceof ContGas) {
                    maiorConsumGas = ((conts.getConsumo() > maiorConsumGas) ? conts.getConsumo() : maiorConsumGas);
                }
            }
        }
        System.out.println("\nMaior consumo de gás: "+maiorConsumGas);
        
        Set<String> nomes = new HashSet<>();
        for (Contador conts : contadores) {
            if (conts != null) {
                nomes.add(conts.getNome());
            }
        }
        System.out.println("\nClientes com contadores:");
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
