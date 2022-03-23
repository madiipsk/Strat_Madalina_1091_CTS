package clase;

public class MicrobuzFactory implements Factory{
    @Override
    public MijTransportComun creareMijloc(String nrInmatriculare) {
        return new Microbuz(nrInmatriculare);
    }
}
