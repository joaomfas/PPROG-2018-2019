/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author joaoferreira
 */
public class ClubeDesportivoTest {
    
    public ClubeDesportivoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDataCriacao method, of class ClubeDesportivo.
     */
    @Ignore
    public void testGetDataCriacao() {
        System.out.println("getDataCriacao");
        ClubeDesportivo instance = null;
        Data expResult = null;
        Data result = instance.getDataCriacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCriacao method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetDataCriacao() {
        System.out.println("setDataCriacao");
        Data dataCriacao = null;
        ClubeDesportivo instance = null;
        instance.setDataCriacao(dataCriacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class ClubeDesportivo.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ClubeDesportivo instance = new ClubeDesportivo(new Data(1993, 6, 22), "Clube XYZ");
        String expResult = "Clube XYZ";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ClubeDesportivo instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtletas method, of class ClubeDesportivo.
     */
    @Ignore
    public void testGetAtletas() {
        System.out.println("getAtletas");
        ClubeDesportivo instance = null;
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.getAtletas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAtleta method, of class ClubeDesportivo.
     */
    @Test
    public void testAddAtleta() {
        System.out.println("addAtleta");
        Atleta at = new Amador("João", 22222, Atleta.MASCULINO, 22, Atividade.CAMINHADA, 50);        
        ClubeDesportivo instance = new ClubeDesportivo(new Data(1993, 6, 22), "Clube");
        boolean expResult = true;
        boolean result1 = instance.addAtleta(at);
        at.setIdade(30);
        boolean result2 = !(at == instance.getAtleta(0));
        boolean result = result1 && result2;
        assertEquals(expResult, result);
    }

    /**
     * Test of removeAtleta method, of class ClubeDesportivo.
     */
    @Ignore
    public void testRemoveAtleta() {
        System.out.println("removeAtleta");
        Atleta at = null;
        ClubeDesportivo instance = null;
        boolean expResult = false;
        boolean result = instance.removeAtleta(at);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalIRSAtletas method, of class ClubeDesportivo.
     */
    @Ignore
    public void testTotalIRSAtletas() {
        System.out.println("totalIRSAtletas");
        ClubeDesportivo instance = null;
        double expResult = 0.0;
        double result = instance.totalIRSAtletas();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarNomes method, of class ClubeDesportivo.
     */
    @Test
    public void testOrdenarNomes() {
        System.out.println("ordenarNomes");
        ClubeDesportivo instance = new ClubeDesportivo(new Data(1993, 6, 22), "Clube XYZ");
        Atleta at = new Amador("João", 22222, Atleta.MASCULINO, 22, Atividade.CAMINHADA, 50); 
        Atleta at1 = new Amador("Isabel", 22222, Atleta.MASCULINO, 22, Atividade.CAMINHADA, 50);
        Atleta at2 = new Amador("Paulo", 22222, Atleta.MASCULINO, 22, Atividade.CAMINHADA, 50); 
        instance.addAtleta(at);
        instance.addAtleta(at1);
        instance.addAtleta(at2);
        ArrayList<Atleta> lista2 = new ArrayList<>();
        lista2.add(at1);
        lista2.add(at);
        lista2.add(at2);
        ArrayList<Atleta> lista1 = instance.ordenarNomes();
        boolean result = true;
        for (int i = 0; i < lista1.size(); i++) {
            if (!(lista1.get(i).getNome().equals(lista2.get(i).getNome()))) {
                result = false;
            }
        }
        assertEquals(true, result);
    }

    /**
     * Test of ordenarPremiosReverse method, of class ClubeDesportivo.
     */
    @Ignore
    public void testOrdenarPremiosReverse() {
        System.out.println("ordenarPremiosReverse");
        ClubeDesportivo instance = null;
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.ordenarPremiosReverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenarCatModNome method, of class ClubeDesportivo.
     */
    @Ignore
    public void testOrdenarCatModNome() {
        System.out.println("ordenarCatModNome");
        ClubeDesportivo instance = null;
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.ordenarCatModNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
