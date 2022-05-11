package clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void placaPeTraseu(int nrLinie){
        System.out.println("Autobuzul "+ nrInmatriculare+ " a plecat pe linia "+ nrLinie);
    }
}
