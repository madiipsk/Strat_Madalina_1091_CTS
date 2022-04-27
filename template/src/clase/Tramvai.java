package clase;

public class Tramvai extends TramvaiAbstract{
    @Override
    public void opresteStatie1() {
        System.out.println("Tramvaiul a oprit in statia 1");
    }

    @Override
    public void opresteStatie2() {
        System.out.println("Tramvaiul a oprit in statia 2");
    }

    @Override
    public void opresteStatie3() {
        System.out.println("Tramvaiul a oprit in statia 3");
    }
}
