package clase;

public class Linie implements AutobuzLinie{
    private Integer nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(Integer nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseazaDescriere(Autobuz autobuz) {
        System.out.println(this.toString()+ autobuz.toString());
    }

    public Integer getNrLinie() {
        return nrLinie;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Linie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
