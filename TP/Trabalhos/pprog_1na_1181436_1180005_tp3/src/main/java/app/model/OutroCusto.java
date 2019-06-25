package app.model;

import java.io.Serializable;

class OutroCusto implements Serializable{
    
    private String designacao;
    private double valor;

    /**
     * 
     * Cria uma instância de OutroCusto
     * 
     * @param designacao Designação do Custo
     * @param valor Valor do Custo
     */
    public OutroCusto(String designacao, double valor) {
        this.designacao = designacao;
        this.valor = valor;
    }

    /**
     * 
     * Retorna a descrição de OutroCusto
     * 
     * @return Descrição de OutroCusto
     */
    @Override
    public String toString() {
        return "Custo: " + designacao + " : valor " + valor;
    }
    
}
