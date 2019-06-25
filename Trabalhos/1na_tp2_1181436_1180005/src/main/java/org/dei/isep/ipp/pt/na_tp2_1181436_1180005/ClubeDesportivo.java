package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

import java.util.ArrayList;
import java.util.Comparator;

public class ClubeDesportivo{

    // Declaração das variáveis que caracterizam o ClubeDesportivo
    private Data dataCriacao;
    private String nome;
    private ArrayList<Atleta> atletas = new ArrayList<>();

    /**
     *
     * Construtor da instância ClubeDesportivo com todos os parâmetros.
     *
     * @param dataCriacao - data de criação do clube
     * @param nome - nome do clube
     */
    public ClubeDesportivo(Data dataCriacao, String nome) {
        this.dataCriacao = new Data(dataCriacao);
        this.nome = nome;
    }

    /**
     *
     * Retorna a data de criação do clube
     *
     * @return - data de criação do clube
     */
    public Data getDataCriacao() {
        return new Data(dataCriacao);
    }

    /**
     *
     * Permite alterar a data de criação
     *
     * @param dataCriacao - data de criação
     */
    public void setDataCriacao(Data dataCriacao) {
        this.dataCriacao = new Data(dataCriacao);
    }

    /**
     *
     * Retorna o nome do clube desportivo
     *
     * @return - nome do clube
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * Permite alterar o nome do clube desportivo
     *
     * @param nome - nome do clube
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * Retorna a lista de atletas
     *
     * @return - ArrayList com os atletas
     */
    public ArrayList<Atleta> getAtletas() {
        return (ArrayList<Atleta>) atletas.clone();
    }
    
    /**
     * 
     * Retorna um dos Atletas da lista atletas
     * 
     * @param index - index do atleta
     * @return      - Atleta a retornar
     */
    public Atleta getAtleta(int index){
        return atletas.get(index);
    }
    
    /**
     * 
     * Verifica se um determinado Atleta já se encontra no contentor
     * 
     * @param atleta - Atleta a procurar
     * @return       - True/False conforme se encontre ou não
     */
    public boolean returnAtleta(Atleta atleta){
        return atletas.contains(atleta);
    }

    /**
     *
     * Permite adicionar um atleta
     *
     * @param at - atleta a adicionar
     * @return - retorna true/false consoante o sucesso/insucesso da operação
     */
    public boolean addAtleta(Atleta at) {
        Atleta atleta;
        if (at instanceof Profissional) {
            atleta = new Profissional(at);
        }else if(at instanceof Semiprofissional){
            atleta = new Semiprofissional(at);
        }else{
            atleta = new Amador(at);
        }
        return atletas.add(atleta);
    }

    /**
     *
     * Permite remover um atleta
     *
     * @param at - atleta a remover
     * @return - retorna true/false consoante o sucesso/insucesso da operação
     */
    public boolean removeAtleta(Atleta at) {
        return atletas.remove(at);
    }

    /**
     *
     * Retorna o valor total da parcela para IRS dos Atletas
     *
     * @return - total da parcela para IRS dos Atletas
     */
    public double totalIRSAtletas() {
        double soma = 0;
        for (Atleta atleta : atletas) {
            if (atleta instanceof Profissional || atleta instanceof Semiprofissional) {
                soma += atleta.valorIRS();
            }
        }
        return soma;
    }

    /**
     *
     * Ordena os atletas por ordem alfabética de nome
     *
     * @return - lista ordenada de Atletas
     */
    public ArrayList<Atleta> ordenarNomes() {
        ArrayList<Atleta> listaOrd = this.getAtletas();
        listaOrd.sort(ordemNomes);
        return listaOrd;
    }

    /**
     *
     * Ordena inversamente os Atletas pelos prémios
     *
     * @return - lista ordenada de Atletas
     */
    public ArrayList<Atleta> ordenarPremiosReverse() {
        ArrayList<Atleta> listaOrd = this.getAtletas();
        listaOrd.sort(ordemPremios.reversed());
        return listaOrd;
    }

    /**
     *
     * Ordena os atletas ordenados alfabeticamente por categoria, modalidade e
     * nome
     *
     * @return - lista ordenada de Atletas
     */
    public ArrayList<Atleta> ordenarCatModNome() {
        ArrayList<Atleta> listaOrd = this.getAtletas();
        Comparator<Atleta> comps = ordemCategoria.thenComparing(ordemAtividade).thenComparing(ordemNomes);
        listaOrd.sort(comps);
        return listaOrd;
    }

    /**
     * 
     * Retorna os dados do clube
     * 
     * @return - String com os dados do clube
     */
    @Override
    public String toString() {
        return "\nClubeDesportivo" + "\n Data de Criação=" + dataCriacao + "\nNome: " + nome + "\nAtletas: " + atletas;
    }
    
        // Comparators utilizados pelas instâncias de ClubeDesportivo
    /**
     * Ordena os Atletas por ordem alfabética de Nomes
     */
    Comparator<Atleta> ordemNomes = new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {
            String nome1 = atleta1.getNome();
            String nome2 = atleta2.getNome();
            return nome1.compareTo(nome2);
        }
    };

    /**
     * Ordena os Atletas por ordem crescente de Prémios
     */
    Comparator<Atleta> ordemPremios = new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {
            double premios1 = atleta1.getPremios();
            double premios2 = atleta2.getPremios();
            if (premios1 > premios2) {
                return 1;
            } else if (premios2 > premios1) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    /**
     * Ordena os Atletas por ordem alfabética de Categorias
     */
    Comparator<Atleta> ordemCategoria = new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {
            String cat1 = atleta1.getCategoria();
            String cat2 = atleta2.getCategoria();
            return cat1.compareTo(cat2);
        }
    };

    /**
     * Ordena os Atletas por ordem alfabética de Atividades
     */
    Comparator<Atleta> ordemAtividade = new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {
            String atv1 = atleta1.getNomeAtividade();
            String atv2 = atleta2.getNomeAtividade();
            return atv1.compareTo(atv2);
        }
    };
}
