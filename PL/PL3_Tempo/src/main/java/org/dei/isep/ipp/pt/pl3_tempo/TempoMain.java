/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.isep.ipp.pt.pl3_tempo;

/**
 *
 * @author joaoferreira
 */
public class TempoMain {

    public static void main(String[] args) {
        Tempo t1 = new Tempo(5, 30, 12);

        System.out.println("t1: " + t1.getTempo12h());

        t1.somarSegundo();

        System.out.println("t1: " + t1.getTempo12h());

        Tempo t2 = new Tempo(18, 5, 20);

        System.out.println("t2: " + t2.getTempo12h());

        System.out.println("t1 > t2: " + t1.tempoMaior(t2));
        
        System.out.println("t1 > 23:07:04: " + t1.tempoMaior(23,7,4));
        
        System.out.println("t1 - t2 = " + t1.diferencaTempoSegundos(t2) + " s");
        
        System.out.println("t1 - t2 = " + t1.diferencaTempo(t2));
    }
}
