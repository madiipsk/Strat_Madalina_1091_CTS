package clase;

public class Troleibuz extends TransportHandler{
    public Troleibuz(int pragDist) {
        super(pragDist);
    }

    @Override
    public void deplaseazaRequest(int dist) {
        if(dist < pragDist){
            System.out.println("Merge cu troleibuzul");
        }
        else handler.deplaseazaRequest(dist);
    }
}
