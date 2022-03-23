package clase;

public class AutobuzFactory implements Factory{
    @Override
    public MijTransportComun creareMijloc(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
