package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private Integer clasa;
	private String tutore;

	public void setClasa(Integer i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}


	public Elev() {
		super();
	}


}