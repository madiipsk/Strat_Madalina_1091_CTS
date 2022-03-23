package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		List<Aplicant> listaAngajati;
		Reader reader=new AngajatReader("angajati.txt");
		try {
			listaAngajati = reader.readAplicants();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}