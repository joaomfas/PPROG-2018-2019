package org.dei.isep.ipp.pt.plcomp_imc;

public class Morada {

    private String localidade;
    private String codigoPostal;
    private String morada;

    public Morada(String localidade, String codigoPostal, String morada) {
        this.localidade = localidade;
        this.codigoPostal = codigoPostal;
        this.morada = morada;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getMorada() {
        return morada;
    }

    @Override
    public String toString() {
        return "%nLocalidade: " + localidade + "%nCodigo Postal: " + codigoPostal + "%nMorada: " + morada;
    }

    
    
}
