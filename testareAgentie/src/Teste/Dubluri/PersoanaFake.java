package Teste.Dubluri;

import Clase.IPersoana;

public class PersoanaFake implements IPersoana {
    String sex;
    int varsta;
    boolean checkCNP;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCheckCNP(boolean checkCNP) {
        this.checkCNP = checkCNP;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return checkCNP;
    }
}
