package org.dei.isep.ipp.pt.pl12_exposicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Quadro quad1 = new Quadro("La Joconde", "Leonardo da Vinci", 1506);
        Quadro quad2 = new Quadro("Skrik", "Edvard Munch", 1893);
        Quadro quad3 = new Quadro("La Persistencia de la Memoria", "Salvador Dalí", 1931);
        Quadro quad4 = new Quadro("Vergine dele Rocce", "Leonardo da Vinci", 1486);

        List<Quadro> quadros = new ArrayList<>();
        quadros.add(quad1);
        quadros.add(quad2);
        quadros.add(quad3);
        quadros.add(quad4);

        listarQuadro(quadros);

        Exposicao expo1 = new Exposicao("Euro2000", 2000);
        expo1.addQuadro(quad1);
        expo1.addQuadro(quad2);
        Exposicao expo2 = new Exposicao("Leonardo", 2010);
        expo2.addQuadro(quad1);
        expo2.addQuadro(quad4);
        Exposicao expo3 = new Exposicao("WorldFair", 1994);
        expo3.addQuadro(quad1);
        expo3.addQuadro(quad2);
        expo3.addQuadro(quad3);
        expo3.addQuadro(quad4);

        System.out.println();
        System.out.println(expo1.toString());
        System.out.println();
        System.out.println(expo2.toString());
        System.out.println();
        System.out.println(expo3.toString());

        quad1.setDesignacao("A Gioconda");
        System.out.println();
        System.out.println(expo1.toString());
        System.out.println();
        System.out.println(expo2.toString());
        System.out.println();
        System.out.println(expo3.toString());

        List<Exposicao> expos = new ArrayList<>();
        expos.add(expo1);
        expos.add(expo2);
        expos.add(expo3);
        Collections.sort(expos, Collections.reverseOrder());
        listarExpo(expos);
        
        System.out.println();
        expo3.removeQuadro(quad1);
        System.out.println(expo3.toString());
    }

    private static void listarQuadro(List<Quadro> lista) {
        for (Quadro quadro : lista) {
            System.out.println(quadro);
        }
    }

    private static void listarExpo(List<Exposicao> lista) {
        for (Exposicao expo : lista) {
            System.out.println(expo);
        }
    }
}
