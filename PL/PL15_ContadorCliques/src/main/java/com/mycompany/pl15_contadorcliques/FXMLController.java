package com.mycompany.pl15_contadorcliques;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    private Label label;
    @FXML
    private Label numeroDeCliques;
    
    private int numCliques=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSomaClique(ActionEvent event) {
        numCliques++;
        numeroDeCliques.setText((String.valueOf(numCliques)));
    }
}
