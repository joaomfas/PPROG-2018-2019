package app.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class RegistoClienteTest {
    
    public RegistoClienteTest() {
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
     * Test of addCliente method, of class RegistoCliente.
     */
    @Ignore
    public void testAddCliente() {
        System.out.println("addCliente");
        Cliente oCliente = null;
        RegistoCliente instance = new RegistoCliente();
        boolean expResult = false;
        boolean result = instance.addCliente(oCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes method, of class RegistoCliente.
     */
    @Ignore
    public void testGetClientes() {
        System.out.println("getClientes");
        RegistoCliente instance = new RegistoCliente();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClienteByEmail method, of class RegistoCliente.
     */
    @Test
    public void testGetClienteByEmail() {
        System.out.println("getClienteByEmail");
        RegistoCliente registo = new RegistoCliente();
        Cliente cli1 = new Cliente("nome", "nif", "fone", "email1");
        Cliente cli2 = new Cliente("nome", "nif", "fone", "email2");
        registo.addCliente(cli1);
        registo.addCliente(cli2);
        String strEmail = "email1";
        Cliente expResult = cli1;
        Cliente result = registo.getClienteByEmail(strEmail);
        assertEquals(expResult, result);
    }
    
}
