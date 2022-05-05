package adapter;

import validatorSubteran.ValidatorSubteran;
import validatorTerestru.ValidatorTerestru;

public class Adapter implements ValidatorTerestru {
    ValidatorSubteran validatorMetrou;

    public Adapter(ValidatorSubteran validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonament();
    }
}
