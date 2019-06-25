package app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PedidoPrestacaoServico implements Serializable {

    private List<DescricaoDoServico> listaServicos = new ArrayList<>();
    private Cliente cliente;
    private EnderecoPostal enderecoPostal;
    private List<PreferenciaHorario> listaPreferencias = new ArrayList<>();
    private double custoTotal = 0;
    private List<OutroCusto> listaOutrosCustos = new ArrayList<>();

    /**
     *
     * Cria uma instância de PedidoPrestacaoServico
     *
     * @param m_oCliente Cliente associado ao pedido
     * @param m_oEnderecoPostal Endereço postal associado ao pedido
     */
    public PedidoPrestacaoServico(Cliente m_oCliente, EnderecoPostal m_oEnderecoPostal) {
        this.cliente = m_oCliente;
        this.enderecoPostal = m_oEnderecoPostal;
    }

    /**
     *
     * Adiciona uma descrição ao pedido
     *
     * @param oDescricaoServico Descrição do pedido
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addDescricao(DescricaoDoServico oDescricaoServico) {
        return listaServicos.add(oDescricaoServico);
    }
    
    /**
     * remove descricao de pedido
     * @param oDescricaoServico Descrição do Serviço a remover
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean removeDescricao(DescricaoDoServico oDescricaoServico) {
        return listaServicos.remove(oDescricaoServico);
    }

    /**
     *
     * Adiciona uma preferência de horário ao pedido
     *
     * @param oPreferenciaHorario Preferência de horário a adicionar
     * @return True/false consoante o sucesso/insucesso da operação
     */
    public boolean addHorario(PreferenciaHorario oPreferenciaHorario) {
        return listaPreferencias.add(oPreferenciaHorario);
    }


    /**
     *
     * Retorna a lista de serviços associada ao pedido
     *
     * @return Serviços associados ao pedido
     */
    public List<DescricaoDoServico> getM_listaServicos() {
        return listaServicos;
    }

    /**
     *
     * Retorna o cliente associado ao pedido
     *
     * @return Cliente associado ao pedido
     */
    public Cliente getM_oCliente() {
        return cliente;
    }

    /**
     *
     * Retorna o Endereço Postal associado ao pedido
     *
     * @return Endereço Postal associado ao pedido
     */
    public EnderecoPostal getM_oEnderecoPostal() {
        return enderecoPostal;
    }

    /**
     *
     * Retorna o custo total
     *
     * @return Custo total do pedido
     */
    public double getdCustoTotal() {
        return custoTotal;
    }

    /**
     *
     * Define a lista de serviços associacos ao pedido
     *
     * @param m_listaServicos Lista de serviços a associar ao pedido
     */
    public void setM_listaServicos(ArrayList<DescricaoDoServico> m_listaServicos) {
        this.listaServicos = m_listaServicos;
    }

    /**
     *
     * Define o cliente associado ao pedido
     *
     * @param m_oCliente Cliente a associar ao pedido
     */
    public void setM_oCliente(Cliente m_oCliente) {
        this.cliente = m_oCliente;
    }

    /**
     *
     * Define o Endereço Postal associado ao pedido
     *
     * @param m_oEnderecoPostal Endereço Postal a associar ao pedido
     */
    public void setM_oEnderecoPostal(EnderecoPostal m_oEnderecoPostal) {
        this.enderecoPostal = m_oEnderecoPostal;
    }

    /**
     *
     * Retorna a lista de preferencias de horario associada ao pedido
     *
     * @return Lista de preferencias de horario associada ao pedido
     */
    public List<PreferenciaHorario> getM_listaPreferenciaHorario() {
        return listaPreferencias;
    }

    /**
     *
     * Redefine o custo total do pedido
     *
     * @param dCustoTotal Custo total do pedido
     */
    public void setdCustoTotal(double dCustoTotal) {
        this.custoTotal = dCustoTotal;
    }

    /**
     *
     * Devolve a descrição completa do pedido
     *
     * @return Descrição completa do pedido
     */
    @Override
    public String toString() {
        return "Pedido efetuado por: " + cliente;
    }

    /**
     *
     * Retorna o numero de preferencias de horario
     *
     * @return Numero de preferencias de horario
     */
    public int getOrdem() {
        return listaPreferencias.size();
    }

    /**
     *
     * Devolve a descrição completa do pedido
     *
     * @return Descrição completa do pedido
     */
    public String toStringComplete() {
        String contents = "";
        contents += "Cliente:\t\t" + this.cliente;
        contents += "\nEndereço:\t\t" + this.enderecoPostal;
        contents += "\nPreferências de horário:";
        for (PreferenciaHorario horario : listaPreferencias) {
            contents += "\n" + horario.toString();
        }
        contents += "\nServiços:";
        for (DescricaoDoServico descricao : listaServicos) {
            contents += "\n" + descricao.toString();
        }
        contents += "\nCusto total: " + this.custoTotal;
        return contents;
    }

    /**
     *
     * Calcula e retorna o custo total do pedido
     *
     * @return Custo total do pedido
     */
    public double calcularCusto() {
        custoTotal = 0;
        double c = 0;
        for (DescricaoDoServico descricao : listaServicos) {
            c += descricao.getCusto();
        }
        listaOutrosCustos.clear();
        RegistoAreaGeografica rag = Empresa.getEmpresa().getRegistoAreaGeografica();
        CodigoPostal cp = enderecoPostal.getCodigoPostal();

        double custoDeslocacao = 0;
        try {
            AreaGeografica ag = rag.getAreaGeoMaisProxima(cp);
            custoDeslocacao = ag.getdCustoDeslocacao();
            OutroCusto oc = new OutroCusto("Custo de deslocação", custoDeslocacao);
            listaOutrosCustos.add(oc);
        } catch (NullPointerException e) {
            System.out.println("Não foi encontrada uma área geográfica");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        custoTotal = c + custoDeslocacao;
        return custoTotal;
    }

}
