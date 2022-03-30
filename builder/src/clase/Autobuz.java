package clase;

public class Autobuz {
    private String model;
    private String numeSofer;
    private String nrInmatriculare;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private Integer nrLinie;
    private Boolean isNew;

    Autobuz() {
        model = "Mercedes";
        numeSofer = "Dorel";
        nrInmatriculare = "B555STB";
        stop=true;
        openDoors=true;
        text="Buna ziua";
        nrLinie= 303;
        isNew=false;
    }

    public Autobuz(String model, String numeSofer, String nrInmatriculare, Boolean stop, Boolean openDoors, String text, Integer nrLinie, Boolean isNew) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.nrInmatriculare = nrInmatriculare;
        this.stop = stop;
        this.openDoors = openDoors;
        this.text = text;
        this.nrLinie = nrLinie;
        this.isNew = isNew;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    void setStop(Boolean stop) {
        this.stop = stop;
    }

    void setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
    }

    void setText(String text) {
        this.text = text;
    }

    void setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", stop=").append(stop);
        sb.append(", openDoors=").append(openDoors);
        sb.append(", text='").append(text).append('\'');
        sb.append(", nrLinie=").append(nrLinie);
        sb.append(", isNew=").append(isNew);
        sb.append('}');
        return sb.toString();
    }
}
