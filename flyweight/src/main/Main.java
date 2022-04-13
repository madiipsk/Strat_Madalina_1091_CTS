package main;

import clase.Autobuz;
import clase.Linie;
import clase.LinieFactory;

public class Main {
    private static void functie(LinieFactory factory){
        Autobuz autobuz = new Autobuz("Mercedes",2022,40);
        factory.getLinie(168).afiseazaDescriere(autobuz);
    }

    public static void main(String[] args) {
        Autobuz a1=new Autobuz("Mercedes", 2014, 50);
        Autobuz a2=new Autobuz("Renault", 2012, 20);
        Autobuz a3=new Autobuz("Mercedes", 2016, 30);
        Autobuz a4=new Autobuz("Dacia", 2013, 40);

        LinieFactory factory=new LinieFactory();
        Linie l1= factory.getLinie(168);
        Linie l2= factory.getLinie(137);

        l1.afiseazaDescriere(a1);
        l1.afiseazaDescriere(a4);
        factory.getLinie(137).afiseazaDescriere(a2);
        l2.afiseazaDescriere(a3);
        functie(factory);

    }
}
