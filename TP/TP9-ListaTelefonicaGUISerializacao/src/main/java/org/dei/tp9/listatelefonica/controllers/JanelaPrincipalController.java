package org.dei.tp9.listatelefonica.controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import org.dei.tp9.listatelefonica.model.ContactoTelefonico;
import org.dei.tp9.listatelefonica.model.FicheiroListaTelefonica;
import org.dei.tp9.listatelefonica.model.ListaTelefonica;
import org.dei.tp9.listatelefonica.ui.FileChooserListaTelefonica;

public class JanelaPrincipalController implements Initializable {

    private ListaTelefonica listaTelefonica;
    private Stage novoContactoStage;

    @FXML
    private TextArea txtBoxListaTelefonica;
    @FXML
    private MenuItem mnuContactosExportar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            novoContactoStage = new Stage();
            novoContactoStage.initModality(Modality.APPLICATION_MODAL);

            novoContactoStage.setTitle("Novo Contacto");
            novoContactoStage.setResizable(false);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/NovoContactoScene.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            NovoContactoController ncController = loader.getController();
            ncController.associarController(this);

            novoContactoStage.setScene(scene);
        } catch (IOException ex) {
            criarAlerta(Alert.AlertType.ERROR, "Erro", ex.getMessage());
        }
    }

    public void associarListaTelefonica(ListaTelefonica listaTelefonica) {
        this.listaTelefonica = listaTelefonica;
        atualizaTextBoxListaTelefonica();
    }

    public boolean adicionarContacto(ContactoTelefonico novoContacto) {
        if (listaTelefonica.adicionarTelefone(novoContacto)) {
            atualizaTextBoxListaTelefonica();
            return true;
        }

        return false;
    }

    @FXML
    private void menuContactosNovoAction(ActionEvent event) throws IOException {
        novoContactoStage.show();
    }

    @FXML
    private void menuContactosImportar(ActionEvent event) {
        FileChooser fcImportar = FileChooserListaTelefonica.criarFileChooserListaTelefonica();

        File fichImport = fcImportar.showOpenDialog(txtBoxListaTelefonica.getScene().getWindow());

        if (fichImport == null) {
            criarAlerta(Alert.AlertType.ERROR, "Importar ficheiro", "Não foi selecionado nenhum ficheiro!").show();
        } else {
            FicheiroListaTelefonica fltImportar = new FicheiroListaTelefonica();
            ListaTelefonica ltImportada = fltImportar.ler(fichImport);
            int qtd = listaTelefonica.adicionarListaTelefonica(ltImportada);
            criarAlerta(Alert.AlertType.INFORMATION, "Importar ficheiro", "Foram adicionados " + qtd + " registos de " + ltImportada.tamanho()).show();
            atualizaTextBoxListaTelefonica();
        }
    }

    @FXML
    private void menuContactosExportar(ActionEvent event) {
        FileChooser fcExportar = FileChooserListaTelefonica.criarFileChooserListaTelefonica();

        File ficheiroExportar = fcExportar.showSaveDialog(txtBoxListaTelefonica.getScene().getWindow());

        if (ficheiroExportar == null) {
            criarAlerta(Alert.AlertType.ERROR, "Exportar ficheiro", "Não foi selecionado nenhum ficheiro!").show();
        } else {
            FicheiroListaTelefonica fiExportar = new FicheiroListaTelefonica();
            boolean guardou = fiExportar.guardar(ficheiroExportar, listaTelefonica);

            if (guardou) {
                criarAlerta(Alert.AlertType.INFORMATION, "Exportar ficheiro", "Ficheiro guardado com sucesso!").show();
            } else {
                criarAlerta(Alert.AlertType.ERROR, "Exportar ficheiro", "Não foi possível guardar o ficheiro!").show();
            }
        }

    }

    @FXML
    private void menuListaShowing(Event event) {
//        if(listaTelefonica.isVazio()){
//            mnuContactosExportar.setDisable(true);
//        }else{
//            mnuContactosExportar.setDisable(false);
//        }
        mnuContactosExportar.setDisable(listaTelefonica.isVazio());
    }

    @FXML
    private void menuContactosSairAction(ActionEvent event) {
        Window window = txtBoxListaTelefonica.getScene().getWindow();
        window.fireEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

    @FXML
    private void menuOpcoesAcercaAction(ActionEvent event) {
        criarAlerta(Alert.AlertType.INFORMATION, "Acerca",
                "@Copyright\nPPROG 2018/2019").show();
    }

    private void atualizaTextBoxListaTelefonica() {
        String listaTelefonicaString = listaTelefonica.toString();

        txtBoxListaTelefonica.setText(listaTelefonicaString);
    }

    private Alert criarAlerta(Alert.AlertType tipoAlerta, String cabecalho,
            String mensagem) {
        Alert alerta = new Alert(tipoAlerta);

        alerta.setTitle("Aplicação");
        alerta.setHeaderText(cabecalho);
        alerta.setContentText(mensagem);

        return alerta;
    }
}
