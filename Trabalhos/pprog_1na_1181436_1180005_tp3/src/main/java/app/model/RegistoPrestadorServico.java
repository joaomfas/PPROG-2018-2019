package app.model;

import app.model.PrestadorServico;
import java.util.ArrayList;
import java.util.List;

public class RegistoPrestadorServico {

    private ArrayList<PrestadorServico> listaPrestadores;

    /**
     * 
     * Cria uma instância de RegistoPrestadorServico
     * 
     */
    public RegistoPrestadorServico() {
        this.listaPrestadores = new ArrayList<>();
    }

    /**
     * 
     * Adiciona um Prestador de Serviços ao Registo
     * 
     * @param oPrestadorServico Prestador de Serviços a adicionar ao registo
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addPrestadorServico(PrestadorServico oPrestadorServico) {
        return listaPrestadores.add(oPrestadorServico);
    }

    /**
     * 
     * Retorna todos os prestadores de serviços registados no sistema
     * 
     * @return Prestadores de serviços registados
     */
    public List<PrestadorServico> getPrestadoresServicos() {
        List<PrestadorServico> lps = new ArrayList<>();
        lps.addAll(this.listaPrestadores);
        return lps;
    }

    /**
     * 
     * Procura e retorna o prestador de serviço com um determinado email
     * 
     * @param strEmail Email associado ao prestador de serviços a pesquisar
     * @return Prestador de Serviços com o email procurado
     */
    public PrestadorServico getPrestServicoByEmail(String strEmail) {
        for (PrestadorServico ps : this.listaPrestadores) {
            if (ps.hasEmail(strEmail)) {
                return ps;
            }
        }
        return null;
    }

    /**
     * 
     * Retorna o Email de todos os prestadores de serviços
     * 
     * @return Lista com os emails de todos os prestadores de serviços
     */
    public ArrayList<String> getEmailPrestadores() {
        ArrayList<String> nomesPrestadores = new ArrayList();
        for (PrestadorServico ps : this.listaPrestadores) {
            nomesPrestadores.add(ps.getEmail());
        }
        return nomesPrestadores;
    }
}
