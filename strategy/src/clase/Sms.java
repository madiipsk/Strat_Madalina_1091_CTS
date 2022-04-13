package clase;

public class Sms implements ModPlata{

    @Override
    public void plateste(float suma) {
        System.out.println("A platit suma de "+suma+ " prin SMS");
    }
}
