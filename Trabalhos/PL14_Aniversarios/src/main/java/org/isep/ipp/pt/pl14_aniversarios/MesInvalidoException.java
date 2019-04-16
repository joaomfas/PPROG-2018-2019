/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isep.ipp.pt.pl14_aniversarios;

/**
 *
 * @author joaoferreira
 */
public class MesInvalidoException extends IllegalArgumentException{
     public MesInvalidoException() {
        super("Mês inserido Inválido!");
    }
    
    public MesInvalidoException(String msg) {
        super(msg);
    }
}
