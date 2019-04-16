/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.pl16;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import org.dei.pl16.model.Data;
import org.dei.pl16.model.DiaInvalidoException;
import org.dei.pl16.model.MesInvalidoException;

/**
 * FXML Controller class
 *
 * 
 */
public class SceneController implements Initializable {

    @FXML
    private TextField txtData;
    @FXML
    private TextField txtDiaSemana;
    @FXML
    private Label lblDataCompleta;


    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleDiaSemanaButton(ActionEvent event) {
        Data d = null;
        try {
            d = lerData();
            txtDiaSemana.setText(d.diaDaSemana());
        } catch (MesInvalidoException | DiaInvalidoException exc) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro");
            alerta.setHeaderText(exc.getMessage());
            alerta.show();
            txtData.setText(null);
            txtData.requestFocus();
        } catch(NumberFormatException | ArrayIndexOutOfBoundsException exc){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro");
            alerta.setHeaderText("Data é inválida!!");
            alerta.show();
            txtData.setText(null);
            txtData.requestFocus();
        }
    }

    @FXML
    private void handleDataExtensoButton(ActionEvent event) {
        Data d = null;
        try {
            d = lerData();
            lblDataCompleta.setText(d.toString());
        } catch (MesInvalidoException | DiaInvalidoException exc) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro");
            alerta.setHeaderText(exc.getMessage());
            alerta.show();
            txtData.setText(null);
            txtData.requestFocus();
        } catch(NumberFormatException | ArrayIndexOutOfBoundsException exc){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro");
            alerta.setHeaderText("Data é inválida!!");
            alerta.show();
            txtData.setText(null);
            txtData.requestFocus();
        }
    }

    @FXML
    private void handleLimparButton(ActionEvent event) {
        txtData.setText(null);
        txtDiaSemana.setText(null);
        lblDataCompleta.setText(null);
        txtData.requestFocus();
    }

    @FXML
    private void handleDataEnter(ActionEvent event) {
        handleDiaSemanaButton(event);
        handleDataExtensoButton(event);
        txtData.requestFocus();
    }

    private Data lerData(){
        String[] leitura = txtData.getText().split("/");
        Data data = new Data(Integer.parseInt(leitura[0]),Integer.parseInt(leitura[1]),Integer.parseInt(leitura[2]));
        return data;
    }
    
    
    
}
