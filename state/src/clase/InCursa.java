package clase;

public class InCursa implements StareAutobuz{
    @Override
    public void modificaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            autobuz.setStare(this);
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este in cursa");
        }else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate fi in cursa");
        }
    }
}
