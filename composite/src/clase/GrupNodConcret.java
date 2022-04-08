package clase;

import java.util.ArrayList;
import java.util.List;

public class GrupNodConcret implements NodAbstract {
    List<NodAbstract> lista = new ArrayList<>();
    private String denumire;

    public GrupNodConcret(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Denumirea grupului este:" + this.denumire);
        for(NodAbstract i: lista){
            i.afiseazaDescriere();
        }
    }


    @Override
    public NodAbstract get(Integer pozitie) {
        return lista.get(pozitie);
    }

    @Override
    public void add(NodAbstract nodAbstract) {
        lista.add(nodAbstract);
    }

    @Override
    public void remove(NodAbstract nodAbstract)  {
        lista.remove(nodAbstract);
    }
}

