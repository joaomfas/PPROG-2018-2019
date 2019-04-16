package com.jp.tp7.conversorgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

    private Label label;
    @FXML
    private TextField txtCelsius;
    @FXML
    private TextField txtFahrenheit;
    @FXML
    private Button btnConverter;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnSair;

//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void converterAplicationAction(ActionEvent event) {
        txtFahrenheit.setText("");
        try {
            double tempC = Double.parseDouble(txtCelsius.getText());
            double tempF = 1.8 * tempC + 32;

            txtFahrenheit.setText(String.valueOf(tempF));
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);

            alerta.setTitle("Celsius");
            alerta.setHeaderText("Erro na temperatura Celsius");
            alerta.setContentText("Não foi introduzido um valor numérico");

            alerta.show();

            txtCelsius.setText("");

            txtCelsius.requestFocus();
        }
    }

    @FXML
    private void limparAplicationAction(ActionEvent event) {
        txtCelsius.setText("");
        txtFahrenheit.setText("");

        txtCelsius.requestFocus();
    }

    @FXML
    private void sairAplicationAction(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        
        alerta.setTitle("Aplicação");
        alerta.setHeaderText("Configuração de ação");
        alerta.setContentText("Deseja mesmo sair da aplicação?");

        if (alerta.showAndWait().get() == ButtonType.OK) {

            ((Stage) btnSair.getScene().getWindow()).close();
        }
    }
}
