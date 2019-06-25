package app.model;

/**
 * Empresa Singleton
 */
public class Empresa {

    private static Empresa empresa;
    private String designacao;
    private String NIF;
    private RegistoCategoria registoCategoria;
    private RegistoServico registoServico;
    private RegistoCliente registoCliente;
    private RegistoPedidoPrestacaoServico registoPedidoPrestacaoServico;
    private RegistoPrestadorServico registoPrestadorServico;
    private RegistoAreaGeografica registoAreaGeografica;
    private RegistoAdministrativo registoAdministrativo;
    private RegistoAtribuicoes registoAtribuicoes;

    /**
     *
     * Cria a instância Singleton de Empresa
     *
     * @param strDesignacao Designação da Empresa
     * @param strNIF NIF da Empresa
     * @return True/False conforme a instância tenha sido criada ou não
     */
    public static boolean criarEmpresa(String strDesignacao, String strNIF) {
        if (getEmpresa() == null) {
            empresa = new Empresa(strDesignacao, strNIF);
            return true;
        }
        return false;
    }

    /**
     *
     * Retorna a instância de Empresa
     *
     * @return Instância de Empresa
     */
    public static Empresa getEmpresa() {
        return empresa;
    }

    /**
     *
     * Cria uma instância de Empresa
     *
     * @param strDesignacao Designação da Empresa
     * @param strNIF NIF da Empresa
     */
    private Empresa(String strDesignacao, String strNIF) {
        if ((strDesignacao == null) || (strNIF == null)
                || (strDesignacao.isEmpty()) || (strNIF.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }
        this.designacao = strDesignacao;
        this.NIF = strNIF;
        this.registoCategoria = new RegistoCategoria();
        this.registoServico = new RegistoServico();
        this.registoCliente = new RegistoCliente();
        this.registoPedidoPrestacaoServico = new RegistoPedidoPrestacaoServico();
        this.registoPrestadorServico = new RegistoPrestadorServico();
        this.registoAreaGeografica = new RegistoAreaGeografica();
        this.registoAdministrativo = new RegistoAdministrativo();
        this.registoAtribuicoes = new RegistoAtribuicoes();
    }

    /**
     *
     * Retorna a designação da Empresa
     *
     * @return Designação da Empresa
     */
    public String getM_strDesignacao() {
        return designacao;
    }

    /**
     *
     * Retorna o Registo de Administrativos
     *
     * @return Registo de Administrativos
     */
    public RegistoAdministrativo getRegistoAdministrativo() {
        return registoAdministrativo;
    }

    /**
     *
     * Retorna o NIF da Empresa
     *
     * @return NIF da Empresas
     */
    public String getM_strNIF() {
        return NIF;
    }

    /**
     *
     * Retorna o Registo de Categorias
     *
     * @return Registo de Categorias
     */
    public RegistoCategoria getRegistoCategoria() {
        return registoCategoria;
    }

    /**
     *
     * Retorna o Registo de Serviços
     *
     * @return Registo de Serviços
     */
    public RegistoServico getRegistoServico() {
        return registoServico;
    }

    /**
     *
     * Retorna o Registo de Clientes
     *
     * @return Registo de Clientes
     */
    public RegistoCliente getRegistoCliente() {
        return registoCliente;
    }

    /**
     *
     * Retorna o Registo de Áreas Geográficas
     *
     * @return Registo de Áreas Geográficas
     */
    public RegistoAreaGeografica getRegistoAreaGeografica() {
        return registoAreaGeografica;
    }

    /**
     *
     * Retorna o Registo de Pedidos de Prestação de Serviços
     *
     * @return Registo de Pedidos de Prestação de Serviços
     */
    public RegistoPedidoPrestacaoServico getRegistoPedidoPrestacaoServico() {
        return registoPedidoPrestacaoServico;
    }

    /**
     *
     * Registo de Prestadores de Serviços
     *
     * @return Registo de Prestadores de Serviços
     */
    public RegistoPrestadorServico getRegistoPrestadorServico() {
        return registoPrestadorServico;
    }

    /**
     * 
     * Define o Registo de Pedido de Prestação de Serviços
     * 
     * @param registoPedidoPrestacaoServico  Registo de Pedido de Prestação de Serviços
     */
    public void setRegistoPedidoPrestacaoServico(RegistoPedidoPrestacaoServico registoPedidoPrestacaoServico) {
        this.registoPedidoPrestacaoServico = registoPedidoPrestacaoServico;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getNIF() {
        return NIF;
    }

    public RegistoAtribuicoes getRegistoAtribuicoes() {
        return registoAtribuicoes;
    }
    
    

}
