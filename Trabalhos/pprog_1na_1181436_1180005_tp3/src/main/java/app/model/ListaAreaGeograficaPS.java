package app.model;

import java.util.ArrayList;

/**
 *
 */
public class ListaAreaGeograficaPS {

    private ArrayList<AreaGeografica> listaAreasGeograficas;

    /**
     * Cria uma instância de ListaAreaGeograficaPS
     */
    public ListaAreaGeograficaPS() {
        listaAreasGeograficas = new ArrayList<>();
    }

    public boolean addAreaGeografica(AreaGeografica oAreaGeo) {
        return listaAreasGeograficas.add(oAreaGeo);
    }

    public ArrayList<AreaGeografica> getM_oListaAG() {
        return listaAreasGeograficas;
    }

    @Override
    public String toString() {
        return "ListaAreaGeograficaPS{" + "m_oListaAG=" + listaAreasGeograficas + '}';
    }
    
    
}
