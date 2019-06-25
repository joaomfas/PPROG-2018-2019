package app.model;

import java.io.Serializable;

/**
 *
 */
public class ServicoFixo implements Servico, Serializable {

    private String strId;
    private String descricaoBreve;
    private String descricaoCompleta;
    private double custoHora;
    private double duracaoPreDeterminada;
    private Categoria categoria;

    /**
     *
     * Cria uma instância de ServicoFixo
     *
     * @param strId ID do ServicoFixo
     * @param strDescBreve Descrição breve do ServicoFixo
     * @param strDescCompleta Descrição completa do ServicoFixo
     * @param dCustoHora Custo à hora do ServicoFixo
     * @param oCategoria Categoria do ServicoFixo
     * @param dDuracaoPreDeterminada Duração pré-determinada do ServicoFixo
     */
    public ServicoFixo(String strId, String strDescBreve, String strDescCompleta, double dCustoHora, Categoria oCategoria, double dDuracaoPreDeterminada) {
        this.strId = strId;
        this.descricaoBreve = strDescBreve;
        this.descricaoCompleta = strDescCompleta;
        this.custoHora = dCustoHora;
        this.duracaoPreDeterminada = dDuracaoPreDeterminada;
        this.categoria = oCategoria;
    }

    /**
     *
     * Retorna o ID do ServicoFixo
     *
     * @return ID do ServicoFixo
     */
    public String getId() {
        return strId;
    }

    /**
     *
     * Define o ID do ServicoFixo
     *
     * @param m_strId ID do ServicoFixo
     */
    public void setId(String m_strId) {
        this.strId = m_strId;
    }

    /**
     *
     * Retorna a descrição breve do ServicoFixo
     *
     * @return Descrição breve do ServicoFixo
     */
    public String getDescBreve() {
        return descricaoBreve;
    }

    /**
     *
     * Define a descrição breve do ServicoFixo
     *
     * @param m_strDescBreve Descrição breve do ServicoFixo
     */
    public void setDescBreve(String m_strDescBreve) {
        this.descricaoBreve = m_strDescBreve;
    }

    /**
     *
     * Retorna a descrição completa do ServicoFixo
     *
     * @return Descrição completa do do ServicoFixo
     */
    @Override
    public String getDescCompleta() {
        return descricaoCompleta;
    }

    /**
     *
     * Define a descrição completa do ServicoFixo
     *
     * @param m_strDescCompleta Descrição completa do ServicoFixo
     */
    public void setDescCompleta(String m_strDescCompleta) {
        this.descricaoCompleta = m_strDescCompleta;
    }

    /**
     *
     * Retorna o custo à hora do ServicoFixo
     *
     * @return Custo à hora do ServicoFixo
     */
    @Override
    public double getCustoHora() {
        return custoHora;
    }

    /**
     *
     * Define o custo à hora do ServicoFixo
     *
     * @param m_dCustoHora Custo à hora do ServicoFixo
     */
    public void setCustoHora(double m_dCustoHora) {
        this.custoHora = m_dCustoHora;
    }

    /**
     *
     * Retorna a duração pré-determinada do ServicoFixo
     *
     * @return Duração pré-determinada do ServicoFixo
     */
    public double getDuracaoPreDeterminada() {
        return duracaoPreDeterminada;
    }

    /**
     *
     * Define a duração pré-determinada do ServicoFixo
     *
     * @param m_dDuracaoPreDeterminada Duração pré-determinada do ServicoFixo
     */
    public void setDuracaoPreDeterminada(double m_dDuracaoPreDeterminada) {
        this.duracaoPreDeterminada = m_dDuracaoPreDeterminada;
    }

    /**
     *
     * Retorna a categoria a que o ServicoFixo pertence
     *
     * @return Categoria em que o ServicoFixo se encontra catalogado
     */
    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     *
     * Define a categoria a que o ServicoFixo pertence
     *
     * @param oCategoria Categoria em que o ServicoFixo se encontra catalogado
     */
    public void setCategoria(Categoria oCategoria) {
        this.categoria = oCategoria;
    }

    /**
     * 
     * Retorna a descrição do tipo de serviço
     * 
     * @return Tipo de Serviço
     */
    @Override
    public String getTipoServico() {
        return "ServicoFixo";
    }

    /**
     * 
     * Verifica se o serviço pertence a uma determinada categoria
     * 
     * @param oCat Categoria a verificar
     * @return  True/false consoante o serviço pertença/ou não à categoria
     */
    @Override
    public boolean hasCat(Categoria oCat) {
        return this.categoria.getCodigo().equals(oCat.getCodigo());
    }

    /**
     * 
     * Retorna descrição do ServicoFixo
     * 
     * @return Descrição do ServicoFixo
     */
    @Override
    public String toString() {
        return descricaoBreve;
    }
}
