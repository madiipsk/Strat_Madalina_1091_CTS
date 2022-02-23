package sem1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private IngrijitorZoo ingrijitorZoo;
    private List<Animal> animale;

    public Zoo(String nume, IngrijitorZoo ingrijitorZoo) {
        this.nume = nume;
        this.ingrijitorZoo = ingrijitorZoo;
        this.animale=new ArrayList<Animal>();
    }

    public Zoo(String nume, IngrijitorZoo ingrijitorZoo, List<Animal> animale) {
        this.nume = nume;
        this.ingrijitorZoo = ingrijitorZoo;
        this.animale = animale;
    }

    public void addAnimal(Animal animal){
        animale.add(animal);

    }

    public void hranesteAnimale(String hrana){
        for( Animal animal:animale) {
            ingrijitorZoo.hranesteAnimal(animal,hrana);

        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitorZoo() {
        return ingrijitorZoo;
    }

    public void setIngrijitorZoo(IngrijitorZoo ingrijitorZoo) {
        this.ingrijitorZoo = ingrijitorZoo;
    }

}
