package app.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 */
public class ListaEnderecoPostal implements Serializable{

    private ArrayList<EnderecoPostal> listaEnderecos;

    /**
     * 
     * Cria uma instância de ListaEnderecoPostal
     * 
     */
    public ListaEnderecoPostal() {
        this.listaEnderecos = new ArrayList<>();
    }

    /**
     * 
     * Adiciona um Endereço Postal à Lista
     * 
     * @param oEnderecoPostal Endereço Postal a adicionar
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addEnderecoPostal(EnderecoPostal oEnderecoPostal) {
        return listaEnderecos.add(oEnderecoPostal);
    }
    
    /**
     * 
     * Remoda um Endereço Postal da Lista
     * 
     * @param oEnderecoPostal Endereço Postal a remover
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean removeEnderecoPostal(EnderecoPostal oEnderecoPostal){
        return listaEnderecos.remove(oEnderecoPostal);
    }
    
    /**
     * 
     * Retorna a Lista de Endereços Postais
     * 
     * @return Lista de Endereços Postais
     */
    public ArrayList<EnderecoPostal> getEnderecosPostais(){
        return listaEnderecos;
    }
}
