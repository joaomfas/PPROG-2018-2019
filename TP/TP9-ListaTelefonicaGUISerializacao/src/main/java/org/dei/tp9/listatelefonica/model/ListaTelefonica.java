package org.dei.tp9.listatelefonica.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTelefonica implements Serializable {

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

    public ContactoTelefonico setTelefone(int indice, ContactoTelefonico contacto) {
        if (!listaTelefonica.contains(contacto)) {
            return listaTelefonica.set(indice, contacto);
        }

        throw new IllegalArgumentException("Contacto Telefónico já existe.");
    }

    public boolean adicionarTelefone(ContactoTelefonico contacto) {
        return listaTelefonica.contains(contacto)
                ? false
                : listaTelefonica.add(contacto);
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

    public boolean removerContacto(ContactoTelefonico contacto) {
        return listaTelefonica.remove(contacto);
    }

    public ContactoTelefonico removerTelefone(int indice) {
        return listaTelefonica.remove(indice);
    }

    public boolean removerTodos(ListaTelefonica listaTelefonica) {
        return this.listaTelefonica.removeAll(listaTelefonica.getListaTelefonica());
    }

    public int obterIndiceContacto(ContactoTelefonico contacto) {
        return listaTelefonica.indexOf(contacto);
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
        for (ContactoTelefonico contacto : copia) {
            s.append(contacto);
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

        return copiaThis.equals(copiaOutra);
    }

}
