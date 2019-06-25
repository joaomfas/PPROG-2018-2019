package app.model;

import app.utils.CalculoDistancia;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class AreaGeograficaTest {
    
    public AreaGeograficaTest() {
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
     * Test of getDesignacao method, of class AreaGeografica.
     */
    @Ignore
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        AreaGeografica instance = null;
        String expResult = "";
        String result = instance.getDesignacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesignacao method, of class AreaGeografica.
     */
    @Ignore
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String m_strDesignacao = "";
        AreaGeografica instance = null;
        instance.setDesignacao(m_strDesignacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodPostalBase method, of class AreaGeografica.
     */
    @Ignore
    public void testGetCodPostalBase() {
        System.out.println("getCodPostalBase");
        AreaGeografica instance = null;
        CodigoPostal expResult = null;
        CodigoPostal result = instance.getCodPostalBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaioAtuacao method, of class AreaGeografica.
     */
    @Ignore
    public void testGetRaioAtuacao() {
        System.out.println("getRaioAtuacao");
        AreaGeografica instance = null;
        double expResult = 0.0;
        double result = instance.getRaioAtuacao();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setraioAtuacao method, of class AreaGeografica.
     */
    @Ignore
    public void testSetraioAtuacao() {
        System.out.println("setraioAtuacao");
        double m_raioAtuacao = 0.0;
        AreaGeografica instance = null;
        instance.setraioAtuacao(m_raioAtuacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdCustoDeslocacao method, of class AreaGeografica.
     */
    @Ignore
    public void testGetdCustoDeslocacao() {
        System.out.println("getdCustoDeslocacao");
        AreaGeografica instance = null;
        double expResult = 0.0;
        double result = instance.getdCustoDeslocacao();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustoDeslocacao method, of class AreaGeografica.
     */
    @Ignore
    public void testSetCustoDeslocacao() {
        System.out.println("setCustoDeslocacao");
        double m_dCustoDeslocacao = 0.0;
        AreaGeografica instance = null;
        instance.setCustoDeslocacao(m_dCustoDeslocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistancia method, of class AreaGeografica.
     */
    @Test
    public void testGetDistancia() {
        System.out.println("getDistancia");
        CodigoPostal oCP = new CodigoPostal("4000-095");
        CodigoPostal oCPAG = new CodigoPostal("4000-007");
        AreaGeografica instance = new AreaGeografica(null, oCPAG, 200, 0);
        AtuaEm atua = new AtuaEm(oCP, CalculoDistancia.distancia(41.1469459, -8.6064074, 41.145458, -8.6064074));
        instance.getAtuacao().add(atua);
        double expResult = 166;
        double result = instance.getDistancia(oCP);
        assertEquals(expResult, result, 1);
    }

    /**
     * Test of getAtuacao method, of class AreaGeografica.
     */
    @Ignore
    public void testGetAtuacao() {
        System.out.println("getAtuacao");
        AreaGeografica instance = null;
        ArrayList<AtuaEm> expResult = null;
        ArrayList<AtuaEm> result = instance.getAtuacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AreaGeografica.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        AreaGeografica instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
