package app.model;

import java.io.Serializable;

public class CodigoPostal implements Serializable {

    private String codigo;

    /**
     * 
     * Cria uma instância de Código Postal
     * 
     * @param strCodPostal Código Postal
     */
    public CodigoPostal(String strCodPostal) {
        if (strCodPostal == null) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }

        this.codigo = strCodPostal;
    }

    /**
     * 
     * Retorna o Código Postal
     * 
     * @return Código Postal
     */
    public String getStringCodigoPostal() {
        return codigo;
    }

    /**
     * 
     * Define o Código Postal
     * 
     * @param m_strCodigoPostal Código Postal em String
     */
    public void setCodigoPostal(String m_strCodigoPostal) {
        this.codigo = m_strCodigoPostal;
    }

    /**
     * 
     * Retorna a descrição de Código Postal
     * 
     * @return Descrição do Código Postal
     */
    @Override
    public String toString() {
        return codigo;
    }
}
