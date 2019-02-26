package org.dei.isep.ipp.pt.plcomp_imc;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome;
        String morada;
        String codigoPostal;
        String localidade;
        int idade;
        double altura;
        double peso;
        double imc;

        Scanner in = new Scanner(System.in);
        Formatter out = new Formatter(System.out);

        out.format("Ferramenta de cálculo de IMC%nInsira os dados do indivíduo:");
        out.format("%nNome: ");
        nome = in.nextLine();
        out.format("Idade: ");
        idade = in.nextInt();
        in.nextLine();
        out.format("Peso: ");
        peso = in.nextDouble();
        in.nextLine();
        out.format("Altura: ");
        altura = in.nextDouble();
        in.nextLine();
        out.format("Morada: ");
        morada = in.nextLine();
        out.format("Codigo Postal: ");
        codigoPostal = in.next();
        out.format("Localidade: ");
        localidade = in.next();

        out.format("%nDados inseridos:%n");
        Morada morada1 = new Morada(localidade, codigoPostal, morada);
        Individuo individuo1 = new Individuo(nome, morada1, altura, peso, idade);

        out.format(individuo1.toString());

        imc = CalculoIMC.calculoIMC(peso, altura);

        out.format("%n%nO IMC do %s é %.2f", individuo1.getNome(), imc);
    }

}
