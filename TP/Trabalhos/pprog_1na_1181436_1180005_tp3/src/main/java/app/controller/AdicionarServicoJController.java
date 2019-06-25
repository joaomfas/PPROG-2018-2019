package app.controller;

import app.model.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class AdicionarServicoJController extends SceneController implements Initializable {

    private EfetuarPedidoController parentController;

    @FXML
    private VBox addServicoBox;
    @FXML
    private ComboBox<Categoria> categoriaComboBox;
    @FXML
    private ComboBox<Servico> servicoComboBox;
    @FXML
    private TextArea descricaoText;
    @FXML
    private Button addNovoServicoButton;
    @FXML
    private Button cancelarButton;
    @FXML
    private TextArea descCompletaTxt;
    @FXML
    private ComboBox<Integer> duracaoComboBox;
    @FXML
    private Label custoTxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        descCompletaTxt.setDisable(true);
        List<Integer> listaInteiros = new ArrayList<>();
        for (int i = 30; i <= 300; i += 30) {
            listaInteiros.add(i);
        }
        duracaoComboBox.getItems().addAll(listaInteiros);
    }

    /**
     * 
     * Define o controller que invocou esta janela
     * 
     * @param parentController Conroller da janela que invoca esta janela
     */
    public void setParentController(EfetuarPedidoController parentController) {
        this.parentController = parentController;
    }

    /**
     * 
     * Popula a categoriaComboBox
     * 
     * @param lc Lista de categorias
     */
    public void popularCategoriaComboBox(List<Categoria> lc) {
        categoriaComboBox.getItems().addAll(lc);
    }

    /**
     * 
     * Popula a servicoComboBox
     * 
     * @param ls Lista de Serviços
     */
    public void popularServicoComboBox(List<Servico> ls) {
        servicoComboBox.getItems().clear();
        servicoComboBox.getItems().addAll(ls);
    }

    /**
     * 
     * Gere o comportamento da categoriaComboBox
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleCategoriaComboBox(ActionEvent event) {
        resetDescServico();
        Categoria catSelecionada = categoriaComboBox.getValue();
        List<Servico> ls = parentController.getListaServicosByCat(catSelecionada);
        popularServicoComboBox(ls);
        duracaoComboBox.setDisable(false);
    }

    /**
     * 
     * Limpa a descrição do serviço
     * 
     */
    private void resetDescServico() {
        descCompletaTxt.setText("");
        servicoComboBox.getItems().clear();
        custoTxt.setText("");
    }

    /**
     * 
     * Gere o comportamento do servicoComboBox
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleServicoComboBox(ActionEvent event) {
        Servico servSelecionado = servicoComboBox.getValue();
        try {
            descCompletaTxt.setDisable(false);
            descCompletaTxt.setText(servSelecionado.getDescCompleta());
            descCompletaTxt.setDisable(true);
            duracaoComboBox.setDisable(false);

            if (servSelecionado instanceof ServicoFixo) {
                ServicoFixo servFixo = (ServicoFixo) servSelecionado;
                duracaoComboBox.setValue((int) servFixo.getDuracaoPreDeterminada());
                duracaoComboBox.setDisable(true);
            }
            custoTxt.setText(String.valueOf(servSelecionado.getCustoHora()) + " €/h");
        } catch (Exception e) {
        }
    }

    /**
     * 
     * Gere o comportamento do addNovoServicoButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleAddNovoServicoButton(ActionEvent event) {
        try {
            Servico servSelecionado = servicoComboBox.getValue();
            String descricao = descricaoText.getText();
            double duracao = duracaoComboBox.getValue();
            DescricaoDoServico descServico = new DescricaoDoServico(servSelecionado, descricao, duracao);
            parentController.addDescServico(descServico);
            parentController.updateSubmeterButton();
            handleCancelarButton(event);
            SceneController.criarAlerta("Serviço adicionado com sucesso!", "", Alert.AlertType.INFORMATION);
        } catch (Exception e) {
            SceneController.criarAlerta(e.getMessage(), "Erro!", Alert.AlertType.ERROR);
        }

    }

    /**
     * 
     * Gere o comportamento do cancelarButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleCancelarButton(ActionEvent event) {
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    /**
     * 
     * Confirma a operação realizada
     * 
     */
    @Override
    public void confirmar() {
    }

}
