package org.dei.tp9.listatelefonica.ui;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileChooserListaTelefonica {

    private FileChooser fileChooser;

    public static FileChooser criarFileChooserListaTelefonica() {
        FileChooserListaTelefonica fcListaTelefonica = new FileChooserListaTelefonica();

        return fcListaTelefonica.fileChooser;

    }

    private FileChooserListaTelefonica() {
        fileChooser = new FileChooser();
        associarFiltro("Ficheiros de Lista Telefónica", "*.ltf");

    }

    private void associarFiltro(String descricao, String extensao) {
        ExtensionFilter filtro = new ExtensionFilter(descricao, extensao);

        fileChooser.getExtensionFilters().add(filtro);
    }

}
