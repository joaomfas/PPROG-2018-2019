package org.dei.isep.ipp.pt.pl5_vencimentos;

import java.util.ArrayList;

public class MainVencimentos {

    public static void main(String[] args) {
        TrabalhadorPeca trab1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao trab2 = new TrabalhadorComissao("Susana Ferreira", 650, 2731, (float) 42.5);
        TrabalhadorHora trab3 = new TrabalhadorHora("Carlos Miguel", 168, (float) 4.50);

        //Object[] trabalhadores = new Object[10];
        ArrayList<Trabalhador> trabalhadores = new ArrayList();

        trabalhadores.add(trab1);
        trabalhadores.add(trab2);
        trabalhadores.add(trab3);
        
                System.out.println("Lista de trabalhadores:");
        for (int i = 0; i < trabalhadores.size(); i++) {
            System.out.println(trabalhadores.get(i).toString());
        }

        System.out.println("\nTrabalhadores à hora:");
        for (int i = 0; i < trabalhadores.size(); i++) {
            if (trabalhadores.get(i) instanceof TrabalhadorHora) {
                System.out.println(trabalhadores.get(i).toString());
            }
        }

        System.out.println("\nTrabalhadores e salário:");
        for (int i = 0; i < trabalhadores.size(); i++) {
            //Trabalhador trab = (Trabalhador) trabalhadores[i];
            System.out.println(trabalhadores.get(i).getNome() + " ==> " + trabalhadores.get(i).calcularVencimento() + "€");
        }
    }

}
