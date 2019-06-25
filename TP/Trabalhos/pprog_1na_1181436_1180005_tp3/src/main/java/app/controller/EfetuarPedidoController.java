package app.controller;

import app.model.*;
import app.utils.Utils;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;

public class EfetuarPedidoController extends SceneController implements Initializable {

    AdicionarServicoJController addServicoController;
    AdicionarPrefHorarioJController addPrefHorarioController;

    private Empresa empresa;
    private RegistoPedidoPrestacaoServico rp;
    private RegistoCliente rc;
    private RegistoCategoria rcat;
    private RegistoServico rs;
    private Cliente cli;
    private List<EnderecoPostal> lep;
    private EnderecoPostal endP;
    private List<Categoria> lc;
    private List<Servico> ls;
    private PedidoPrestacaoServico pedido;

    @FXML
    private ComboBox<Cliente> listaCliente;
    @FXML
    private ComboBox<EnderecoPostal> enderecoComboBox;
    @FXML
    private Button submeterButton;
    @FXML
    private Button cancelarButton;
    @FXML
    private HBox enderecoBox;
    @FXML
    private Button addServicoButton;
    @FXML
    private Button addPrefHorarioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.empresa = Empresa.getEmpresa();
        this.rp = empresa.getRegistoPedidoPrestacaoServico();
        this.rc = empresa.getRegistoCliente();
        this.rcat = empresa.getRegistoCategoria();
        this.rs = empresa.getRegistoServico();

        enderecoBox.setVisible(false);
        submeterButton.setDisable(true);
        addServicoButton.setVisible(false);
        addPrefHorarioButton.setVisible(false);

        popularListaCliente();

    }

    /**
     * 
     * Popula a comboBox listaCliente
     * 
     */
    private void popularListaCliente() {
        List<Cliente> clientes = rc.getClientes();
        listaCliente.getItems().addAll(clientes);
    }

    /**
     * 
     * Popula a enderecoComboBox
     * 
     */
    private void popularEnderecoComboBox() {
        this.lep = cli.getEnderecosPostais();
        enderecoComboBox.getItems().addAll(lep);
    }

    /**
     * 
     * Retorna a lista de serviçoes referente a uma dada categoria
     * 
     * @param catSelecionada Categoria à qual se pretende os serviços associados
     * @return Lista de serviços pertencentes a uma dada categoria
     */
    public List<Servico> getListaServicosByCat(Categoria catSelecionada) {
        return rs.getServicosDeCategoria(catSelecionada);
    }

    /**
     * 
     * Gere o comportamento da Lista de Clientes apresentada
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleListaCliente(ActionEvent event) {
        this.cli = listaCliente.getValue();
        listaCliente.setDisable(true);
        enderecoBox.setVisible(true);
        popularEnderecoComboBox();
    }

    /**
     * 
     * Gere o comportamento do enderecoComboBox
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleEnderecoComboBox(ActionEvent event) {
        this.endP = enderecoComboBox.getValue();
        addServicoButton.setVisible(true);
        addPrefHorarioButton.setVisible(true);
        pedido = new PedidoPrestacaoServico(cli, endP);
    }

    /**
     * 
     * Gere o comportamento do addServicoButton
     * 
     * @param event Evento que aciona este comportamento
     * @throws IOException Excepção retornada caso o ficheiro FXML não seja encontrado
     */
    @FXML
    private void handleAddServicoButton(ActionEvent event) throws IOException {
        this.lc = rcat.getCategorias();
        addServicoController = (AdicionarServicoJController) mainController.popUpWindow("/fxml/adicionarServicoJanela.fxml");
        addServicoController.setParentController(this);
        addServicoController.popularCategoriaComboBox(lc);
    }

    /**
     * 
     * Gere o comportamento do addPrefHorarioButton
     * 
     * @param event Evento que aciona este comportamento
     * @throws IOException Excepção retornada caso o ficheiro FXML não seja encontrado
     */
    @FXML
    private void handleAddPrefHorarioButton(ActionEvent event) throws IOException {
        addPrefHorarioController = (AdicionarPrefHorarioJController) mainController.popUpWindow("/fxml/adicionarPrefHorarioJanela.fxml");
        addPrefHorarioController.setParentController(this);
    }

    /**
     * 
     * Gere o comportamento do submeterButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleSubmeterButton(ActionEvent event) {
        submeter();
    }

    /**
     * 
     * Gere o comportamento do cancelarButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleCancelarButton(ActionEvent event){
        this.mainController.backToMainMenu();
    }

    /**
     * 
     * Procede à submissão do pedido de prestação de serviços descrito
     * 
     */
    private void submeter() {
        System.out.println("Submetendo pedido");
        try {
            System.out.println("Tentando calcular custo");
            pedido.calcularCusto();
            ConfirmarJController confirmarJanela = (ConfirmarJController) mainController.popUpWindow("/fxml/confirmarJanela.fxml");
            confirmarJanela.setParentController(this);
            confirmarJanela.setConfirmarLabel("Confirmar pedido de prestação de serviços");
            confirmarJanela.setTextArea(pedido.toStringComplete());
        } catch (Exception e) {
            System.out.println("Erro ao criar janela de confirmação");
            System.out.println(e.getMessage());
        }
    }

    /**
     * 
     * Adiciona uma preferência de horário ao pedido
     * 
     * @param horario Preferência de horário a adicionar
     */
    public void addPreferenciaHorario(PreferenciaHorario horario) {
        pedido.addHorario(horario);
    }

    /**
     * 
     * Adiciona uma descrição do serviço ao pedido
     * 
     * @param oDescServico Descrição do serviço a adicionar
     */
    public void addDescServico(DescricaoDoServico oDescServico) {
        pedido.addDescricao(oDescServico);
    }

    /**
     * 
     * Retorna o número de prefêrencia de horário
     * 
     * @return Números de preferências de horário
     */
    public int getOrdem() {
        return pedido.getOrdem();
    }

    /**
     * 
     * Ativa o submeterButton caso os critérios sejam verificados
     * 
     */
    void updateSubmeterButton() {
        if (!pedido.getM_listaServicos().isEmpty() && !pedido.getM_listaPreferenciaHorario().isEmpty()) {
            submeterButton.setDisable(false);
        }
    }

    /**
     * 
     * Confirma a operação realizada
     * 
     */
    @Override
    public void confirmar() {
        rp.addPedidoPrestacaoServico(pedido);
        Utils.gravarRegistoPedidosEmFicheiroBinario();
        SceneController.criarAlerta("Pedido submetido com sucesso!", "Sucesso!", Alert.AlertType.INFORMATION);
        mainController.backToMainMenu();
    }
}
