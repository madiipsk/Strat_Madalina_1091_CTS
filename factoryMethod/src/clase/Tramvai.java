package clase;

public class Tramvai extends MijTransportComun{
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai " + getNrInmatriculare();
    }
}
