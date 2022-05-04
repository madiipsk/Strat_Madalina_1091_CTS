package main;

import clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(4);
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.pleacaInCursa();
        autobuz.trimiteInService();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.trimiteInService();
        autobuz.scoateDinService();
    }
}
