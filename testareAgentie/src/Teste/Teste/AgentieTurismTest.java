package Teste.Teste;

import Clase.AgentieTurism;
import Clase.IPachetTuristic;
import Clase.IPersoana;
import Clase.PachetTuristic;
import Teste.Dubluri.PachetDummy;
import Teste.Dubluri.PachetFake;
import Teste.Dubluri.PersoanaStub;
import Teste.Teste.Categorii.TestCuDummy;
import Teste.Teste.Categorii.TestCuFake;
import Teste.Teste.Categorii.TestDeRIGHT;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class AgentieTurismTest {

    @Test
    @Category(TestCuDummy.class)
    public void testAdaugaTurism(){
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetD= new PachetDummy();
        agentieTurism.adaugaPachet(pachetD);
        assertEquals(1,agentieTurism.getNumarPacheteTuristice());
    }

    @Test
    @Category({TestCuFake.class, TestDeRIGHT.class})
    public void testCalculSumaTotalaPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetF1 = new PachetFake();
        PachetFake pachetF2 = new PachetFake();

        pachetF1.setPret(1000.0);
        pachetF2.setPret(500.0);

        agentieTurism.adaugaPachet(pachetF1);
        agentieTurism.adaugaPachet(pachetF2);

        assertEquals(1500, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

}