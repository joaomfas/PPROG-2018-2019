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
public class ProfissionalTest {

    public ProfissionalTest() {
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
     * Test of getNumAtletas method, of class Profissional.
     */
    @Ignore
    public void testGetNumAtletas() {
        System.out.println("getNumAtletas");
        int expResult = 0;
        int result = Profissional.getNumAtletas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParcelaFixaSalario method, of class Profissional.
     */
    @Ignore
    public void testSetParcelaFixaSalario() {
        System.out.println("setParcelaFixaSalario");
        double parcelaFixaSalario = 0.0;
        Profissional instance = new Profissional();
        instance.setParcelaFixaSalario(parcelaFixaSalario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParcelaVariavelSalarioPerCent method, of class Profissional.
     */
    @Ignore
    public void testSetParcelaVariavelSalarioPerCent() {
        System.out.println("setParcelaVariavelSalarioPerCent");
        double parcelaVariavelSalarioPerCent = 0.0;
        Profissional instance = new Profissional();
        instance.setParcelaVariavelSalarioPerCent(parcelaVariavelSalarioPerCent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelaFixaSalario method, of class Profissional.
     */
    @Ignore
    public void testGetParcelaFixaSalario() {
        System.out.println("getParcelaFixaSalario");
        Profissional instance = new Profissional();
        double expResult = 0.0;
        double result = instance.getParcelaFixaSalario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelaVariavelSalarioPerCent method, of class Profissional.
     */
    @Ignore
    public void testGetParcelaVariavelSalarioPerCent() {
        System.out.println("getParcelaVariavelSalarioPerCent");
        Profissional instance = new Profissional();
        double expResult = 0.0;
        double result = instance.getParcelaVariavelSalarioPerCent();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalario method, of class Profissional.
     */
    @Test
    public void testCalcularSalario() {
        System.out.println("calcularSalario");
        Profissional instance = new Profissional("Atleta", 0, "GEN", 50, Atividade.CAMINHADA, 80);
        instance.setPremios(100);
        instance.setParcelaFixaSalario(100);
        instance.setParcelaVariavelSalarioPerCent(0.30);
        double expResult = 130;
        double result = instance.calcularSalario();
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of toString method, of class Profissional.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Profissional instance = new Profissional();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
