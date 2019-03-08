package org.dei.isep.ipp.pt.pl6_impostoextraordinario;

public class MainCalculoTaxa {

    public static void main(String[] args) {
        Morada morada1 = new Morada("Rua da Alegria", "4200-000", "Porto");
        Desempregado contr1 = new Desempregado("Carlos", morada1, 1000, 12);
        Morada morada2 = new Morada("Rua do Céu", "3800-000", "Aveiro");
        TrabalhadorContaPropria contr2 = new TrabalhadorContaPropria("António", morada2, 40000, 1000, "Picheleiro");

        Object[] contribuintes = new Object[3];
        contribuintes[0] = contr1;
        contribuintes[1] = contr2;

        for (int i = 0; i < Contribuinte.getNumContr(); i++) {
            Contribuinte cont = (Contribuinte) contribuintes[i];
            System.out.println(cont.toString() + "\nTaxa total: " + cont.calcularTaxa());
        }

        System.out.println("\nContribuintes Desempregados");
        for (int i = 0; i < Contribuinte.getNumContr(); i++) {
            Contribuinte cont = (Contribuinte) contribuintes[i];
            if (cont instanceof Desempregado) {
                System.out.println("Nome: " + cont.getNome() + "\nTaxa total: " + cont.calcularTaxa());
            }
        }

        for (int i = 0; i < Contribuinte.getNumContr(); i++) {
            Contribuinte cont = (Contribuinte) contribuintes[i];
            if (cont instanceof Desempregado) {
                ((Desempregado) cont).setTaxaOR(0.1);
            }
        }

        System.out.println("\nContribuintes Desempregados - Taxa Alterada");
        for (int i = 0; i < Contribuinte.getNumContr(); i++) {
            Contribuinte cont = (Contribuinte) contribuintes[i];
            if (cont instanceof Desempregado) {
                System.out.println("Nome: " + cont.getNome() + "\nTaxa total: " + cont.calcularTaxa());
            }
        }
    }
}
