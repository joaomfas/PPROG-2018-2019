package app.model;

import java.io.Serializable;

public class DescricaoDoServico implements Serializable{

    Servico servico;
    String descricao;
    double duracao;

    /**
     * 
     * Cria uma instância de Descrição do Serviço
     * 
     * @param oServico Serviço indicado no pedido
     * @param strDescricao Descrição do serviço pedido
     * @param dDuracao  Duração do serviço pedido
     */
    public DescricaoDoServico(Servico oServico, String strDescricao, double dDuracao) {
        this.servico = oServico;
        this.descricao = strDescricao;
        this.duracao = dDuracao;
    }

    /**
     * 
     * Retorna o Serviço
     * 
     * @return Serviço referente à descrição
     */
    public Servico getM_oServico() {
        return servico;
    }

    /**
     * 
     * Define o Serviço
     * 
     * @param m_oServico Serviço referente à descrição
     */
    public void setM_oServico(Servico m_oServico) {
        this.servico = m_oServico;
    }

    /**
     * 
     * Retorna a descrição do Serviço
     * 
     * @return Descrição do Serviço
     */
    public String getM_strDescricao() {
        return descricao;
    }

    /**
     * 
     * Define a descrição do Serviço
     * 
     * @param m_strDescricao Descrição do Serviço
     */
    public void setM_strDescricao(String m_strDescricao) {
        this.descricao = m_strDescricao;
    }

    /**
     * 
     * Retorna a duração do Serviço
     * 
     * @return Duração do Serviço
     */
    public double getM_dDuracao() {
        return duracao;
    }

    /**
     * 
     * Define a duração do Serviço
     * 
     * @param m_dDuracao Duração do Serviço
     */
    public void setM_dDuracao(double m_dDuracao) {
        this.duracao = m_dDuracao;
    }
    
    /**
     * 
     * Retorna o custo do Serviço em função da duração
     * 
     * @return Custo do serviço
     */
    public double getCusto(){
        double dCusto = 0;     
        dCusto = this.duracao * this.servico.getCustoHora() / 60;
        return dCusto;
    }

    /**
     * 
     * Retorna a descrição completa do Serviço pedido
     * 
     * @return Descrição completa (Serviço + duração + descrição) do Serviço pedido
     */
    @Override
    public String toString() {
        return  servico.toString();
    }
    
    
}
