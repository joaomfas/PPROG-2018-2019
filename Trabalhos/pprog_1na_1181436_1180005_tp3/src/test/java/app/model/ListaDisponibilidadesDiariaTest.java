package app.model;

import app.utils.Data;
import app.utils.Tempo;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ListaDisponibilidadesDiariaTest {

    public ListaDisponibilidadesDiariaTest() {
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
     * Test of novoPedidoDisponibilidade method, of class
     * ListaDisponibilidadesDiaria.
     */
    @Ignore
    public void testNovoPedidoDisponibilidade() {
        System.out.println("novoPedidoDisponibilidade");
        Data strDataI = null;
        Tempo strhoraI = null;
        Data strDataF = null;
        Tempo strHoraF = null;
        ListaDisponibilidadesDiaria instance = new ListaDisponibilidadesDiaria();
        Disponibilidade expResult = null;
        Disponibilidade result = instance.novoPedidoDisponibilidade(strDataI, strhoraI, strDataF, strHoraF);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaPeriodoDisponibilidade method, of class
     * ListaDisponibilidadesDiaria.
     */
    @Ignore
    public void testRegistaPeriodoDisponibilidade() {
        System.out.println("registaPeriodoDisponibilidade");
        Disponibilidade oDisp = null;
        ListaDisponibilidadesDiaria instance = new ListaDisponibilidadesDiaria();
        boolean expResult = false;
        boolean result = instance.registaPeriodoDisponibilidade(oDisp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaPeriodoDisponibilidade method, of class
     * ListaDisponibilidadesDiaria.
     */
    @Test
    public void testValidaPeriodoDisponibilidade() {
        System.out.println("validaPeriodoDisponibilidade");
        Data oDataInicio = new Data(2019, 5, 17);
        Tempo oHoraInicio = new Tempo(12, 0, 0);
        Data oDataFim = new Data(2019, 5, 17);
        Tempo oHoraFim = new Tempo(17, 0, 0);
        Disponibilidade oDisp = new Disponibilidade(oDataInicio, oHoraInicio, oDataFim, oHoraFim);
        ListaDisponibilidadesDiaria instance = new ListaDisponibilidadesDiaria();
        boolean expResult = true;
        boolean result = instance.validaPeriodoDisponibilidade(oDisp);
        assertEquals(expResult, result);
    }

    /**
     * Test of addPeriodoDisponibilidade method, of class
     * ListaDisponibilidadesDiaria.
     */
    @Ignore
    public void testAddPeriodoDisponibilidade() {
        System.out.println("addPeriodoDisponibilidade");
        Disponibilidade oDisp = null;
        ListaDisponibilidadesDiaria instance = new ListaDisponibilidadesDiaria();
        boolean expResult = false;
        boolean result = instance.addPeriodoDisponibilidade(oDisp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_oListaDispDiaria method, of class
     * ListaDisponibilidadesDiaria.
     */
    @Ignore
    public void testGetM_oListaDispDiaria() {
        System.out.println("getM_oListaDispDiaria");
        ListaDisponibilidadesDiaria instance = new ListaDisponibilidadesDiaria();
        ArrayList<Disponibilidade> expResult = null;
        ArrayList<Disponibilidade> result = instance.getM_oListaDispDiaria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaDisponibilidadesDiaria.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        ListaDisponibilidadesDiaria instance = new ListaDisponibilidadesDiaria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
