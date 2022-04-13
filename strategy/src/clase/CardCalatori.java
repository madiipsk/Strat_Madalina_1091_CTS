package clase;

public class CardCalatori implements ModPlata {
    @Override
    public void plateste(float suma) {
        System.out.println("A platit suma de "+suma+ " prin card de calatorii");
    }
}
