package app.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class DescricaoDoServicoTest {
    
    public DescricaoDoServicoTest() {
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
     * Test of getM_oServico method, of class DescricaoDoServico.
     */
    @Ignore
    public void testGetM_oServico() {
        System.out.println("getM_oServico");
        DescricaoDoServico instance = null;
        Servico expResult = null;
        Servico result = instance.getM_oServico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_oServico method, of class DescricaoDoServico.
     */
    @Ignore
    public void testSetM_oServico() {
        System.out.println("setM_oServico");
        Servico m_oServico = null;
        DescricaoDoServico instance = null;
        instance.setM_oServico(m_oServico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_strDescricao method, of class DescricaoDoServico.
     */
    @Ignore
    public void testGetM_strDescricao() {
        System.out.println("getM_strDescricao");
        DescricaoDoServico instance = null;
        String expResult = "";
        String result = instance.getM_strDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_strDescricao method, of class DescricaoDoServico.
     */
    @Ignore
    public void testSetM_strDescricao() {
        System.out.println("setM_strDescricao");
        String m_strDescricao = "";
        DescricaoDoServico instance = null;
        instance.setM_strDescricao(m_strDescricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_dDuracao method, of class DescricaoDoServico.
     */
    @Ignore
    public void testGetM_dDuracao() {
        System.out.println("getM_dDuracao");
        DescricaoDoServico instance = null;
        double expResult = 0.0;
        double result = instance.getM_dDuracao();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_dDuracao method, of class DescricaoDoServico.
     */
    @Ignore
    public void testSetM_dDuracao() {
        System.out.println("setM_dDuracao");
        double m_dDuracao = 0.0;
        DescricaoDoServico instance = null;
        instance.setM_dDuracao(m_dDuracao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCusto method, of class DescricaoDoServico.
     */
    @Test
    public void testGetCusto() {
        System.out.println("getCusto");
        Servico oServico = new ServicoFixo("101", "ServTeste", "ServTeste", 120, null, 30);
        DescricaoDoServico instance = new DescricaoDoServico(oServico, "Teste", 30);
        double expResult = 60;
        double result = instance.getCusto();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class DescricaoDoServico.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        DescricaoDoServico instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
