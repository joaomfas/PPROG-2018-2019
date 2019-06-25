package app.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoAreaGeografica {

    private ArrayList<AreaGeografica> listaAreasGeograficas = new ArrayList<>();

    /**
     * 
     * Adiciona uma Área Geográfica ao registo
     * 
     * @param oAreaGeo Área Geográfica a adicionar
     * @return True/False consoante o sucesso/insucesso da operação
     */
    public boolean addAreaGeografica(AreaGeografica oAreaGeo) {
        return listaAreasGeograficas.add(oAreaGeo);
    }

    /**
     * 
     * Retorna a Lista de Áreas Geográficas
     * 
     * @return Lista de Áreas Geográficas registadas
     */
    public List<AreaGeografica> getAreasGeograficas() {
        List<AreaGeografica> lag = new ArrayList<>();
        lag.addAll(this.listaAreasGeograficas);
        return lag;
    }

    /**
     * 
     * Retorna a Área Geográfica com uma determinada designação
     * 
     * @param strAGDesig Designação associada à Área Geográfica a procurar
     * @return Área Geográfica com a designação passada por parametro
     */
    public AreaGeografica getAGByDesig(String strAGDesig) {
        for (AreaGeografica areaGeo : this.listaAreasGeograficas) {
            if (areaGeo.getDesignacao().equals(strAGDesig)) {
                return areaGeo;
            }
        }
        return null;
    }

    /**
     * 
     * Retorna a Área Geográfica mais próxima de um determinado código postal
     * 
     * @param oCP Código postal a pesquisar
     * @return Área Geográfica mais próxima do código postal passado por parametro
     */
    public AreaGeografica getAreaGeoMaisProxima(CodigoPostal oCP) {
        AreaGeografica agMaisProxima;
        try {
             agMaisProxima = listaAreasGeograficas.get(0);
        } catch(NullPointerException e) {
            return null;
        }
        double menorDistancia = 9999999;
        for (AreaGeografica ag : listaAreasGeograficas) {
            double distancia = ag.getDistancia(oCP);
            if (distancia > -1) {
                System.out.println(oCP.toString() + " pertence a " + ag.getDesignacao() + " Distancia: " + distancia);
                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                    agMaisProxima = ag;
                }
            } else {}
        }
        if (menorDistancia < 9999999) {
            System.out.println("AG mais proxima " + agMaisProxima.getDesignacao());
            return agMaisProxima;
        }
        return null;
    }

    /**
     * 
     * Descrição completa da Área Geográfica
     * 
     * @return Descrição completa da Área Geográfica
     */
    @Override
    public String toString() {
        return "RegistoAreaGeografica{" + "m_oRegAreaGeo=" + listaAreasGeograficas + '}';
    }

    
}
