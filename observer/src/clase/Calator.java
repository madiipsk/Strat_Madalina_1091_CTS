package clase;

public class Calator implements Observer{
    private String nume;

    @Override
    public void primesteSms(String mesaj) {
        System.out.println(nume + " ai primit urmatorul mesaj: " + mesaj);
    }

    public Calator(String nume) {
        this.nume = nume;
    }

}
