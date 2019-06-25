package app.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoAtribuicoes {
    private List<AtribuicaoDeServico> listaDeAtribuicoes = new ArrayList<>();
    
    /**
     * 
     * Adiciona uma Atribuição ao Registo
     * 
     * @param atribuicao Atribuição a adicionar
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addAtribuicao(AtribuicaoDeServico atribuicao) {
        return listaDeAtribuicoes.add(atribuicao);
    }

    /**
     * 
     * Retorna a Lista de Atribuições
     * 
     * @return Lista de Atribuições
     */
    public List<AtribuicaoDeServico> getListaDeAtribuicoes() {
        return listaDeAtribuicoes;
    }

    /**
     * 
     * Define a Lista de Atribuições
     * 
     * @param listaDeAtribuicoes Lista de Atribuições
     */
    public void setListaDeAtribuicoes(List<AtribuicaoDeServico> listaDeAtribuicoes) {
        this.listaDeAtribuicoes = listaDeAtribuicoes;
    }

    /**
     * 
     * Retorna a descrição do Registo de Atribuições
     * 
     * @return Descrição do Registo de Atribuições
     */
    @Override
    public String toString() {
        return "RegistoAtribuicoes{" + "listaDeAtribuicoes=" + listaDeAtribuicoes + '}';
    }
}
