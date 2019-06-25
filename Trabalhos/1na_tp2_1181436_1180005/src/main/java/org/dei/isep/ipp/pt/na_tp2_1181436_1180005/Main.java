package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

public class Main {

    public static void main(String[] args) {
        //TP1
        Profissional prof1 = new Profissional("João", 217491824, Atleta.MASCULINO, 25, Atividade.CAMINHADA, 70);
        prof1.setPremios(200);
        prof1.setParcelaFixaSalario(100);
        Profissional prof2 = new Profissional("Isabel", 219294482, Atleta.FEMININO, 30, Atividade.NATACAO, 65);
        prof2.setPremios(250);
        prof2.setParcelaFixaSalario(150);
        Profissional prof3 = new Profissional("Carlota", 371829182, Atleta.FEMININO, 25, Atividade.CORRIDA, 70);
        prof3.setPremios(300);
        prof3.setParcelaFixaSalario(120);

        Semiprofissional semiprof1 = new Semiprofissional("Carlos", 212451235, Atleta.MASCULINO, 19, Atividade.CORRIDA, 75);
        semiprof1.setPremios(50);
        semiprof1.setAntiguidade(2);
        Semiprofissional semiprof2 = new Semiprofissional("José", 288172642, Atleta.FEMININO, 28, Atividade.CORRIDA, 70);
        semiprof2.setPremios(70);
        semiprof2.setAntiguidade(7);
        Semiprofissional semiprof3 = new Semiprofissional("Ana", 312341234, Atleta.MASCULINO, 35, Atividade.CAMINHADA, 63);
        semiprof3.setPremios(50);
        semiprof3.setAntiguidade(15);
        Semiprofissional.setParcelaFixaSalario(10);

        Amador amad1 = new Amador("Eva", 231245123, Atleta.FEMININO, 26, Atividade.CORRIDA, 80);
        amad1.setPremios(0);
        amad1.setAntiguidade(2);
        Amador amad2 = new Amador("Filipa", 215601827, Atleta.MASCULINO, 40, Atividade.CICLISMO, 65);
        amad2.setPremios(150);
        amad2.setAntiguidade(20);
        Amador amad3 = new Amador("António", 215601827, Atleta.MASCULINO, 40, Atividade.CICLISMO, 65);
        amad3.setPremios(100);
        amad3.setAntiguidade(22);

//        Atleta[] atletas = new Atleta[20];
//        atletas[0] = prof1;
//        atletas[1] = prof2;
//        atletas[2] = prof3;
//        atletas[3] = semiprof1;
//        atletas[4] = semiprof2;
//        atletas[5] = semiprof3;
//        atletas[6] = amad1;
//        atletas[7] = amad2;
//        atletas[8] = amad3;
//
//        for (Atleta at : atletas) {
//            if (at != null) {
//                if (at instanceof Semiprofissional || at instanceof Profissional) {
//                    System.out.println("Nome do Atleta: " + at.getNome());
//                    System.out.println("FCM: " + at.calcularFCM());
//                    int[] fct = at.calcularFCT();
//                    System.out.println("FCT (Queima de gordura): " + fct[0]);
//                    System.out.println("FCT (Trabalhar capacidade cardiorespiratória): " + fct[1]);
//                }
//            }
//        }
//
//        for (Atleta at : atletas) {
//            if (at != null) {
//                System.out.println("Nome do Atleta: " + at.getNome());
//                System.out.println("Valor a pagar: " + at.calcularSalario());
//            }
//        }
//
//        System.out.println("# de Atletas amadores: " + Amador.getNumAtletas());
//        System.out.println("# de Atletas profissionais: " + Profissional.getNumAtletas());
//
//        double somaA = 0;
//        double somaS = 0;
//        double somaP = 0;
//
//        for (Atleta at : atletas) {
//            if (at != null) {
//                if (at instanceof Amador) {
//                    somaA += at.calcularSalario();
//                } else if (at instanceof Semiprofissional) {
//                    somaS += at.calcularSalario();
//                } else {
//                    somaP += at.calcularSalario();
//                }
//            }
//        }
//        System.out.println("Valor a pagar aos atletas amadores: " + somaA);
//        System.out.println("Valor a pagar aos atletas semiprofissionais: " + somaS);
//        System.out.println("Valor a pagar aos atletas profissionais: " + somaP);
//        double somaTotal = somaA + somaS + somaP;
//        System.out.println("Valor total a pagar: " + somaTotal);

        //TP2
        Data dataCriacao = new Data(1989, 2, 20);
        ClubeDesportivo clube = new ClubeDesportivo(dataCriacao, "Clube XPTO");

        // Armazenamento das instâncias de Atleta no Clube
        clube.addAtleta(prof1);
        clube.addAtleta(prof2);
        clube.addAtleta(prof3);
        clube.addAtleta(amad1);
        clube.addAtleta(amad2);
        clube.addAtleta(amad3);
        clube.addAtleta(semiprof1);
        clube.addAtleta(semiprof2);
        clube.addAtleta(semiprof3);

        // Retornar nome do Clube
        System.out.println("Nome do Clube: " + clube.getNome());

        // Visualizar Atletas inseridos no Clube
        System.out.println("\nAtletas inscritos no Clube:");
        for (Atleta at : clube.getAtletas()) {
            System.out.println(at);
        }

        // Lista de Atletas ordenados alfabeticamente por nome
        System.out.println("\nAtletas por ordem alfabética de nome:");
        for (Atleta at : clube.ordenarNomes()) {
            System.out.println(at);
        }

        // Lista de Atletas ordenados por ordem inversa pelo valor dos prémios
        System.out.println("\nAtletas por ordem inversa pelo valor dos prémios:");
        for (Atleta at : clube.ordenarPremiosReverse()) {
            System.out.println(at);
        }

        // Valor total, para efeitos de IRS, da totalidade dos Atletas
        System.out.println("\nValor total, para efeitos de IRS, da totalidade dos atletas = " + clube.totalIRSAtletas());

        // Lista de Atletas ordenados por ordem alfabética por categoria, modalidade e nome
        System.out.println("\nAtletas por ordem inversa pelo valor dos prémios:");
        for (Atleta at : clube.ordenarCatModNome()) {
            System.out.println(at);
        }
        
        // Lista de Atletas ordenados alfabeticamente por categoria, modalidade e nome
        System.out.println("\nAtletas por ordem inversa pelo valor dos prémios:");
        for (Atleta at : clube.ordenarCatModNome()) {
            System.out.println(at);
        }
    }
}
