package test;

import clase.Persoana;
import exceptii.ExceptieCNPGresit;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCNPTest {

    @Test
    public void checkCNP() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("CnpCorect", "6000430210017");
        assertTrue(persoana.checkCNP());
    }
    @Test
    public void checkCNPInvalid() throws ExceptieCNPGresit{
        Persoana persoana = new Persoana("OutOfBoundary", "9999999999999");
        assertFalse(persoana.checkCNP());
    }
    @Test
    public void boundaryInfCheckCNP() throws ExceptieCNPGresit{
        Persoana persoana = new Persoana("LimInf", "1000000000002");
        assertTrue(persoana.checkCNP());
    }
    @Test
    public void boundarySupCheckCNP() throws ExceptieCNPGresit{
        Persoana persoana = new Persoana("LimSup", "9999999999996");
        assertTrue(persoana.checkCNP());
    }
    @Test(expected = IllegalArgumentException.class)
    public void errorCheckCNP() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("PreaPutineChar","6590456");
        persoana.checkCNP();
    }
    @Test(expected = IllegalArgumentException.class)
    public void error2CheckCNP() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("Litere","6AJC4AD21sb1a");
        persoana.checkCNP();
    }
    @Test(expected = IllegalArgumentException.class)
    public void error3CheckCNP() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("PreaMulteChar","6555455211293227");
        persoana.checkCNP();
    }
    @Test(timeout = 100)
    public void performanceCheckCNP() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("Timeout","6000431210017");
        persoana.getVarsta();
    }
    @Test(expected = NullPointerException.class)
    public void textExistanceCheckCNP() throws ExceptieCNPGresit {
        Persoana pers = new Persoana("NuExista", null);
        pers.checkCNP();
    }
    @Test(expected = ExceptieCNPGresit.class)
    public void testConformanceCheckCNPFirstChar() throws ExceptieCNPGresit{
        Persoana pers = new Persoana("Zero", "0971095670015");
        pers.checkCNP();
    }
}