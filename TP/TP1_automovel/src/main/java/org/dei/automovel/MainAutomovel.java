/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.automovel;

/**
 *
 * @author joaoferreira
 */
public class MainAutomovel {
    public static void main(String[] args) {
        Automovel a1 = new Automovel("11-11-AA","Toyota",1400);
        
        System.out.println("Automovel a1: " + a1);
        System.out.println("Matrícula automóvel a1: "+ a1.getMatricula());
        System.out.println("#Automóveis = " + Automovel.getTotalAutomoveis());
        
        Automovel a2 = new Automovel();
        
        System.out.println("Automovel a2: " + a2);
        a2.setCilindrada(1800);
        System.out.println("Automovel a2: " + a2);
        System.out.println("#Automóveis (pós a2) = " + Automovel.getTotalAutomoveis());
        
        Automovel a3;
        // Construtor é invocado mas o objeto criado não é alocado a nenhuma variável
        new Automovel();
        System.out.println("#Automóveis (pós a3) = " + Automovel.getTotalAutomoveis());
        
        //abs é um método de instância
        System.out.println("Diferença: "+ Math.abs(a1.calcularDiferencaCilindrada(a2)));
    }
}
