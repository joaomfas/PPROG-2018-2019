package app.model;

import java.io.Serializable;

public class EnderecoPostal implements Serializable {

    private String local;
    private CodigoPostal codigoPostal;
    private String localidade;

    /**
     * 
     * Cria uma instância de Endereço Postal
     * 
     * @param local Local referente ao Endereço Postal
     * @param codigoPostal Código Postal
     * @param localidade Localidade
     */
    public EnderecoPostal(String local, CodigoPostal codigoPostal, String localidade) {
        this.local = local;
        this.codigoPostal = codigoPostal;
        this.localidade = localidade;
    }

    /**
     * 
     * Retorna o local referente ao Endereço Postal
     * 
     * @return Local referente ao Endereço Postal
     */
    public String getLocal() {
        return local;
    }

    /**
     * 
     * Retorna o Código Postal
     * 
     * @return Código Postal
     */
    public CodigoPostal getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * 
     * Retorna a localidade
     * 
     * @return Localidade
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * 
     * Retorna a descrição do Endereço Postal
     * 
     * @return Descrição completa do Endereço Postal
     */
    @Override
    public String toString() {
        return String.format("%s - %s - %s", this.local, this.codigoPostal, this.localidade);
    }
}
