package app.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoServico {

    private ArrayList<Servico> listaServicos;

    /**
     * 
     * Cria uma instância de RegistoServico
     * 
     */
    public RegistoServico() {
        listaServicos = new ArrayList<>();
    }

    /**
     * 
     * Adiciona um Serviço ao Registo
     * 
     * @param oServico Serviço a registar no sistema
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addServico(Servico oServico) {
        return listaServicos.add(oServico);
    }

    /**
     * 
     * Retorna a lista de todos os serviços registados no sistema
     * 
     * @return Serviços registados no sistema
     */
    public List<Servico> getServicos() {
        List<Servico> ls = new ArrayList<>();
        ls.addAll(this.listaServicos);
        return ls;
    }

    /**
     * 
     * Retorna todos os serviços pertencentes a uma determinada Categoria
     * 
     * @param cat Categoria associada aos serviços a retornar
     * @return Lista de todos os serviços pertencentes a uma determinada categoria
     */
    public List<Servico> getServicosDeCategoria(Categoria cat) {
        List<Servico> ls = new ArrayList<>();
        for (Servico serv : this.listaServicos) {
            if (serv.hasCat(cat)) {
                ls.add(serv);
            }
        }
        return ls;
    }

}
