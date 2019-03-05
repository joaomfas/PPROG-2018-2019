package org.dei.isep.ipp.pt.pl4_utenteginasio;

import java.util.ArrayList;

public class MainUtente {

    public static void main(String[] args) {
        Utente ut1 = new Utente("Joao", "M", 26, 1.68, 60);
        Utente ut2 = new Utente("Luis", "M", 27, 1.77, 65);
        Utente ut3 = new Utente();
        Utente ut4 = new Utente("André", 28);

        ArrayList<Utente> utentes = new ArrayList();
        utentes.add(ut1);
        utentes.add(ut2);
        utentes.add(ut3);
        utentes.add(ut4);

        for (int i = 0; i < Utente.getNumUtentes(); i++) {
            System.out.println(utentes.get(i).toString());
        }

        for (int i = 0; i < Utente.getNumUtentes(); i++) {
            System.out.println("\n" + utentes.get(i).getNome() + "\n"
                    + "IMC: " + utentes.get(i).calcularIMC() + "\n"
                    + "Grau obesidade: " + utentes.get(i).grauObesidade());
        }

        for (int i = 0; i < Utente.getNumUtentes(); i++) {
            if (!utentes.get(i).grauObesidade().equals("Saudável")) {
                System.out.println("\n" + "Nome: " + utentes.get(i).getNome()
                        + "\nGrau obesidade: " + utentes.get(i).grauObesidade());
            }
        }
        Utente.setGrauMagro(23);
        Utente.setGrauSaudavel(30);

        for (int i = 0; i < Utente.getNumUtentes(); i++) {
            System.out.println("\n" + utentes.get(i).getNome() + "\n"
                    + "IMC: " + utentes.get(i).calcularIMC() + "\n"
                    + "Grau obesidade: " + utentes.get(i).grauObesidade());
        }

        int temp = ut1.getIdade();
        ut1.setIdade(ut2.getIdade());
        ut2.setIdade(temp);

        if (ut1.verificaMaisNovo(ut2) == 1) {
            System.out.println(ut1.getNome() + " é mais novo do que " + ut2.getNome());
        } else {
            if (ut1.verificaMaisNovo(ut2) == 2) {
                System.out.println(ut2.getNome() + " é mais novo do que " + ut1.getNome());
            }else{
                if (ut1.verificaMaisNovo(ut2) == 0) {
            System.out.println(ut1.getNome()+" tem a mesma idade que "+ut2.getNome());
        }
            }
        }
    }
}
