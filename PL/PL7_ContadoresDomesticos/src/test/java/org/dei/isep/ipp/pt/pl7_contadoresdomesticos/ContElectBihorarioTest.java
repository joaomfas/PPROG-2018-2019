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
public class ContElectBihorarioTest {
    
    public ContElectBihorarioTest() {
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
     * Test of getTarifaVazio method, of class ContElectBihorario.
     */
    @Ignore
    public void testGetTarifaVazio() {
        System.out.println("getTarifaVazio");
        double expResult = 0.0;
        double result = ContElectBihorario.getTarifaVazio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarifaVazio method, of class ContElectBihorario.
     */
    @Ignore
    public void testSetTarifaVazio() {
        System.out.println("setTarifaVazio");
        double tarifaMenor = 0.0;
        ContElectBihorario.setTarifaVazio(tarifaMenor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTarifaForaVazio method, of class ContElectBihorario.
     */
    @Ignore
    public void testGetTarifaForaVazio() {
        System.out.println("getTarifaForaVazio");
        double expResult = 0.0;
        double result = ContElectBihorario.getTarifaForaVazio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTarifaForaVazio method, of class ContElectBihorario.
     */
    @Ignore
    public void testSetTarifaForaVazio() {
        System.out.println("setTarifaForaVazio");
        double tarifaMaior = 0.0;
        ContElectBihorario.setTarifaForaVazio(tarifaMaior);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPotenciaContratada method, of class ContElectBihorario.
     */
    @Ignore
    public void testGetPotenciaContratada() {
        System.out.println("getPotenciaContratada");
        ContElectBihorario instance = null;
        double expResult = 0.0;
        double result = instance.getPotenciaContratada();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPotenciaContratada method, of class ContElectBihorario.
     */
    @Ignore
    public void testSetPotenciaContratada() {
        System.out.println("setPotenciaContratada");
        double potenciaContratada = 0.0;
        ContElectBihorario instance = null;
        instance.setPotenciaContratada(potenciaContratada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContElectBihorario.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        ContElectBihorario instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcConsumoMesActual method, of class ContElectBihorario.
     */
    @Test
    public void testCalcConsumoMesActual() {
        System.out.println("calcConsumoMesActual");
        ContElectBihorario instance = new ContElectBihorario("Joao", 4.6, 20, 40);
        
        double expResult = 6.92;
        
        double result = instance.calcConsumoMesActual();
        assertEquals(expResult, result, 0.001);
    }
    
}
