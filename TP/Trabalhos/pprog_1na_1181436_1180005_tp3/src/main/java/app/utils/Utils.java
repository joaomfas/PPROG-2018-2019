package app.utils;

import app.controller.SceneController;
import app.model.Empresa;
import app.model.RegistoPedidoPrestacaoServico;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

public class Utils {

    /**
     *
     * Importa dados de um ficheiro e devolve-os num arraylist
     * retorna ArrayList vazio se não conseguir ler ficheiro
     * @param m_strfileName Nome do ficheiro a importar
     * @return ArrayList com os dados do ficheiro
     * encontrado
     */
    public static ArrayList<String[]> importarInfoFicheiro(String m_strfileName) {
        ArrayList<String[]> leitura = new ArrayList<>();
        File file = new File(m_strfileName);
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] strLinha = sc.nextLine().trim().split(";");
                String[] trimmedLine = new String[strLinha.length];
                for (int i = 0; i < strLinha.length; i++) {
                    trimmedLine[i] = strLinha[i].trim();
                }
                leitura.add(trimmedLine);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return leitura;
    }

    /**
     *
     * Converte a LocalDate num objeto do tipo Data
     *
     * @param localData LocalDate a converter
     * @return Objeto do tipo Data
     */
    public static Data converterLocalDateEmData(LocalDate localData) {
        String[] strData = localData.toString().split("-");
        int ano = Integer.parseInt(strData[0]);
        int mes = Integer.parseInt(strData[1]);
        int dia = Integer.parseInt(strData[2]);
        return new Data(ano, mes, dia);
    }

    /**
     *
     * Converte uma string num int
     *
     * @param string String a converter
     * @param maxValue Valor máximo aceite
     * @return Retorna um int
     * @throws NumberFormatException Excepção retornada caso ocorra algum erro
     */
    public static int converterStringInt(String string, int maxValue) throws NumberFormatException {
        int integer;
        try {
            integer = Integer.parseInt(string);
            if (integer >= maxValue || integer <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
        return integer;
    }

    /**
     *
     * Grava o Registo de Pedidos num ficheiro binário
     *
     */
    public static void gravarRegistoPedidosEmFicheiroBinario() {
        try {
            File file = new File("src/main/resources/files/pedidos.bin");
            file.delete();
            RegistoPedidoPrestacaoServico registo = Empresa.getEmpresa().getRegistoPedidoPrestacaoServico();
            FileOutputStream ficheiroBinario = null;
            ficheiroBinario = new FileOutputStream("src/main/resources/files/pedidos.bin");
            ObjectOutputStream out = new ObjectOutputStream(ficheiroBinario);
            out.writeObject(registo);
            ficheiroBinario.close();
            SceneController.criarAlerta("Registo de pedidos gravado em ficheiro binario", "", Alert.AlertType.INFORMATION);
        } catch (Exception e) {
            SceneController.criarAlerta(e.getMessage(), "Erro ao gravar ficheiro binario!", Alert.AlertType.ERROR);
        }
    }

    /**
     *
     * Importa o registo de pedidos de um ficheiro binário
     *
     */
    public static void importarRegistoPedidosEmFicheiroBinario() {
        try {
            FileInputStream ficheiroBinario = null;
            ficheiroBinario = new FileInputStream("src/main/resources/files/pedidos.bin");
            ObjectInputStream in = new ObjectInputStream(ficheiroBinario);
            RegistoPedidoPrestacaoServico registo = (RegistoPedidoPrestacaoServico) in.readObject();
            Empresa.getEmpresa().setRegistoPedidoPrestacaoServico(registo);
            ficheiroBinario.close();
        } catch (Exception e) {
  
        }
    }
}
