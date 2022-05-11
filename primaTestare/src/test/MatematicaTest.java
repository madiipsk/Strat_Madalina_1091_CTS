package test;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {
//    @Test
//    public void test(){
//        fail("Not yet implemented");
//    }
    private Matematica mate;
    @Before
    public void setUp(){
        mate = new Matematica();
    }

    @Test
    public void testSumaCorecta(){

        int rezultat = mate.suma(5,9);
        assertEquals("Metoda suma e gresita",14,rezultat);

    }

    @Test
    public void testRaportCorect(){

        double rezultat= mate.raport(24,6);
        assertEquals(4.0,rezultat,0.001);
    }
    @Test
    public void testRaportZecimalCorect(){

        double rezultat= mate.raport(27,6);
        assertEquals(4.5, rezultat,0.001);
    }

    @Test
    public void testRaportShouldThrowException(){
        try{
            mate.raport(34,0);
            fail("Nu trebuia sa ajung aici");
        }catch (IllegalArgumentException exceptie){}

    }

    @Test
    public void testEsteParCorect(){
        assertTrue(mate.estePar(6));
        assertTrue(mate.estePar(18));
        assertTrue(mate.estePar(78));
        assertFalse(mate.estePar(5));
        assertFalse(mate.estePar(89));
    }

    @Test
    public void testNrPareListNotNull(){
        List<Integer> lista=mate.nNumerePare(2);
        assertNotNull(lista);
    }
}