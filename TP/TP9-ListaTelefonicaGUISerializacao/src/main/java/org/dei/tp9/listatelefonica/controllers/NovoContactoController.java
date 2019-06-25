/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.tp9.listatelefonica.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.dei.tp9.listatelefonica.model.ContactoTelefonico;

public class NovoContactoController implements Initializable {

    private JanelaPrincipalController jpControler;

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtTelefone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void associarController(JanelaPrincipalController jpController) {
        this.jpControler = jpController;
    }

    @FXML
    private void btnAdicionarAction(ActionEvent event) {
        try {
            ContactoTelefonico novoContacto = new ContactoTelefonico(
                    txtNome.getText().trim(), Integer.parseInt(txtTelefone.getText()));

            boolean adicionou = jpControler.adicionarContacto(novoContacto);
            criarAlerta(Alert.AlertType.INFORMATION, "Adição de novo contacto", adicionou ? "Contacto adicionado com sucesso"
                    : "Não foi possível adicionar o contacto").show();

            encerrarNovoContacto(event);
        } catch (NumberFormatException nfe) {
            criarAlerta(Alert.AlertType.ERROR, "Erro nos dados!",
                    "Introduza um valor numérico para telefone!").show();
        } catch (IllegalArgumentException iae) {
            criarAlerta(Alert.AlertType.ERROR, "Erro nos dados!", iae.getMessage()).show();
        }

    }

    @FXML
    private void btnCancelarAction(ActionEvent event) {
        encerrarNovoContacto(event);
    }
    
    private void encerrarNovoContacto(ActionEvent event) {
        txtNome.setText("");
        txtTelefone.setText("");

        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    private Alert criarAlerta(Alert.AlertType tipoAlerta, String cabecalho,
            String mensagem) {
        Alert alerta = new Alert(tipoAlerta);

        alerta.setTitle("Novo contacto");
        alerta.setHeaderText(cabecalho);
        alerta.setContentText(mensagem);

        return alerta;
    }
}