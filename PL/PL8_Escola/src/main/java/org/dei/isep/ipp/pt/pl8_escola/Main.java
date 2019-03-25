package org.dei.isep.ipp.pt.pl8_escola;

public class Main {

    public static void main(String[] args) {
        Professor p1 = new Professor("Alexandre Gouveia", "aas@isep.ipp.pt", 999999999, Professor.ADJUNTO);
        Professor p2 = new Professor("Fernando Duarte", "fjd@isep.ipp.pt", 999999999, Professor.ASSISTENTE);
        Professor p3 = new Professor("Luiz Faria", "lef@isep.ipp.pt", 999999999, Professor.COORDENADOR);

        Aluno a1 = new Aluno("André Azevedo", "1130740@isep.ipp.pt", 999999999, 1130740);
        Aluno a2 = new Aluno("Sara Silva", "sara@gmail.com", 999999999, 1130648);

        Bolseiro b1 = new Bolseiro("Duarte Amorim", "1130674@isep.ipp.pt", 258594306, 1130674, 1565.5f);
        Bolseiro b2 = new Bolseiro("Tiago Ferreira", "1130672@isep.ipp.pt", 999999999, 1130672, 2500f);

        Pessoa[] p = new Pessoa[10];

        p[0] = p1;
        p[1] = p2;
        p[2] = p3;

        p[3] = a1;
        p[4] = a2;

        p[5] = b1;
        p[6] = b2;

        System.out.println("\n### Listar os nomes de professores e alunos acompanhados do nome da classe correspondente ###");
        for (Pessoa pessoa : p) {
            if (pessoa != null) {
                System.out.printf("Nome: %s Classe: %s%n%n", pessoa.getNome(), pessoa.getClass().getSimpleName());
            }
        }

        System.out.println("\n### Listar o nome e a categoria de cada um dos professores ###");
        for (Pessoa pessoa : p) {
            if (pessoa instanceof Professor) {
                System.out.printf("Nome: %s  Categoria: %s%n", pessoa.getNome(), ((Professor) pessoa).getCategoria());
            }
        }

        System.out.println("\n### Listar todos os alunos da escola ###");
        for (Pessoa pessoa : p) {
            if (pessoa instanceof Aluno) {
                System.out.println(pessoa);
            }
        }

        System.out.println("\n### Listar o número e o nome de cada um dos alunos que não recebem bolsa ###");
        for (Pessoa pessoa : p) {
            if (pessoa instanceof Aluno && !(pessoa instanceof Bolseiro)) {
                Aluno a = (Aluno) pessoa;
                System.out.printf("Nr. Mec: %d  Nome: %s%n", a.getNrMec(), a.getNome());
            }
        }

        System.out.println("\n### Mostrar o encargo mensal da escola com os vencimentos dos professores e as bolsas dos alunos. ###");
        float encargos = 0;
        for (Pessoa pessoa : p) {
            if (pessoa instanceof Encargos) {
                encargos += ((Encargos) pessoa).encargo();
            }
        }
        System.out.printf("%nEncargos com Vencimentos e Bolsas: %.2f €%n", encargos);
    }
}
