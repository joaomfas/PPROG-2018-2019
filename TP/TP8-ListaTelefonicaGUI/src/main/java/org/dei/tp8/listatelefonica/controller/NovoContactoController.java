/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.tp8.listatelefonica.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.dei.tp8.listatelefonica.model.ContactoTelefonico;

/**
 * FXML Controller class
 *
 * @author joaoferreira
 */
public class NovoContactoController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtTelefone;
    
    private JanelaPrincipalController jpController;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void associarController(JanelaPrincipalController jpController){
        this.jpController = jpController;
    }

    @FXML
    private void btnAdicionarAction(ActionEvent event) {
        ContactoTelefonico novo = new ContactoTelefonico(txtNome.getText(), Integer.parseInt(txtTelefone.getText()));
        jpController.adicionarContacto(novo);
    }

    @FXML
    private void btnCancelarAction(ActionEvent event) {
        Stage thisstage = (Stage) txtNome.getScene().getWindow();
        thisstage.hide();
    }
    
    public void limparUI(){
        txtNome.clear();
        txtTelefone.clear();
    }
}
