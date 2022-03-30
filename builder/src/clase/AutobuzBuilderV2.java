package clase;

public class AutobuzBuilderV2 implements Builder{
    private String model;
    private String numeSofer;
    private String nrInmatriculare;
    private Boolean stop;
    private Boolean openDoors;
    private String text;
    private Integer nrLinie;
    private Boolean isNew;

    public AutobuzBuilderV2(){
        model = "Mercedes";
        numeSofer = "Dorel";
        nrInmatriculare = "B555STB";
        stop=true;
        openDoors=true;
        text="Buna ziua";
        nrLinie= 303;
        isNew=false;
    }

    @Override
    public Autobuz build() {
        return new Autobuz(model, numeSofer, nrInmatriculare, stop, openDoors, text,nrLinie,isNew);
    }

    public AutobuzBuilderV2 setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilderV2 setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilderV2 setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilderV2 setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }

    public AutobuzBuilderV2 setOpenDoors(Boolean openDoors) {
        this.openDoors = openDoors;
        return this;
    }

    public AutobuzBuilderV2 setText(String text) {
        this.text = text;
        return this;
    }

    public AutobuzBuilderV2 setNrLinie(Integer nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuilderV2 setNew(Boolean aNew) {
        isNew = aNew;
        return this;
    }
}
