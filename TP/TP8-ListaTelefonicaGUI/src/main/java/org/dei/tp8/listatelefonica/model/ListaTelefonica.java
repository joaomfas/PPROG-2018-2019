package org.dei.tp8.listatelefonica.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTelefonica {

    private List<ContactoTelefonico> listaTelefonica;

    public ListaTelefonica() {
        listaTelefonica = new ArrayList<>();
    }

    public ListaTelefonica(ListaTelefonica listaTelefonica) {
        this.listaTelefonica = new ArrayList<>(listaTelefonica.getListaTelefonica());
    }

    public List<ContactoTelefonico> getListaTelefonica() {
        return new ArrayList<>(listaTelefonica);
    }

    public void setListaTelefonica(ListaTelefonica listaTelefonica) {
        this.listaTelefonica.clear();
        adicionarListaTelefonica(listaTelefonica);
    }

    public ContactoTelefonico getTelefone(int indice) {
        return listaTelefonica.get(indice);
    }

    public ContactoTelefonico setTelefone(int indice, ContactoTelefonico telefone) {
        if (!listaTelefonica.contains(telefone)) {
            return listaTelefonica.set(indice, telefone);
        }

        throw new IllegalArgumentException("Contacto Telefónico já existe.");
    }

    public boolean adicionarTelefone(ContactoTelefonico telefone) {
        return listaTelefonica.contains(telefone)
                ? false
                : listaTelefonica.add(telefone);
    }

    public int adicionarListaTelefonica(ListaTelefonica listaTelefonica) {
        int totalTelefonesAdicionados = 0;
        for (ContactoTelefonico telefone : listaTelefonica.getListaTelefonica()) {
            boolean telefoneAdicionado = adicionarTelefone(telefone);
            if (telefoneAdicionado) {
                totalTelefonesAdicionados++;
            }
        }
        return totalTelefonesAdicionados;
    }

    public boolean removerTelefone(ContactoTelefonico telefone) {
        return listaTelefonica.remove(telefone);
    }

    public ContactoTelefonico removerTelefone(int indice) {
        return listaTelefonica.remove(indice);
    }

    public boolean removerTodos(ListaTelefonica listaTelefonica) {
        return this.listaTelefonica.removeAll(listaTelefonica.getListaTelefonica());
    }

    public int obterIndiceDeTelefone(ContactoTelefonico telefone) {
        return listaTelefonica.indexOf(telefone);
    }

    public void limpar() {
        listaTelefonica.clear();
    }

    public int tamanho() {
        return listaTelefonica.size();
    }

    public boolean isVazio() {
        return listaTelefonica.isEmpty();
    }

    public ContactoTelefonico[] getArray() {
        return listaTelefonica.toArray(new ContactoTelefonico[listaTelefonica.size()]);
    }

    @Override
    public String toString() {
        List<ContactoTelefonico> copia = new ArrayList<>(listaTelefonica);
        Collections.sort(copia);

        StringBuilder s = new StringBuilder();
        for (ContactoTelefonico telefone : copia) {
            s.append(telefone);
            s.append("\n");
        }

        return s.toString().trim();
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        ListaTelefonica outraListaTelefonica = (ListaTelefonica) outroObjeto;

        List<ContactoTelefonico> copiaThis = new ArrayList<>(listaTelefonica);
        List<ContactoTelefonico> copiaOutra = new ArrayList<>(outraListaTelefonica.listaTelefonica);

        Collections.sort(copiaThis);
        Collections.sort(copiaOutra);

        return copiaThis.equals(copiaOutra);
    }

}
