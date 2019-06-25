/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.tp8.listatelefonica.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.dei.tp8.listatelefonica.model.ContactoTelefonico;
import org.dei.tp8.listatelefonica.model.ListaTelefonica;

/**
 * FXML Controller class
 *
 * @author joaoferreira
 */
public class JanelaPrincipalController implements Initializable {

    @FXML
    private TextArea txtBoxListaTelefonica;
    private Stage ncStage;
    private ListaTelefonica lista;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            ncStage = new Stage();
            ncStage.setTitle("Novo Contacto");
            ncStage.initModality(Modality.APPLICATION_MODAL);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/NovoContactoScene.fxml"));
            Parent root = loader.load();
            
            NovoContactoController ncController = loader.getController();
            ncController.associarController(this);

            Scene scene = new Scene(root);
            ncStage.setScene(scene);
            
            ncStage.setOnShowing(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    ncController.limparUI();
                }
            });
            
            
        } catch (IOException ex) {
            Platform.exit();
        }
    }
    
    public void associarListaTelefonica(ListaTelefonica listatelefonica){
        lista = listatelefonica;
        
        txtBoxListaTelefonica.clear();
        txtBoxListaTelefonica.appendText(lista.toString());
    }

    @FXML
    private void menuContactosNovoAction(ActionEvent event) {
        ncStage.show();

    }

    @FXML
    private void mnuContactosSairAction(ActionEvent event) {
        Stage thisstage = (Stage) txtBoxListaTelefonica.getScene().getWindow();
        thisstage.fireEvent(new WindowEvent(thisstage, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

    @FXML
    private void mnuOpcoesAcercaAction(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);

        alerta.setTitle("Aplicação");
        alerta.setHeaderText("Acerca");
        alerta.setContentText("Algo sobre aplicação");

        alerta.show();
    }

    public void adicionarContacto(ContactoTelefonico novo) {
        txtBoxListaTelefonica.appendText(novo.toString());
        txtBoxListaTelefonica.appendText("\n");
    }

}
