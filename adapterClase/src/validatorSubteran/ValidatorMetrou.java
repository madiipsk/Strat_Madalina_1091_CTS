package validatorSubteran;

public class ValidatorMetrou implements ValidatorSubteran{
    @Override
    public void valideazaCalatorie() {
        System.out.println("A fost validata calatoria pentru metrou!");
    }

    @Override
    public void valideazaAboonament() {
        System.out.println("A fost validat abonamentul pentru metrou!");
    }
}
