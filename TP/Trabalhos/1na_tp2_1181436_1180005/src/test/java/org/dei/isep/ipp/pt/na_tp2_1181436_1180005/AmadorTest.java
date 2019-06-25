/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.isep.ipp.pt.na_tp2_1181436_1180005;

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
public class AmadorTest {

    public AmadorTest() {
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
     * Test of getValorMinimo method, of class Amador.
     */
    @Ignore
    public void testGetValorMinimo() {
        System.out.println("getValorMinimo");
        int expResult = 0;
        int result = Amador.getValorMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorMinimo method, of class Amador.
     */
    @Ignore
    public void testSetValorMinimo() {
        System.out.println("setValorMinimo");
        int valorMinimo = 0;
        Amador.setValorMinimo(valorMinimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerCentPremios method, of class Amador.
     */
    @Ignore
    public void testGetPerCentPremios() {
        System.out.println("getPerCentPremios");
        double expResult = 0.0;
        double result = Amador.getPerCentPremios();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumAtletas method, of class Amador.
     */
    @Ignore
    public void testGetNumAtletas() {
        System.out.println("getNumAtletas");
        int expResult = 0;
        int result = Amador.getNumAtletas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerCentPremios method, of class Amador.
     */
    @Ignore
    public void testSetPerCentPremios() {
        System.out.println("setPerCentPremios");
        double perCentPremios = 0.0;
        Amador.setPerCentPremios(perCentPremios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalario method, of class Amador.
     */
    @Test
    public void testCalcularSalario1() {
        // ant 0 premios 100 percent 7 -> salario 7
        System.out.println("calcularSalario1");
        Amador instance = new Amador("NOME", 0, "GENERO", 0, Atividade.CAMINHADA, 0);
        Amador.setPerCentPremios(0.07);
        instance.setPremios(100);
        instance.setAntiguidade(0);
        double expResult = 7;
        double result = instance.calcularSalario();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalcularSalario2() {
        // ant 5 premios 100 percent 7 -> salario 9
        System.out.println("calcularSalario2");
        Amador instance = new Amador("NOME", 0, "GENERO", 0, Atividade.CAMINHADA, 0);
        Amador.setPerCentPremios(0.07);
        instance.setPremios(100);
        instance.setAntiguidade(5);
        double expResult = 9;
        double result = instance.calcularSalario();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalcularSalario3() {
        // ant 10 premios 100 percent 7 -> salario 9
        System.out.println("calcularSalario3");
        Amador instance = new Amador("NOME", 0, "GENERO", 0, Atividade.CAMINHADA, 0);
        Amador.setPerCentPremios(0.07);
        instance.setPremios(100);
        instance.setAntiguidade(10);
        double expResult = 9;
        double result = instance.calcularSalario();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalcularSalario4() {
        // ant 20 premios 100 percent 7 -> salario 15
        System.out.println("calcularSalario1");
        Amador instance = new Amador("NOME", 0, "GENERO", 0, Atividade.CAMINHADA, 0);
        Amador.setPerCentPremios(0.07);
        instance.setPremios(100);
        instance.setAntiguidade(20);
        double expResult = 15;
        double result = instance.calcularSalario();
        assertEquals(expResult, result, 0.01);
    }

    @Test
    public void testCalcularSalario5() {
        // ant 21 premios 100 percent 7 -> salario 27
        System.out.println("calcularSalario1");
        Amador instance = new Amador("NOME", 0, "GENERO", 0, Atividade.CAMINHADA, 0);
        Amador.setPerCentPremios(0.07);
        instance.setPremios(100);
        instance.setAntiguidade(21);
        double expResult = 27;
        double result = instance.calcularSalario();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of toString method, of class Amador.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Amador instance = new Amador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
