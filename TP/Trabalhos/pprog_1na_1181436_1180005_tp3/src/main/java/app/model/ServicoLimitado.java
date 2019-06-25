package app.model;

import java.io.Serializable;

/**
 *
 */
public class ServicoLimitado implements Servico, Serializable {

    private String strId;
    private String descricaoBreve;
    private String descricaoCompleta;
    private double custoHora;
    private Categoria categoria;

    /**
     *
     * Criação de uma instância de ServicoLimitado
     *
     * @param strId ID do ServicoLimitado
     * @param strDescBreve Descrição breve do ServicoLimitado
     * @param strDescCompleta Descrição completa do ServicoLimitado
     * @param dCustoHora Custo à hora do ServicoLimitado
     * @param oCategoria Categoria do ServicoLimitado
     */
    public ServicoLimitado(String strId, String strDescBreve, String strDescCompleta, double dCustoHora, Categoria oCategoria) {
        this.strId = strId;
        this.descricaoBreve = strDescBreve;
        this.descricaoCompleta = strDescCompleta;
        this.custoHora = dCustoHora;
        this.categoria = oCategoria;
    }

    /**
     *
     * Retorna o ID do ServicoLimitado
     *
     * @return ID do ServicoLimitado
     */
    public String getId() {
        return strId;
    }

    /**
     *
     * Define o ID do ServicoLimitado
     *
     * @param m_strId ID do ServicoLimitado
     */
    public void setId(String m_strId) {
        this.strId = m_strId;
    }

    /**
     *
     * Retorna a descrição breve do ServicoLimitado
     *
     * @return Descrição breve do ServicoLimitado
     */
    public String getDescBreve() {
        return descricaoBreve;
    }

    /**
     *
     * Define a descrição breve do ServicoLimitado
     *
     * @param m_strDescBreve Descrição breve do ServicoLimitado
     */
    public void setDescBreve(String m_strDescBreve) {
        this.descricaoBreve = m_strDescBreve;
    }

    /**
     *
     * Retorna a descrição completa do ServicoLimitado
     *
     * @return Descrição completa do ServicoLimitado
     */
    @Override
    public String getDescCompleta() {
        return descricaoCompleta;
    }

    /**
     *
     * Define a descrição completa do ServicoLimitado
     *
     * @param m_strDescCompleta Descrição completa do ServicoLimitado
     */
    public void setDescCompleta(String m_strDescCompleta) {
        this.descricaoCompleta = m_strDescCompleta;
    }

    /**
     *
     * Retorna o custo à hora do ServicoLimitado
     *
     * @return Custo à hora do ServicoLimitado
     */
    @Override
    public double getCustoHora() {
        return custoHora;
    }

    /**
     *
     * Define o custo à hora do ServicoLimitado
     *
     * @param m_dCustoHora Custo à hora do ServicoLimitado
     */
    public void setCustoHora(double m_dCustoHora) {
        this.custoHora = m_dCustoHora;
    }

    /**
     *
     * Retorna a categoria associada ao serviço
     *
     * @return Categoria em que o serviço se encontra catalogado
     */
    @Override
    public Categoria getCategoria() {
        return this.categoria;
    }

    /**
     *
     * Define a categoria associada ao serviço
     *
     * @param oCategoria Categoria em que o serviço irá ser catalogado
     */
    public void setCategoria(Categoria oCategoria) {
        this.categoria = oCategoria;
    }

    /**
     *
     * Retorna o tipo de serviço
     *
     * @return Descrição do tipo de serviço
     */
    @Override
    public String getTipoServico() {
        return "ServicoLimitado";
    }

    /**
     *
     * Verifica se o serviço pertence a uma determinada categoria
     *
     * @param oCat Categoria a verificar
     * @return True/false consoante o serviço pertença/ou não à categoria
     */
    @Override
    public boolean hasCat(Categoria oCat) {
        return this.categoria.getCodigo().equals(oCat.getCodigo());
    }

    /**
     * 
     * Retorna descrição do ServicoLimitado
     * 
     * @return Descrição do ServicoLimitado
     */
    @Override
    public String toString() {
        return descricaoBreve;
    }
}
