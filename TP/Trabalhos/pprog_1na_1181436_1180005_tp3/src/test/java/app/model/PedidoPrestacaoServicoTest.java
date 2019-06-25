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

public class PedidoPrestacaoServicoTest {

    public PedidoPrestacaoServicoTest() {
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
     * Test of addDescricao method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testAddDescricao() {
        System.out.println("addDescricao");
        DescricaoDoServico oDescricaoServico = null;
        PedidoPrestacaoServico instance = null;
        boolean expResult = false;
        boolean result = instance.addDescricao(oDescricaoServico);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHorario method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testAddHorario() {
        System.out.println("addHorario");
        PreferenciaHorario oPreferenciaHorario = null;
        PedidoPrestacaoServico instance = null;
        boolean expResult = false;
        boolean result = instance.addHorario(oPreferenciaHorario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_listaServicos method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testGetM_listaServicos() {
        System.out.println("getM_listaServicos");
        PedidoPrestacaoServico instance = null;
        List<DescricaoDoServico> expResult = null;
        List<DescricaoDoServico> result = instance.getM_listaServicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_oCliente method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testGetM_oCliente() {
        System.out.println("getM_oCliente");
        PedidoPrestacaoServico instance = null;
        Cliente expResult = null;
        Cliente result = instance.getM_oCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_oEnderecoPostal method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testGetM_oEnderecoPostal() {
        System.out.println("getM_oEnderecoPostal");
        PedidoPrestacaoServico instance = null;
        EnderecoPostal expResult = null;
        EnderecoPostal result = instance.getM_oEnderecoPostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdCustoTotal method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testGetdCustoTotal() {
        System.out.println("getdCustoTotal");
        PedidoPrestacaoServico instance = null;
        double expResult = 0.0;
        double result = instance.getdCustoTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_listaServicos method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testSetM_listaServicos() {
        System.out.println("setM_listaServicos");
        ArrayList<DescricaoDoServico> m_listaServicos = null;
        PedidoPrestacaoServico instance = null;
        instance.setM_listaServicos(m_listaServicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_oCliente method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testSetM_oCliente() {
        System.out.println("setM_oCliente");
        Cliente m_oCliente = null;
        PedidoPrestacaoServico instance = null;
        instance.setM_oCliente(m_oCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_oEnderecoPostal method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testSetM_oEnderecoPostal() {
        System.out.println("setM_oEnderecoPostal");
        EnderecoPostal m_oEnderecoPostal = null;
        PedidoPrestacaoServico instance = null;
        instance.setM_oEnderecoPostal(m_oEnderecoPostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_listaPreferenciaHorario method, of class
     * PedidoPrestacaoServico.
     */
    @Ignore
    public void testGetM_listaPreferenciaHorario() {
        System.out.println("getM_listaPreferenciaHorario");
        PedidoPrestacaoServico instance = null;
        List<PreferenciaHorario> expResult = null;
        List<PreferenciaHorario> result = instance.getM_listaPreferenciaHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdCustoTotal method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testSetdCustoTotal() {
        System.out.println("setdCustoTotal");
        double dCustoTotal = 0.0;
        PedidoPrestacaoServico instance = null;
        instance.setdCustoTotal(dCustoTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        PedidoPrestacaoServico instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdem method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testGetOrdem() {
        System.out.println("getOrdem");
        PedidoPrestacaoServico instance = null;
        int expResult = 0;
        int result = instance.getOrdem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringComplete method, of class PedidoPrestacaoServico.
     */
    @Ignore
    public void testToStringComplete() {
        System.out.println("toStringComplete");
        PedidoPrestacaoServico instance = null;
        String expResult = "";
        String result = instance.toStringComplete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCusto method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testCalcularCusto() {
        System.out.println("calcularCusto");
        app.utils.Init.run();
        Servico oServico = new ServicoFixo("101", "ServTeste", "ServTeste", 120, null, 30);
        DescricaoDoServico oDescPedido = new DescricaoDoServico(oServico, "Teste", 30);
        CodigoPostal oCodPostal = new CodigoPostal("4100-006");
        EnderecoPostal m_oEnderecoPostal = new EnderecoPostal(null, oCodPostal, null);
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico(null, m_oEnderecoPostal);
        instance.addDescricao(oDescPedido);
        double expResult = 80;
        double result = instance.calcularCusto();
        assertEquals(expResult, result, 0.0);
    }

}
