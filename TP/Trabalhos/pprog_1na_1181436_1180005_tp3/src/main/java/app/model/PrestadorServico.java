package app.model;

import java.util.List;

/**
 *
 */
public class PrestadorServico {

    private String nome;
    private String numeroMec;
    private String abreviacao;
    private String email;
    private ListaDisponibilidadesDiaria listaDisponibilidade;
    private ListaCategoriasPS listaCategorias;
    private ListaAreaGeograficaPS listaAreasGeograficasPS;

    /**
     *
     * Cria uma instância de Prestador de Serviço
     *
     * @param strNome Nome do Prestador de Serviço
     * @param strNumMec Número mecanografico do Prestador de Serviço
     * @param strAbrev Abreviatura do Prestador de Serviço
     * @param strEmail Email do Prestador de Serviço
     */
    public PrestadorServico(String strNome, String strNumMec, String strAbrev, String strEmail) {
        if ((strNome == null)
                || (strNumMec == null)
                || (strAbrev == null)
                || (strEmail == null)
                || (strNome.isEmpty())
                || (strNumMec.isEmpty())
                || (strAbrev.isEmpty())
                || (strEmail.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }
        this.listaAreasGeograficasPS = new ListaAreaGeograficaPS();
        this.listaCategorias = new ListaCategoriasPS();
        this.listaDisponibilidade = new ListaDisponibilidadesDiaria();
        this.nome = strNome;
        this.numeroMec = strNumMec;
        this.abreviacao = strAbrev;
        this.email = strEmail;

        listaDisponibilidade = new ListaDisponibilidadesDiaria();
        listaCategorias = new ListaCategoriasPS();
        listaAreasGeograficasPS = new ListaAreaGeograficaPS();
    }

    /**
     *
     * Retorna o nome do Prestador de Serviço
     *
     * @return Nome do Prestador de Serviço
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * Define o nome do Prestador de Serviço
     *
     * @param m_strNome Nome do Prestador de Serviço
     */
    public void setNome(String m_strNome) {
        this.nome = m_strNome;
    }

    /**
     *
     * Retorna o numero mecanografico do Prestador de Serviço
     *
     * @return Numero mecanografico do Prestador de Serviço
     */
    public String getNumMec() {
        return numeroMec;
    }

    /**
     *
     * Define o numero mecanografico do Prestador de Serviço
     *
     * @param m_strNumMec Numero mecanografico do Prestador de Serviço
     */
    public void setNumMec(String m_strNumMec) {
        this.numeroMec = m_strNumMec;
    }

    /**
     *
     * Retorna a abreviatura do Prestador de Serviço
     *
     * @return Abreviatura do Prestador de Serviço
     */
    public String getAbrev() {
        return abreviacao;
    }

    /**
     *
     * Define a abreviatura do Prestador de Serviço
     *
     * @param m_strAbrev Abreviatura do Prestador de Serviço
     */
    public void setAbrev(String m_strAbrev) {
        this.abreviacao = m_strAbrev;
    }

    /**
     *
     * Retorna o email do Prestador de Serviço
     *
     * @return Email do Prestador de Serviço
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * Define o Email do Prestador de Serviço
     *
     * @param m_strEmail Email do prestador de serviço
     */
    public void setEmail(String m_strEmail) {
        this.email = m_strEmail;
    }

    /**
     *
     * Retorna a lista de Disponibilidades do Prestador de Serviço
     *
     * @return Lista de Disponibilidades do Prestador de Serviço
     */
    public ListaDisponibilidadesDiaria getlistaDisponibilidades() {
        return listaDisponibilidade;
    }

    /**
     *
     * Define a lista de Disponibilidades do Prestador de Serviço
     *
     * @param m_listaDisponibilidades Lista de Disponibilidades do Prestador de
     * Serviço
     */
    public void setlistaDisponibilidades(ListaDisponibilidadesDiaria m_listaDisponibilidades) {
        this.listaDisponibilidade = m_listaDisponibilidades;
    }

    /**
     *
     * Verifica se o Prestador tem um determinado Email
     *
     * @param strEmail Email a investigar
     * @return True/false consonate o prestador tem ou não o email em análise
     */
    public boolean hasEmail(String strEmail) {
        return this.email.equalsIgnoreCase(strEmail);
    }

    /**
     *
     * Adiciona uma categoria ao prestador de serviço
     *
     * @param oCat Categoria a adicionar
     * @return True/false consoante o sucesso ou insucesso da operação
     */
    public boolean addCategoria(Categoria oCat) {
        return listaCategorias.addCategoria(oCat);
    }

    /**
     *
     * Adiciona uma área geografica ao prestador de serviço
     *
     * @param oAreaGeo AreaGeografica a adicionar
     * @return True/false consoante o sucesso ou insucesso da operação
     */
    public boolean addAreaGeografica(AreaGeografica oAreaGeo) {
        return listaAreasGeograficasPS.addAreaGeografica(oAreaGeo);
    }

    /**
     *
     * Retorna a Lista de Disponibilidades
     *
     * @return Lista de Disponibilidades
     */
    public ListaDisponibilidadesDiaria getM_listaDisponibilidades() {
        return listaDisponibilidade;
    }

    /**
     *
     * Retorna a Lista de Categorias
     *
     * @return Lista de Categorias
     */
    public ListaCategoriasPS getM_listaCategorias() {
        return listaCategorias;
    }

    /**
     *
     * Retorna a Lista de Áreas Geográficas
     *
     * @return Lista de Áreas Geográficas
     */
    public ListaAreaGeograficaPS getM_listaAG() {
        return listaAreasGeograficasPS;
    }

    /**
     *
     * Verifica se o prestador atua numa determinada Área Geográfica
     *
     * @param ag Área Geográfica
     * @return True/false consoante o Prestador atue ou não nessa área
     */
    public boolean atuaEmAG(AreaGeografica ag) {
        for (AreaGeografica areaGeografica : this.listaAreasGeograficasPS.getM_oListaAG()) {
            if (areaGeografica.equals(ag)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * Verifica se o Prestador realiza serviços de uma determinada categoria
     *
     * @param cat Categoria
     * @return True/false consoante o Prestador realize ou não serviços dessa
     * categoria
     */
    public boolean realizaServicoDeCategoria(Categoria cat) {
        for (Categoria categoria : this.listaCategorias.getM_oListaCats()) {
            if (categoria.equals(cat)) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * Verifica se o Prestador realiza um determinado serviço
     *
     * @param servico Serviço
     * @return True/false consoante o Prestador realize ou o serviço
     */
    public boolean realizaServico(Servico servico) {
        Categoria categoriaDoServico = servico.getCategoria();
        return realizaServicoDeCategoria(categoriaDoServico);
    }

    /**
     * Verifica se para cada disponibilidade do prestador existe alguma
     * preferencia de horário na listaPreferenciaHorario que seja compatível
     * (esteja dentro do intervalo de horário da disponibilidade)
     *
     * @param listaPreferenciaHoriario Lista de Preferências de Horário
     * @return True/false consoante o Prestador esteja ou não disponivel
     */
    public boolean estaDisponivelEm(List<PreferenciaHorario> listaPreferenciaHoriario) {
        List<Disponibilidade> listaDispPrestador = listaDisponibilidade.getM_oListaDispDiaria();
        for (Disponibilidade disponibilidade : listaDispPrestador) {
            for (PreferenciaHorario preferenciaHorario : listaPreferenciaHoriario) {
                if (disponibilidade.contemHorario(preferenciaHorario)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * Retorna a descrição do prestador de serviço
     *
     * @return Descrição do prestador de serviço
     */
    @Override
    public String toString() {
        return email;
    }

    /**
     * verifica se o prestador pode ser atribuido a determinado serviço de um
     * pedido. para tanto, deve atuar na AreaGeografica em que o pedido é
     * realizado, deve possuir categoria que contenha o serviço e deve possuir
     * disponibilidade compatível com pelo menos uma preferencia de horário do
     * pedido
     *
     * @param agMaisProxima Área Geográfica mais próxima do local do serviço
     * @param servico Serviço
     * @param listaPreferenciaHorarios Lista de preferência de horários do pedido
     * @return True/false consoante o prestador possa ou não ser afeto ao serviço
     */
    public boolean podeSerAfetado(AreaGeografica agMaisProxima, Servico servico, List<PreferenciaHorario> listaPreferenciaHorarios) {
        if (this.atuaEmAG(agMaisProxima)) {
            System.out.println("\nprestador atua na ag");
            if (this.realizaServico(servico)) {
                System.out.println("\nprestador realiza o serviço");
                if (this.estaDisponivelEm(listaPreferenciaHorarios)) {
                    System.out.println("\nprestador tem disponibilidade");
                    return true;
                }
            }
        }
        return false;
    }

}
