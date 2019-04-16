package org.dei.excecaoUnchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        boolean dadosInvalidos = true;
        Pessoa p = new Pessoa();

        do {
            try {
                System.out.print("Nome:");
                String nome = ler.nextLine();
                p.setNome(nome);

                System.out.print("Nº de ID Civil:");
                int idCivil = ler.nextInt();
                ler.nextLine();
                p.setIDCivil(idCivil);

                dadosInvalidos = false;
            } catch (ArgumentoForaDosLimitesException afle) {
                System.out.println("Exceção (IDCivil): " + afle.getMessage());
            } catch (IllegalArgumentException iae) {
                System.out.println("Exceção (Nome): " + iae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("ID Civil não é inteiro!");
                ler.nextLine();
            }

        } while (dadosInvalidos);

        System.out.println("\nPessoa: " + p);

    }

}
