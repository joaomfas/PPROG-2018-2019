package app.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CategoriaTest {
    
    public CategoriaTest() {
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
     * Test of getCodigo method, of class Categoria.
     */
    @Ignore
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Categoria instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasCodigo method, of class Categoria.
     */
    @Test
    public void testHasCodigo() {
        System.out.println("hasCodigo");
        String strCod = "18261";
        Categoria instance = new Categoria("18261", "Teste");
        boolean expResult = true;
        boolean result = instance.hasCodigo(strCod);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Categoria.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Categoria("101", "teste1");;
        Categoria instance = new Categoria("101", "teste1");
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Categoria.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Categoria instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
