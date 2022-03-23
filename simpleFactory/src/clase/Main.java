package clase;

public class Main {
    public static void main(String[] args) {
        MijTransportComun mij1 = Factory.creareMijlocTransport(TipMijTransport.Autobuz,"6789aaa");
        MijTransportComun mij2 = Factory.creareMijlocTransport(TipMijTransport.Tramvai,"JKAN999");
        MijTransportComun mij3 = Factory.creareMijlocTransport(TipMijTransport.Troleibuz,"VN999ZZZ");

        System.out.println(mij1);
        System.out.println(mij2);
        System.out.println(mij3);
    }
}
