package app.model;

public class AtribuicaoDeServico {

    private PrestadorServico prestadorAtribuido;
    private PreferenciaHorario horarioAtribuido;
    private DescricaoDoServico servicoAtribuido;
    private PedidoPrestacaoServico pedidoReferente;

    /**
     *
     * Cria uma instância de AtribuicaoDeServico
     *
     * @param prestadorAtribuido Prestador atribuido
     * @param servicoAtribuido Serviço do pedido atribuido
     * @param pedidoReferente Pedido referente ao serviço
     */
    public AtribuicaoDeServico(PrestadorServico prestadorAtribuido, DescricaoDoServico servicoAtribuido, PedidoPrestacaoServico pedidoReferente) {
        this.prestadorAtribuido = prestadorAtribuido;
        this.servicoAtribuido = servicoAtribuido;
        this.pedidoReferente = pedidoReferente;
    }

    /**
     *
     * Retorna o Prestador atribuido
     * 
     * @return Prestador atribuido
     */
    public PrestadorServico getPrestadorAtribuido() {
        return prestadorAtribuido;
    }

    /**
     * 
     * Retorna o horario atribuido
     * 
     * @return Horario atribuido
     */
    public PreferenciaHorario getHorarioAtribuido() {
        return horarioAtribuido;
    }

    /**
     * 
     * Retorna o Serviço atribuido
     * 
     * @return Serviço atribuido
     */
    public DescricaoDoServico getServicoAtribuido() {
        return servicoAtribuido;
    }

    /**
     * 
     * Retorna o Pedido referente ao serviço atribuido
     * 
     * @return Pedido referente ao serviço atribuido
     */
    public PedidoPrestacaoServico getPedidoReferente() {
        return pedidoReferente;
    }

    /**
     * 
     * Define o Prestador atribuido
     * 
     * @param prestadorAtribuido Prestador atribuido
     */
    public void setPrestadorAtribuido(PrestadorServico prestadorAtribuido) {
        this.prestadorAtribuido = prestadorAtribuido;
    }

    /**
     * 
     * Define o horário atribuido
     * 
     * @param horarioAtribuido Horário atribuido
     */
    public void setHorarioAtribuido(PreferenciaHorario horarioAtribuido) {
        this.horarioAtribuido = horarioAtribuido;
    }

    /**
     * 
     * Define o serviço atribuido
     * 
     * @param servicoAtribuido Serviço atribuido
     */
    public void setServicoAtribuido(DescricaoDoServico servicoAtribuido) {
        this.servicoAtribuido = servicoAtribuido;
    }

    /**
     * 
     * Define o Pedido referente ao serviço atribuido
     * 
     * @param pedidoReferente Pedido referente ao serviço atribuido
     */
    public void setPedidoReferente(PedidoPrestacaoServico pedidoReferente) {
        this.pedidoReferente = pedidoReferente;
    }

}
