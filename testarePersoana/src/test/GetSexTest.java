package test;

import clase.Persoana;
import org.junit.Test;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;

public class GetSexTest {

    @org.junit.Test
    public void getSex() {
        Persoana pers = new Persoana("Ana", "3910228394428");
        assertEquals("M",pers.getSex());
    }

    @Test
    public void boundaryGetSex(){
        Persoana pers = new Persoana("Ana", "1910228394428");
        Persoana pers2 = new Persoana("Ana", "6210228394428");

        assertEquals("M",pers.getSex());
        assertEquals("F",pers2.getSex());
    }

    @Test
    public void crossCheckGetSex(){
        Persoana pers = new Persoana("Ana", "2910228394428");
        assertEquals(pers.CNP.charAt(0)%2==1?"M":"F", pers.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void errorGetSex(){
        Persoana pers = new Persoana("Ana", "0910228394428");
        pers.getSex();
    }
    @Test(timeout = 100)
    public void performanceTestGetSex(){
        Persoana pers = new Persoana("Ana", "2910228394428");
        pers.getSex();
    }

    @Test
    public void formatTestGetSex(){
        Persoana pers = new Persoana("Ana", "2910228394428");
        Persoana pers2 = new Persoana("Ana", "1910228394428");

        assertEquals("F", pers.getSex());
        assertEquals("M", pers2.getSex());

    }
    @Test
    public void rangeGetSex(){
        Persoana pers = new Persoana("Ana", "7910228394428");
        Persoana pers2 = new Persoana("Ana", "8910228394428");

        assertEquals("N/A", pers.getSex());
        assertEquals("N/A",pers2.getSex());
    }
    @Test(expected = NullPointerException.class)
    public void existTestGetSex(){
        Persoana pers = new Persoana("Ana", null);
        pers.getSex();
    }
}

//tema de facut pentru check cnp