package app.controller;

import app.model.*;
import app.model.RegistoPrestadorServico;
import app.utils.Data;
import app.utils.Tempo;
import static app.utils.Utils.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;

public class IndicarDisponibilidadeController extends SceneController implements Initializable {

    Empresa empresa;
    RegistoPrestadorServico rp;
    PrestadorServico prestador;
    Data dataInicio;
    Data dataFim;
    Tempo tempoInicio;
    Tempo tempoFim;
    int horaInicioSelecionada;
    int horaFimSelecionada;
    int minInicioSelecionada;
    int minFimSelecionada;
    LocalDate dataInicioSelecionada;
    LocalDate dataFimSelecionada;
    ListaDisponibilidadesDiaria listaDisponibilidade;
    Disponibilidade disponibilidade;

    private MenuPrincipalController menuPrincipalController;

    @FXML
    private Button submeterButton;
    @FXML
    private Button cancelarButton;
    @FXML
    private DatePicker dataInicioPicker;
    @FXML
    private DatePicker dataFimPicker;
    @FXML
    private ComboBox<PrestadorServico> listaPrestadoresComboBox;
    @FXML
    private ComboBox<Integer> horaInicioComboBox;
    @FXML
    private ComboBox<Integer> minInicioComboBox;
    @FXML
    private ComboBox<Integer> horaFimComboBox;
    @FXML
    private ComboBox<Integer> minFimComboBox;
    @FXML
    private VBox indicarDisponibilidadeBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.empresa = Empresa.getEmpresa();
        this.rp = empresa.getRegistoPrestadorServico();
        popularListaPrestadores();
        popularComboBoxInteiros(24, horaInicioComboBox);
        popularComboBoxInteiros(24, horaFimComboBox);
        popularComboBoxInteiros(60, minInicioComboBox);
        popularComboBoxInteiros(60, minFimComboBox);
        indicarDisponibilidadeBox.setVisible(false);
        submeterButton.setDisable(true);
    }

    /**
     *
     * Popula a listaPrestadoresComboBox
     *
     */
    public void popularListaPrestadores() {
        List<PrestadorServico> lp = rp.getPrestadoresServicos();
        listaPrestadoresComboBox.getItems().addAll(lp);
    }

    /**
     *
     * Popula a comboBoxInteiros com inteiros entre 0 e o inteiro dado como
     * parametro
     *
     * @param num Número inteiro máximo
     * @param comboBox ComboBox a popular
     */
    public void popularComboBoxInteiros(int num, ComboBox comboBox) {
        List<Integer> listaInteiros = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            listaInteiros.add(i);
        }
        comboBox.getItems().addAll(listaInteiros);
    }

    /**
     *
     * Submete a disponibilidade indicada
     *
     */
    private void submeter() {
        try {
            dataInicioSelecionada = dataInicioPicker.getValue();
            dataFimSelecionada = dataFimPicker.getValue();
            horaInicioSelecionada = horaInicioComboBox.getValue();
            horaFimSelecionada = horaFimComboBox.getValue();
            minInicioSelecionada = minInicioComboBox.getValue();
            minFimSelecionada = minFimComboBox.getValue();
            dataInicio = converterLocalDateEmData(dataInicioSelecionada);
            dataFim = converterLocalDateEmData(dataFimSelecionada);
            tempoInicio = new Tempo(horaInicioSelecionada, minInicioSelecionada, 0);
            tempoFim = new Tempo(horaFimSelecionada, minFimSelecionada, 0);
            disponibilidade = new Disponibilidade(dataInicio, tempoInicio, dataFim, tempoFim);
            listaDisponibilidade.validaPeriodoDisponibilidade(disponibilidade);
            ConfirmarJController confirmarJanela = (ConfirmarJController) mainController.popUpWindow("/fxml/confirmarJanela.fxml");
            confirmarJanela.setParentController(this);
            confirmarJanela.setConfirmarLabel("Confirmar nova disponibilidade diária");
            confirmarJanela.setTextArea(disponibilidade.toString());
        } catch (NullPointerException e) {
            SceneController.criarAlerta("Preencha todos os dados do formulário.", "Erro!", Alert.AlertType.ERROR);
            System.out.println(e);
        } catch (Exception e) {
            SceneController.criarAlerta("Dados inseridos invalidos!", "Erro!", Alert.AlertType.ERROR);
            System.out.println(e);
        }
    }

    /**
     * 
     * Gere o comportamento do submeterButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleSubmeterButton(ActionEvent event) {
        submeter();
    }

    /**
     * 
     * Gere o comportamento do cancelarButton
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handleCancelarButton(ActionEvent event){
        this.mainController.backToMainMenu();
    }

    /**
     * 
     * Gere o comportamento do prestadoresComboBox
     * 
     * @param event Evento que aciona este comportamento
     */
    @FXML
    private void handlePrestadoresComboBox(ActionEvent event) {
        this.prestador = listaPrestadoresComboBox.getValue();
        listaDisponibilidade = prestador.getlistaDisponibilidades();
        listaPrestadoresComboBox.setDisable(true);
        indicarDisponibilidadeBox.setVisible(true);
        submeterButton.setDisable(false);
    }

    /**
     * 
     * Confirma a operação realizada
     * 
     */
    @Override
    public void confirmar() {
        listaDisponibilidade.addPeriodoDisponibilidade(disponibilidade);
        SceneController.criarAlerta("Disponibilidade inserida com sucesso!", "Sucesso!", Alert.AlertType.INFORMATION);
        this.mainController.backToMainMenu();
    }
}
