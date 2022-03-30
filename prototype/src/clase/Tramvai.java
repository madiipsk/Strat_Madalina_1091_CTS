package clase;

public class Tramvai extends MijlocTransport{
    private String numeVatman;

    public Tramvai(String nrInmatriculare, String numeVatman) {
        super(nrInmatriculare);
        this.numeVatman=numeVatman;
    }

    public String getNumeVatman() {
        return numeVatman;
    }

    public void setNumeVatman(String numeVatman) {
        this.numeVatman = numeVatman;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tramvai{");
        sb.append("numeVatman='").append(numeVatman).append('\'');
        sb.append(" - ");
        sb.append("nrInmatriculare='").append(getNrInmatriculare()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
