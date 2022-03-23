package clase;

public class Main {

    public static void modulAfisareMijTransport(Factory fabrica,String nrInmatriculare){
        MijTransportComun mijloc = fabrica.creareMijloc(nrInmatriculare);
        System.out.println(mijloc.toString());
    }

    public static void main(String[] args) {
        //Factory factory = new AutobuzFactory();
        //System.out.println(factory.creareMijloc("NR2o3o32").getNrInmatriculare());

        modulAfisareMijTransport(new AutobuzFactory(), "b222NNN");
        modulAfisareMijTransport(new TroleibuzFactory(), "HD69PPP");
        modulAfisareMijTransport(new MicrobuzFactory(), "VN99CTS");
    }
}
