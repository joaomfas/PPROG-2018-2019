package org.dei.pl1_cumprimentar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner in = new Scanner(System.in);
        
        Cumprimentar pessoa1 = new Cumprimentar();
        
        System.out.printf("Insira o nome: ");
        nome = in.next();
        
        pessoa1.setNome(nome);
        
        System.out.printf("%n Insira a idade: ");
        idade = in.nextInt();
        
        pessoa1.setIdade(idade);
        
        System.out.println(pessoa1.toString());
    }
}
