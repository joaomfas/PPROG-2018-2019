/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.isep.ipp.pt.pl7_contadoresdomesticos;

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
public class ContElectSimplesTest {
    
    public ContElectSimplesTest() {
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
     * Test of getBorderlinePotenciaContratada method, of class ContElectSimples.
     */
    @Ignore
    public void testGetBorderlinePotenciaContratada() {
        System.out.println("getBorderlinePotenciaContratada");
        double expResult = 0.0;
        double result = ContElectSimples.getBorderlinePotenciaContratada();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBorderlinePotenciaContratada method, of class ContElectSimples.
     */
    @Ignore
    public void testSetBorderlinePotenciaContratada() {
        System.out.println("setBorderlinePotenciaContratada");
        double borderlinePotenciaContratada = 0.0;
        ContElectSimples.setBorderlinePotenciaContratada(borderlinePotenciaContratada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarifaMenor method, of class ContElectSimples.
     */
    @Ignore
    public void testGetTarifaMenor() {
        System.out.println("getTarifaMenor");
        double expResult = 0.0;
        double result = ContElectSimples.getTarifaMenor();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarifaMenor method, of class ContElectSimples.
     */
    @Ignore
    public void testSetTarifaMenor() {
        System.out.println("setTarifaMenor");
        double tarifaMenor = 0.0;
        ContElectSimples.setTarifaMenor(tarifaMenor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarifaMaior method, of class ContElectSimples.
     */
    @Ignore
    public void testGetTarifaMaior() {
        System.out.println("getTarifaMaior");
        double expResult = 0.0;
        double result = ContElectSimples.getTarifaMaior();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarifaMaior method, of class ContElectSimples.
     */
    @Ignore
    public void testSetTarifaMaior() {
        System.out.println("setTarifaMaior");
        double tarifaMaior = 0.0;
        ContElectSimples.setTarifaMaior(tarifaMaior);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPotenciaContratada method, of class ContElectSimples.
     */
    @Ignore
    public void testGetPotenciaContratada() {
        System.out.println("getPotenciaContratada");
        ContElectSimples instance = null;
        double expResult = 0.0;
        double result = instance.getPotenciaContratada();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPotenciaContratada method, of class ContElectSimples.
     */
    @Ignore
    public void testSetPotenciaContratada() {
        System.out.println("setPotenciaContratada");
        double potenciaContratada = 0.0;
        ContElectSimples instance = null;
        instance.setPotenciaContratada(potenciaContratada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContElectSimples.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        ContElectSimples instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcConsumoMesActual method, of class ContElectSimples.
     */
    @Test
    public void testCalcConsumoMesActual() {
       System.out.println("calcConsumoMesActual");
        
        ContElectSimples instance = new ContElectSimples("João", 6.9, 20);
        
        double expResult = 3.2;
        
        double result = instance.calcConsumoMesActual();
        
        assertEquals(expResult, result, 0);
    }
    
}
