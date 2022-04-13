package clase;

public class Validator {
    private ModPlata modPlata;
    private float pret;
    public Validator(ModPlata modPlata, float pret) {
        super();
        this.modPlata = modPlata;
        this.pret = pret;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata=modPlata;
    }
    public void platesteCalatorie() {
        modPlata.plateste(pret);
    }
}