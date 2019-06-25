package app.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getNome method, of class Cliente.
     */
    @Ignore
    public void testGetNome() {
        System.out.println("getNome");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Ignore
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasEmail method, of class Cliente.
     */
    @Test
    public void testHasEmail() {
        System.out.println("hasEmail");
        String strEmail = "teste@teste.com";
        Cliente instance = new Cliente("Joao", "8161737", "9867543567", "teste@teste.com");
        boolean expResult = true;
        boolean result = instance.hasEmail(strEmail);
        assertEquals(expResult, result);
    }

    /**
     * Test of addEnderecoPostal method, of class Cliente.
     */
    @Ignore
    public void testAddEnderecoPostal() {
        System.out.println("addEnderecoPostal");
        EnderecoPostal oMorada = null;
        Cliente instance = null;
        boolean expResult = false;
        boolean result = instance.addEnderecoPostal(oMorada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEnderecoPostal method, of class Cliente.
     */
    @Ignore
    public void testRemoveEnderecoPostal() {
        System.out.println("removeEnderecoPostal");
        EnderecoPostal oMorada = null;
        Cliente instance = null;
        boolean expResult = false;
        boolean result = instance.removeEnderecoPostal(oMorada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnderecosPostais method, of class Cliente.
     */
    @Ignore
    public void testGetEnderecosPostais() {
        System.out.println("getEnderecosPostais");
        Cliente instance = null;
        List<EnderecoPostal> expResult = null;
        List<EnderecoPostal> result = instance.getEnderecosPostais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Cliente("José", "123", "456", "tste@teste.com");
        Cliente instance = new Cliente("António", "456", "123", "teste@blabla.com");
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Cliente instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
