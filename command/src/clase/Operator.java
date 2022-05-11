package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> comenzi;
    public void addComanda(Comanda comanda){
        comenzi.add(comanda);

    }
    public void executaComanda(){
        if(comenzi!=null&&comenzi.size()>0){
        comenzi.get(0).executa();
        comenzi.remove(0);
        }
    }

    public Operator() {
        this.comenzi=new ArrayList<>();
    }
}
