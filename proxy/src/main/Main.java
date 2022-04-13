package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;
import clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuzNormal = new Autobuz(0,"idk1");
        autobuzNormal.opresteInStatie();
        ((Autobuz)autobuzNormal).setNrCalatori(2);


        MijlocDeTransport autobuzDeNoapte = new AutobuzDeNoapte(autobuzNormal);
        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
        autobuzDeNoapte.opresteInStatie();
    }
}
