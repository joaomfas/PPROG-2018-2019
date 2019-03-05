package org.dei.pl1_cumprimentar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner in = new Scanner(System.in);
        
        // Criação do objeto pessoa1 do tipo Cumprimentar. Sem paramtros.
        Cumprimentar pessoa1 = new Cumprimentar();
        
        System.out.printf("Insira o nome: ");
        nome = in.next();
        
        // Definição da variável nome do objeto pessoa1
        pessoa1.setNome(nome);
        
        System.out.printf("%n Insira a idade: ");
        idade = in.nextInt();
        
        // Definição da variável idade do objeto pessoa1
        pessoa1.setIdade(idade);
        
        // Impressão dos dados do objeto pessoa1
        System.out.println(pessoa1.toString());
    }
}
