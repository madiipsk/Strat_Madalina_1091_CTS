package clase;

public class Autobuz extends MijTransportComun{
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz " + getNrInmatriculare();
    }
}