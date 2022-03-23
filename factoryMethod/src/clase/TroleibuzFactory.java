package clase;

public class TroleibuzFactory implements Factory{
    @Override
    public MijTransportComun creareMijloc(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
