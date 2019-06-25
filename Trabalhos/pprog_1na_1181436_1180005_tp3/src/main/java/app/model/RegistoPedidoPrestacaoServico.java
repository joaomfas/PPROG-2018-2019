package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RegistoPedidoPrestacaoServico implements Serializable {

    private ArrayList<PedidoPrestacaoServico> listaPedidos;

    /**
     *
     * Cria uma instância de RegistoPedidoPrestacaoServico
     *
     */
    public RegistoPedidoPrestacaoServico() {
        listaPedidos = new ArrayList<>();
    }

    /**
     *
     * Adiciona um Pedido de Prestação de Serviço ao Registo
     *
     * @param oPedidoPrestServico Pedido de Prestação de Serviço a adicionar ao
     * Registo
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addPedidoPrestacaoServico(PedidoPrestacaoServico oPedidoPrestServico) {
        return listaPedidos.add(oPedidoPrestServico);
    }

    /**
     *
     * remove um Pedido de Prestação de Serviço ao Registo
     *
     * @param oPedidoPrestServico Pedido de Prestação de Serviço a remove ao
     * Registo
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean removePedidoPrestacaoServico(PedidoPrestacaoServico oPedidoPrestServico) {
        return listaPedidos.remove(oPedidoPrestServico);
    }

    /**
     *
     * Retorna a lista de todos os pedidos de prestação de serviços registados
     *
     * @return Lista de todos os pedidos de prestação de serviços registados
     */
    public List<PedidoPrestacaoServico> getPedidosPrestacaoServico() {
        List<PedidoPrestacaoServico> lpps = new ArrayList<>();
        lpps.addAll(this.listaPedidos);
        return lpps;
    }
}
