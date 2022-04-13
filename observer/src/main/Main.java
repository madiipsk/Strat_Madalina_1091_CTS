package main;

import clase.Autobuz;
import clase.Calator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1= new Autobuz(1);
        Calator c1= new Calator("Popescu");
        Calator c2= new Calator("Popa");
        Calator c3= new Calator("Pop");

        a1.aboneazaObserver(c1);
        a1.aboneazaObserver(c2);
        a1.aboneazaObserver(c3);

        //a1.notify("Plec de la capat");
        //a1.pleacaDeLaCapat();

        a1.dezaboneazaObserver(c2);
        a1.pleacaDeLaCapat();
    }
}
