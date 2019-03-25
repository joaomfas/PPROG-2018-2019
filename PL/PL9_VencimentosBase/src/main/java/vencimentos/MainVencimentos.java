package vencimentos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainVencimentos {

    public static void main(String[] args) {      

        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500, 1500, 6);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        Trabalhador[] trab = new Trabalhador[3];
        trab[0] = tp;
        trab[1] = tc;
        trab[2] = th;

        //Comparable 
        //Ordenação crescente dos vencimentos
        System.out.println("\n\n### Trabalhadores por ordem crescente dos Vencimentos (Objectos Comparable)");
        Arrays.sort(trab); //Ordena baseado no compareTo da classe
        listar(trab);

        //Ordenação decrescente dos vencimentos
        System.out.println("\n\n### Trabalhadores por ordem decrescente dos Vencimentos (Objectos Comparable)");
        //reverseOrder - inverte a ordem definida no compareTo
        Arrays.sort(trab, Collections.reverseOrder());
        listar(trab);

        //Comparator
        Comparator critNumerico = new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
                float venc1 = ((Trabalhador) obj1).calcularVencimento();
                float venc2 = ((Trabalhador) obj2).calcularVencimento();

                if (venc1 < venc2) {
                    return -1;
                } else if (venc1 > venc2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Comparator critAlfabetico = new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
                String nome1 = ((Trabalhador) obj1).getNome();
                String nome2 = ((Trabalhador) obj2).getNome();

                return nome1.compareTo(nome2);
            }
        };

        //Ordenação crescente dos vencimentos
        System.out.println("\n\n### Trabalhadores por ordem crescente dos Vencimentos");
        Arrays.sort(trab, critNumerico);
        listar(trab);

        //Ordenação decrescente dos vencimentos
        System.out.println("\n\n### Trabalhadores por ordem crescente dos Vencimentos");
        Arrays.sort(trab, Collections.reverseOrder(critNumerico));
        listar(trab);

        //Ordenação alfabética dos nomes
        System.out.println("\n\n### Trabalhadores por ordem Alfabética do Nome");
        Arrays.sort(trab, critAlfabetico);
        listar(trab);
    }

    public static void listar(Trabalhador[] t) {
        System.out.println("\n--- Listagem de Trabalhadores Ordenada: ---");
        for (int i = 0; i < t.length; i++) {
            if (t[i] != null) {
                System.out.printf("%n%s vencimento = %.2f €%n", t[i], t[i].calcularVencimento());
            }
        }
    }

}
