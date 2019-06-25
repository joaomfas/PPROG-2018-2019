package app.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ServicoFixoTest {

    public ServicoFixoTest() {
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
     * Test of getId method, of class ServicoFixo.
     */
    @Ignore
    public void testGetId() {
        System.out.println("getId");
        ServicoFixo instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class ServicoFixo.
     */
    @Ignore
    public void testSetId() {
        System.out.println("setId");
        String m_strId = "";
        ServicoFixo instance = null;
        instance.setId(m_strId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescBreve method, of class ServicoFixo.
     */
    @Ignore
    public void testGetDescBreve() {
        System.out.println("getDescBreve");
        ServicoFixo instance = null;
        String expResult = "";
        String result = instance.getDescBreve();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescBreve method, of class ServicoFixo.
     */
    @Ignore
    public void testSetDescBreve() {
        System.out.println("setDescBreve");
        String m_strDescBreve = "";
        ServicoFixo instance = null;
        instance.setDescBreve(m_strDescBreve);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescCompleta method, of class ServicoFixo.
     */
    @Ignore
    public void testGetDescCompleta() {
        System.out.println("getDescCompleta");
        ServicoFixo instance = null;
        String expResult = "";
        String result = instance.getDescCompleta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescCompleta method, of class ServicoFixo.
     */
    @Ignore
    public void testSetDescCompleta() {
        System.out.println("setDescCompleta");
        String m_strDescCompleta = "";
        ServicoFixo instance = null;
        instance.setDescCompleta(m_strDescCompleta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustoHora method, of class ServicoFixo.
     */
    @Ignore
    public void testGetCustoHora() {
        System.out.println("getCustoHora");
        ServicoFixo instance = null;
        double expResult = 0.0;
        double result = instance.getCustoHora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustoHora method, of class ServicoFixo.
     */
    @Ignore
    public void testSetCustoHora() {
        System.out.println("setCustoHora");
        double m_dCustoHora = 0.0;
        ServicoFixo instance = null;
        instance.setCustoHora(m_dCustoHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracaoPreDeterminada method, of class ServicoFixo.
     */
    @Ignore
    public void testGetDuracaoPreDeterminada() {
        System.out.println("getDuracaoPreDeterminada");
        ServicoFixo instance = null;
        double expResult = 0.0;
        double result = instance.getDuracaoPreDeterminada();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuracaoPreDeterminada method, of class ServicoFixo.
     */
    @Ignore
    public void testSetDuracaoPreDeterminada() {
        System.out.println("setDuracaoPreDeterminada");
        double m_dDuracaoPreDeterminada = 0.0;
        ServicoFixo instance = null;
        instance.setDuracaoPreDeterminada(m_dDuracaoPreDeterminada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class ServicoFixo.
     */
    @Ignore
    public void testGetCategoria() {
        System.out.println("getCategoria");
        ServicoFixo instance = null;
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class ServicoFixo.
     */
    @Ignore
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria oCategoria = null;
        ServicoFixo instance = null;
        instance.setCategoria(oCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoServico method, of class ServicoFixo.
     */
    @Ignore
    public void testGetTipoServico() {
        System.out.println("getTipoServico");
        ServicoFixo instance = null;
        String expResult = "";
        String result = instance.getTipoServico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasCat method, of class ServicoFixo.
     */
    @Test
    public void testHasCat() {
        System.out.println("hasCat");
        Categoria oCat = new Categoria("cat", "cod");
        ServicoFixo instance = new ServicoFixo("", "", "", 0, oCat, 0);
        boolean expResult = true;
        boolean result = instance.hasCat(oCat);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ServicoFixo.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        ServicoFixo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
