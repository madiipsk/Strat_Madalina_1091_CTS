package test;

import clase.Persoana;
import exceptii.ExceptieCNPGresit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {

    @Test
    public void getVarsta() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("nume", "6000430210017");

        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void boundaryGetVarsta() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("nume", "3000101653425");
        Persoana persoana1 = new Persoana("nume","6220101567897");

        assertEquals(222, persoana.getVarsta());
        assertEquals(0,persoana1.getVarsta());
    }

    @Test(expected = ExceptieCNPGresit.class)
    public void crossCheckGetVarsta() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("nume","6590430210017");

        persoana.getVarsta();
    }

    @Test(expected = NumberFormatException.class)
    public void errorGetVarsta() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("nume","6A8y49");

        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void performanceGetVarsta() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("nume","6000431210017");

        persoana.getVarsta();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void error2GetVarsta() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("nume","1923");

        persoana.getVarsta();
    }

    @Test
    public void orderGetVarsta() throws ExceptieCNPGresit {
        Persoana persoana = new Persoana("nume", "1981212456789");
        Persoana persoana1 = new Persoana("nume", "6001212456789");

        assertTrue(persoana.getVarsta() > persoana1.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void existanceTestGetVarsta() throws Exception {
        Persoana persoana = new Persoana("nume",null);

        persoana.getVarsta();
    }
}