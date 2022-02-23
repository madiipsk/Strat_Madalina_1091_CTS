package sem1;

public class Zebra extends Animal {
    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String hrana) {
        System.out.println("Zebra " + getNume() + " a mancat " + hrana);
    }
}
