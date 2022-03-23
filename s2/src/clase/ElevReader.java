package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader{

    ElevReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {

        super.scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Elev elev=new Elev();
            readAplicant(super.scanner, elev);
            int clasa = super.scanner.nextInt();
            String tutore = super.scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        super.scanner.close();
        return elevi;
    }

}