package clase;

public class TramvaiFactory implements Factory{
    @Override
    public MijTransportComun creareMijloc(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
