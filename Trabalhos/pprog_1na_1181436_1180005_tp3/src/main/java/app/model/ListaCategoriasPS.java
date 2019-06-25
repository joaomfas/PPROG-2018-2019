package app.model;

import java.util.ArrayList;

public class ListaCategoriasPS {
    private ArrayList<Categoria> listaCategorias;

    public ListaCategoriasPS() {
        listaCategorias = new ArrayList<>();
    }
    
    public boolean addCategoria(Categoria oCat){
        return listaCategorias.add(oCat);
    }

    public ArrayList<Categoria> getM_oListaCats() {
        return listaCategorias;
    }

    @Override
    public String toString() {
        return "ListaCategoriasPS{" + "m_oListaCats=" + listaCategorias + '}';
    }
    
    
}
