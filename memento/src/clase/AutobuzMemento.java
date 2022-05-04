package clase;

public class AutobuzMemento {

    private String nume;
    private Integer consum;

    public String getNume() {
        return nume;
    }

    public AutobuzMemento(String nume, Integer consum) {
        this.nume = nume;
        this.consum = consum;
    }

    public Integer getConsum() {
        return consum;
    }
}
