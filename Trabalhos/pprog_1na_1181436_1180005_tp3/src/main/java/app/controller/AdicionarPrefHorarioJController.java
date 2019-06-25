package app.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import app.utils.*;
import app.model.*;
import javafx.scene.Node;

public class AdicionarPrefHorarioJController extends SceneController implements Initializable {

    EfetuarPedidoController parentController;
    @FXML
    private VBox preferenciaHorarioBox;
    @FXML
    private DatePicker dataPicker;
    @FXML
    private Button adicionarPreferenciaButton;
    @FXML
    private ComboBox<Integer> horaComboBox;
    @FXML
    private ComboBox<Integer> minComboBox;
    @FXML
    private Button cancelarButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        popularComboBoxInteiros(24, horaComboBox);
        popularComboBoxInteiros(60, minComboBox);
    }

    /**
     *
     * Gere o comportamento do botão AdicionarPreferenciaButton
     *
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleAdicionarPreferenciaButton(ActionEvent event) {
        try {
            Data data = new Data(Utils.converterLocalDateEmData(dataPicker.getValue()));
            Tempo tempo = new Tempo(horaComboBox.getValue(), minComboBox.getValue(), 0);
            int ordem = parentController.getOrdem();
            PreferenciaHorario horario = new PreferenciaHorario(ordem, data, tempo);
            parentController.addPreferenciaHorario(horario);
            SceneController.criarAlerta("Preferência de horário adicionada com sucesso!", "", Alert.AlertType.INFORMATION);
            parentController.updateSubmeterButton();
            handleCancelarButton(event);
        } catch (Exception e) {
            SceneController.criarAlerta(e.getMessage(), "Erro!", Alert.AlertType.ERROR);
        }
    }

    /**
     *
     * Popula a comboBox passada por parametros com números inteiros entre 0 e
     * num.
     *
     * @param num Número interiro máximo
     * @param comboBox ComboBox a popular
     */
    public void popularComboBoxInteiros(int num, ComboBox comboBox) {
        List<Integer> listaInteiros = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            listaInteiros.add(i);
        }
        comboBox.getItems().addAll(listaInteiros);
    }

    /**
     *
     * Define o controller referente à classe EfetuarPedidoController
     *
     * @param controller Controller da janela que invoca este Controller
     */
    void setParentController(EfetuarPedidoController controller) {
        this.parentController = controller;
    }

    /**
     *
     * Gere o comportamento do botão CancelarButton
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
