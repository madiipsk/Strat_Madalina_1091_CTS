package main;

import adapter.Adapter;
import validatorSubteran.ValidatorMetrou;
import validatorSubteran.ValidatorSubteran;
import validatorTerestru.ValidatorAutobuz;
import validatorTerestru.ValidatorTerestru;

public class Main {

    public static void valideazaBilet(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilet();
    }

    public static void main(String[] args) {
        ValidatorSubteran validatorMetrou= new ValidatorMetrou();
        ValidatorTerestru validatorAutobuz= new ValidatorAutobuz();

        valideazaBilet(validatorAutobuz);
        //valideazaBilet(validatorMetrou);

        Adapter adapter = new Adapter(validatorMetrou);
        valideazaBilet(adapter);
    }
}
