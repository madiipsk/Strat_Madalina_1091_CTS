package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;

	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Numar Proiecte=" + nrProiecte  + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}


}