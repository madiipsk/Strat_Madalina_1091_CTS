package clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("A platit suma de "+suma+ " prin card bancar");
    }
}
