package app.model;

import app.utils.Data;
import app.utils.Tempo;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class PrestadorServicoTest {

    public PrestadorServicoTest() {
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
     * Test of getNome method, of class PrestadorServico.
     */
    @Ignore
    public void testGetNome() {
        System.out.println("getNome");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class PrestadorServico.
     */
    @Ignore
    public void testSetNome() {
        System.out.println("setNome");
        String m_strNome = "";
        PrestadorServico instance = null;
        instance.setNome(m_strNome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumMec method, of class PrestadorServico.
     */
    @Ignore
    public void testGetNumMec() {
        System.out.println("getNumMec");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.getNumMec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumMec method, of class PrestadorServico.
     */
    @Ignore
    public void testSetNumMec() {
        System.out.println("setNumMec");
        String m_strNumMec = "";
        PrestadorServico instance = null;
        instance.setNumMec(m_strNumMec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbrev method, of class PrestadorServico.
     */
    @Ignore
    public void testGetAbrev() {
        System.out.println("getAbrev");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.getAbrev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAbrev method, of class PrestadorServico.
     */
    @Ignore
    public void testSetAbrev() {
        System.out.println("setAbrev");
        String m_strAbrev = "";
        PrestadorServico instance = null;
        instance.setAbrev(m_strAbrev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class PrestadorServico.
     */
    @Ignore
    public void testGetEmail() {
        System.out.println("getEmail");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class PrestadorServico.
     */
    @Ignore
    public void testSetEmail() {
        System.out.println("setEmail");
        String m_strEmail = "";
        PrestadorServico instance = null;
        instance.setEmail(m_strEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlistaDisponibilidades method, of class PrestadorServico.
     */
    @Ignore
    public void testGetlistaDisponibilidades() {
        System.out.println("getlistaDisponibilidades");
        PrestadorServico instance = null;
        ListaDisponibilidadesDiaria expResult = null;
        ListaDisponibilidadesDiaria result = instance.getlistaDisponibilidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setlistaDisponibilidades method, of class PrestadorServico.
     */
    @Ignore
    public void testSetlistaDisponibilidades() {
        System.out.println("setlistaDisponibilidades");
        ListaDisponibilidadesDiaria m_listaDisponibilidades = null;
        PrestadorServico instance = null;
        instance.setlistaDisponibilidades(m_listaDisponibilidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasEmail method, of class PrestadorServico.
     */
    @Test
    public void testHasEmail() {
        System.out.println("hasEmail");
        String strEmail = "teste123@teste.com";
        PrestadorServico instance = new PrestadorServico("TEste", "12314", "T", "teste123@teste.com");
        boolean expResult = true;
        boolean result = instance.hasEmail(strEmail);
        assertEquals(expResult, result);
    }

    /**
     * Test of addCategoria method, of class PrestadorServico.
     */
    @Ignore
    public void testAddCategoria() {
        System.out.println("addCategoria");
        Categoria oCat = null;
        PrestadorServico instance = null;
        boolean expResult = false;
        boolean result = instance.addCategoria(oCat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAreaGeografica method, of class PrestadorServico.
     */
    @Ignore
    public void testAddAreaGeografica() {
        System.out.println("addAreaGeografica");
        AreaGeografica oAreaGeo = null;
        PrestadorServico instance = null;
        boolean expResult = false;
        boolean result = instance.addAreaGeografica(oAreaGeo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_listaDisponibilidades method, of class PrestadorServico.
     */
    @Ignore
    public void testGetM_listaDisponibilidades() {
        System.out.println("getM_listaDisponibilidades");
        PrestadorServico instance = null;
        ListaDisponibilidadesDiaria expResult = null;
        ListaDisponibilidadesDiaria result = instance.getM_listaDisponibilidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_listaCategorias method, of class PrestadorServico.
     */
    @Ignore
    public void testGetM_listaCategorias() {
        System.out.println("getM_listaCategorias");
        PrestadorServico instance = null;
        ListaCategoriasPS expResult = null;
        ListaCategoriasPS result = instance.getM_listaCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_listaAG method, of class PrestadorServico.
     */
    @Ignore
    public void testGetM_listaAG() {
        System.out.println("getM_listaAG");
        PrestadorServico instance = null;
        ListaAreaGeograficaPS expResult = null;
        ListaAreaGeograficaPS result = instance.getM_listaAG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atuaEmAG method, of class PrestadorServico.
     */
    @Test
    public void testAtuaEmAG() {
        System.out.println("atuaEmAG");
        CodigoPostal oCodPostal = new CodigoPostal("4200-007");
        AreaGeografica ag = new AreaGeografica("teste", oCodPostal, 0, 0);
        PrestadorServico instance = new PrestadorServico("TEste", "12314", "T", "teste123@teste.com");
        instance.addAreaGeografica(ag);
        boolean expResult = true;
        boolean result = instance.atuaEmAG(ag);
        assertEquals(expResult, result);
    }

    /**
     * Test of realizaServicoDeCategoria method, of class PrestadorServico.
     */
    @Test
    public void testRealizaServicoDeCategoria() {
        System.out.println("realizaServicoDeCategoria");
        Categoria cat = new Categoria("123", "teste");
        PrestadorServico instance = new PrestadorServico("TEste", "12314", "T", "teste123@teste.com");
        instance.addCategoria(cat);
        boolean expResult = true;
        boolean result = instance.realizaServicoDeCategoria(cat);
        assertEquals(expResult, result);
    }

    /**
     * Test of realizaServico method, of class PrestadorServico.
     */
    @Test
    public void testRealizaServico() {
        System.out.println("realizaServico");
        Categoria cat = new Categoria("123", "teste");
        Servico servico = new ServicoFixo("123123", "teste", "teste", 0, cat, 0);
        PrestadorServico instance = new PrestadorServico("TEste", "12314", "T", "teste123@teste.com");
        instance.addCategoria(cat);
        boolean expResult = true;
        boolean result = instance.realizaServico(servico);
        assertEquals(expResult, result);
    }

    /**
     * Test of estaDisponivelEm method, of class PrestadorServico.
     */
    @Test
    public void testEstaDisponivelEm() {
        System.out.println("estaDisponivelEm");
        List<PreferenciaHorario> listaPreferenciaHoriario = new ArrayList<>();
        Data oData = new Data(2019, 5, 17);
        Tempo oTempo = new Tempo(13, 0, 0);
        PreferenciaHorario oPref = new PreferenciaHorario(0, oData, oTempo);
        listaPreferenciaHoriario.add(oPref);
        PrestadorServico instance = new PrestadorServico("TEste", "12314", "T", "teste123@teste.com");
        Data oDataInicio = new Data(2019, 5, 17);
        Tempo oHoraInicio = new Tempo(12, 0, 0);
        Data oDataFim = new Data(2019, 5, 17);
        Tempo oHoraFim = new Tempo(17, 0, 0);
        Disponibilidade oDisp = new Disponibilidade(oDataInicio, oHoraInicio, oDataFim, oHoraFim);
        instance.getM_listaDisponibilidades().addPeriodoDisponibilidade(oDisp);
        boolean expResult = true;
        boolean result = instance.estaDisponivelEm(listaPreferenciaHoriario);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PrestadorServico.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        PrestadorServico instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
