package main;

import clase.CardBancar;
import clase.CardCalatori;
import clase.Sms;
import clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator= new Validator(new CardCalatori(), 3);
        validator.platesteCalatorie();
        validator.setModPlata(new CardBancar());
        validator.platesteCalatorie();
        validator.setModPlata(new Sms());
        validator.platesteCalatorie();
    }
}
