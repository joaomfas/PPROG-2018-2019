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

public class RegistoServicoTest {

    public RegistoServicoTest() {
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
     * Test of addServico method, of class RegistoServico.
     */
    @Ignore
    public void testAddServico() {
        System.out.println("addServico");
        Servico oServico = null;
        RegistoServico instance = new RegistoServico();
        boolean expResult = false;
        boolean result = instance.addServico(oServico);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicos method, of class RegistoServico.
     */
    @Ignore
    public void testGetServicos() {
        System.out.println("getServicos");
        RegistoServico instance = new RegistoServico();
        List<Servico> expResult = null;
        List<Servico> result = instance.getServicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicosDeCategoria method, of class RegistoServico. cria 2
     * serviços de cat1 e 1 serviço de cat2. adiciona-os ao registo e verifica
     * se o método retorna os dois serviços de cat1
     */
    @Test
    public void testGetServicosDeCategoria() {
        System.out.println("getServicosDeCategoria");
        RegistoServico registo = new RegistoServico();
        Categoria cat1 = new Categoria("cat1", "cod1");
        Categoria cat2 = new Categoria("cat2", "cod2");
        Servico servico1 = new ServicoFixo("", "", "", 0, cat1, 0);
        Servico servico2 = new ServicoFixo("", "", "", 0, cat1, 0);
        Servico servico3 = new ServicoFixo("", "", "", 0, cat2, 0);
        registo.addServico(servico1);
        registo.addServico(servico2);
        registo.addServico(servico3);
        List<Servico> expResult = new ArrayList<>();
        expResult.add(servico1);
        expResult.add(servico2);
        List<Servico> result = registo.getServicosDeCategoria(cat1);
        assertEquals(expResult, result);
    }

}
