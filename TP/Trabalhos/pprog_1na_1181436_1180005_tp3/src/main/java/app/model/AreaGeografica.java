package app.model;

import java.util.ArrayList;

public class AreaGeografica {

    private ArrayList<AtuaEm> atuacao = new ArrayList<>();
    private String designacao;
    private CodigoPostal codPostalBase;
    private double raioAtuacao;
    private double custoDeslocacao;

    /**
     *
     * Cria uma instância de Área Geográfica
     *
     * @param designacao Designação da Área Geográfica
     * @param codPostalBase Código postal base
     * @param raioAtuacao Raio de atuação
     * @param custoDeslocacao Custo de deslocação da Área Geográfica
     */
    public AreaGeografica(String designacao, CodigoPostal codPostalBase, double raioAtuacao, double custoDeslocacao) {
        this.designacao = designacao;
        this.codPostalBase = codPostalBase;
        this.raioAtuacao = raioAtuacao;
        this.custoDeslocacao = custoDeslocacao;
    }

    /**
     *
     * Retorna a designação da Área Geográfica
     *
     * @return Designação da Área Geográfica
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     *
     * Define a designação da Área Geográfica
     *
     * @param m_strDesignacao Designação a definir
     */
    public void setDesignacao(String m_strDesignacao) {
        this.designacao = m_strDesignacao;
    }

    /**
     *
     * Retorna o código postal base
     *
     * @return Código postal base da Área Geográfica
     */
    public CodigoPostal getCodPostalBase() {
        return codPostalBase;
    }

    /**
     *
     * Retorna o raio de atuação
     * 
     * @return Raio de atuação da Área Geográfica
     */
    public double getRaioAtuacao() {
        return raioAtuacao;
    }

    /**
     * 
     * Define o raio de atuação
     * 
     * @param m_raioAtuacao Raio de atuação a definir
     */
    public void setraioAtuacao(double m_raioAtuacao) {
        this.raioAtuacao = m_raioAtuacao;
    }

    /**
     * 
     * Retorna os custos de deslocação
     * 
     * @return Custos de deslocação da Área Geográfica
     */
    public double getdCustoDeslocacao() {
        return custoDeslocacao;
    }

    /**
     * 
     * Define os custos de deslocação
     * 
     * @param m_dCustoDeslocacao Custos de deslocação da Área Geográfica
     */
    public void setCustoDeslocacao(double m_dCustoDeslocacao) {
        this.custoDeslocacao = m_dCustoDeslocacao;
    }

    /**
     * 
     * Calcula a distância entre a Área Geográfica e um dado Código Postal
     * 
     * @param oCP Código Postal usado para calcular a distância
     * @return Distância entre a Área Geográfica e um dado Código Postal
     */
    public double getDistancia(CodigoPostal oCP) {
        String enderecoBase = oCP.getStringCodigoPostal();
        for (AtuaEm atuaEm : atuacao) {
            String enderecoAtuaEm = atuaEm.getCp().getStringCodigoPostal();
            if (enderecoBase.equals(enderecoAtuaEm)) {
                return atuaEm.getDistancia();
            }
        }
        return -1;
    }

    /**
     * 
     * Retorna um ArrayList com os Códigos Postais que compõem a Área Geográfica
     * 
     * @return Códigos Postais em que a Área Geográfica atua
     */
    public ArrayList<AtuaEm> getAtuacao() {
        return atuacao;
    }

    /**
     * 
     * Retorna a informação da Área Geográfica
     * 
     * @return String com as informações da Área Geográfica
     */
    @Override
    public String toString() {
        return "AreaGeografica{" + ", designacao=" + designacao + ", codPostalBase=" + codPostalBase + ", raioAtuacao=" + raioAtuacao + ", custoDeslocacao=" + custoDeslocacao + "atuacao=" + atuacao + '}';
        //        return designacao;
    }

}
