package clase;

public abstract class MijTransportComun {
    String nrInmatriculare;

    public MijTransportComun(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }
}
