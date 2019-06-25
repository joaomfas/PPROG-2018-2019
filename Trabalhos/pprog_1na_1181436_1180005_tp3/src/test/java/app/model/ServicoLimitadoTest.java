package app.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ServicoLimitadoTest {
    
    public ServicoLimitadoTest() {
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
     * Test of getId method, of class ServicoLimitado.
     */
    @Ignore
    public void testGetId() {
        System.out.println("getId");
        ServicoLimitado instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ServicoLimitado.
     */
    @Ignore
    public void testSetId() {
        System.out.println("setId");
        String m_strId = "";
        ServicoLimitado instance = null;
        instance.setId(m_strId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescBreve method, of class ServicoLimitado.
     */
    @Ignore
    public void testGetDescBreve() {
        System.out.println("getDescBreve");
        ServicoLimitado instance = null;
        String expResult = "";
        String result = instance.getDescBreve();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescBreve method, of class ServicoLimitado.
     */
    @Ignore
    public void testSetDescBreve() {
        System.out.println("setDescBreve");
        String m_strDescBreve = "";
        ServicoLimitado instance = null;
        instance.setDescBreve(m_strDescBreve);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescCompleta method, of class ServicoLimitado.
     */
    @Ignore
    public void testGetDescCompleta() {
        System.out.println("getDescCompleta");
        ServicoLimitado instance = null;
        String expResult = "";
        String result = instance.getDescCompleta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescCompleta method, of class ServicoLimitado.
     */
    @Ignore
    public void testSetDescCompleta() {
        System.out.println("setDescCompleta");
        String m_strDescCompleta = "";
        ServicoLimitado instance = null;
        instance.setDescCompleta(m_strDescCompleta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustoHora method, of class ServicoLimitado.
     */
    @Ignore
    public void testGetCustoHora() {
        System.out.println("getCustoHora");
        ServicoLimitado instance = null;
        double expResult = 0.0;
        double result = instance.getCustoHora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustoHora method, of class ServicoLimitado.
     */
    @Ignore
    public void testSetCustoHora() {
        System.out.println("setCustoHora");
        double m_dCustoHora = 0.0;
        ServicoLimitado instance = null;
        instance.setCustoHora(m_dCustoHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class ServicoLimitado.
     */
    @Ignore
    public void testGetCategoria() {
        System.out.println("getCategoria");
        ServicoLimitado instance = null;
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class ServicoLimitado.
     */
    @Ignore
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria oCategoria = null;
        ServicoLimitado instance = null;
        instance.setCategoria(oCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoServico method, of class ServicoLimitado.
     */
    @Ignore
    public void testGetTipoServico() {
        System.out.println("getTipoServico");
        ServicoLimitado instance = null;
        String expResult = "";
        String result = instance.getTipoServico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasCat method, of class ServicoLimitado.
     */
    @Test
    public void testHasCat() {
        System.out.println("hasCat");
        Categoria oCat = new Categoria("cat", "cod1");
        ServicoLimitado instance = new ServicoLimitado("", "", "", 0, oCat);
        boolean expResult = true;
        boolean result = instance.hasCat(oCat);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ServicoLimitado.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        ServicoLimitado instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
