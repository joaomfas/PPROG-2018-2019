package app.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class RegistoAreaGeograficaTest {

    public RegistoAreaGeograficaTest() {
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
     * Test of addAreaGeografica method, of class RegistoAreaGeografica.
     */
    @Ignore
    public void testAddAreaGeografica() {
        System.out.println("addAreaGeografica");
        AreaGeografica oAreaGeo = null;
        RegistoAreaGeografica instance = new RegistoAreaGeografica();
        boolean expResult = false;
        boolean result = instance.addAreaGeografica(oAreaGeo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreasGeograficas method, of class RegistoAreaGeografica.
     */
    @Ignore
    public void testGetAreasGeograficas() {
        System.out.println("getAreasGeograficas");
        RegistoAreaGeografica instance = new RegistoAreaGeografica();
        List<AreaGeografica> expResult = null;
        List<AreaGeografica> result = instance.getAreasGeograficas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAGByDesig method, of class RegistoAreaGeografica.
     */
    @Test
    public void testGetAGByDesig() {
        System.out.println("getAGByDesig");
        String strAGDesig = "ag1";
        CodigoPostal cp = new CodigoPostal("");
        AreaGeografica ag1 = new AreaGeografica("ag1", cp, 0, 0);
        AreaGeografica ag2 = new AreaGeografica("ag2", cp, 0, 0);
        RegistoAreaGeografica registo = new RegistoAreaGeografica();
        registo.addAreaGeografica(ag1);
        registo.addAreaGeografica(ag2);
        AreaGeografica expResult = ag1;
        AreaGeografica result = registo.getAGByDesig(strAGDesig);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAreaGeoMaisProxima method, of class RegistoAreaGeografica.
     * Cria duas AGs com atuas em de diferentes distâncias. o método get
     * retorna o ag com atua em de menor distância
     */
    @Test
    public void testGetAreaGeoMaisProxima() {
        System.out.println("getAreaGeoMaisProxima");
        RegistoAreaGeografica registo = new RegistoAreaGeografica();
        CodigoPostal cpBase = new CodigoPostal("");
        CodigoPostal oCP = new CodigoPostal("oCP");
        AreaGeografica ag1 = new AreaGeografica("ag1", cpBase, 0, 0);
        AreaGeografica ag2 = new AreaGeografica("ag2", cpBase, 0, 0);
        registo.addAreaGeografica(ag1);
        registo.addAreaGeografica(ag2);
        AtuaEm atuaEm1 = new AtuaEm(oCP, 10);
        AtuaEm atuaEm2 = new AtuaEm(oCP, 5);
        ag1.getAtuacao().add(atuaEm1);
        ag2.getAtuacao().add(atuaEm2);
        AreaGeografica expResult = ag2;
        AreaGeografica result = registo.getAreaGeoMaisProxima(oCP);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class RegistoAreaGeografica.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        RegistoAreaGeografica instance = new RegistoAreaGeografica();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
