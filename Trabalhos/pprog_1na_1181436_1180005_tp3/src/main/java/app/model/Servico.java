package app.model;

/**
 *
 * Interface Serviço com a declaração dos métodos que devem ser implementados 
 * 
 */
public interface Servico {
    public abstract String getTipoServico();
    public abstract boolean hasCat(Categoria oCat);
    public abstract String getDescCompleta();
    public abstract double getCustoHora();
    public abstract Categoria getCategoria();
}
