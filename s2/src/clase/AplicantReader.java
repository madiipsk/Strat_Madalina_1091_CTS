package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AplicantReader implements Reader{

    protected Scanner scanner;
    AplicantReader(String numeFisier) throws FileNotFoundException {
        scanner=new Scanner(new File(numeFisier));
    }
    public void readAplicant(Scanner scanner,Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiriProiecte(nr,vect);

    }
}