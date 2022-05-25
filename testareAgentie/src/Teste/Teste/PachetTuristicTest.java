package Teste.Teste;

import Clase.IPersoana;
import Clase.PachetTuristic;
import Teste.Dubluri.PersoanaFake;
import Teste.Dubluri.PersoanaStub;
import Teste.Teste.Categorii.TestCuFake;
import Teste.Teste.Categorii.TestCuStub;
import Teste.Teste.Categorii.TestDeRIGHT;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(TestCuStub.class)
    public void testPoateRezerva(){
        IPersoana p1 = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(p1 , "Moscova", 100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TestCuFake.class, TestDeRIGHT.class})
    public void testNuPoateRezerva(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(17);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake , "Moscova", 100.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
}