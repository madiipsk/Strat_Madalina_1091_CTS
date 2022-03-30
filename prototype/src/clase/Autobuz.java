package clase;

public class Autobuz extends MijlocTransport{
    private String numeSofer;

    public Autobuz(String nrInmatriculare, String numeSofer) {
        super(nrInmatriculare);
        this.numeSofer=numeSofer;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) this.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(" - ");
        sb.append("nrInmatriculare='").append(getNrInmatriculare()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
