package clase;

import java.util.concurrent.ExecutionException;

public interface NodAbstract {
    void afiseazaDescriere();
    NodAbstract get(Integer pozitie);
    void add(NodAbstract nodAbstract) throws ExecutionException;
    void remove(NodAbstract nodAbstract) throws ExecutionException;

}
