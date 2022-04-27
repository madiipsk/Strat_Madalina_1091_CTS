package clase;

public class Tramvai extends TransportHandler{
    public Tramvai(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if (dist < pragDist){
            System.out.println("Merge cu tramvaiul");
        }
        else handler.deplaseazaRequest(dist);
    }
}
