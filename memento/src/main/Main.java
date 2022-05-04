package main;

import clase.Autobuz;
import clase.ManagerAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Andrei", 4, "dacia",2000,10);
        ManagerAutobuz manager = new ManagerAutobuz();

        manager.adaugaMemento(autobuz.genereazaMemento());
        autobuz.setNumeSofer("Viorel");
        System.out.println(autobuz.toString());
        manager.adaugaMemento(autobuz.genereazaMemento());
        autobuz.setConsumMediu(7);
        manager.adaugaMemento(autobuz.genereazaMemento());
        System.out.println(autobuz.toString());
        autobuz.revineLaOStareAnterioara(manager.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
