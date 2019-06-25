package app.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ConfirmarJController extends SceneController implements Initializable {

    private SceneController parentController;

    @FXML
    private Label confirmarLabel;
    @FXML
    private TextArea textArea;
    @FXML
    private Button confirmarButton;
    @FXML
    private Button cancelarButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * 
     * Define o controller da janela principal
     * 
     * @param mainController Controller da janela principal
     */
    @Override
    public void setMainController(MenuPrincipalController mainController) {
        this.mainController = mainController;
    }

    /**
     * 
     * Gere o comportamento do ConfirmarButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleConfirmarButton(ActionEvent event) {
        confirmar();
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    /**
     * 
     * Gere o comportamento do CancelarButton
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
        parentController.confirmar();
    }

    /**
     * 
     * Define o texto a apresentar na janela de confirmação
     * 
     * @param text Texto a apresentar
     */
    public void setTextArea(String text) {
        textArea.setText(text);
    }

    /**
     * 
     * Define a confirmarLabel
     * 
     * @param confirmar Mensagem de confirmação a apresentar
     */
    public void setConfirmarLabel(String confirmar) {
        confirmarLabel.setText(confirmar);
    }

    /**
     * 
     * Define o controller que invoca esta janela
     * 
     * @param parentController Controller da janela que invoca esta janela
     */
    public void setParentController(SceneController parentController) {
        this.parentController = parentController;
    }

}
