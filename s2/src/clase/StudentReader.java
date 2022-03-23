package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

    StudentReader(String numeFisier) throws FileNotFoundException {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {

        super.scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (super.scanner.hasNext()) {
            Student student=new Student();
            readAplicant(super.scanner, student);
            Integer an_studii = super.scanner.nextInt();
            String facultate = (super.scanner.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        super.scanner.close();
        return studenti;
    }

}