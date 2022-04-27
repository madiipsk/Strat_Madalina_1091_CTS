package main;

import clase.Tramvai;
import clase.TramvaiAbstract;
import clase.TramvaiProbe;

public class Main {
    public static void main(String[] args) {
        TramvaiAbstract tramvai = new Tramvai();
        TramvaiAbstract tramvaiProba = new TramvaiProbe();

        tramvai.parcurgereTraseu();
        System.out.println("\n");
        tramvai.parcurgereTraseuInvers();
        System.out.println("\n");
        tramvaiProba.parcurgereTraseu();
        System.out.println("\n");
        tramvaiProba.parcurgereTraseuInvers();

    }
}
