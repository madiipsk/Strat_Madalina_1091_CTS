package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareTraseu;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("B01ppp");
        Autobuz a2 = new Autobuz("B99III");

        Comanda comanda1=new ComandaPlecareTraseu(1,a1);

        Operator operator=new Operator();
        operator.addComanda(comanda1);
        operator.addComanda(new ComandaPlecareTraseu(2,a2));
        operator.addComanda(new ComandaPlecareTraseu(2,a1));
        operator.addComanda(new ComandaPlecareTraseu(5,a2));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
