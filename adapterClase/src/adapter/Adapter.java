package adapter;

import validatorSubteran.ValidatorMetrou;
import validatorTerestru.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        super.valideazaAboonament();
    }


}