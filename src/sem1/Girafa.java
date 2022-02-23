package sem1;

public class Girafa extends Animal{
    public Girafa(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String hrana) {
        System.out.println("Girafa "+ getNume() +" a mancat " + hrana);
    }
}
