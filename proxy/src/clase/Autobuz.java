package clase;

public class Autobuz implements MijlocDeTransport{
    private Integer nrCalatori;
    private String model;

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie cu " + nrCalatori + " calatori.");
        nrCalatori -- ;
    }

    public Autobuz(Integer nrCalatori, String model) {
        this.nrCalatori = nrCalatori;
        this.model = model;
    }

    public Integer getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(Integer nrCalatori) {
        this.nrCalatori = nrCalatori;
    }
}
