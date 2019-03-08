package org.dei.isep.ipp.pt.pl6_impostoextraordinario;

public class Morada {

    private String morada;
    private String codigoPostal;
    private String localidade;

    public Morada(String morada, String codigoPostal, String localidade) {
        this.morada = morada;
        this.codigoPostal = codigoPostal;
        this.localidade = localidade;
    }

    public String getMorada() {
        return morada;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Morada: " + morada + "\nCódigo postal: " + codigoPostal + "\nLocalidade: " + localidade;
    }
    
    
}
