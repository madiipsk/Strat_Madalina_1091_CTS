package clase;

public class AutobuzDeNoapte implements MijlocDeTransport{
    private MijlocDeTransport autobuz;

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori()==0){
            System.out.println("Autobuzul nu se opreste in statie!");
        } else {
            autobuz.opresteInStatie();
        }
    }

    @Override
    public Integer getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    public AutobuzDeNoapte(MijlocDeTransport autobuz) {
        this.autobuz = autobuz;
    }
}
