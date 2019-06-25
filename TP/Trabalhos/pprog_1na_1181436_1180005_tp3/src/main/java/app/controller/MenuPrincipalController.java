package app.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MenuPrincipalController implements Initializable {

    Stage stage;
    Scene scene;

    @FXML
    private MenuItem indicarDisponibilidadeButton;
    @FXML
    private MenuItem atribuirPedidoButton;
    @FXML
    private MenuItem efetuarPedidoButton;
    @FXML
    private MenuItem sairButton;
    @FXML
    private MenuItem sobreButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    /**
     * 
     * Define o Stage passado por parametro
     * 
     * @param stage Stage a definir
     */
    public void setStage(Stage stage) {
        this.stage = stage;
        this.scene = stage.getScene();
    }

    /**
     * 
     * Gere o comportamento do indicarDisponibilidadeButton
     * 
     * @param event Evento que aciona este comportamento
     * @throws IOException Excepção retornada caso o ficheiro FXML não seja encontrado
     */
    @FXML
    private void handleIndicarDisponibilidadeButton(ActionEvent event) throws IOException {
        changeScene(this.stage, "/fxml/indicarDisponibilidade.fxml");
    }

    /**
     * 
     * Gere o comportamento do atribuirPedidoButton
     * 
     * @param event Evento que aciona este comportamento
     * @throws IOException Excepção retornada caso o ficheiro FXML não seja encontrado
     */
    @FXML
    private void handleAtribuirPedidoButton(ActionEvent event) throws IOException {
        changeScene(this.stage, "/fxml/atribuirPedido.fxml");
    }

    /**
     * 
     * Gere o comportamento do efetuarPedidoButton
     * 
     * @param event Evento que aciona este comportamento
     * @throws IOException Excepção retornada caso o ficheiro FXML não seja encontrado
     */
    @FXML
    private void handleEfetuarPedidoButton(ActionEvent event) throws IOException {
        changeScene(this.stage, "/fxml/efetuarPedido.fxml");
    }

    /**
     * 
     * Gere o comportamento do sairButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleSairButton(ActionEvent event) {
        stage.fireEvent(new WindowEvent(stage, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

    /**
     * 
     * Gere o comportamento do sobreButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleSobreButton(ActionEvent event){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);

        alerta.setTitle("Aplicação");
        alerta.setHeaderText("Acerca");
        alerta.setContentText("PPROG - Paradigmas da Programação\nAno Lectivo 2018/2019\nTrabalho realizado por:"
                + "\nBreno Pacheco - 1180005\nJoão Ferreira - 1181436");

        alerta.show();

    }

    /**
     * 
     * Retorna ao menu principal
     * 
     */
    public void backToMainMenu() {
        stage.setScene(scene);
    }

    /**
     * 
     * Permite a alteração da Scene
     * 
     * @param stage Stage em que se pretende alterar a Scene
     * @param fxmlFile Ficheiro FXML referente à Scene
     * @return Controller da Scene a apresentar
     * @throws IOException Excepção retornada caso o ficheiro FXML não exista
     */
    public SceneController changeScene(Stage stage, String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = (Parent) fxmlLoader.load();
        Scene newScene = new Scene(root);
        SceneController controller = fxmlLoader.getController();
        controller.setMainController(this);
        stage.setScene(newScene);
        return controller;
    }

    /**
     * 
     * Abre uma janela popUp
     * 
     * @param fxmlFile Ficheiro FXML da janela popup a abrir
     * @return Retorna o Controller da janela aberta
     * @throws IOException Retorna esta excepção caso o ficheiro FXML não seja encontrado
     */
    public SceneController popUpWindow(String fxmlFile) throws IOException {
        Stage newStage = new Stage();
        newStage.setTitle("Gestão de Pedidos de Prestação de Serviço");
        newStage.initModality(Modality.APPLICATION_MODAL);
        SceneController controller = changeScene(newStage, fxmlFile);
        newStage.show();
        return controller;
    }
}
