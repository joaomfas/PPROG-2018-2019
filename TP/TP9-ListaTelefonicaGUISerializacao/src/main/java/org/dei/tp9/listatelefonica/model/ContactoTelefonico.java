package org.dei.tp9.listatelefonica.model;

import java.io.Serializable;

public class ContactoTelefonico implements Comparable<ContactoTelefonico>, Serializable {

    private String titular;
    private int numero;

    public ContactoTelefonico(String titular, int numero) {
        setTitular(titular);
        setNumero(numero);
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public final void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é inválido!");
        }
        this.titular = titular;
    }

    public final void setNumero(int numero) {
        if (numero < 100000000 || numero > 999999999) {
            throw new IllegalArgumentException("Número é inválido!");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("Número:%d Titular:%s", numero, titular);
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        ContactoTelefonico outroContacto = (ContactoTelefonico) outroObjeto;
        
        return numero == outroContacto.numero;
    }

    @Override
    public int compareTo(ContactoTelefonico outroContacto) {
        return numero - outroContacto.numero;
    }

}
