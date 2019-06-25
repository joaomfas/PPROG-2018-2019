package app.controller;

import javafx.scene.control.Alert;

public abstract class SceneController {

    public MenuPrincipalController mainController;
    
    /**
     * 
     * Define o controller do menu principal
     * 
     * @param mainController Controller do menu principal
     */
    public void setMainController(MenuPrincipalController mainController) {
        this.mainController = mainController;
    }

    /**
     * 
     * Retorna o controller do menu principal
     * 
     * @return Controller do menu principal
     */
    public MenuPrincipalController getMainController() {
        return this.mainController;
    }

    /**
     * 
     * Cria um alerta com base nos dados passados por parametro
     * 
     * @param mensagem Mensagem a apresentar no alerta
     * @param titulo Titulo do alerta
     * @param tipoDeAlerta Tipo de alerta a apresentar
     */
    public static void criarAlerta(String mensagem, String titulo, Alert.AlertType tipoDeAlerta) {
        Alert aviso = new Alert(tipoDeAlerta);
        aviso.setHeaderText(titulo);
        aviso.setContentText(mensagem);
        aviso.show();
    }
    
    /**
     * 
     * Declaração do método confirmar() a implementar nas subclasses
     * 
     */
    public abstract void confirmar();
}
