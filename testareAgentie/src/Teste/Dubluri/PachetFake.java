package Teste.Dubluri;

import Clase.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    Boolean rezerva;
    Double pret;

    public void setRezerva(Boolean rezerva) {
        this.rezerva = rezerva;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public boolean poateRezerva() {
        return rezerva;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return pret;
    }
}
