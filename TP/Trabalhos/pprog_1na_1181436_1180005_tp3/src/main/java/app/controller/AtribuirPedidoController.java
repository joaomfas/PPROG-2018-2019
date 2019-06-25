package app.controller;

import app.model.RegistoPedidoPrestacaoServico;
import app.model.RegistoAdministrativo;
import app.model.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class AtribuirPedidoController extends SceneController implements Initializable {

    Empresa empresa = Empresa.getEmpresa();
    private RegistoAdministrativo ra = empresa.getRegistoAdministrativo();
    private RegistoPedidoPrestacaoServico rp = empresa.getRegistoPedidoPrestacaoServico();
    private List<Administrativo> la;
    private Administrativo adm;
    private List<PedidoPrestacaoServico> lp;
    private PedidoPrestacaoServico pedido;
    private List<DescricaoDoServico> lds;
    private DescricaoDoServico servicoSelecionado;
    private PrestadorServico prestadorSelecionado;

    @FXML
    private Button cancelarButton;
    @FXML
    private ComboBox<Administrativo> administrativoComboBox;
    @FXML
    private HBox enderecoBox;
    @FXML
    private ComboBox<PedidoPrestacaoServico> pedidoComboBox;
    @FXML
    private Button atribuirPedidoButton;
    @FXML
    private ListView<DescricaoDoServico> listServicos;
    @FXML
    private TextArea txtDescricao;
    @FXML
    private ListView<PrestadorServico> listPrestadores;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pedidoComboBox.setDisable(true);
        atribuirPedidoButton.setDisable(true);
        popularAdministrativoComboBox();
    }

    /**
     *
     * Popula a administrativoComboBox com os Administrativos registados
     *
     */
    private void popularAdministrativoComboBox() {
        this.la = ra.getListaAdministrativos();
        administrativoComboBox.getItems().addAll(la);
    }

    /**
     *
     * Popula a pedidoComboBox com os Pedidos realizados
     *
     */
    private void popularPedidoComboBox() {
        lp = rp.getPedidosPrestacaoServico();
        System.out.println("lp: " + lp);
        System.out.println("rp: " + rp);
        if (lp.isEmpty()) {
            SceneController.criarAlerta("Não há pedidos de prestação de serviço registados.", "Atenção!", Alert.AlertType.WARNING);
        }
        pedidoComboBox.getItems().addAll(lp);
    }

    /**
     *
     * Gere o comportamento do handleCancelarButton
     *
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleCancelarButton(ActionEvent event) {
        this.mainController.backToMainMenu();
    }

    /**
     *
     * Gere o comportamento do AdministrativoComboBox
     *
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleAdministrativoComboBox(ActionEvent event) {
        administrativoComboBox.setDisable(true);
        pedidoComboBox.setDisable(false);
        this.adm = administrativoComboBox.getValue();
        System.out.println("Administrativo selecionado: " + adm);
        popularPedidoComboBox();
    }

    /**
     *
     * Gere o comportamento do PedidoComboBox
     *
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handlePedidoComboBox(ActionEvent event) {
        pedido = pedidoComboBox.getValue();
        popularListaServicos();
        pedidoComboBox.setDisable(true);
    }

    /**
     *
     * Gere o comportamento do AtribuirPedidoButton
     *
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleAtribuirPedidoButton(ActionEvent event) {
        atribuirPedido();
    }

    /**
     *
     * Confirma a operação realizada
     *
     */
    @Override
    public void confirmar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * Atribui o pedido selecionado ao Prestador de Serviços Selecionado
     *
     */
    private void atribuirPedido() {
        RegistoCategoria registoCategoria = empresa.getRegistoCategoria();
        List<PrestadorServico> listaPrestadores = empresa.getRegistoPrestadorServico().getPrestadoresServicos();
        List<PreferenciaHorario> listaPreferenciaHorario = pedido.getM_listaPreferenciaHorario();
        try {
            AtribuicaoDeServico novaAtribuicao = new AtribuicaoDeServico(prestadorSelecionado, servicoSelecionado, pedido);
            Empresa.getEmpresa().getRegistoAtribuicoes().addAtribuicao(novaAtribuicao);
            pedido.removeDescricao(servicoSelecionado);
            popularListaServicos();
            SceneController.criarAlerta("Serviço atribuido a prestador com sucesso!", "", Alert.AlertType.INFORMATION);
            if (pedido.getM_listaServicos().isEmpty()) {
                rp.removePedidoPrestacaoServico(pedido);
                SceneController.criarAlerta("Todos serviços do pedido foram atribuidos!", "", Alert.AlertType.INFORMATION);
                handleCancelarButton(new ActionEvent());
            }
            txtDescricao.clear();
            listPrestadores.getItems().clear();
        } catch (Exception e) {
            SceneController.criarAlerta(e.getMessage(), "Erro!", Alert.AlertType.ERROR);
        }
    }

    /**
     * popula a lista de serviços do pedido selecionado
     */
    private void popularListaServicos() {
        listServicos.getItems().clear();
        List<DescricaoDoServico> listaDescricaoServicos = this.pedido.getM_listaServicos();
        listServicos.getItems().addAll(listaDescricaoServicos);

    }

    /**
     * popula o campo de descrição do serviço selecionado
     */
    private void popularDescricao() {
        txtDescricao.clear();
        txtDescricao.appendText("Descrição:\t");
        txtDescricao.appendText(servicoSelecionado.getM_strDescricao());
        txtDescricao.appendText("\nDuração:\t");
        txtDescricao.appendText(String.valueOf(servicoSelecionado.getM_dDuracao()));
        txtDescricao.appendText("\nCusto:\t");
        txtDescricao.appendText(String.valueOf(servicoSelecionado.getCusto()));
    }

    /**
     * popula o campo ViewList com prestadores de serviço disponíveis para o
     * serviço selecionado
     */
    private void popularPrestadoresDisponiveis() {
        listPrestadores.getItems().clear();
        listPrestadores.getItems().addAll(getPrestadoresDisponiveis());
        if (listPrestadores.getItems().isEmpty()) {
            SceneController.criarAlerta("Prestadores não disponíveis para esse serviço", "Erro!", Alert.AlertType.ERROR);
        }
    }

    /**
     * retorna a lista de prestadores disponíveis para um serviço requer que o
     * usuário tenha selecionado um pedido de prestação de serviço e um
     * determinado serviço do pedido.
     *
     * @return Lista de Prestadores de Serviço disponiveis para um determinado
     * serviço
     */
    public List<PrestadorServico> getPrestadoresDisponiveis() {
        List<PrestadorServico> prestadoresDisponiveis = new ArrayList<>();
        CodigoPostal CPDoPedido = pedido.getM_oEnderecoPostal().getCodigoPostal();
        AreaGeografica agMaisProxima = empresa.getRegistoAreaGeografica().getAreaGeoMaisProxima(CPDoPedido);
        List<PrestadorServico> prestadores = empresa.getRegistoPrestadorServico().getPrestadoresServicos();
        Servico servico = servicoSelecionado.getM_oServico();
        List<PreferenciaHorario> listaPreferenciaHorario = pedido.getM_listaPreferenciaHorario();
        System.out.println("servico:" + servico.toString());
        System.out.println("categoria do serviço: " + servico.getCategoria());
        System.out.println("AG do serviço: " + agMaisProxima);
        System.out.println("horarios do serviço: " + listaPreferenciaHorario);
        for (PrestadorServico prestador : prestadores) {
            System.out.println("\n");
            System.out.println("prestador: " + prestador);
            System.out.println("disponibilidade: " + prestador.getM_listaDisponibilidades().toString());
            System.out.println("ags: " + prestador.getM_listaAG().toString());
            System.out.println("categorias: " + prestador.getM_listaCategorias().toString());
            if (prestador.podeSerAfetado(agMaisProxima, servico, listaPreferenciaHorario)) {
                prestadoresDisponiveis.add(prestador);
            }
        }
        return prestadoresDisponiveis;
    }

    /**
     * evento de seleção de um serviço da lista
     *
     * @param event
     */
    @FXML
    private void handleListServico(MouseEvent event) {
        servicoSelecionado = null;
        this.servicoSelecionado = listServicos.getSelectionModel().getSelectedItem();
        if (servicoSelecionado != null) {
            popularDescricao();
            popularPrestadoresDisponiveis();
        }
    }

    /**
     * evento de seleção de um prestador da lista
     *
     * @param event
     */
    @FXML
    private void handleListPrestador(MouseEvent event) {
        atribuirPedidoButton.setDisable(true);
        prestadorSelecionado = null;
        this.prestadorSelecionado = listPrestadores.getSelectionModel().getSelectedItem();
        if (prestadorSelecionado != null) {
            atribuirPedidoButton.setDisable(false);
        }
    }
}
