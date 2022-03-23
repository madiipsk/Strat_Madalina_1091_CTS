package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader{

    AngajatReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {

        super.scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Angajat angajat=new Angajat();
            readAplicant(super.scanner,angajat);
            int salariu = super.scanner.nextInt();
            String ocupatie = super.scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        super.scanner.close();
        return angajati;
    }

}