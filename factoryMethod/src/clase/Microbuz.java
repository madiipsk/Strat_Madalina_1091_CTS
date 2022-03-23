package clase;

public class Microbuz extends MijTransportComun{

    public Microbuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Microbuz " + getNrInmatriculare();
    }
}
