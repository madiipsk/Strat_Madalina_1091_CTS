package clase;

public class ComandaPlecareTraseu implements Comanda{
    private int nrLinie;
    private Autobuz autobuz;

    public ComandaPlecareTraseu(int nrLinie, Autobuz autobuz) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.placaPeTraseu(nrLinie);
    }
}
