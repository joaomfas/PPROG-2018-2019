package app.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class RegistoPrestadorServicoTest {

    public RegistoPrestadorServicoTest() {
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
     * Test of addPrestadorServico method, of class RegistoPrestadorServico.
     */
    @Ignore
    public void testAddPrestadorServico() {
        System.out.println("addPrestadorServico");
        PrestadorServico oPrestadorServico = null;
        RegistoPrestadorServico instance = new RegistoPrestadorServico();
        boolean expResult = false;
        boolean result = instance.addPrestadorServico(oPrestadorServico);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestadoresServicos method, of class RegistoPrestadorServico.
     */
    @Ignore
    public void testGetPrestadoresServicos() {
        System.out.println("getPrestadoresServicos");
        RegistoPrestadorServico instance = new RegistoPrestadorServico();
        List<PrestadorServico> expResult = null;
        List<PrestadorServico> result = instance.getPrestadoresServicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestServicoByEmail method, of class RegistoPrestadorServico.
     */
    @Test
    public void testGetPrestServicoByEmail() {
        System.out.println("getPrestServicoByEmail");
        String strEmail = "email1";
        RegistoPrestadorServico registo = new RegistoPrestadorServico();
        PrestadorServico ps1 = new PrestadorServico("nome", "num", "abrev", "email1");
        PrestadorServico ps2 = new PrestadorServico("nome", "num", "abrev", "email2");
        registo.addPrestadorServico(ps1);
        registo.addPrestadorServico(ps2);
        PrestadorServico expResult = ps1;
        PrestadorServico result = registo.getPrestServicoByEmail(strEmail);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmailPrestadores method, of class RegistoPrestadorServico.
     */
    @Test
    public void testGetEmailPrestadores() {
        System.out.println("getEmailPrestadores");
        RegistoPrestadorServico registo = new RegistoPrestadorServico();
        PrestadorServico ps1 = new PrestadorServico("nome", "num", "abrev", "email1");
        PrestadorServico ps2 = new PrestadorServico("nome", "num", "abrev", "email2");
        registo.addPrestadorServico(ps1);
        registo.addPrestadorServico(ps2);
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("email1");
        expResult.add("email2");
        ArrayList<String> result = registo.getEmailPrestadores();
        assertEquals(expResult, result);
    }

}
