package app.model;

import java.util.ArrayList;
import java.util.List;

public class RegistoCliente {

    private ArrayList<Cliente> listaClientes;

    /**
     * 
     * Cria uma instância de RegistoCliente
     * 
     */
    public RegistoCliente() {
        listaClientes = new ArrayList<>();
    }

    /**
     * 
     * Adiciona um Cliente ao Registo
     * 
     * @param oCliente Cliente a adicionar ao registo
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addCliente(Cliente oCliente) {
        return listaClientes.add(oCliente);
    }

    /**
     * 
     * Retorna a lista de Clientes registados
     * 
     * @return Lista de clientes registados no sistema
     */
    public List<Cliente> getClientes() {
        List<Cliente> lc = new ArrayList<>();
        lc.addAll(this.listaClientes);
        return lc;
    }

    /**
     * 
     * Procura e retorna o cliente com um determinado email
     * 
     * @param strEmail Email a pesquisar
     * @return Cliente associado ao email pesquisado
     */
    public Cliente getClienteByEmail(String strEmail) {
        for (Cliente cliente : this.listaClientes) {
            if (cliente.hasEmail(strEmail)) {
                return cliente;
            }
        }
        return null;
    }
}
