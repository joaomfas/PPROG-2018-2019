package app.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoCategoria {

    private ArrayList<Categoria> listaCategorias;

    /**
     * 
     * Cria uma instância de RegistoCategoria
     * 
     */
    public RegistoCategoria() {
        listaCategorias = new ArrayList<>();
    }

    /**
     * 
     * Adiciona uma Categoria ao Registo
     * 
     * @param oCategoria Categoria a adiconar ao Registo
     * @return True/False consoante o sucesso/insucesso da operação
     */
    public boolean addCategoria(Categoria oCategoria) {
        return listaCategorias.add(oCategoria);
    }

    /**
     * 
     * Retorna as categorias registadas
     * 
     * @return Categorias inseridas no Registo
     */
    public List<Categoria> getCategorias() {
        List<Categoria> lc = new ArrayList<>();
        lc.addAll(this.listaCategorias);
        return lc;
    }

    /**
     * 
     * Procura e retorna a categoria com um determinado ID
     * 
     * @param strId ID a pesquisar
     * @return Categoria com o ID pesquisado
     */
    public Categoria getCatById(String strId) {
        for (Categoria cat : this.listaCategorias) {
            if (cat.hasCodigo(strId)) {
                return cat;
            }
        }
        return null;
    }
}
