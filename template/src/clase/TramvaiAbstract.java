package clase;

public abstract class TramvaiAbstract {

    protected abstract void opresteStatie1();
    protected abstract void opresteStatie2();
    protected abstract void opresteStatie3();
    public final void parcurgereTraseu(){
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
    }
    public final void parcurgereTraseuInvers(){
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    }
}
