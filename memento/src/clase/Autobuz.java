package clase;

public class Autobuz {

    private String numeSofer;
    private Integer anFabricatie;
    private String model;
    private Integer nrLocuri;
    private Integer consumMediu;

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setAnFabricatie(Integer anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrLocuri(Integer nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void setConsumMediu(Integer consumMediu) {
        this.consumMediu = consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", consumMediu=").append(consumMediu);
        sb.append('}');
        return sb.toString();
    }

    public Autobuz(String numeSofer, Integer anFabricatie, String model, Integer nrLocuri, Integer consumMediu) {
        this.numeSofer = numeSofer;
        this.anFabricatie = anFabricatie;
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.consumMediu = consumMediu;
    }

    public AutobuzMemento genereazaMemento() {
        return new AutobuzMemento(this.numeSofer, this.consumMediu);
    }

    public void revineLaOStareAnterioara(AutobuzMemento memento) {
        this.numeSofer = memento.getNume();
        this.consumMediu = memento.getConsum();
    }

}
