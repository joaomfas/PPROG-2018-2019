package app.model;

import java.io.Serializable;

/**
 *
 */
public class ServicoExpansivel implements Servico, Serializable{

    private String strId;
    private String descricaoBreve;
    private String descricaoCompleta;
    private double custoHora;
    private Categoria categoria;

    /**
     * 
     * Criação de uma instância de ServicoExpansivel
     * 
     * @param strId ID do ServicoExpansivel
     * @param strDescBreve Descrição breve do ServicoExpansivel
     * @param strDescCompleta Descrição completa do ServicoExpansivel
     * @param dCustoHora Custo à hora do ServicoExpansivel
     * @param oCategoria Categoria do ServicoExpansivel
     */
    public ServicoExpansivel(String strId, String strDescBreve, String strDescCompleta, double dCustoHora, Categoria oCategoria) {
        this.strId = strId;
        this.descricaoBreve = strDescBreve;
        this.descricaoCompleta = strDescCompleta;
        this.custoHora = dCustoHora;
        this.categoria = oCategoria;
    }

    /**
     * 
     * Retorna o ID do ServicoExpansivel
     * 
     * @return ID do ServicoExpansivel
     */
    public String getId() {
        return strId;
    }

    /**
     * 
     * Define o ID do ServicoExpansivel
     * 
     * @param m_strId ID do ServicoExpansivel
     */
    public void setId(String m_strId) {
        this.strId = m_strId;
    }

    /**
     * 
     * Retorna a descrição breve do ServicoExpansivel
     * 
     * @return Descrição breve do ServicoExpansivel
     */
    public String getDescBreve() {
        return descricaoBreve;
    }

    /**
     * 
     * Define a descrição breve do ServicoExpansivel
     * 
     * @param m_strDescBreve Descrição breve do ServicoExpansivel
     */
    public void setDescBreve(String m_strDescBreve) {
        this.descricaoBreve = m_strDescBreve;
    }

    /**
     * 
     * Retorna a descrição completa do ServicoExpansivel
     * 
     * @return Descrição completa do ServicoExpansivel
     */
    @Override
    public String getDescCompleta() {
        return descricaoCompleta;
    }

    /**
     * 
     * Define a descrição completa do ServicoExpansivel
     * 
     * @param m_strDescCompleta Descrição completa do ServicoExpansivel
     */
    public void setDescCompleta(String m_strDescCompleta) {
        this.descricaoCompleta = m_strDescCompleta;
    }

    /**
     * 
     * Retorna o custo à hora do ServicoExpansivel
     * 
     * @return Custo à hora do ServicoExpansivel
     */
    @Override
    public double getCustoHora() {
        return custoHora;
    }

    /**
     * 
     * Define o custo à hora do ServicoExpansivel
     * 
     * @param m_dCustoHora Custo à hora do ServicoExpansivel
     */
    public void setCustoHora(double m_dCustoHora) {
        this.custoHora = m_dCustoHora;
    }

    /**
     * 
     * Retorna o tipo de serviço
     * 
     * @return Descrição do tipo de serviço
     */
    @Override
    public String getTipoServico() {
        return "ServicoExpansivel";
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
     * Retorna descrição do ServicoExpansivel
     * 
     * @return Descrição do ServicoExpansivel
     */
    @Override
    public String toString() {
        return descricaoBreve;
    }
}
