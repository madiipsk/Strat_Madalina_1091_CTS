package main;

import clase.AutobuzFrunza;
import clase.GrupNodConcret;
import clase.NodAbstract;

public class Main {
    public static void main(String[] args){
        NodAbstract a1 = new AutobuzFrunza("Dacia", "model1", 7);
        NodAbstract a2 = new AutobuzFrunza("Dacia", "model1", 12);
        NodAbstract a3 = new AutobuzFrunza("Dacia", "model1", 45);

        NodAbstract grupMic = new GrupNodConcret("Grup mic");
        NodAbstract grupMare = new GrupNodConcret("Grup mare");
        NodAbstract flota = new GrupNodConcret("Flota");

        try {
            grupMic.add(a1);
            grupMic.add(a2);
            grupMare.add(a3);
            flota.add(grupMic);
            flota.add(grupMare);
            flota.afiseazaDescriere();
        } catch (Exception ex) {
        }

    }
}