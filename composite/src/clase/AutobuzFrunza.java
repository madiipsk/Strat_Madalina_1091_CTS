package clase;

import java.util.concurrent.ExecutionException;

public class AutobuzFrunza implements NodAbstract {
   private String producator;
   private String model;
   private int nrLocuri;

    public AutobuzFrunza(String producator, String model, Integer nrLocuri)
    {
        super();
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public NodAbstract get(Integer pozitie) {
        return null;
    }

    @Override
    public void add(NodAbstract nodAbstract) throws ExecutionException {
        throw new ExecutionException(null);
    }

    @Override
    public void remove(NodAbstract nodAbstract) throws ExecutionException {
        throw new ExecutionException(null);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AutobuzFrunza{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
