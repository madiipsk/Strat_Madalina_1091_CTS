package clase;

public class Troleibuz extends MijTransportComun{
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Troleibuz " + getNrInmatriculare();
    }
}
