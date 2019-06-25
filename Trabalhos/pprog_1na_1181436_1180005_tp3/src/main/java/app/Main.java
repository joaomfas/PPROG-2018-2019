package app;

import app.controller.MenuPrincipalController;
import app.utils.Init;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/menuPrincipal.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Gestão de Pedidos de Prestação de Serviço");
        stage.setScene(scene);
        ((MenuPrincipalController) fxmlLoader.getController()).setStage(stage);
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
        Init.run();
    }
}
