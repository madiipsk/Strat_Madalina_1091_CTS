package clase;

public class Autobuz {
    private StareAutobuz stare;
    private Integer nrAutobuz;

    public Autobuz(Integer nrAutobuz) {
        this.stare=new LaCapatDeLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public StareAutobuz getStare() {
        return stare;
    }

    protected void setStare(StareAutobuz stare) {
        this.stare = stare;
    }

    public Integer getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(Integer nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa(){
        InCursa stare=new InCursa();
        stare.modificaStare(this);
    }
    public void ajungeLaCapatDeLinie(){
        LaCapatDeLinie stare = new LaCapatDeLinie();
        stare.modificaStare(this);
    }
    public void trimiteInService(){
        LaReparat stare = new LaReparat();
        stare.modificaStare(this);
    }
    public void scoateDinService(){
        LaCapatDeLinie stare = new LaCapatDeLinie();
        stare.modificaStare(this);
    }
}
