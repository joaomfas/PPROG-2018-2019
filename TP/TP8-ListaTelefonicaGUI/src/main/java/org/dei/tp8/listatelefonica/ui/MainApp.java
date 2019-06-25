package org.dei.tp8.listatelefonica.ui;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.dei.tp8.listatelefonica.model.ContactoTelefonico;
import org.dei.tp8.listatelefonica.model.ListaTelefonica;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        try {
//            ListaTelefonica listaTelefonica = new ListaTelefonica();
//            prePreencherLista(listaTelefonica);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/JanelaPrincipalScene.fxml"));
            Parent root = loader.load();

//            JanelaPrincipalController jpControler = loader.getController();
//            jpControler.associarListaTelefonica(listaTelefonica);

            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle("Lista Telefónica");
            stage.setScene(scene);

            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);

                    alerta.setTitle("Aplicação");
                    alerta.setHeaderText("Confirmação da ação.");
                    alerta.setContentText("Deseja mesmo encerrar a aplicação!");

                    if (alerta.showAndWait().get() == ButtonType.CANCEL) {
                        event.consume();
                    }
                }
            });
            stage.show();
        } catch (IOException ex) {
            criarAlertaErro(ex).show();
        }
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private Alert criarAlertaErro(Exception ex) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);

        alerta.setTitle("Aplicação");
        alerta.setHeaderText("Problemas no arranque da aplicação");
        alerta.setContentText(ex.getMessage());

        return alerta;
    }

    private void prePreencherLista(ListaTelefonica listaTelefonica) {
        for (int i = 0; i < 50; i++) {
            ContactoTelefonico ct = new ContactoTelefonico("abc", 100000000 + i);
            listaTelefonica.adicionarTelefone(ct);
        }
    }
}
