package org.dei.tp9.listatelefonica.model;

import java.io.*;

public class FicheiroListaTelefonica {

    public static final String NOME_FICHEIRO = "ListaTelefonica.ltf";

    public FicheiroListaTelefonica() {
    }

    public ListaTelefonica ler() {
        return ler(new File(NOME_FICHEIRO));
    }

    public ListaTelefonica ler(String nomeFicheiro) {
        return ler(new File(nomeFicheiro));
    }

    public ListaTelefonica ler(File ficheiro) {
        ListaTelefonica listaTelefonica;
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(ficheiro));
            try {
                listaTelefonica = (ListaTelefonica) in.readObject();
            } finally {
                in.close();
            }
            return listaTelefonica;
        } catch (IOException | ClassNotFoundException ex) {
            return new ListaTelefonica();
        }
    }

    public boolean guardar(ListaTelefonica listaTelefonica) {
        return guardar(new File(NOME_FICHEIRO), listaTelefonica);
    }
    
    public boolean guardar(String nomeFicheiro, ListaTelefonica listaTelefonica) {
        return guardar(new File(nomeFicheiro), listaTelefonica);
    }

    public boolean guardar(File ficheiro, ListaTelefonica listaTelefonica) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(ficheiro));
            try {
                out.writeObject(listaTelefonica);
            } finally {
                out.close();
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

}
