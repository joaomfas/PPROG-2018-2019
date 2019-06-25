package app.model;

import java.util.ArrayList;
import java.util.List;


public class RegistoAdministrativo {
    private List<Administrativo> listaAdministrativos;

    /**
     * 
     * Cria uma instância de Registo Administrativo
     * 
     */
    public RegistoAdministrativo() {
        listaAdministrativos = new ArrayList<>();
    }

    /**
     * 
     * Retorna a lista de administrativos
     * 
     * @return Lista de Administrativos registados
     */
    public List<Administrativo> getListaAdministrativos() {
        return listaAdministrativos;
    }
    
    /**
     * 
     * Adiciona um Administrativo ao registo
     * 
     * @param administrativo Administrativo a adicionar
     */
    public void addAdministrativo(Administrativo administrativo) {
        this.listaAdministrativos.add(administrativo);
    }
    
}
