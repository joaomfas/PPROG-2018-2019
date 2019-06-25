package app.model;


public class AtuaEm {
    private CodigoPostal cp;
    private double distancia;

    /**
     * 
     * Cria uma instância de AtuaEm
     * 
     * @param cp Código Postal
     * @param distancia Distância
     */
    public AtuaEm(CodigoPostal cp, double distancia) {
        this.cp = cp;
        this.distancia = distancia;
    }

    /**
     * 
     * Retorna o Código Postal
     * 
     * @return Código Postal
     */
    public CodigoPostal getCp() {
        return cp;
    }

    /**
     * 
     * Retorna a distância
     * 
     * @return Distância
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * 
     * Devolve a descrição de AtuaEm
     * 
     * @return Descrição de AtuaEm
     */
    @Override
    public String toString() {
        return "AtuaEm{" + "cp=" + cp + ", distancia=" + distancia + '}';
    }
    
    
}
